package com.rpa.selenium.api.data.dto.request.impl.sub.foreach.impl;

import com.rpa.selenium.api.data.dto.request.impl.sub.foreach.ForEachCommand;
import com.rpa.selenium.selenium.WebElement;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class DataCommand implements ForEachCommand {

    private List<Field> fields = new ArrayList<>();

    @Override
    public boolean logic(WebElement webElement) {
        Map<String, Map<String, String>> temp = new HashMap<>();
        for (Field field : fields) {
            Map<String, String> data = new HashMap<>();
            data.put("value", webElement.getText(field.getTarget()));
            data.put("description", field.getDescription());
            temp.put(field.getKey(), data);
        }

        log.info("Data Save : " + temp.toString());
        return true;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class Field {
        private String key;

        private String target;

        private String description;
    }
}