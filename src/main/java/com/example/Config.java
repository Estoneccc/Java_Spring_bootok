package com.example;

import com.example.beans.BeanFirst;
import com.example.beans.BeanSecond;
import com.example.beans.BeanThird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
public class Config {

    @Autowired
    private Environment env;

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
    public BeanThird thirdBean() {
        String appEnvironment = env.getProperty("app.environment", "default");
        if (!"default".equals(appEnvironment)) {
            return new BeanThird();
        }
        return null;
    }
}
