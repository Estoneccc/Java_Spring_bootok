package com.example;

import com.example.annotations.IsDigit;
import com.example.annotations.ValidEmail;

public class MyRequest {
    @ValidEmail
    private String email;

    @IsDigit
    private String digit;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit;
    }
}
