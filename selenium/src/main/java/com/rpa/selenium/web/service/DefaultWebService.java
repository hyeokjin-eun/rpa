package com.rpa.selenium.web.service;

import com.rpa.selenium.web.controller.dto.request.WebRequestDto;
import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.enums.PlatformType;
import com.rpa.selenium.web.service.platform.PlatformWebService;
import com.rpa.selenium.web.service.platform.PlatformWebServiceFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultWebService implements WebService {

    private final PlatformWebServiceFactory platformWebServiceFactory;

    @Override
    public boolean auto(PlatformType platformType, FunctionType functionType, WebRequestDto webRequestDto) {
        PlatformWebService platformWebService = platformWebServiceFactory.getInstance(platformType);
        return platformWebService.auto(functionType, webRequestDto);
    }
}
