package com.WebS.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class ControllerHeader {

    @GetMapping("/headers")
    public Map<String, String> getHeaders(@RequestHeader Map<String, String> headers) {
        return Collections.unmodifiableMap(headers);
    }

    // Если нужно получить только конкретный заголовок
    @GetMapping("/headers")
    public String getSpecificHeader(@RequestHeader("Header") String specificHeader) {
        return "Header: " + specificHeader;
    }
}
