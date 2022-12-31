package com.rpa.selenium.web.service.function.facebook;

import com.rpa.selenium.selenium.Selenium;
import com.rpa.selenium.web.controller.dto.request.WebCommand;
import com.rpa.selenium.web.enums.FunctionType;

import java.util.List;

public abstract class FaceBookFunction {

    protected final String FACEBOOK_URL = "https://www.google.com";
    protected Selenium selenium;

    public FaceBookFunction(Selenium selenium) {
        this.selenium = selenium;
    }

    abstract FunctionType getFunctionType();

    public String open() {
        return selenium.open(FACEBOOK_URL);
    }

    public abstract boolean logic(String driverId, List<WebCommand> webCommands);

    public void close(String driverId) {
        selenium.close(driverId);
    }
}
