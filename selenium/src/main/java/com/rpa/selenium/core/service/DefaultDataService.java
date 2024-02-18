package com.rpa.selenium.core.service;

import com.rpa.selenium.api.data.dto.request.DataRequestDto;
import com.rpa.selenium.core.enums.FunctionType;
import com.rpa.selenium.core.enums.PlatformType;
import com.rpa.selenium.data.service.platform.PlatformDataService;
import com.rpa.selenium.data.service.platform.PlatformDataServiceFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultDataService implements DataService {

    private final PlatformDataServiceFactory platformDataServiceFactory;

    @Override
    public boolean auto(PlatformType platformType, FunctionType functionType, DataRequestDto dataRequestDto) {
        PlatformDataService platformDataService = platformDataServiceFactory.getInstance(platformType);
        return platformDataService.auto(functionType, dataRequestDto);
    }
}