package com.springboot.pms.exception;
import org.springframework.http.HttpStatus;

public class PmsAPIException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public PmsAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public PmsAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
