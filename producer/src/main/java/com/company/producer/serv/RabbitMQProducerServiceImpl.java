package com.company.producer.serv;

import com.company.producer.conf.RabbitMqProperties;
import com.company.producer.dto.MessageDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQProducerServiceImpl implements RabbitMQProducerService {

    private final RabbitTemplate rabbitTemplate;
    private final RabbitMqProperties rabbitMqProperties;

    @Autowired
    public RabbitMQProducerServiceImpl(RabbitTemplate rabbitTemplate, RabbitMqProperties rabbitMqProperties) {
        this.rabbitTemplate = rabbitTemplate;
        this.rabbitMqProperties = rabbitMqProperties;
    }

    public void sendMessage(MessageDto dto) {
        rabbitTemplate.convertAndSend(rabbitMqProperties.getTopic(),  rabbitMqProperties.getRoutingKeyToSend(), dto);
    }

}