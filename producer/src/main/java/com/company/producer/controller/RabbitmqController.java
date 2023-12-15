package com.company.producer.controller;

import com.company.producer.conf.RabbitMqProperties;
import com.company.producer.dto.MessageDto;
import com.company.producer.serv.RabbitMQProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RabbitmqController {

    private final RabbitMQProducerService rabbitMQProducerService;

    @Autowired
    public RabbitmqController(RabbitMQProducerService rabbitMQProducerService) {
        this.rabbitMQProducerService = rabbitMQProducerService;
    }

    @GetMapping("/send")
    public void sendMessageToRabbit(@RequestBody MessageDto messageDto) {
        rabbitMQProducerService.sendMessage(messageDto);
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}