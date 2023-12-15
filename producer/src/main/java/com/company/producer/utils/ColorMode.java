package com.company.producer.utils;

/** Режим лампы */
public enum ColorMode {
    /** Включена */
    ON(0),

    /** Выключена */
    OFF(1),

    /** Моргает */
    FLASH(2);

    private int code;

    ColorMode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
