package com.rpa.selenium.selenium;

import com.rpa.selenium.web.exception.ChromeDriverMaxException;
import com.rpa.selenium.web.exception.ChromeDriverNotFoundException;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentMap;

@Component
public class DefaultSelenium implements Selenium{

    private int count = 0;
    private final ConcurrentMap<String, WebDriver> driverMap = new ConcurrentHashMap<>();
    private final ConcurrentLinkedDeque<String> driverIdQueue = new ConcurrentLinkedDeque<>();

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
            driverIdQueue.add(driverId);
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
            driverIdQueue.remove(driverId);
            count--;
        }
    }

    @Override
    public WebDriver getDriver(String driverId) {
        return driverMap.get(driverId);
    }
}
