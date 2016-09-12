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

import com.fincatto.cte300.classes.CTe;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;

/**
 *
 * @author Fagner Granella
 */
public class CTGeraChave {

    private final CTe cte;

    public CTGeraChave(final CTe cte) {
        this.cte = cte;
    }

    public String geraCodigoRandomico() {
        final Random random = new Random(cte.getInfo().getIdentificacao().getDataHoraEmissao().atZone(ZoneId.systemDefault()).toEpochSecond());
        return StringUtils.leftPad(String.valueOf(random.nextInt(100000000)), 8, "0");
    }

    public String getChaveAcesso() {
        return String.format("%s%s", geraChaveAcessoSemDV(), getDV());
    }

    public Integer getDV() {
        final char[] valores = this.geraChaveAcessoSemDV().toCharArray();
        final int[] valoresInt = {2, 3, 4, 5, 6, 7, 8, 9};
        int indice = 0;
        int soma = 0;
        int valorTemp;
        int multTemp;
        for (int i = valores.length; i > 0; i--) {
            if (indice >= valoresInt.length) {
                indice = 0;
            }

            valorTemp = Integer.parseInt(String.valueOf(valores[i - 1]));
            multTemp = valoresInt[indice++];
            soma += valorTemp * multTemp;
        }
        final int dv = 11 - (soma % 11);
        return ((dv == 11) || (dv == 10)) ? 0 : dv;
    }

    private String geraChaveAcessoSemDV() {
        if (StringUtils.isBlank(cte.getInfo().getIdentificacao().getCodigoRandomico())) {
            throw new IllegalStateException("Codigo randomico deve estar presente para gerar a chave de acesso");
        }
        return StringUtils.leftPad(cte.getInfo().getIdentificacao().getUf().getCodigoIbge(), 2, "0")
                + StringUtils.leftPad(cte.getInfo().getIdentificacao().getDataHoraEmissao().format(DateTimeFormatter.ofPattern("yyMM")), 4, "0")
                + StringUtils.leftPad(cte.getInfo().getEmitente().getCnpj(), 14, "0")
                + StringUtils.leftPad(cte.getInfo().getIdentificacao().getModelo(), 2, "0")
                + StringUtils.leftPad(cte.getInfo().getIdentificacao().getSerie(), 3, "0")
                + StringUtils.leftPad(cte.getInfo().getIdentificacao().getNumeroCTe(), 9, "0")
                + StringUtils.leftPad(cte.getInfo().getIdentificacao().getTipoEmissao().getCodigo(), 1, "0")
                + StringUtils.leftPad(cte.getInfo().getIdentificacao().getCodigoRandomico(), 8, "0");
    }
}
