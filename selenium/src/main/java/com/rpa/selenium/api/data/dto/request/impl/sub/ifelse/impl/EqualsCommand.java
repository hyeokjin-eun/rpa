package com.rpa.selenium.api.data.dto.request.impl.sub.ifelse.impl;

import com.rpa.selenium.api.data.dto.request.impl.sub.ifelse.BooleanCommand;
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
public class EqualsCommand implements BooleanCommand {

    private String target;
    private String text;

    @Override
    public boolean is(WebDriver webDriver) {
        try {
            String temp = webDriver.getText(target);
            if (this.text.equals(temp)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception exception) {
            return false;
        }
    }
}
