package com.bbva.ekip.arq.clients.tipos;

import com.bbva.jee.arq.spring.core.servicing.gce.xml.instance.ErrorSeverity;

/**
 * Created by christian on 29/11/16.
 */
public class ExcepcionClienteRest extends Exception{
    private int httpStatus;
    private String severity;
    private int version;
    private String errorCode;
    private String errorMessage;
    private String consumerRequestId;
    private String systemErrorCode;
    private String systemErrorDescription;

    public ExcepcionClienteRest(String message, int httpStatus, String severity, int version, String errorCode, String errorMessage, String consumerRequestId, String systemErrorCode, String systemErrorDescription) {
        super(message);
        this.httpStatus = httpStatus;
        this.severity = severity;
        this.version = version;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.consumerRequestId = consumerRequestId;
        this.systemErrorCode = systemErrorCode;
        this.systemErrorDescription = systemErrorDescription;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getConsumerRequestId() {
        return consumerRequestId;
    }

    public void setConsumerRequestId(String consumerRequestId) {
        this.consumerRequestId = consumerRequestId;
    }

    public String getSystemErrorCode() {
        return systemErrorCode;
    }

    public void setSystemErrorCode(String systemErrorCode) {
        this.systemErrorCode = systemErrorCode;
    }

    public String getSystemErrorDescription() {
        return systemErrorDescription;
    }

    public void setSystemErrorDescription(String systemErrorDescription) {
        this.systemErrorDescription = systemErrorDescription;
    }
}
