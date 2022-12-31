package com.rpa.selenium.selenium;

import org.openqa.selenium.Keys;

public interface WebDriver {

    void get(String url);

    void close();

    void click(String target);

    void input(String target, String text);

    void enter(String target);

    void scroll(int x, int y);

    void sendKeyByTarget(String target, Keys... unicode);

    void sendKeyByWindow(Keys... unicode);
}
