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

import com.fincatto.cte300.parsers.CTChaveParser;
import java.util.Arrays;

/**
 * <h1>URLs dos serviços</h1><br>
 * <a href="http://hom.cte.fazenda.gov.br/portal/webServices.aspx?tipoConteudo=wpdBtfbTMrw=">CTE
 * Homologação</a><br>
 * <a href="http://www.cte.fazenda.gov.br/portal/webServices.aspx?tipoConteudo=wpdBtfbTMrw=">CTE
 * Produção</a><br>
 *
 * @author Fagner Granella
 */
public enum CTAutorizador30 {

    SP {
        @Override
        public String getCteRecepcao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteRecepcao.asmx" : "https://nfe.fazenda.sp.gov.br/cteWEB/services/cteRecepcao.asmx";
        }

        @Override
        public String getCteRetRecepcao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteRetRecepcao.asmx" : "https://nfe.fazenda.sp.gov.br/cteWEB/services/cteRetRecepcao.asmx";
        }

        @Override
        public String getCteConsultaProtocolo(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteConsulta.asmx" : "https://nfe.fazenda.sp.gov.br/cteWEB/services/cteConsulta.asmx";
        }

        @Override
        public String getCteStatusServico(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteStatusServico.asmx" : "https://nfe.fazenda.sp.gov.br/cteWEB/services/cteStatusServico.asmx";
        }

        @Override
        public String getCteRecepcaoEvento(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteweb/services/cteRecepcaoEvento.asmx" : "https://nfe.fazenda.sp.gov.br/cteweb/services/cteRecepcaoEvento.asmx";
        }

        @Override
        public String getCteInutilizacao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteInutilizacao.asmx" : "https://nfe.fazenda.sp.gov.br/cteWEB/services/cteInutilizacao.asmx";
        }

        @Override
        public CTUnidadeFederativa[] getUFs() {
            return new CTUnidadeFederativa[]{
                CTUnidadeFederativa.SP
            };
        }
    },
    RS {
        @Override
        public String getCteRecepcao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/cterecepcao/CteRecepcao.asmx" : "https://cte.svrs.rs.gov.br/ws/cterecepcao/CteRecepcao.asmx";
        }

        @Override
        public String getCteRetRecepcao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/cteretrecepcao/cteRetRecepcao.asmx" : "https://cte.svrs.rs.gov.br/ws/cteretrecepcao/cteRetRecepcao.asmx";
        }

        @Override
        public String getCteConsultaProtocolo(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/cteconsulta/CteConsulta.asmx" : "https://cte.svrs.rs.gov.br/ws/cteconsulta/CteConsulta.asmx";
        }

        @Override
        public String getCteStatusServico(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/ctestatusservico/CteStatusServico.asmx" : "https://cte.svrs.rs.gov.br/ws/ctestatusservico/CteStatusServico.asmx";
        }

        @Override
        public String getCteRecepcaoEvento(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/cterecepcaoevento/cterecepcaoevento.asmx" : "https://cte.svrs.rs.gov.br/ws/cterecepcaoevento/cterecepcaoevento.asmx";
        }

        @Override
        public String getCteInutilizacao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/cteinutilizacao/cteinutilizacao.asmx" : "https://cte.svrs.rs.gov.br/ws/cteinutilizacao/cteinutilizacao.asmx";
        }

        @Override
        public CTUnidadeFederativa[] getUFs() {
            return new CTUnidadeFederativa[]{
                CTUnidadeFederativa.RS
            };
        }
    },
    SVRS {
        @Override
        public String getCteRecepcao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/cterecepcao/CteRecepcao.asmx" : "https://cte.svrs.rs.gov.br/ws/cterecepcao/CteRecepcao.asmx";
        }

        @Override
        public String getCteRetRecepcao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/cteretrecepcao/cteRetRecepcao.asmx" : "https://cte.svrs.rs.gov.br/ws/cteretrecepcao/cteRetRecepcao.asmx";
        }

        @Override
        public String getCteConsultaProtocolo(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/cteconsulta/CteConsulta.asmx" : "https://cte.svrs.rs.gov.br/ws/cteconsulta/CteConsulta.asmx";
        }

        @Override
        public String getCteStatusServico(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/ctestatusservico/CteStatusServico.asmx" : "https://cte.svrs.rs.gov.br/ws/ctestatusservico/CteStatusServico.asmx";
        }

        @Override
        public String getCteRecepcaoEvento(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/cterecepcaoevento/cterecepcaoevento.asmx" : "https://cte.svrs.rs.gov.br/ws/cterecepcaoevento/cterecepcaoevento.asmx";
        }

        @Override
        public String getCteInutilizacao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://cte-homologacao.svrs.rs.gov.br/ws/cteinutilizacao/cteinutilizacao.asmx" : "https://cte.svrs.rs.gov.br/ws/cteinutilizacao/cteinutilizacao.asmx";
        }

        @Override
        public CTUnidadeFederativa[] getUFs() {
            return new CTUnidadeFederativa[]{
                CTUnidadeFederativa.RS,
                CTUnidadeFederativa.AC,
                CTUnidadeFederativa.AL,
                CTUnidadeFederativa.AM,
                CTUnidadeFederativa.BA,
                CTUnidadeFederativa.CE,
                CTUnidadeFederativa.DF,
                CTUnidadeFederativa.ES,
                CTUnidadeFederativa.GO,
                CTUnidadeFederativa.MA,
                CTUnidadeFederativa.PA,
                CTUnidadeFederativa.PB,
                CTUnidadeFederativa.PI,
                CTUnidadeFederativa.RJ,
                CTUnidadeFederativa.RN,
                CTUnidadeFederativa.RO,
                CTUnidadeFederativa.SC,
                CTUnidadeFederativa.SE,
                CTUnidadeFederativa.TO
            };
        }
    },
    SVSP {
        @Override
        public String getCteRecepcao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteRecepcao.asmx" : "https://nfe.fazenda.sp.gov.br/cteWEB/services/cteRecepcao.asmx";
        }

        @Override
        public String getCteRetRecepcao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteRetRecepcao.asmx" : "https://nfe.fazenda.sp.gov.br/cteWEB/services/cteRetRecepcao.asmx";
        }

        @Override
        public String getCteConsultaProtocolo(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteConsulta.asmx" : "https://nfe.fazenda.sp.gov.br/cteWEB/services/cteConsulta.asmx";
        }

        @Override
        public String getCteStatusServico(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteStatusServico.asmx" : "https://nfe.fazenda.sp.gov.br/cteWEB/services/cteStatusServico.asmx";
        }

        @Override
        public String getCteRecepcaoEvento(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteweb/services/cteRecepcaoEvento.asmx" : "https://nfe.fazenda.sp.gov.br/cteweb/services/cteRecepcaoEvento.asmx";
        }

        @Override
        public String getCteInutilizacao(final CTAmbiente ambiente) {
            return CTAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nfe.fazenda.sp.gov.br/cteWEB/services/cteInutilizacao.asmx" : "https://nfe.fazenda.sp.gov.br/cteWEB/services/cteInutilizacao.asmx";
        }

        @Override
        public CTUnidadeFederativa[] getUFs() {
            return new CTUnidadeFederativa[]{
                CTUnidadeFederativa.AP,
                CTUnidadeFederativa.PE,
                CTUnidadeFederativa.RR
            };
        }
    };

    public abstract String getCteRecepcao(final CTAmbiente ambiente);

    public abstract String getCteRetRecepcao(final CTAmbiente ambiente);

    public abstract String getCteConsultaProtocolo(final CTAmbiente ambiente);

    public abstract String getCteStatusServico(final CTAmbiente ambiente);

    public abstract String getCteRecepcaoEvento(final CTAmbiente ambiente);

    public abstract String getCteInutilizacao(final CTAmbiente ambiente);

    public abstract CTUnidadeFederativa[] getUFs();

    public static CTAutorizador30 valueOfCodigoUF(final CTUnidadeFederativa uf) {
        for (final CTAutorizador30 autorizador : CTAutorizador30.values()) {
            if (Arrays.asList(autorizador.getUFs()).contains(uf)) {
                return autorizador;
            }
        }
        throw new IllegalStateException(String.format("N\u00e3o existe autorizador para a UF %s", uf.getCodigo()));
    }

    public static CTAutorizador30 valueOfChaveAcesso(final String chaveAcesso) {
        final CTChaveParser chaveParser = new CTChaveParser(chaveAcesso);

        if (chaveParser.isEmitidaContingenciaSCVRS()) {
            return CTAutorizador30.SVRS;
        } else {
            return CTAutorizador30.valueOfCodigoUF(chaveParser.getCTUnidadeFederativa());
        }
    }

    public static CTAutorizador30 valueOfTipoEmissao(final CTTipoEmissao tpEmissao, final CTUnidadeFederativa uf) {
        switch (tpEmissao) {
            case EMISSAO_NORMAL:
                return CTAutorizador30.valueOfCodigoUF(uf);
            case CONTINGENCIA_SVCRS:
                return CTAutorizador30.SVRS;
            case CONTINGENCIA_SVCSP:
                return CTAutorizador30.SVSP;
            default:
                throw new IllegalArgumentException("N\u00e3o ha implementac\u00e3o para o tipo de emiss\u00e3o: " + tpEmissao.getDescricao());
        }
    }
}
