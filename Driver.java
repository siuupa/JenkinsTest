package org.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

    WebDriver driver;

    public Driver(String browser) throws Exception {
        createDriver(browser);
    }

    private void createDriver(String browser) throws Exception {

        switch (browser) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
                ChromeOptions optionsChrome = new ChromeOptions();
                optionsChrome.addArguments("--disable-notifications --start-maximized");
                driver = new ChromeDriver(optionsChrome);
                break;
            default:
                throw new Exception("Cannot create a driver");
        }
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }
    public WebDriver getDriver() {
        return driver;
    }
}