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

import org.simpleframework.xml.Element;

/**
 *
 * @author Fagner Granella
 */
public class CTeInfoInformacaoComplementar {

    @Element(name = "xCaracAd", required = false)
    private String caracteristicaTransporte;

    @Element(name = "xCaracSer", required = false)
    private String caracteristicaServico;

    @Element(name = "xEmi", required = false)
    private String funcionarioEmissor;
}
