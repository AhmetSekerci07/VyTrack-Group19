package com.Testing.VyTrack.Zeliha;

import com.Testing.VyTrack.Zeliha.utilities.Driver;
import com.Testing.VyTrack.Zeliha.utilities.VyTruck_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC7_B26G19_27 {

    @Test
    public void vehicleOdometer() throws InterruptedException {


//Truck Driver is on the vehicle odometer grid page.
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


//Truck Driver clicks the three dots "..." on the right side.
        WebElement threeDots = Driver.getDriver().findElement(By.xpath("//div[@class='dropdown']/a[1]"));

        System.out.println("threeDots.isDisplayed() = " + threeDots.isDisplayed());

        Actions actionDots = new Actions(Driver.getDriver());
        actionDots.moveToElement(threeDots).perform();


//Truck Driver clicks the Delete Icon.
        WebElement deleteIcon = Driver.getDriver().findElement(By.xpath("(//ul[@class='nav nav-pills icons-holder launchers-list'])[1]/li[3]"));

        System.out.println("deleteIcon.isDisplayed() = " + deleteIcon.isDisplayed());

        Actions actionDelete = new Actions(Driver.getDriver());
        actionDelete.moveToElement(deleteIcon).perform();
        deleteIcon.click();


//Truck Driver should be able to delete the Odometer Value row.
        WebElement deleteConfirmation = Driver.getDriver().findElement(By.xpath("//div[@class='modal oro-modal-danger in']/div[3]/a[2]"));
        deleteConfirmation.click();

    }

}
