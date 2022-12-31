package com.rpa.selenium.selenium;

public interface Selenium {

    String open(String url);

    void close(String driverId);

    WebDriver getDriver(String driverId);
}
