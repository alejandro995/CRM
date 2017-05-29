//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.bbva.jee.arq.spring.core.servicing.gce.xml.instance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "error-metainfo",
        propOrder = {"property"}
)
public class ErrorMetainfo implements Serializable {
    private static final long serialVersionUID = 1L;
    protected List<ErrorMetainfoProperty> property;

    public ErrorMetainfo() {
    }

    public List<ErrorMetainfoProperty> getProperty() {
        if(this.property == null) {
            this.property = new ArrayList();
        }

        return this.property;
    }
}
