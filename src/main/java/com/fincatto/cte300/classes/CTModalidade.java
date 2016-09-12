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
public enum CTModalidade {

    RODOVIARIO("01", "Rodoviário"),
    AEREO("02", "Aéreo"),
    AQUAVIARIO("03", "Aquaviário"),
    FERROVIARIO("04", "Ferroviário"),
    DUTOVIARIO("05", "Dutoviário"),
    MULTIMODAL("06", "Multimodal");

    private final String codigo;
    private final String descricao;

    private CTModalidade(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static CTModalidade valueOfCodigo(final String codigo) {
        for (final CTModalidade tipo : CTModalidade.values()) {
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
