package com.rpa.selenium.data.service.platform;

import com.rpa.selenium.api.data.dto.request.DataRequestDto;
import com.rpa.selenium.core.enums.FunctionType;
import com.rpa.selenium.core.enums.PlatformType;

public interface PlatformDataService {

    PlatformType getPlatformType();

    boolean auto(FunctionType functionType, DataRequestDto dataRequestDto);
}
