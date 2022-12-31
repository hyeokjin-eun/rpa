package com.rpa.selenium.web.controller.dto.request.command;

import com.rpa.selenium.selenium.WebDriver;
import com.rpa.selenium.web.controller.dto.request.WebCommand;
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
public class InputWebCommand implements WebCommand {

    private String target;
    private String text;

    @Override
    public boolean logic(WebDriver webDriver) {
        log.info(target + "에 " + text + "를 입력합니다.");
        webDriver.input(target, text);
        return true;
    }
}
