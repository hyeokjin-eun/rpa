package com.rpa.selenium.web.service.function.navermap;

import com.rpa.selenium.selenium.Selenium;
import com.rpa.selenium.web.controller.dto.request.act.WebCommand;
import com.rpa.selenium.web.enums.FunctionType;

import java.util.List;

public abstract class NaverMapFunction {

    protected final String NAVER_MAP_URL = "https://map.naver.com";
    protected Selenium selenium;

    public NaverMapFunction(Selenium selenium) {
        this.selenium = selenium;
    }

    abstract FunctionType getFunctionType();

    public String open() {
        return selenium.open(NAVER_MAP_URL);
    }

    public abstract boolean logic(String driverId, List<WebCommand> webCommands);

    public void close(String driverId) {
        selenium.close(driverId);
    }
}
