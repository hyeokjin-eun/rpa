package com.rpa.selenium.api.data.dto.request.impl;

import com.rpa.selenium.api.data.dto.request.DataCommand;
import com.rpa.selenium.data.exception.CommandNotSupportException;
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
public class ScrollDataCommand implements DataCommand {

    private int x;
    private int y;

    @Override
    public boolean logic(WebDriver webDriver) {
        log.info(x + ", " + y + "만큼 스크롤합니다.");
        webDriver.scroll(x, y);
        return true;
    }
}
