//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.bbva.jee.arq.spring.core.servicing.gce.xml.instance;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(
        name = "error-severity"
)
@XmlEnum
public enum ErrorSeverity {
    ERROR,
    FATAL,
    CRITICAL;

    private ErrorSeverity() {
    }

    public String value() {
        return this.name();
    }

    public static ErrorSeverity fromValue(String v) {
        return valueOf(v);
    }
}
