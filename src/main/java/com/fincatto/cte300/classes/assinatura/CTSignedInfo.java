package com.fincatto.cte300.classes.assinatura;

import org.simpleframework.xml.Element;

/**
 *
 * @author Fagner Granella
 */
public class CTSignedInfo {

    @Element(name = "CanonicalizationMethod", required = false)
    private CTCanonicalizationMethod canonicalizationMethod;

    @Element(name = "SignatureMethod", required = false)
    private CTSignatureMethod signatureMethod;

    @Element(name = "Reference", required = false)
    private CTReference reference;

    public CTCanonicalizationMethod getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    public void setCanonicalizationMethod(CTCanonicalizationMethod canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    public CTSignatureMethod getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(CTSignatureMethod signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public CTReference getReference() {
        return reference;
    }

    public void setReference(CTReference reference) {
        this.reference = reference;
    }

}
