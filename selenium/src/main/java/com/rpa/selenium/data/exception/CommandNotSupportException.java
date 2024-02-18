package com.rpa.selenium.data.exception;

public class CommandNotSupportException extends DataCommandException {

    private static final String MESSAGE = "Command Not Support Exception";

    public CommandNotSupportException() {
        super(MESSAGE);
    }
}
