package com.rpa.selenium.data.exception;

public class ChromeDriverNotFoundException extends DataCommandException {

    private static final String MESSAGE = "Chrome Driver Not Found Exception";

    public ChromeDriverNotFoundException() {
        super(MESSAGE);
    }
}
