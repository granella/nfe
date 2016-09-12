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
package com.fincatto.cte300;

import com.fincatto.cte300.classes.CTAmbiente;
import com.fincatto.cte300.classes.CTTipoEmissao;
import com.fincatto.cte300.classes.CTUnidadeFederativa;

import java.security.KeyStore;
import java.security.KeyStoreException;

/**
 * Configuração basica do sistema de conhecimento de transporte.
 *
 * @author Fagner Granella
 */
public abstract class CTeConfig {

    public static final String VERSAO_CTE = "2.00";
    public static final String CTE_NAMESPACE = "http://www.portalfiscal.inf.br/cte";

    /**
     * Indica o ambiente de trabalho, se em produção ou homologação.
     *
     * @return Ambiente de trabalho.
     */
    public CTAmbiente getAmbiente() {
        return CTAmbiente.HOMOLOGACAO;
    }

    /**
     * Unidade da federação do emissor do conhecimento de transporte.
     *
     * @return Unidade da federação do emissor.
     */
    public abstract CTUnidadeFederativa getCUF();

    /**
     * KeyStore contendo o certificado pessoal do emissor. <br>
     * Esse certificado é fornecido por uma autoridade certificadora. <br>
     * Em caso de dúvidas, consulte seu contador.
     *
     * @return KeyStore do certificado pessoal.
     * @throws KeyStoreException Caso não consiga carregar o KeyStore.
     */
    public abstract KeyStore getCertificadoKeyStore() throws KeyStoreException;

    /**
     * Senha do certificado pessoal do emissor, contido dentro do KeyStore do
     * certificado.
     *
     * @return Senha do certificado.
     * @see #getCertificadoKeyStore()
     */
    public abstract String getCertificadoSenha();

    /**
     * KeyStore contendo a cadeia de certificados da SEFAZ de destino. <br>
     * Para gerar a cadeia, use o utilitário fornecido com a biblioteca:<br>
     * FileUtils.writeByteArrayToFile(new File("/tmp/producao.cacerts"),
     * CTGeraCadeiaCertificados.geraCadeiaCertificados(CTAmbiente.PRODUCAO,
     * "senha"));
     *
     * @return KeyStore da cadeia de certificados.
     * @throws KeyStoreException Caso nao consiga carregar o KeyStore.
     */
    public abstract KeyStore getCadeiaCertificadosKeyStore() throws KeyStoreException;

    /**
     * Senha da cadeia de certificados, contida dentro do KeyStore da cadeia.
     *
     * @return Senha da cadeia de certificados.
     * @see #getCadeiaCertificadosKeyStore()
     */
    public abstract String getCadeiaCertificadosSenha();

    /**
     * Tipo da emissão do conhecimento de transporte (se normal ou em
     * contingência).
     *
     * @return Tipo da emissão do conhecimento de transporte.
     */
    public CTTipoEmissao getTipoEmissao() {
        return CTTipoEmissao.EMISSAO_NORMAL;
    }

    /**
     * Protocolo de SSL, usado pela SEFAZ para receber o conhecimento de
     * transporte.
     *
     * @return Protocolo SSL da SEFAZ de origem.
     */
    public String getSSLProtocolo() {
        return "TLSv1";
    }
}
