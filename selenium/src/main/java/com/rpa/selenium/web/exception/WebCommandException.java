package com.rpa.selenium.web.exception;

public class WebCommandException extends RuntimeException{
    private static final String MESSAGE = "Web Command Exception";

    public WebCommandException() {
        super(MESSAGE);
    }
}
