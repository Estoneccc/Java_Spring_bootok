package com.example.DI.beans.transport;

import com.example.DI.beans.kindTransports.KindTransport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class Airplane {
    @Qualifier("Airplane")
    public KindTransport kindTransport;

    @PostConstruct
    public void postConstruct() {
        log.info("Airplane bean created");
    }

    @PreDestroy
    public void PreDestroy() {
        log.info("Airplane bean deleted");
    }
}
