package com.example.di.beans.kindtransports;


import org.springframework.stereotype.Component;

@Component
public class GroundTransport implements KindTransport {
    @Override
    public String getInformation() {
        return "GroundTransport";
    }

}
