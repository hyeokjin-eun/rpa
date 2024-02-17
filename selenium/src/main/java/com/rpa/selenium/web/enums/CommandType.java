package com.rpa.selenium.web.enums;

import lombok.Getter;

@Getter
public enum CommandType {
    CLICK(Values.CLICK),
    FOCUS(Values.FOCUS),
    WAIT(Values.WAIT),
    INPUT(Values.INPUT),
    ENTER(Values.ENTER),
    SCROLL(Values.SCROLL),
    KEY_TARGET(Values.KEY_TARGET),
    KEY_WINDOW(Values.KEY_WINDOW),
    DATA(Values.DATA)
    ;

    private final String type;

    CommandType(String type) {
        this.type = type;
    }

    public static class Values {
        public static final String CLICK = "CLICK";
        public static final String FOCUS = "FOCUS";
        public static final String WAIT = "WAIT";
        public static final String INPUT = "INPUT";
        public static final String ENTER = "ENTER";
        public static final String SCROLL = "SCROLL";
        public static final String KEY_TARGET = "KEY_TARGET";
        public static final String KEY_WINDOW = "KEY_WINDOW";
        public static final String DATA = "DATA";
    }
}
