package com.company.producer.serv;

import com.company.producer.dto.MessageDto;

public interface RabbitMQProducerService {

    void sendMessage(MessageDto dto);

}