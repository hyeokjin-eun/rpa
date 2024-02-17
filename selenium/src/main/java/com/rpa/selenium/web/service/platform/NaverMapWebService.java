package com.rpa.selenium.web.service.platform;

import com.rpa.selenium.web.controller.dto.request.WebRequestDto;
import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.enums.PlatformType;
import com.rpa.selenium.web.exception.SeleniumFailException;
import com.rpa.selenium.web.service.function.navermap.NaverMapFunction;
import com.rpa.selenium.web.service.function.navermap.NaverMapFunctionFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NaverMapWebService implements PlatformWebService {

    private final NaverMapFunctionFactory naverMapFunctionFactory;

    @Override
    public PlatformType getPlatformType() {
        return PlatformType.NAVER_MAP;
    }

    @Override
    public boolean auto(FunctionType functionType, WebRequestDto webRequestDto) {
        NaverMapFunction naverMapFunction = naverMapFunctionFactory.getInstance(functionType);
        String driverId = naverMapFunction.open();
        boolean success;
        try {
            success = naverMapFunction.logic(driverId, webRequestDto.getWebCommands());
        } catch (Exception exception) {
            naverMapFunction.close(driverId);
            throw new SeleniumFailException();
        }
        naverMapFunction.close(driverId);
        return success;
    }
}
