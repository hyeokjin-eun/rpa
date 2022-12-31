package com.rpa.selenium.web.service;

import com.rpa.selenium.web.controller.dto.request.WebRequestDto;
import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.enums.PlatformType;

public interface WebService {

    boolean auto(PlatformType platformType, FunctionType functionType, WebRequestDto webRequestDto);
}
