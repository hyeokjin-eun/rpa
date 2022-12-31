package com.rpa.selenium.web.exception;

public class PlatformTypeNotSupportException extends EnumNotSupportException {

    private static final String MESSAGE = "Platform Not Support Exception";

    public PlatformTypeNotSupportException() {
        super(MESSAGE);
    }
}
