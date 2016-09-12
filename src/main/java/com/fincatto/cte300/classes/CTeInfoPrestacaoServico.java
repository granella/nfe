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
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 *
 * @author Fagner Granella
 */
public class CTeInfoPrestacaoServico {

    @Element(name = "vTPrest")
    private String valorTotal;

    @Element(name = "vRec")
    private String valorReceber;

    @ElementList(entry = "Comp", inline = true, required = false)
    private List<CTeInfoComponentePrestacaoServico> componentes;

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(String valorReceber) {
        this.valorReceber = valorReceber;
    }

    public List<CTeInfoComponentePrestacaoServico> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<CTeInfoComponentePrestacaoServico> componentes) {
        this.componentes = componentes;
    }

}
