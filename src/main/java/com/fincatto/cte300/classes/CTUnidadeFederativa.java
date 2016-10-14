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

/**
 *
 * @author Fagner Granella
 */
public enum CTUnidadeFederativa {

    AC("AC", "Acre", "12"),
    AL("AL", "Alagoas", "27"),
    AP("AP", "Amap\u00E1", "16"),
    AM("AM", "Amazonas", "13"),
    BA("BA", "Bahia", "29"),
    CE("CE", "Cear\u00E1", "23"),
    DF("DF", "Distrito Federal", "53"),
    GO("GO", "Goi\u00E1s", "52"),
    ES("ES", "Esp\u00EDrito Santo", "32"),
    MA("MA", "Maranh\u00E3o", "21"),
    MT("MT", "Mato Grosso", "51"),
    MS("MS", "Mato Grosso do Sul", "50"),
    MG("MG", "Minas Gerais", "31"),
    PA("PA", "Par\u00E1", "15"),
    PB("PB", "Paraiba", "25"),
    PR("PR", "Paran\u00E1", "41"),
    PE("PE", "Pernambuco", "26"),
    PI("PI", "Piau\u00ED", "22"),
    RJ("RJ", "Rio de Janeiro", "33"),
    RN("RN", "Rio Grande do Norte", "24"),
    RS("RS", "Rio Grande do Sul", "43"),
    RO("RO", "Rond\u00F4nia", "11"),
    RR("RR", "Roraima", "14"),
    SP("SP", "S\u00E3o Paulo", "35"),
    SC("SC", "Santa Catarina", "42"),
    SE("SE", "Sergipe", "28"),
    TO("TO", "Tocantins", "17"),
    NACIONAL("NC", "Nacional", "90"),
    RFB("RFB", "RFB", "91"),
    EX("EX", "Exterior", "99");

    private final String codigo;
    private final String descricao;
    private final String codigoIbge;

    private CTUnidadeFederativa(final String codigo, final String descricao, final String codigoIbge) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.codigoIbge = codigoIbge;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getCodigoIbge() {
        return this.codigoIbge;
    }

    @Override
    public String toString() {
        return this.getDescricao();
    }

    /**
     * Identifica a UF pela sigla ou pelo codigo IBGE.
     *
     * @param codigo Sigla ou codigo IBGE da UF.
     * @return CTUnidadeFederativa.
     */
    public static CTUnidadeFederativa valueOfCodigo(final String codigo) {
        for (final CTUnidadeFederativa uf : CTUnidadeFederativa.values()) {
            if (uf.getCodigo().equalsIgnoreCase(codigo)) {
                return uf;
            } else if (uf.getCodigoIbge().equalsIgnoreCase(codigo)) {
                return uf;
            }
        }
        throw new IllegalArgumentException(String.format("N\u00e3o existe o c\u00f3digo %s no mapeamento.", codigo));
    }
}
