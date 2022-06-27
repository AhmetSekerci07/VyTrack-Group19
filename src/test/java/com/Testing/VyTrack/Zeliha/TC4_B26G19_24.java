package com.Testing.VyTrack.Zeliha;

import com.Testing.VyTrack.Zeliha.utilities.Driver;
import com.Testing.VyTrack.Zeliha.utilities.VyTruck_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4_B26G19_24 {

    @Test
    public void vehicleOdometer() throws InterruptedException {


//Truck Driver is on the vehicle odometer grid page.
        //Login
        VyTruck_Login.vytruck_login(Driver.getDriver());

        //Verifying Dashboard Tab
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle, expectedTitle, "Dashboard Title Verification Failed");


//Truck Driver clicks on any truck
        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));
        fleetModule.click();

        WebElement vehicleOdometer = Driver.getDriver().findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/div/div/ul/li[4]"));
        vehicleOdometer.click();

        WebElement tableGridRow =Driver.getDriver().findElement(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr"));

        tableGridRow.click();

//Truck Driver should be able to see Odometer Values.
        WebElement OdometerValue = Driver.getDriver().findElement(By.xpath("//label[text()='Odometer Value']"));

        System.out.println("OdometerValue.isDisplayed() = " + OdometerValue.isDisplayed());

    }

}
