//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.bbva.jee.arq.spring.core.servicing.gce.xml.instance;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "error-metainfo-property",
        propOrder = {"value"}
)
public class ErrorMetainfoProperty implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute(
            namespace = "http://bbva.com/arq-spring-servicing/gce-extension",
            required = true
    )
    protected String name;

    public ErrorMetainfoProperty() {
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }
}
