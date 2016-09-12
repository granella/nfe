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
public enum CTTomadorServico {

    REMETENTE("0", "Remetente"),
    EXPEDIDOR("1", "Expedidor"),
    RECEBEDOR("2", "Recebedor"),
    DESTINATARIO("3", "Destinatário");

    private final String codigo;
    private final String descricao;

    private CTTomadorServico(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public static CTTomadorServico valueOfCodigo(final String codigo) {
        for (final CTTomadorServico tipo : CTTomadorServico.values()) {
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
