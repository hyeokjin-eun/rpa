package com.rpa.selenium.data.enums;

import lombok.Getter;

@Getter
public enum CommandType {
    CLICK(Values.CLICK),
    WAIT(Values.WAIT),
    INPUT(Values.INPUT),
    SCROLL(Values.SCROLL),
    KEY_TARGET(Values.KEY_TARGET),
    KEY_WINDOW(Values.KEY_WINDOW),
    IF_ELSE(Values.IF_ELSE),
    FOR_EACH(Values.FOR_EACH),
    DATA(Values.DATA)
    ;

    private final String type;

    CommandType(String type) {
        this.type = type;
    }

    public static class Values {
        public static final String CLICK = "CLICK";
        public static final String WAIT = "WAIT";
        public static final String INPUT = "INPUT";
        public static final String SCROLL = "SCROLL";
        public static final String KEY_TARGET = "KEY_TARGET";
        public static final String KEY_WINDOW = "KEY_WINDOW";
        public static final String IF_ELSE = "IF_ELSE";
        public static final String FOR_EACH = "FOR_EACH";
        public static final String DATA = "DATA";
    }
}
