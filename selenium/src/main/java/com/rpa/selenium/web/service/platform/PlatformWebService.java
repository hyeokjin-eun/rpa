package com.rpa.selenium.web.service.platform;

import com.rpa.selenium.web.controller.dto.request.WebRequestDto;
import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.enums.PlatformType;

public interface PlatformWebService {
    PlatformType getPlatformType();

    boolean auto(FunctionType functionType, WebRequestDto webRequestDto);
}
