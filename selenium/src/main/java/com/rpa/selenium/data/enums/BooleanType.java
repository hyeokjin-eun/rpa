package com.rpa.selenium.data.enums;

import lombok.Getter;

@Getter
public enum BooleanType {
    EQUALS(Values.EQUALS),
    IS(Values.IS)
    ;

    private final String type;

    BooleanType(String type) {
        this.type = type;
    }

    public static class Values {
        public static final String EQUALS = "EQUALS";
        public static final String IS = "IS";
    }
}
