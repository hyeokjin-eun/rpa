package com.rpa.selenium.web.service.function.chrome;

import com.rpa.selenium.selenium.Selenium;
import com.rpa.selenium.selenium.WebDriver;
import com.rpa.selenium.web.controller.dto.request.WebCommand;
import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.exception.WebCommandException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChromeCrawlingFunction extends ChromeFunction{

    public ChromeCrawlingFunction(Selenium selenium) {
        super(selenium);
    }

    @Override
    public FunctionType getFunctionType() {
        return FunctionType.CRAWLING;
    }

    @Override
    public boolean logic(String driverId, List<WebCommand> webCommands) {
        WebDriver webDriver = selenium.getDriver(driverId);
        for (WebCommand webCommand : webCommands) {
            if ( ! webCommand.logic(webDriver)) throw new WebCommandException();
        }

        return true;
    }
}
