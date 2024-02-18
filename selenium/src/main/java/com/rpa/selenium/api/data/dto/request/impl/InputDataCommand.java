package com.rpa.selenium.api.data.dto.request.impl;

import com.rpa.selenium.api.data.dto.request.DataCommand;
import com.rpa.selenium.selenium.WebDriver;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class InputDataCommand implements DataCommand {

    private String target;
    private String text;

    @Override
    public boolean logic(WebDriver webDriver) {
        log.info(target + "에 " + text + "를 입력합니다.");
        webDriver.input(target, text);
        return true;
    }
}
