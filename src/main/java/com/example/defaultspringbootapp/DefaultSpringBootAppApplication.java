package com.example.defaultspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DefaultSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DefaultSpringBootAppApplication.class, args);
    }

    @GetMapping
    public String hello(){
        return "Hello World";
    }

}
