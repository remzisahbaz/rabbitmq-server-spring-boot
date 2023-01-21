package com.example.rabbitmqspringboot.controller;

import com.example.rabbitmqspringboot.model.Message;
import com.example.rabbitmqspringboot.service.MessageService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @Project
 * @Created by Author (remzisahbaz)
 * @Date (24.12.2022)
 **/

@RequestScope
@RestController
@RequestMapping("/api/v1")
public class MessageController {

    private MessageService messageService;

    @PostMapping("/send")
    public void sendMessage(@RequestBody @NonNull Message message){
        messageService.sendMessage(message);

    }

}
