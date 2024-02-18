package com.rpa.selenium.data.service.platform.impl;

import com.rpa.selenium.api.data.dto.request.DataRequestDto;
import com.rpa.selenium.core.enums.PlatformType;
import com.rpa.selenium.core.enums.FunctionType;
import com.rpa.selenium.data.service.function.FunctionDataService;
import com.rpa.selenium.data.service.function.FunctionDataServiceFactory;
import com.rpa.selenium.data.service.platform.PlatformDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WebDataServiceImpl implements PlatformDataService {

    private final FunctionDataServiceFactory functionDataServiceFactory;

    @Override
    public PlatformType getPlatformType() {
        return PlatformType.WEB;
    }

    @Override
    public boolean auto(FunctionType functionType, DataRequestDto dataRequestDto) {
        FunctionDataService functionDataService = functionDataServiceFactory.getInstance(FunctionType.SELENIUM);
        functionDataService.auto(dataRequestDto);
        return true;
    }
}
