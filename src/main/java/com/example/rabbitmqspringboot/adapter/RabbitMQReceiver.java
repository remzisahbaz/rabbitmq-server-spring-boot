package com.example.rabbitmqspringboot.adapter;

import com.example.rabbitmqspringboot.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Project
 * @Created by Author (remzisahbaz)
 * @Date (24.12.2022)
 **/

@Component
@Slf4j
public class RabbitMQReceiver {

    @RabbitListener(queues = "toQueue")
    private void handlerMessage(Message message){
        log.info("alınan mesage",message.getMessageText());
    }
}
