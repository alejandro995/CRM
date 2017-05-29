//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.bbva.jee.arq.spring.core.servicing.gce.xml.instance;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.exc.UnrecognizedPropertyException;
import org.codehaus.jackson.xc.JaxbAnnotationIntrospector;

import javax.ws.rs.WebApplicationException;
import javax.xml.bind.annotation.*;
import java.io.IOException;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "error-instance",
        propOrder = {"version", "httpStatus", "errorCode", "errorMessage", "severity", "consumerRequestId", "systemErrorCode", "systemErrorDescription", "systemErrorCause", "errorMetainfo"}
)
public class ErrorInstance implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlSchemaType(
            name = "unsignedShort"
    )
    protected int version;
    @XmlElement(
            name = "http-status"
    )
    @XmlSchemaType(
            name = "unsignedShort"
    )
    protected int httpStatus;
    @XmlElement(
            name = "error-code",
            required = true
    )
    protected String errorCode;
    @XmlElement(
            name = "error-message",
            required = true
    )
    protected String errorMessage;
    @XmlElement(
            required = true
    )
    protected ErrorSeverity severity;
    @XmlElement(
            name = "consumer-request-id",
            required = true
    )
    protected String consumerRequestId;
    @XmlElement(
            name = "system-error-code"
    )
    protected String systemErrorCode;
    @XmlElement(
            name = "system-error-description"
    )
    protected String systemErrorDescription;
    @XmlElement(
            name = "system-error-cause"
    )
    protected String systemErrorCause;
    @XmlElement(
            name = "error-metainfo"
    )
    protected ErrorMetainfo errorMetainfo;

    public ErrorInstance() {
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int value) {
        this.version = value;
    }

    public int getHttpStatus() {
        return this.httpStatus;
    }

    public void setHttpStatus(int value) {
        this.httpStatus = value;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    public ErrorSeverity getSeverity() {
        return this.severity;
    }

    public void setSeverity(ErrorSeverity value) {
        this.severity = value;
    }

    public String getConsumerRequestId() {
        return this.consumerRequestId;
    }

    public void setConsumerRequestId(String value) {
        this.consumerRequestId = value;
    }

    public String getSystemErrorCode() {
        return this.systemErrorCode;
    }

    public void setSystemErrorCode(String value) {
        this.systemErrorCode = value;
    }

    public String getSystemErrorDescription() {
        return this.systemErrorDescription;
    }

    public void setSystemErrorDescription(String value) {
        this.systemErrorDescription = value;
    }

    public String getSystemErrorCause() {
        return this.systemErrorCause;
    }

    public void setSystemErrorCause(String value) {
        this.systemErrorCause = value;
    }

    public ErrorMetainfo getErrorMetainfo() {
        return this.errorMetainfo;
    }

    public void setErrorMetainfo(ErrorMetainfo value) {
        this.errorMetainfo = value;
    }

    public static ErrorInstance fromJsonToErrorInstance(String json) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return (ErrorInstance)mapper.readValue(json, ErrorInstance.class);
        } catch (UnrecognizedPropertyException var4) {
            ObjectMapper mapperWithAnnotation = new ObjectMapper();
            JaxbAnnotationIntrospector introspector = new JaxbAnnotationIntrospector();
            mapperWithAnnotation.setAnnotationIntrospector(introspector);
            mapperWithAnnotation.getDeserializationConfig().withAnnotationIntrospector(introspector);
            return (ErrorInstance)mapperWithAnnotation.readValue(json, ErrorInstance.class);
        }
    }

    public static ErrorInstance fromJsonToErrorInstance(WebApplicationException ex) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return (ErrorInstance)mapper.readValue(ex.getLocalizedMessage(), ErrorInstance.class);
        } catch (UnrecognizedPropertyException var4) {
            ObjectMapper mapperWithAnnotation = new ObjectMapper();
            JaxbAnnotationIntrospector introspector = new JaxbAnnotationIntrospector();
            mapperWithAnnotation.setAnnotationIntrospector(introspector);
            mapperWithAnnotation.getDeserializationConfig().withAnnotationIntrospector(introspector);
            return (ErrorInstance)mapperWithAnnotation.readValue(ex.getLocalizedMessage(), ErrorInstance.class);
        }
    }
}
