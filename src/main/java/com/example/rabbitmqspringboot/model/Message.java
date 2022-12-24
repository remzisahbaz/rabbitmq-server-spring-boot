package com.example.rabbitmqspringboot.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Project
 * @Created by Author (remzisahbaz)
 * @Date (24.12.2022)
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String messageId;
    private String from;
    private String to;
    private String messageText;

}
