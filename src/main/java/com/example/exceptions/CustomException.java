package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpServerErrorException;

@ControllerAdvice
public class CustomException {

    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ExceptionHandler(HttpServerErrorException.class)
    public void handleBadGatewayException() {
    }
}
