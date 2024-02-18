package com.rpa.selenium.data.exception;

public class FunctionTypeNotSupportException extends EnumNotSupportException {

    private static final String MESSAGE = "FunctionType Not Support Exception";

    public FunctionTypeNotSupportException() {
        super(MESSAGE);
    }
}
