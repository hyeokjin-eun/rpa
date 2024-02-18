package com.rpa.selenium.selenium;

import org.openqa.selenium.Keys;

import java.util.List;

public interface WebDriver {

    void get(String url);

    void close();

    void click(String target);

    void input(String target, String text);

    void scroll(int x, int y);

    void sendKeyByTarget(String target, Keys... unicode);

    void sendKeyByWindow(Keys... unicode);

    String getText(String target);

    boolean isTarget(String target);

    List<WebElement> getElements(String target);
}
