package com.rpa.selenium.data.service.function;

import com.rpa.selenium.api.data.dto.request.DataRequestDto;
import com.rpa.selenium.core.enums.FunctionType;

public interface FunctionDataService {

    FunctionType getFunctionType();

    void auto(DataRequestDto dataRequestDto);
}
