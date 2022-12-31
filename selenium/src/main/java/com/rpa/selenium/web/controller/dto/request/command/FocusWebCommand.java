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
public class FocusWebCommand implements WebCommand {

    private String target;

    @Override
    public boolean logic(WebDriver webDriver) {
        log.info(target + "을 포커스합니다.");
        return true;
    }
}
