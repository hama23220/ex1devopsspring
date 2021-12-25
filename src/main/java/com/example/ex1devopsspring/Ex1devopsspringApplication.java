package com.example.ex1devopsspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class Ex1devopsspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ex1devopsspringApplication.class, args);
    }

}
