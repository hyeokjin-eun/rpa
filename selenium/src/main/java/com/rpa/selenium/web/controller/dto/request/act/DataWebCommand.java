package com.rpa.selenium.web.controller.dto.request.act;

import com.rpa.selenium.selenium.WebDriver;
import com.rpa.selenium.web.controller.dto.request.data.DataCommand;
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
public class DataWebCommand implements WebCommand {

    private List<DataCommand> targetList;

    @Override
    public boolean logic(WebDriver webDriver) {
        for (DataCommand dataCommand : targetList) {
            log.info("type : ");
        }

        return true;
    }
}
