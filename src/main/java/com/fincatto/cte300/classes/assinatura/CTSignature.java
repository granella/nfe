package com.fincatto.cte300.classes.assinatura;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

/**
 *
 * @author Fagner Granella
 */
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class CTSignature {

    @Element(name = "SignedInfo", required = false)
    private CTSignedInfo signedInfo;

    @Element(name = "SignatureValue", required = false)
    private String signatureValue;

    @Element(name = "KeyInfo", required = false)
    private CTKeyInfo keyInfo;

    public CTSignedInfo getSignedInfo() {
        return signedInfo;
    }

    public void setSignedInfo(CTSignedInfo signedInfo) {
        this.signedInfo = signedInfo;
    }

    public String getSignatureValue() {
        return signatureValue;
    }

    public void setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
    }

    public CTKeyInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(CTKeyInfo keyInfo) {
        this.keyInfo = keyInfo;
    }

}
