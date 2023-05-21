package com.example;

import com.example.beans.BeanFirst;
import com.example.beans.BeanSecond;
import com.example.beans.BeanThird;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {
    @Bean
    @Profile("test")
    public BeanFirst firstBean() {
        return new BeanFirst();
    }

    @Bean
    @ConditionalOnBean(BeanFirst.class)
    public BeanSecond secondBean() {
        return new BeanSecond();
    }

    @Bean
    @Profile("test")
    @ConditionalOnProperty(name = "app.environment", havingValue = "default", matchIfMissing = true)
    public BeanThird thirdBean() {
        return new BeanThird();
    }
}
