package com.rpa.selenium.web.enums;

import lombok.Getter;

@Getter
public enum PlatformType {
    FACEBOOK(Values.FACEBOOK),
    CHROME(Values.CHROME),
    NAVER_MAP(Values.NAVER_MAP)
    ;

    private final String platform;

    PlatformType(String platform) {
        this.platform = platform;
    }

    public static class Values {
        public static final String FACEBOOK = "FACEBOOK";
        public static final String CHROME = "CHROME";
        public static final String NAVER_MAP = "NAVER-MAP";
    }
}
