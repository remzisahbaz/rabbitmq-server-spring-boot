package com.example.rabbitmqspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RabbitmqSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqSpringBootApplication.class, args);
    }

}
