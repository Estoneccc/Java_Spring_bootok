package com.example.DI.beans.kindTransports;


import org.springframework.stereotype.Component;

@Component
public class GroundTransport implements KindTransport {
    @Override
    public String getInformation() {
        return "GroundTransport";
    }

}
