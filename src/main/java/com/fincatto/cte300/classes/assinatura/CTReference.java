package com.fincatto.cte300.classes.assinatura;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Path;

/**
 *
 * @author Fagner Granella
 */
public class CTReference {

    @Attribute(name = "URI", required = false)
    private String uri;

    @Path("Transforms")
    @Attribute(name = "Transforms", required = false)
    private List<CTTransform> transforms;

    @Attribute(name = "DigestMethod", required = false)
    private CTDigestMethod digestMethod;

    @Attribute(name = "DigestValue", required = false)
    private String digestValue;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<CTTransform> getTransforms() {
        return transforms;
    }

    public void setTransforms(List<CTTransform> transforms) {
        this.transforms = transforms;
    }

    public CTDigestMethod getDigestMethod() {
        return digestMethod;
    }

    public void setDigestMethod(CTDigestMethod digestMethod) {
        this.digestMethod = digestMethod;
    }

    public String getDigestValue() {
        return digestValue;
    }

    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }

}
