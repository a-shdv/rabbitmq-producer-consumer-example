package com.company.producer.dto;

import com.company.producer.utils.Color;
import com.company.producer.utils.ColorMode;
import com.company.producer.utils.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class MessageDto implements Serializable {

    private ErrorCode errorCode;

    private Color color;

    private ColorMode colorMode;
}
