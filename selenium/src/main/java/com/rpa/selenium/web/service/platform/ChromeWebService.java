package com.rpa.selenium.web.service.platform;

import com.rpa.selenium.web.controller.dto.request.WebRequestDto;
import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.enums.PlatformType;
import com.rpa.selenium.web.exception.SeleniumFailException;
import com.rpa.selenium.web.service.function.chrome.ChromeFunction;
import com.rpa.selenium.web.service.function.chrome.ChromeFunctionFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChromeWebService implements PlatformWebService{

    private final ChromeFunctionFactory chromeFunctionFactory;

    @Override
    public PlatformType getPlatformType() {
        return PlatformType.CHROME;
    }

    @Override
    public boolean auto(FunctionType functionType, WebRequestDto webRequestDto) {
        ChromeFunction chromeFunction = chromeFunctionFactory.getInstance(functionType);
        String driverId = chromeFunction.open();
        boolean success;
        try {
            success = chromeFunction.logic(driverId, webRequestDto.getWebCommands());
        } catch (Exception exception) {
            chromeFunction.close(driverId);
            throw new SeleniumFailException();
        }
        chromeFunction.close(driverId);
        return success;
    }
}
