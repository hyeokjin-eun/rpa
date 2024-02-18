package com.rpa.selenium.selenium.impl;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Slf4j
public class DefaultWebElement implements com.rpa.selenium.selenium.WebElement {

    private final WebElement webElement;

    public DefaultWebElement(WebElement webElement) {
        this.webElement = webElement;
    }

    @Override
    public String getText(String target) {
        return webElement.findElement(By.xpath(target)).getText();
    }
}
