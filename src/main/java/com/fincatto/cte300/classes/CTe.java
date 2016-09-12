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

import com.fincatto.cte300.classes.assinatura.CTSignature;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 *
 * @author Fagner Granella
 */
@Root(name = "CTe")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTe {

    @Element(name = "infCte")
    private CTeInfo info;

    @Element(name = "Signature", required = false)
    private CTSignature assinatura;

    public CTeInfo getInfo() {
        return info;
    }

    public void setInfo(CTeInfo info) {
        this.info = info;
    }

    public CTSignature getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(CTSignature assinatura) {
        this.assinatura = assinatura;
    }

}
