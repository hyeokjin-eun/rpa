package com.rpa.selenium.web.controller.dto.request.act;

import com.rpa.selenium.selenium.Key;
import com.rpa.selenium.selenium.WebDriver;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Keys;

import java.util.Arrays;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class KeyWindowWebCommand implements WebCommand {

    private Key[] keyList;

    @Override
    public boolean logic(WebDriver webDriver) {
        log.info(Arrays.toString(keyList) + "를 입력합니다.");
        Keys[] keys = Arrays.stream(keyList).map(Key::getKeys).toList().toArray(new Keys[0]);
        webDriver.sendKeyByWindow(keys);
        return true;
    }
}