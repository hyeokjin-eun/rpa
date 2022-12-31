package com.rpa.selenium.web.exception;

public class ChromeDriverNotFoundException extends RuntimeException {

    private static final String MESSAGE = "Chrome Driver Not Found Exception";

    public ChromeDriverNotFoundException() {
        super(MESSAGE);
    }
}
