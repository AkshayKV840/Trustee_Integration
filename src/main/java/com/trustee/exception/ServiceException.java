package com.trustee.exception;

public class ServiceException extends RuntimeException {

    private String details = "";

    public ServiceException(String exception) {
        super(exception);
    }
    
    public ServiceException(String exception, String details) {
        super(exception);
        this.details = details;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
