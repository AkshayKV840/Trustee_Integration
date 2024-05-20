package com.trustee.exception;

import lombok.Getter;

@Getter
public class ExceptionResponse {
    
    
    private int status;
    private String errorMessage;
    private String errorCode;
    private String errorDetails;

    public ExceptionResponse(int status, String code, String error, String details) {
        super();
        this.status = status;
        this.errorMessage = error;
        this.errorCode = code;
        this.errorDetails = details;
        
        
        this.setErrorDetails(error);
    }
    
    public ExceptionResponse(int status, String code, String details) {
        super();
        
        this.status = status;
        this.errorCode = code;
        this.errorDetails = details;
        
        this.setErrorDetails(code);
    }
    
    
    public void setErrorDetails(String errorCode){
        
        String error = ErrorCode.getErrorDetails(errorCode);
        
        if(error != null){
            this.errorMessage = error;
        }else if(this.errorMessage == null){
            this.errorMessage = this.errorCode;
        }
    }
}
