package com.rpa.selenium.data.exception;

public class PlatformTypeNotSupportException extends EnumNotSupportException {

    private static final String MESSAGE = "Platform Not Support Exception";

    public PlatformTypeNotSupportException() {
        super(MESSAGE);
    }
}
