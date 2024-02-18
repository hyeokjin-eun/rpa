package com.rpa.selenium.data.exception;

public class SeleniumFailException extends DataCommandException{
    private static final String MESSAGE = "Selenium Fail Exception";

    public SeleniumFailException() {
        super(MESSAGE);
    }
}
