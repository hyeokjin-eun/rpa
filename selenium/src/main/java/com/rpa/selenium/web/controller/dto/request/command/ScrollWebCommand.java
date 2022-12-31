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
public class ScrollWebCommand implements WebCommand {

    private int x;
    private int y;

    @Override
    public boolean logic(WebDriver webDriver) {
        log.info(x + ", " + y + "만큼 스크롤합니다.");
        webDriver.scroll(x, y);
        return true;
    }
}
