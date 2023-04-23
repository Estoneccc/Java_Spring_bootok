package com.WebS.exception_handling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpServerErrorException;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(HttpServerErrorException.class)
    @ResponseBody
    public String handleBadGatewayException() {
        return "Custom error 502";
    }
}
