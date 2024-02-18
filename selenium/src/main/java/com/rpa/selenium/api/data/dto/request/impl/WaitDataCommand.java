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
public class WaitDataCommand implements DataCommand {

    private int time = 0;

    @Override
    public boolean logic(WebDriver webDriver) {
        return this.core();
    }

    public boolean core() {
        log.info(time + "ms 만큼 기다립니다.");
        try {
            Thread.sleep(time);
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
