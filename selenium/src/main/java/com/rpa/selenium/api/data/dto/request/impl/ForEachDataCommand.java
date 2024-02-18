package com.rpa.selenium.api.data.dto.request.impl;

import com.rpa.selenium.api.data.dto.request.DataCommand;
import com.rpa.selenium.api.data.dto.request.impl.sub.foreach.ForEachCommand;
import com.rpa.selenium.selenium.WebDriver;
import com.rpa.selenium.selenium.WebElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class ForEachDataCommand implements DataCommand {

    private String target;

    private List<ForEachCommand> forEachCommands;

    @Override
    public boolean logic(WebDriver webDriver) {
        List<WebElement> webElements = webDriver.getElements(this.target);
        for (WebElement webElement : webElements) {
            for (ForEachCommand forEachCommand : forEachCommands) {
                forEachCommand.logic(webElement);
            }
        }

        return true;
    }
}
