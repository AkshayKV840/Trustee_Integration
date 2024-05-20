package com.trustee.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        ExceptionResponse exceptionResponse = null;
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        if (ex instanceof ServiceException) {
            exceptionResponse = new ExceptionResponse(400, ex.getMessage(), ((ServiceException) ex).getDetails());
            httpStatus = HttpStatus.BAD_REQUEST;
        } else {
            exceptionResponse = new ExceptionResponse(500, ErrorCode.MS500, ex.getMessage(),
                    request.getDescription(true));

        }

        return new ResponseEntity<>(exceptionResponse, httpStatus);
    }


    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {

        List<String> errors = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            ((FieldError) error).getField();
            if (!errors.contains(error.getDefaultMessage())) {
                errors.add(error.getDefaultMessage());
            }

        });

        ExceptionResponse exceptionResponse = new ExceptionResponse(400, errors.toString(), "");
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ApiException.class)
    public final ResponseEntity<Object> handleApiException(ApiException ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(400, ex.getMessage(), "");

        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PermissionException.class)
    public final ResponseEntity<Object> handlePermission(PermissionException ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(403, ErrorCode.MS403, "");

        return new ResponseEntity<>(exceptionResponse, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public final ResponseEntity<Object> handleAnauthorized(ApiException ex, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(401, ErrorCode.MS401, ex.getMessage());

        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
