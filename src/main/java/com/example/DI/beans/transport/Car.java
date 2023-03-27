package com.example.DI.beans.transport;

import com.example.DI.beans.kindTransports.KindTransport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class Car{
    public KindTransport kindTransport;

    public Car(@Qualifier("groundTransport") KindTransport kindTransport) {
        this.kindTransport = kindTransport;
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Car bean created");
    }

    @PreDestroy
    public void PreDestroy() {
        log.info("Car bean deleted");
    }
}
