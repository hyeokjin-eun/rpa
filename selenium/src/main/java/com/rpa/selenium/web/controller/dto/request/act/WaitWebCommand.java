package com.rpa.selenium.web.controller.dto.request.act;

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
public class WaitWebCommand implements WebCommand {

    private int time = 0;

    @Override
    public boolean logic(WebDriver webDriver) {
        log.info(time + "ms 만큼 기다립니다.");
        try {
            Thread.sleep(time);
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
