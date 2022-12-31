package com.rpa.selenium.web.service.function.chrome;

import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.exception.FunctionTypeNotSupportException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ChromeFunctionFactory {

    private final List<ChromeFunction> chromeFunctionList;

    public ChromeFunction getInstance(FunctionType functionType) {
        for (ChromeFunction chromeFunction : chromeFunctionList) {
            if (chromeFunction.getFunctionType() == functionType) return chromeFunction;
        }

        throw new FunctionTypeNotSupportException();
    }
}
