package com.fincatto.cte300.classes.assinatura;

import org.simpleframework.xml.Element;

/**
 *
 * @author Fagner Granella
 */
public class CTKeyInfo {

    @Element(name = "X509Data", required = false)
    private CTX509Data data;

    public CTX509Data getData() {
        return data;
    }

    public void setData(CTX509Data data) {
        this.data = data;
    }

}
