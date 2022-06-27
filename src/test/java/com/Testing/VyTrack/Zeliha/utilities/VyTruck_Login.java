package com.Testing.VyTrack.Zeliha.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTruck_Login {

    public static void vytruck_login(WebDriver driver) {

        driver.get(ConfigurationReader.getProperty("env"));

        WebElement usernameBox = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        usernameBox.sendKeys(ConfigurationReader.getProperty("storeManagerUsername"));

        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginBtn.click();


    }
}
