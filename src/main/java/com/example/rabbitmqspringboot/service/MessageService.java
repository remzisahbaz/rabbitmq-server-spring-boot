package com.example.rabbitmqspringboot.service;

import com.example.rabbitmqspringboot.adapter.RabbitMQProducer;
import com.example.rabbitmqspringboot.model.Message;
import com.example.rabbitmqspringboot.service.imp.MessageImp;
import org.springframework.stereotype.Service;

/**
 * @Project
 * @Created by Author (remzisahbaz)
 * @Date (24.12.2022)
 **/

@Service
public class MessageService implements MessageImp {

    private RabbitMQProducer rabbitMQProducer;
    @Override
    public void sendMessage(Message message) {
        rabbitMQProducer.sendMessage(message);
    }

    @Override
    public void handlerMessage(Message message) {

    }
}
