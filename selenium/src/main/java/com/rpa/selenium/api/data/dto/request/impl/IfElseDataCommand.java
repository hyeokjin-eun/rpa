package com.rpa.selenium.api.data.dto.request.impl;

import com.rpa.selenium.api.data.dto.request.DataCommand;
import com.rpa.selenium.api.data.dto.request.impl.sub.ifelse.BooleanCommand;
import com.rpa.selenium.selenium.WebDriver;
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
public class IfElseDataCommand implements DataCommand {

    private List<BooleanCommand> booleanCommands;

    private List<DataCommand> ifCommands;

    private List<DataCommand> elseCommands;

    @Override
    public boolean logic(WebDriver webDriver) {
        boolean check = true;
        for (BooleanCommand booleanCommand : booleanCommands) {
            if ( ! booleanCommand.is(webDriver)) {
                check = false;
                break;
            }
        }

        if (check) {
            for (DataCommand dataCommand : ifCommands) {
                dataCommand.logic(webDriver);
            }
        } else {
            for (DataCommand dataCommand : elseCommands) {
                dataCommand.logic(webDriver);
            }
        }

        return true;
    }
}
