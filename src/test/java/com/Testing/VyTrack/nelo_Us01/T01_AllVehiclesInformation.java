package com.Testing.VyTrack.nelo_Us01;

import com.Testing.utilities.Driver;
import com.Testing.utilities.US01_LoginAsTruckDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T01_AllVehiclesInformation {

    /**
     *   Scenario: Truck driver can see all vehicles information
     *     Given driver is on fleet management page
     *     When driver clicks on fleet module
     *     And driver clicks on vehicle module
     *     Then driver can see all vehicles information
     */
    @Test
    public void all_vehicles_info() throws InterruptedException {

        US01_LoginAsTruckDriver.LoginVTruckAsDriver();
        Thread.sleep(5000);
        //Verifying Dashboard Tab
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";


        Assert.assertEquals(actualTitle, expectedTitle, "Dashboard Title Verification Failed");

        WebElement fleetModule =Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));
        fleetModule.click();

        WebElement vehicleModal = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles Model']"));
        vehicleModal.click();

        WebElement modalName = Driver.getDriver().findElement(By.xpath("//span[.='Model Name']"));
        Assert.assertTrue(modalName.isDisplayed());

        WebElement madeBy = Driver.getDriver().findElement(By.xpath("//span[.='Make']"));
        Assert.assertTrue(madeBy.isDisplayed());

        WebElement canBeRequested = Driver.getDriver().findElement(By.xpath("//span[.='Can be requested']"));
        Assert.assertTrue(canBeRequested.isDisplayed());

        WebElement cVVI = Driver.getDriver().findElement(By.xpath("//span[.='CVVI']"));
        Assert.assertTrue(cVVI.isDisplayed());

        WebElement c02_Fee_month = Driver.getDriver().findElement(By.xpath("//span[.='CVVI']"));
        Assert.assertTrue(c02_Fee_month.isDisplayed());

        WebElement cost = Driver.getDriver().findElement(By.xpath("//span[.='Cost (Depreciated)']"));
        Assert.assertTrue(cost.isDisplayed());

        WebElement totalCost = Driver.getDriver().findElement(By.xpath("//span[.='Total Cost (Depreciated)']"));
        Assert.assertTrue(totalCost.isDisplayed());

        WebElement c02_Emmissions = Driver.getDriver().findElement(By.xpath("//span[.='CO2 Emissions']"));
        Assert.assertTrue(c02_Emmissions.isDisplayed());

        WebElement fuelType = Driver.getDriver().findElement(By.xpath("//span[.='Fuel Type']"));
        Assert.assertTrue(fuelType.isDisplayed());

        WebElement vendors = Driver.getDriver().findElement(By.xpath("//span[.='Vendors']"));
        Assert.assertTrue(vendors.isDisplayed());

        Driver.closeDriver();

    }

}
