package com.rpa.selenium.core.enums;

public enum ResponseCode {
    WEB_SUCCESS(2200, "Web Auto Service Success");

    private final int code;

    private final String message;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
