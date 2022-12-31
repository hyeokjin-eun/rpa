package com.rpa.selenium.web.exception;

public class SeleniumFailException extends RuntimeException{
    private static final String MESSAGE = "Selenium Fail Exception";

    public SeleniumFailException() {
        super(MESSAGE);
    }
}
