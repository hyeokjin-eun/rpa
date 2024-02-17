package com.rpa.selenium.web.service.function.navermap;

import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.exception.FunctionTypeNotSupportException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class NaverMapFunctionFactory {

    private final List<NaverMapFunction> naverMapFunctionList;

    public NaverMapFunction getInstance(FunctionType functionType) {
        for (NaverMapFunction naverMapFunction : naverMapFunctionList) {
            if (naverMapFunction.getFunctionType() == functionType) return naverMapFunction;
        }

        throw new FunctionTypeNotSupportException();
    }
}
