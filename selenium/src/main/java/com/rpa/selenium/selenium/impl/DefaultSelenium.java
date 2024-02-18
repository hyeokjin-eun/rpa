package com.rpa.selenium.selenium.impl;

import com.rpa.selenium.data.exception.ChromeDriverMaxException;
import com.rpa.selenium.data.exception.ChromeDriverNotFoundException;
import com.rpa.selenium.selenium.Selenium;
import com.rpa.selenium.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component
public class DefaultSelenium implements Selenium {

    private int count = 0;
    private final ConcurrentMap<String, WebDriver> driverMap = new ConcurrentHashMap<>();

    @Override
    public synchronized String open(String url) {
        int MAX = 2;
        if (MAX <= count) {
            throw new ChromeDriverMaxException();
        }

        synchronized (DefaultSelenium.class) {
            if (MAX <= count) {
                throw new ChromeDriverMaxException();
            }

            String driverId = UUID.randomUUID().toString();
            driverMap.put(driverId, new DefaultWebDriver(url));
            count++;
            return driverId;
        }
    }

    @Override
    public synchronized void close(String driverId) {
        if (!driverMap.containsKey(driverId)) {
            throw new ChromeDriverNotFoundException();
        }

        synchronized (DefaultSelenium.class) {
            if (!driverMap.containsKey(driverId)) {
                throw new ChromeDriverNotFoundException();
            }

            WebDriver webDriver = driverMap.get(driverId);
            webDriver.close();
            driverMap.remove(driverId);
            count--;
        }
    }

    @Override
    public WebDriver getDriver(String driverId) {
        return driverMap.get(driverId);
    }
}
