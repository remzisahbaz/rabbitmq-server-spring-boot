package com.example.rabbitmqspringboot.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;



/**
 * @Project
 * @Created by Author (remzisahbaz)
 * @Date (24.12.2022)
 **/

@Configuration
public class RabbitMQConfig {

    @Value("${spring.rabbitmq.queue.json.fromQueue}")
    private String queue;
    @Value("${spring.rabbitmq.key.toKey}")
    private String key;

    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    public Queue toQueue(){
        return new Queue(queue,true);
    }


    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("exc");
    }

    @Bean
    public Binding binding(){
        return BindingBuilder
                .bind(toQueue())
                .to(topicExchange())
                .with(key);

    }

   @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory){
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMandatory(true);
        return rabbitTemplate;

   }

   @Bean
    public MessageConverter converter(){
        return new Jackson2JsonMessageConverter(objectMapper);
   }

   @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
   }
}

