package com.company.consumer.services;

import com.company.consumer.dtos.ReceivedMessageDto;
import com.company.consumer.dtos.SentMessageDto;

public interface RabbitService {

    void receive(ReceivedMessageDto message);

    void send(SentMessageDto message);
}
