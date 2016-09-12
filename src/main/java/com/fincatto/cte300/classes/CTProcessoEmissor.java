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
public enum CTProcessoEmissor {

    CONTRIBUINTE("0", "Aplicativo do contribuinte"),
    AVULSA_FISCO("1", "Emiss\u00e3o de CT-e avulsa pelo Fisco"),
    AVULSA_CONTRIBUINTE_COM_CERTIFICADO_DIGITAL_FISCO("2", "Emiss\u00e3o de CT-e avulsa, pelo contribuinte com certificado digital atrav\u00e9s do Fisco"),
    CONTRIBUINTE_APLICATIVO_FISCO("3", "Emiss\u00e3o de CT-e pelo contribuinte com aplicativo fornecido pelo Fisco");

    private final String codigo;
    private final String descricao;

    private CTProcessoEmissor(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static CTProcessoEmissor valueOfCodigo(final String codigo) {
        for (final CTProcessoEmissor tipo : CTProcessoEmissor.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }

}
