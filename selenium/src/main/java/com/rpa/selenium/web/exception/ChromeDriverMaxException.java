package com.rpa.selenium.web.exception;

public class ChromeDriverMaxException extends RuntimeException {

    private static final String MESSAGE = "Chrome Driver Max Exception";

    public ChromeDriverMaxException() {
        super(MESSAGE);
    }
}
