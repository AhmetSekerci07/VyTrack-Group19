package com.Testing.VyTrack.Zeliha;

import com.Testing.VyTrack.Zeliha.utilities.Driver;
import com.Testing.VyTrack.Zeliha.utilities.VyTruck_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC5_B26G19_25 {

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


//Truck Driver clicks to "Create Vehicle Odometer" button
        WebElement createVehicleOdometerBtn = Driver.getDriver().findElement(By.xpath("//a[contains(@title,'Create Vehicle Odometer')]"));
        Thread.sleep(3000);
        createVehicleOdometerBtn.click();


//Truck Driver fill out the General information about the vehicle
        // Odometer Value Box
        WebElement OdometerValueBox = Driver.getDriver().findElement(By.xpath("//input[contains(@id,'custom_entity_type_OdometerValue')]"));
        OdometerValueBox.sendKeys("121344");

        WebElement odometerValueLabel = Driver.getDriver().findElement(By.xpath("//label[contains(.,'Odometer Value')]"));
        System.out.println("odometerValueLabel.isDisplayed() = " + odometerValueLabel.isDisplayed());

        //info odometer value
        WebElement infoOdometerValue = Driver.getDriver().findElement(By.xpath("//i[@class='fa-info-circle tooltip-icon'][1]"));
        System.out.println("infoOdometerValue.isDisplayed() = " + infoOdometerValue.isDisplayed());
        infoOdometerValue.click();

        WebElement closeInfoMessage = Driver.getDriver().findElement(By.xpath("//i[@class='fa-close popover-close']"));
        System.out.println("closeInfoMessage.isDisplayed() = " + closeInfoMessage.isDisplayed());
        closeInfoMessage.click();

        //Date box
        WebElement dateButton = Driver.getDriver().findElement(By.xpath("//input[contains(@id,'date_selector_custom_entity_type_Date')]"));
        dateButton.click();

        Select selectMonth = new Select(Driver.getDriver().findElement(By.xpath("//select[@data-handler='selectMonth']")));
        selectMonth.selectByValue("0");

        Select selectYear = new Select(Driver.getDriver().findElement(By.xpath("//select[@data-handler='selectYear']")));
        selectYear.selectByValue("1942");

        WebElement selectDay = Driver.getDriver().findElement(By.xpath("(//td[@data-handler='selectDay'])[1]"));
        selectDay.click();

        //            OR  ->  Today Button IsDisplayed
//      WebElement todayBtn = driver.findElement(By.xpath("//div[@class='ui-datepicker-buttonpane ui-widget-content']/button[text()='Today']"));
//        System.out.println("todayBtn.isDisplayed() = " + todayBtn.isDisplayed());
//        todayBtn.click();


        //Driver Box
        WebElement driverBox = Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[Driver]']"));
        driverBox.click();
        driverBox.sendKeys("Sofor");

        //Unit Box
        WebElement unitBox =Driver.getDriver().findElement(By.xpath("//div[contains(@id,'s2id_custom_entity_type_Units')]"));
        unitBox.click();

        WebElement itemKM = Driver.getDriver().findElement(By.xpath("//div[text()='km']"));
        itemKM.click();

        WebElement unitLabel = Driver.getDriver().findElement(By.xpath("//label[text()='Unit']"));
        System.out.println("unitLabel.isDisplayed() = " + unitLabel.isDisplayed());

        //Model Box
        WebElement ModelBox = Driver.getDriver().findElement(By.xpath("//div[contains(@id,'s2id_custom_entity_type_Model-uid')]"));
        ModelBox.click();

        WebElement textModelBox = Driver.getDriver().findElement(By.xpath("//div[@id='select2-drop']/div"));
        System.out.println("textModelBox.isDisplayed() = " + textModelBox.isDisplayed());

        WebElement noMatchingFound = Driver.getDriver().findElement(By.xpath("//div[@id='select2-drop']/div/following-sibling::ul/li[text()='No matches found']"));

        System.out.println("noMatchingFound.isDisplayed() = " + noMatchingFound.isDisplayed());

        WebElement clickHTML = Driver.getDriver().findElement(By.xpath("//html"));
        clickHTML.click();


//Truck Driver clicks to the "Save and Close" button
        WebElement saveAndCloseButton = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-success action-button']"));
        saveAndCloseButton.click();


//Then Truck Driver can create Vehicle Odometer.
        //Verify Alert
        WebElement verif = Driver.getDriver().findElement(By.xpath("//div[.=\"Entity saved\"]"));
        Assert.assertEquals(verif.getText(), "Entity saved");

        //Verify Title
        String actualVehicleOdometerNavigates = Driver.getDriver().getTitle();
        String expectedVehicleOdometerNavigates= "Sofor - Vehicle Odometer - Entities - System - Car - Entities - System";

        Assert.assertEquals(actualVehicleOdometerNavigates, expectedVehicleOdometerNavigates, "Title verification Failed!");
    }

}
