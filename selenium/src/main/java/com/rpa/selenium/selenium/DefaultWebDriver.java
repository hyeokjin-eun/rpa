package com.rpa.selenium.selenium;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

@Slf4j
public class DefaultWebDriver implements WebDriver{

    private final ChromeDriver chromeDriver;

    public DefaultWebDriver(String url) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        this.chromeDriver = new ChromeDriver();
        this.get(url);
    }

    @Override
    public void get(String url) {
        chromeDriver.get(url);
    }

    @Override
    public void close() {
        this.chromeDriver.quit();
    }

    @Override
    public void click(String target) {
        chromeDriver.findElement(By.xpath(target)).click();
    }

    @Override
    public void input(String target, String text) {
        chromeDriver.findElement(By.xpath(target)).sendKeys(text);
    }

    @Override
    public void enter(String target) {
        chromeDriver.findElement(By.xpath(target)).sendKeys(Keys.ENTER);
    }

    @Override
    public void scroll(int x, int y) {
        new Actions(chromeDriver).scrollByAmount(x, y).build().perform();
    }

    @Override
    public void sendKeyByTarget(String target, Keys... unicode) {
        Actions actions = new Actions(chromeDriver).moveToElement(chromeDriver.findElement(By.xpath(target)));
        StringBuilder key = new StringBuilder();
        for (Keys keys : unicode) {
            key.append(Keys.chord(keys));
        }

        actions.sendKeys(key.toString()).build().perform();
    }

    @Override
    public void sendKeyByWindow(Keys... unicode) {
        Actions actions = new Actions(chromeDriver);
        StringBuilder key = new StringBuilder();
        for (Keys keys : unicode) {
            key.append(Keys.chord(keys));
        }

        actions.sendKeys(key.toString()).build().perform();
    }
}
