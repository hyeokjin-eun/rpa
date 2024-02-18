package com.rpa.selenium.api.data.dto.request.impl.sub.foreach.impl;

import com.rpa.selenium.api.data.dto.request.impl.sub.foreach.ForEachCommand;
import com.rpa.selenium.selenium.WebElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class DataCommand implements ForEachCommand {

    private String key;

    private String target;

    private String description;

    @Override
    public boolean logic(WebElement webElement) {
        Map<String, Map<String, String>> temp = new HashMap<>();
        Map<String, String> data = new HashMap<>();
        data.put("value", webElement.getText(this.target));
        data.put("description", this.description);
        temp.put(this.key, data);
        log.info("Data Save : " + temp.toString());
        return true;
    }
}