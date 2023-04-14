package com.example.springsecurityjwt.exception;


public class ServiceException extends RuntimeException {
    public ServiceException(String message) {
        super(message);
    }
}

