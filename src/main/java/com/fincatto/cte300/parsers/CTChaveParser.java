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
package com.fincatto.cte300.parsers;

import com.fincatto.cte300.classes.CTTipoEmissao;
import com.fincatto.cte300.classes.CTUnidadeFederativa;
import com.fincatto.nfe310.classes.NFModelo;
import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;

public class CTChaveParser {

    private final String chave;

    public CTChaveParser(final String chave) {
        this.chave = StringUtils.stripToEmpty(chave).replaceAll("\\D", "");
        if (this.chave.length() != 44) {
            throw new IllegalArgumentException(String.format("A chave deve ter exatos 44 caracteres numericos: %s", chave));
        }
    }

    public CTUnidadeFederativa getCTUnidadeFederativa() {
        return CTUnidadeFederativa.valueOfCodigo(this.chave.substring(0, 2));
    }

    public LocalDate getDataEmissao() {
        return LocalDate.of(this.getDataEmissaoAno(), this.getDataEmissaoMes(), 1);
    }

    private int getDataEmissaoMes() {
        return Integer.parseInt(this.chave.substring(4, 6));
    }

    private int getDataEmissaoAno() {
        return 2000 + Integer.parseInt(this.chave.substring(2, 4));
    }

    public String getCnpjEmitente() {
        return this.chave.substring(6, 20);
    }

    public NFModelo getModelo() {
        return NFModelo.valueOfCodigo(this.chave.substring(20, 22));
    }

    public String getSerie() {
        return this.chave.substring(22, 25);
    }

    public String getNumero() {
        return this.chave.substring(25, 34);
    }

    public CTTipoEmissao getFormaEmissao() {
        return CTTipoEmissao.valueOfCodigo(this.chave.substring(34, 35));
    }

    public String getCodigoNumerico() {
        return this.chave.substring(35, 43);
    }

    public String getDV() {
        return this.chave.substring(43, 44);
    }

    public boolean isEmitidaContingenciaEPEC() {
        return this.chave.matches("\\d{34}4\\d{9}");
    }

    public boolean isEmitidaContingenciaFSDA() {
        return this.chave.matches("\\d{34}5\\d{9}");
    }

    public boolean isEmitidaContingenciaSCVRS() {
        return this.chave.matches("\\d{34}7\\d{9}");
    }

    public boolean isEmitidaContingenciaSCVSP() {
        return this.chave.matches("\\d{34}8\\d{9}");
    }

    public String getFormatado() {
        return this.chave.replaceFirst("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{4})", "$1 $2 $3 $4 $5 $6 $7 $8 $9 $10 $11");
    }
}
