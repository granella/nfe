package com.fincatto.cte300.classes.assinatura;

import org.simpleframework.xml.Attribute;

/**
 *
 * @author Fagner Granella
 */
public class CTCanonicalizationMethod {

    @Attribute(name = "Algorithm", required = false)
    private String algorithm;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

}
