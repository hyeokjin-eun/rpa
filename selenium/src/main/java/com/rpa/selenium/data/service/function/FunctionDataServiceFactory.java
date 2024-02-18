package com.rpa.selenium.data.service.function;


import com.rpa.selenium.core.enums.FunctionType;
import com.rpa.selenium.data.exception.FunctionTypeNotSupportException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FunctionDataServiceFactory {

    private final List<FunctionDataService> platformDataServiceList;

    public FunctionDataService getInstance(FunctionType functionType) {
        for (FunctionDataService functionDataService : platformDataServiceList) {
            if (functionDataService.getFunctionType() == functionType) return functionDataService;
        }

        throw new FunctionTypeNotSupportException();
    }
}
