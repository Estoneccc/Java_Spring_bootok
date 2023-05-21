package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
@Profile({"dev", "test", "prod"})
public class Dz1Application {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(Dz1Application.class, args);
    }

    @GetMapping("/my-list-values")
    public List<String> getMyListValues() {
        String propertyValue = env.getProperty("my.list.values");
        if (propertyValue != null) {
            return Arrays.asList(propertyValue.split(","));
        } else {
            return Collections.emptyList();
        }
    }
}
