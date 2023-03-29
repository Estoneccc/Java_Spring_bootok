package com.example.di.beans.transport;

import com.example.di.beans.kindtransports.KindTransport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
@Slf4j
public class Bus {
    public KindTransport kindTransport;
    @PostConstruct
    public void postConstruct() {
        log.info("Bus bean created");
    }

    @PreDestroy
    public void PreDestroy() {
        log.info("Bus bean deleted");
    }

    @Autowired
    public void setType(@Qualifier("groundTransport") KindTransport kindTransport) {
        this.kindTransport = kindTransport;
    }
}
