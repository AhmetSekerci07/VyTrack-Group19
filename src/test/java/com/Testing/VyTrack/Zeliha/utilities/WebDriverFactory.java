package com.Testing.VyTrack.Zeliha.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType) {

        WebDriver driver;

        switch (browserType.toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.chromedriver().setup();
                driver = new FirefoxDriver();
            default:
                System.out.println("Unknown Browser Type " + browserType);
                driver = null;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        return driver;
    }

}
