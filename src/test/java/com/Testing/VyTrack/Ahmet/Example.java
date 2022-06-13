package com.Testing.VyTrack.Ahmet;

import com.Base.TestBase;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example extends TestBase {
    /*



    "2. As a store manager and Sales manager I should be able to create Vehicle"


    "1.Verify that Store manager or sales manager should be able to see all vehicle information once
    navigate to Vehicle page
    2. Verify that Store manager or sales manager should be able to create and cancel a car
    3..Verify that Store manager or sales manager should be able to add Vehicle Module and Vehicle Make
    4.Verify that Store manager or sales manager should be able to edit or delete the car
    5.Verify that Store manager or sales manager should be able to add event
    "





     */
    @Description("1")
    @Test
    public void testAhmet() throws InterruptedException {
        driver.get("https://qa2.vytrack.com");

        WebElement username = driver.findElement(By.name("_username"));
        username.sendKeys("storemanager88");

        // Enter password
        WebElement password = driver.findElement(By.name("_password"));
        password.sendKeys("UserUser123");

        // Click login button
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        // store manager or sales manager can see all Vehicles model information
        WebElement allVehiclesModel = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        allVehiclesModel.click();

        WebElement Vehicles = driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/div/div/ul/li[3]"));
        Vehicles.click();

        WebElement createCar = driver.findElement(By.xpath("//a[@title='Create Car']"));
        createCar.click();


        WebElement plateNum = driver.findElement(By.xpath("//input[@name='custom_entity_type[LicensePlate]']"));
        plateNum.sendKeys("123456");



    }
}
