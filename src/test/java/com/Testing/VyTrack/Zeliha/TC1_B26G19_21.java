package com.Testing.VyTrack.Zeliha;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_B26G19_21 {
    @Test
    public void vehicleOdometer() throws InterruptedException{

//Truck Driver is on Fleet Management Dashboard page.
        //Login
        VyTruck_Login.vytruck_login(Driver.getDriver());

        //Verifying Dashboard Tab
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle, expectedTitle, "Dashboard Title Verification Failed");


//Truck Driver clicks to Fleet Module
        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));

        String actualFleetTitle = fleetModule.getText();
        String expectedFleetTitle = "Fleet";

        Assert.assertEquals(actualFleetTitle, expectedFleetTitle, "Fleet Title Verification FAILED!");

        fleetModule.click();


//Truck Driver clicks on Vehicle Odometer module.
        WebElement vehicleOdometer = Driver.getDriver().findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/div/div/ul/li[4]"));
        vehicleOdometer.click();


//Truck Driver can see Vehicle Odometer Page.
        WebElement gridList = Driver.getDriver().findElement(By.xpath("//div[@class='oro-datagrid']"));
        System.out.println("gridList.isDisplayed() = " + gridList.isDisplayed());

    }

}
