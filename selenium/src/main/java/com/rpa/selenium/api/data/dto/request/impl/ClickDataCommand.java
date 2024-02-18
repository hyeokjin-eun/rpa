package com.rpa.selenium.api.data.dto.request.impl;

import com.rpa.selenium.api.data.dto.request.DataCommand;
import com.rpa.selenium.selenium.WebDriver;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class ClickDataCommand implements DataCommand {

    private String target;

    @Override
    public boolean logic(WebDriver webDriver) {
        log.info(target + "을 클릭합니다.");
        webDriver.click(target);
        return true;
    }
}
