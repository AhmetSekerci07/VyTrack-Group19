package com.Base;

import com.Testing.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class TestBase { public WebDriver driver;

    @BeforeMethod

    public void setup(){
        driver = DriverFactory.getDriver("chrome");
        driver.manage().window().maximize();




    }

    @AfterMethod
    public void teardown(){

        driver.quit();

    }
}

