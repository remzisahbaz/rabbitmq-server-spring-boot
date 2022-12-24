package com.example.rabbitmqspringboot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;



/**
 * @Project
 * @Created by Author (remzisahbaz)
 * @Date (24.12.2022)
 **/

@Configuration
public class RabbitMQConfig {

    @Value("${queue}")
    private String queue;

    private Queue queue(){
        return new Queue("xx",true);
    }


}

