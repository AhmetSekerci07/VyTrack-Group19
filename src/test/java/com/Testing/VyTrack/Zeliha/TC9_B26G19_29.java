package com.Testing.VyTrack.Zeliha;

import com.Testing.VyTrack.Zeliha.utilities.Driver;
import com.Testing.VyTrack.Zeliha.utilities.VyTruck_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC9_B26G19_29 {

    @Test
    public void vehicleOdometer() throws InterruptedException {

//Truck Driver is on the vehicle odometer grid page
        //Login
        VyTruck_Login.vytruck_login(Driver.getDriver());

        //Verifying Dashboard Tab
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle, expectedTitle, "Dashboard Title Verification Failed");

        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));
        fleetModule.click();

        WebElement vehicleOdometer = Driver.getDriver().findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/div/div/ul/li[4]"));
        vehicleOdometer.click();


//Truck Driver clicks to the reset button on the grid settings
        WebElement resetButton = Driver.getDriver().findElement(By.xpath("//div[@class='actions-panel pull-right form-horizontal']/div/a[3]"));

        resetButton.click();


//Truck Driver should be able to see the grid is rested.
        String pageSource = Driver.getDriver().getPageSource();
        WebElement refresh = Driver.getDriver().findElement(By.tagName("body"));
        String expected = refresh.getText();

        System.out.println("Page Source is : " + expected);

    }

}
