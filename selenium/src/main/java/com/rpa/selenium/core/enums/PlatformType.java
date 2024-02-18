package com.rpa.selenium.core.enums;

import lombok.Getter;

@Getter
public enum PlatformType {
    WEB(Values.WEB),
    API(Values.API)
    ;

    private final String platform;

    PlatformType(String platform) {
        this.platform = platform;
    }

    public static class Values {
        public static final String WEB = "WEB";
        public static final String API = "API";
    }
}
