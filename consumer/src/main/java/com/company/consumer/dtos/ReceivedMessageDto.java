package com.company.consumer.dtos;

import com.company.consumer.utils.Color;
import com.company.consumer.utils.ColorMode;
import com.company.consumer.utils.ErrorCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class ReceivedMessageDto implements Serializable {
    private ErrorCode errorCode;
    private Color color;
    private ColorMode colorMode;
}
