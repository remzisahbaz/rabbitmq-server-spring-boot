package com.example.rabbitmqspringboot.adapter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @Project
 * @Created by Author (remzisahbaz)
 * @Date (24.12.2022)
 **/

@Component
@Slf4j
public class RabbitMQProdecure {

    private RabbitTemplate rabbitTemplate;

    private void sendMessage(){

        rabbitTemplate.convertAndSend("exc","producer.to.consumer","{'message':'message'}");
        log.info("mesaj gönderildi");
    }
}
