package com.Testing.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US01_LoginAsTruckDriver {
    public static void LoginVTruckAsDriver(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement logInBox = Driver.getDriver().findElement(By.id("prependedInput"));
        logInBox.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement passwordBox = Driver.getDriver().findElement(By.id("prependedInput2"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//button[@id='_submit']"));
        loginBtn.click();

    }
}
