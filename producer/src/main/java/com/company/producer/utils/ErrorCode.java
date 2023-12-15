package com.company.producer.utils;

/** Код ошибки */
public enum ErrorCode {
    /** Штатный режим */
    Working(0),

    /** Ошибка связи с контроллером */
    PLC_ERROR(1);

    private int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
