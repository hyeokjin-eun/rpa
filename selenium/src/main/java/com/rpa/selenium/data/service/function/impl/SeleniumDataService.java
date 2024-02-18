package com.rpa.selenium.data.service.function.impl;

import com.rpa.selenium.api.data.dto.request.DataCommand;
import com.rpa.selenium.api.data.dto.request.DataRequestDto;
import com.rpa.selenium.core.enums.FunctionType;
import com.rpa.selenium.data.service.function.FunctionDataService;
import com.rpa.selenium.selenium.Selenium;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeleniumDataService implements FunctionDataService {

    private final Selenium selenium;

    @Override
    public FunctionType getFunctionType() {
        return FunctionType.SELENIUM;
    }

    @Override
    public void auto(DataRequestDto dataRequestDto) {
        String url = dataRequestDto.getOpenData().getUrl();
        String driverId = selenium.open(url);
        List<DataCommand> dataCommands = dataRequestDto.getDataCommands();
        for (DataCommand dataCommand : dataCommands) {
            dataCommand.logic(selenium.getDriver(driverId));
        }

        selenium.close(driverId);
    }
}
