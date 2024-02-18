package com.rpa.selenium.api.data.dto.request.impl.sub.ifelse.impl;

import com.rpa.selenium.api.data.dto.request.impl.sub.ifelse.BooleanCommand;
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
public class IsCommand implements BooleanCommand {

    private String target;

    @Override
    public boolean is(WebDriver webDriver) {
        try {
            if (webDriver.isTarget(this.target)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception exception) {
            return false;
        }
    }
}
