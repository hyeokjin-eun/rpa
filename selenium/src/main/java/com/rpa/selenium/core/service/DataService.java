package com.rpa.selenium.core.service;

import com.rpa.selenium.api.data.dto.request.DataRequestDto;
import com.rpa.selenium.core.enums.FunctionType;
import com.rpa.selenium.core.enums.PlatformType;

public interface DataService {

    boolean auto(PlatformType platformType, FunctionType functionType, DataRequestDto dataRequestDto);
}
