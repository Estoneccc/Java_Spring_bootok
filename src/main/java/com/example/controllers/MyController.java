package com.example.controllers;

import com.example.MyRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MyController {

    @PostMapping("/validate")
    public ResponseEntity<String> validateEmailAndDigit(@RequestBody @Valid MyRequest request) {
        return ResponseEntity.ok("Valid request: " + request.getEmail() + ", " + request.getDigit());
    }


}
