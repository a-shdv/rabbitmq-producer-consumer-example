package com.company.consumer.exceptions;

public class RabbitMqException extends RuntimeException {

    public RabbitMqException(String message) {
        super(message);
    }

}
