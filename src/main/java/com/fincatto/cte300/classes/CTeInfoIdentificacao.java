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

import java.time.LocalDateTime;

import org.simpleframework.xml.Element;

/**
 * @author Fagner Granella
 */
public class CTeInfoIdentificacao {

    @Element(name = "cUF")
    private CTUnidadeFederativa uf;

    @Element(name = "cCT")
    private String codigoRandomico;

    @Element(name = "CFOP")
    private String codigoFiscal;

    @Element(name = "natOp")
    private String naturezaOperacao;

    @Element(name = "mod")
    private String modelo = "57";

    @Element(name = "serie")
    private String serie;

    @Element(name = "nCT")
    private String numeroCTe;

    @Element(name = "dhEmi")
    private LocalDateTime dataHoraEmissao;

    @Element(name = "tpImp")
    private CTTipoImpressao tipoImpressao;

    @Element(name = "tpEmis")
    private CTTipoEmissao tipoEmissao;

    @Element(name = "cDV")
    private Integer digitoVerificador;

    @Element(name = "tpAmb")
    private CTAmbiente ambiente;

    @Element(name = "tpCTe")
    private CTTipo tpCTe;

    @Element(name = "procEmi")
    private CTProcessoEmissor programaEmissor;

    @Element(name = "verProc")
    private String versaoEmissor;

    @Element(name = "indGlobalizado")
    private String indicadorGlobalizado;

    @Element(name = "cMunEnv")
    private String codigoMunicipioEnvio;

    @Element(name = "xMunEnv")
    private String municipioEnvio;

    @Element(name = "UFEnv")
    private CTUnidadeFederativa ufEnvio;

    @Element(name = "modal")
    private CTModalidade modalidade;

    @Element(name = "tpServ")
    private CTTipoServico tipoServico;

    @Element(name = "cMunIni")
    private String codigoMunicipioInicial;

    @Element(name = "xMunIni")
    private String municipioInicial;

    @Element(name = "UFIni")
    private CTUnidadeFederativa ufInicial;

    @Element(name = "cMunFim")
    private String codigoMunicipioFinal;

    @Element(name = "xMunFim")
    private String municipioFinal;

    @Element(name = "UFFim")
    private CTUnidadeFederativa ufFinal;

    @Element(name = "retira")
    private String retira;

    @Element(name = "xDetRetira")
    private String xDetRetira;

    @Element(name = "toma03")
    private CTTomadorServico toma03;

    @Element(name = "toma4")
    private CTeInfoTomadorServico toma4;

    @Element(name = "dhCont", required = false)
    private LocalDateTime dataHoraContigencia;

    @Element(name = "xJust", required = false)
    private String justificativaEntradaContingencia;

    public CTUnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(CTUnidadeFederativa uf) {
        this.uf = uf;
    }

    public String getCodigoRandomico() {
        return codigoRandomico;
    }

    public void setCodigoRandomico(String codigoRandomico) {
        this.codigoRandomico = codigoRandomico;
    }

    public String getCodigoFiscal() {
        return codigoFiscal;
    }

    public void setCodigoFiscal(String codigoFiscal) {
        this.codigoFiscal = codigoFiscal;
    }

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumeroCTe() {
        return numeroCTe;
    }

    public void setNumeroCTe(String numeroCTe) {
        this.numeroCTe = numeroCTe;
    }

    public LocalDateTime getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public void setDataHoraEmissao(LocalDateTime dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }

    public CTTipoImpressao getTipoImpressao() {
        return tipoImpressao;
    }

    public void setTipoImpressao(CTTipoImpressao tipoImpressao) {
        this.tipoImpressao = tipoImpressao;
    }

    public CTTipoEmissao getTipoEmissao() {
        return tipoEmissao;
    }

    public void setTipoEmissao(CTTipoEmissao tipoEmissao) {
        this.tipoEmissao = tipoEmissao;
    }

    public Integer getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(Integer digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public CTAmbiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(CTAmbiente ambiente) {
        this.ambiente = ambiente;
    }

    public CTTipo getTpCTe() {
        return tpCTe;
    }

    public void setTpCTe(CTTipo tpCTe) {
        this.tpCTe = tpCTe;
    }

    public CTProcessoEmissor getProgramaEmissor() {
        return programaEmissor;
    }

    public void setProgramaEmissor(CTProcessoEmissor programaEmissor) {
        this.programaEmissor = programaEmissor;
    }

    public String getVersaoEmissor() {
        return versaoEmissor;
    }

    public void setVersaoEmissor(String versaoEmissor) {
        this.versaoEmissor = versaoEmissor;
    }

    public String getIndicadorGlobalizado() {
        return indicadorGlobalizado;
    }

    public void setIndicadorGlobalizado(String indicadorGlobalizado) {
        this.indicadorGlobalizado = indicadorGlobalizado;
    }

    public String getCodigoMunicipioEnvio() {
        return codigoMunicipioEnvio;
    }

    public void setCodigoMunicipioEnvio(String codigoMunicipioEnvio) {
        this.codigoMunicipioEnvio = codigoMunicipioEnvio;
    }

    public String getMunicipioEnvio() {
        return municipioEnvio;
    }

    public void setMunicipioEnvio(String municipioEnvio) {
        this.municipioEnvio = municipioEnvio;
    }

    public CTUnidadeFederativa getUfEnvio() {
        return ufEnvio;
    }

    public void setUfEnvio(CTUnidadeFederativa ufEnvio) {
        this.ufEnvio = ufEnvio;
    }

    public CTModalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(CTModalidade modalidade) {
        this.modalidade = modalidade;
    }

    public CTTipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(CTTipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getCodigoMunicipioInicial() {
        return codigoMunicipioInicial;
    }

    public void setCodigoMunicipioInicial(String codigoMunicipioInicial) {
        this.codigoMunicipioInicial = codigoMunicipioInicial;
    }

    public String getMunicipioInicial() {
        return municipioInicial;
    }

    public void setMunicipioInicial(String municipioInicial) {
        this.municipioInicial = municipioInicial;
    }

    public CTUnidadeFederativa getUfInicial() {
        return ufInicial;
    }

    public void setUfInicial(CTUnidadeFederativa ufInicial) {
        this.ufInicial = ufInicial;
    }

    public String getCodigoMunicipioFinal() {
        return codigoMunicipioFinal;
    }

    public void setCodigoMunicipioFinal(String codigoMunicipioFinal) {
        this.codigoMunicipioFinal = codigoMunicipioFinal;
    }

    public String getMunicipioFinal() {
        return municipioFinal;
    }

    public void setMunicipioFinal(String municipioFinal) {
        this.municipioFinal = municipioFinal;
    }

    public CTUnidadeFederativa getUfFinal() {
        return ufFinal;
    }

    public void setUfFinal(CTUnidadeFederativa ufFinal) {
        this.ufFinal = ufFinal;
    }

    public String getRetira() {
        return retira;
    }

    public void setRetira(String retira) {
        this.retira = retira;
    }

    public String getxDetRetira() {
        return xDetRetira;
    }

    public void setxDetRetira(String xDetRetira) {
        this.xDetRetira = xDetRetira;
    }

    public CTTomadorServico getToma03() {
        return toma03;
    }

    public void setToma03(CTTomadorServico toma03) {
        this.toma03 = toma03;
    }

    public CTeInfoTomadorServico getToma4() {
        return toma4;
    }

    public void setToma4(CTeInfoTomadorServico toma4) {
        this.toma4 = toma4;
    }

    public LocalDateTime getDataHoraContigencia() {
        return dataHoraContigencia;
    }

    public void setDataHoraContigencia(LocalDateTime dataHoraContigencia) {
        this.dataHoraContigencia = dataHoraContigencia;
    }

    public String getJustificativaEntradaContingencia() {
        return justificativaEntradaContingencia;
    }

    public void setJustificativaEntradaContingencia(String justificativaEntradaContingencia) {
        this.justificativaEntradaContingencia = justificativaEntradaContingencia;
    }

}
