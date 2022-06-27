package com.Testing.VyTrack.Zeliha;

import com.Testing.VyTrack.Zeliha.utilities.Driver;
import com.Testing.VyTrack.Zeliha.utilities.VyTruck_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_B26G19_23 {


    @Test
    public void vehicleOdometer() throws InterruptedException {


//Sales Managers is on the Fleet Managment Dashboard page.
        //Login
        VyTruck_Login.vytruck_login(Driver.getDriver());

        //Verifying Dashboard Tab
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle, expectedTitle, "Dashboard Title Verification Failed");


//Sales Managers clicks to Fleet Module
        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));

        String actualFleetTitle = fleetModule.getText();
        String expectedFleetTitle = "Fleet";

        Assert.assertEquals(actualFleetTitle, expectedFleetTitle, "Fleet Title Verification FAILED!");

        Thread.sleep(3000);
        fleetModule.click();


//Sales Managers clicks on Vehicle Odometer module.
        WebElement vehicleOdometer = Driver.getDriver().findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/div/div/ul/li[4]"));
        Thread.sleep(3000);
        vehicleOdometer.click();


//Sales Managers should have no access to vehicle odometer page (BUG!!)

        WebElement alert = Driver.getDriver().findElement(By.xpath("//div[text()='You do not have permission to perform this action.']"));

        String actualAlert = alert.getText();
        String expectedAlert = "You do not have permission to perform this action.";

        Assert.assertEquals(actualAlert, expectedAlert, "Alert Verification FAILED!");


    }

}
