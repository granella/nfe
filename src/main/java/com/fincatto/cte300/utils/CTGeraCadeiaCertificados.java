/*
 * Copyright 2016 Fagner Granella.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fincatto.cte300.utils;

import com.fincatto.cte300.classes.CTAmbiente;
import com.fincatto.cte300.classes.CTAutorizador30;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 *
 * @author Fagner Granella
 */
public abstract class CTGeraCadeiaCertificados {

    private static final int PORT = 443;
    private static final String PROTOCOL = "TLS";
    private static final Logger LOGGER = LoggerFactory.getLogger(CTGeraCadeiaCertificados.class);

    public static byte[] geraCadeiaCertificados(final CTAmbiente ambiente, final String senha) throws Exception {
        final KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, senha.toCharArray());
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            for (final CTAutorizador30 aut : CTAutorizador30.values()) {
                final String urlNF = aut.getCteStatusServico(ambiente);
                if (StringUtils.isNotBlank(urlNF)) {
                    final String host = new URI(urlNF).getHost();
                    CTGeraCadeiaCertificados.get(keyStore, host, PORT);
                }
            }
            keyStore.store(out, senha.toCharArray());
            return out.toByteArray();
        }
    }

    private static void get(final KeyStore keyStore, final String host, final int port) throws Exception {
        final TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);

        final X509TrustManager defaultTrustManager = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
        final SavingTrustManager savingTrustManager = new SavingTrustManager(defaultTrustManager);

        final SSLContext sslContext = SSLContext.getInstance(PROTOCOL);
        sslContext.init(null, new TrustManager[]{savingTrustManager}, null);

        LOGGER.info(String.format("Abrindo conexao para o servidor: %s:%s", host, port));
        try (SSLSocket sslSocket = (SSLSocket) sslContext.getSocketFactory().createSocket(host, port)) {
            sslSocket.setSoTimeout(10000);
            sslSocket.startHandshake();
        } catch (final Exception e) {
            LOGGER.error(String.format("[%s] %s", host, e.toString()));
        }

        //se conseguir obter a cadeia de certificados, adiciona no keystore
        if (savingTrustManager.chain != null) {
            LOGGER.info(String.format("Certificados enviados pelo servidor: %s", savingTrustManager.chain.length));
            final MessageDigest sha1 = MessageDigest.getInstance("SHA1");
            final MessageDigest md5 = MessageDigest.getInstance("MD5");
            for (int i = 0; i < savingTrustManager.chain.length; i++) {
                final X509Certificate certificate = savingTrustManager.chain[i];
                sha1.update(certificate.getEncoded());
                md5.update(certificate.getEncoded());

                final String alias = String.format("%s.%s", host, i + 1);
                keyStore.setCertificateEntry(alias, certificate);
                LOGGER.info(String.format("Adicionado certificado no keystore com o alias: %s", alias));
            }
        }
    }

    private static class SavingTrustManager implements X509TrustManager {

        private final X509TrustManager trustManager;
        private X509Certificate[] chain;

        SavingTrustManager(final X509TrustManager trustManager) {
            this.trustManager = trustManager;
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return trustManager.getAcceptedIssuers();
        }

        @Override
        public void checkClientTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
            this.trustManager.checkClientTrusted(chain, authType);
        }

        @Override
        public void checkServerTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
            this.chain = chain;
            this.trustManager.checkServerTrusted(chain, authType);
        }
    }
}
