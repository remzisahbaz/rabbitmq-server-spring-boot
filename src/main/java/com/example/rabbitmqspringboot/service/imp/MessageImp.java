package com.example.rabbitmqspringboot.service.imp;

import com.example.rabbitmqspringboot.model.Message;

/**
 * @Project
 * @Created by Author (remzisahbaz)
 * @Date (24.12.2022)
 **/

public interface MessageImp {
    public void sendMessage(Message message);
    public void handlerMessage(Message message);
}
