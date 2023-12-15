package com.company.consumer.services.impl;

import com.company.consumer.dtos.ReceivedMessageDto;
import com.company.consumer.dtos.SentMessageDto;
import com.company.consumer.properties.RabbitMqProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@EnableRabbit
@Slf4j
public class RabbitMqServiceImpl implements com.company.consumer.services.RabbitService {

    private final RabbitTemplate rabbitTemplate;

    private final RabbitMqProperties rabbitProperties;

    @Override
    @RabbitListener(queues = "${rabbitmq.queue-to-receive}")
    public void receive(ReceivedMessageDto message) {
        log.info("===================================");
        log.info("RECEIVED:");
        log.info("{");
        log.info("\t{},",message.getErrorCode());
        log.info("\t{},",message.getColor());
        log.info("\t{},",message.getColorMode());
        log.info("}");
        log.info("===================================");
    }

    @Override
    public void send(SentMessageDto message) {

    }

}
