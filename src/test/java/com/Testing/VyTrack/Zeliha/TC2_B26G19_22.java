package com.Testing.VyTrack.Zeliha;

import com.Testing.VyTrack.Zeliha.utilities.Driver;
import com.Testing.VyTrack.Zeliha.utilities.VyTruck_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_B26G19_22 {


    @Test
    public void vehicleOdometer() throws InterruptedException {

//Store Manager is on the Fleet Management Dashboard page.
        VyTruck_Login.vytruck_login(Driver.getDriver());

        //Verifying Dashboard Tab
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle, expectedTitle, "Dashboard Title Verification Failed");


//Store Manager clicks to Fleet Module
        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));

        String actualFleetTitle = fleetModule.getText();
        String expectedFleetTitle = "Fleet";

        Assert.assertEquals(actualFleetTitle, expectedFleetTitle, "Fleet Title Verification FAILED!");

        Thread.sleep(3000);
        fleetModule.click();


//Store Manager clicks on Vehicle Odometer module.
        WebElement vehicleOdometer = Driver.getDriver().findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/div/div/ul/li[4]"));

        Thread.sleep(3000);
        vehicleOdometer.click();

//Store Manager should have no access to vehicle odometer page.
        WebElement alert = Driver.getDriver().findElement(By.xpath("//div[text()='You do not have permission to perform this action.']"));

        String actualAlert = alert.getText();
        String expectedAlert = "You do not have permission to perform this action.";

        Assert.assertEquals(actualAlert, expectedAlert, "Alert Verification FAILED!");

    }

}
