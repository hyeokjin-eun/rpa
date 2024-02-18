package com.rpa.selenium.data.enums;

import lombok.Getter;

@Getter
public enum ForEachType {
    CLICK(Values.CLICK),
    INPUT(Values.INPUT),
    DATA(Values.DATA)
    ;

    private final String type;

    ForEachType(String type) {
        this.type = type;
    }

    public static class Values {
        public static final String CLICK = "CLICK";
        public static final String INPUT = "INPUT";
        public static final String DATA = "DATA";
    }
}
