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
package com.fincatto.cte300.classes;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

/**
 * @author Fagner Granella
 */
public class CTeInfo {

    @Attribute(name = "versao")
    private String versao;

    @Attribute(name = "Id")
    private String identificador;

    @Element(name = "ide")
    private CTeInfoIdentificacao identificacao;

    @Element(name = "compl", required = false)
    private CTeInfoInformacaoComplementar informacaoComplentar;

    @Element(name = "emit")
    private CTeInfoEmitente emitente;

    @Element(name = "rem")
    private CTeInfoRemetente remetente;

    @Element(name = "exped")
    private CTeInfoExpedidor expedidor;

    @Element(name = "receb")
    private CTeInfoRecebedor recebedor;

    @Element(name = "dest")
    private CTeInfoDestinatario destinatario;

    @Element(name = "vPrest")
    private CTeInfoPrestacaoServico prestacaoServico;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public CTeInfoIdentificacao getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(CTeInfoIdentificacao identificacao) {
        this.identificacao = identificacao;
    }

    public CTeInfoInformacaoComplementar getInformacaoComplentar() {
        return informacaoComplentar;
    }

    public void setInformacaoComplentar(CTeInfoInformacaoComplementar informacaoComplentar) {
        this.informacaoComplentar = informacaoComplentar;
    }

    public CTeInfoEmitente getEmitente() {
        return emitente;
    }

    public void setEmitente(CTeInfoEmitente emitente) {
        this.emitente = emitente;
    }

    public CTeInfoRemetente getRemetente() {
        return remetente;
    }

    public void setRemetente(CTeInfoRemetente remetente) {
        this.remetente = remetente;
    }

    public CTeInfoExpedidor getExpedidor() {
        return expedidor;
    }

    public void setExpedidor(CTeInfoExpedidor expedidor) {
        this.expedidor = expedidor;
    }

    public CTeInfoRecebedor getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(CTeInfoRecebedor recebedor) {
        this.recebedor = recebedor;
    }

    public CTeInfoDestinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(CTeInfoDestinatario destinatario) {
        this.destinatario = destinatario;
    }

    public CTeInfoPrestacaoServico getPrestacaoServico() {
        return prestacaoServico;
    }

    public void setPrestacaoServico(CTeInfoPrestacaoServico prestacaoServico) {
        this.prestacaoServico = prestacaoServico;
    }

}
