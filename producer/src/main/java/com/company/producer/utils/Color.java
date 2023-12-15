package com.company.producer.utils;

/** Цвет */
public enum Color {
    /** Красный */
    RED(0),

    /** Зеленый */
    GREEN(1);

    private int code;

    Color(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
