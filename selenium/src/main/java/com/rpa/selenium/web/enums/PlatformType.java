package com.rpa.selenium.web.enums;

import lombok.Getter;

@Getter
public enum PlatformType {
    FACEBOOK(Values.FACEBOOK),
    CHROME(Values.CHROME)
    ;

    private final String platform;

    PlatformType(String platform) {
        this.platform = platform;
    }

    public static class Values {
        public static final String FACEBOOK = "FACEBOOK";
        public static final String CHROME = "CHROME";
    }
}
