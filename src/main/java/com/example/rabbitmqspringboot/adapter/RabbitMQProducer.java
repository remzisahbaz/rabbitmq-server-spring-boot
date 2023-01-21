package com.example.rabbitmqspringboot.adapter;

import com.example.rabbitmqspringboot.model.Message;
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
public class RabbitMQProducer {

    private RabbitTemplate rabbitTemplate;

    public void sendMessage(Message message){

        rabbitTemplate.convertAndSend("exc","producer.to.consumer","");
        log.info("mesaj gönderildi----> data :", message);
    }
}
