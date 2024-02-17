package com.rpa.selenium.web.service.function.chrome;

import com.rpa.selenium.selenium.Selenium;
import com.rpa.selenium.web.controller.dto.request.act.WebCommand;
import com.rpa.selenium.web.enums.FunctionType;

import java.util.List;

public abstract class ChromeFunction {

    protected final String CHROME_URL = "https://www.google.com";
    protected Selenium selenium;

    public ChromeFunction(Selenium selenium) {
        this.selenium = selenium;
    }

    abstract FunctionType getFunctionType();

    public String open() {
        return selenium.open(CHROME_URL);
    }

    public abstract boolean logic(String driverId, List<WebCommand> webCommands);

    public void close(String driverId) {
        selenium.close(driverId);
    }
}
