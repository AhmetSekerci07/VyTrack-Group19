package com.Testing.VyTrack.Akerke;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class UserStories_14 extends TestBase {

        /*
        1. store manager or sales manager can see all Vehicles model information
        2. Store manager or Sales manager can create new Vehicle model
        3. during the creation, all required field should be displayed and Fuel type drop down should displayed as (Gasoline,Diesel,Electric,Hybird)
        4.Verify that store manager or sales manager can Edit  the Vehicle model.
        5.Verify that store manager or sales manager can delete the Vehicle model.
        6. store manager or sales manager can reset the grid by click on Grid setting."
          */

    @Test
    public void storeManager() throws InterruptedException {
        driver.get("https://qa2.vytrack.com/user/login");

        // Enter Username
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
        Thread.sleep(3000);
        allVehiclesModel.click();

        WebElement Vehicles = driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/div/div/ul/li[9]"));
        Thread.sleep(3000);
        Vehicles.click();

        //2. Store manager or Sales manager can create new Vehicle model
        WebElement newVehicle = driver.findElement(By.xpath("//a[@title='Create Vehicles Model']"));
        Thread.sleep(3000);
        newVehicle.click();

        //3. during the creation, all required field should be displayed and Fuel type drop down should displayed as (Gasoline,Diesel,Electric,Hybird)

       List <WebElement> allRequired = driver.findElements(By.className("section-content"));
        System.out.println("allRequired.size() = " + allRequired.size());

        for (WebElement each : allRequired){
            System.out.println("each.isDisplayed() = " + each.isDisplayed());

        }

        WebElement fuelType = driver.findElement(By.className("select2-chosen"));
        fuelType.click();

        WebElement gasoline = driver.findElement(By.className("select2-result-label"));
        System.out.println("gasoline.isDisplayed() = " + gasoline.isDisplayed());

        WebElement diesel = driver.findElement(By.className("select2-result-label"));
        System.out.println("diesel.isDisplayed() = " + diesel.isDisplayed());

        WebElement electric = driver.findElement(By.className("select2-result-label"));
        System.out.println("electric.isDisplayed() = " + electric.isDisplayed());

        WebElement hybrid = driver.findElement(By.className("select2-result-label"));
        System.out.println("hybrid.isDisplayed() = " + hybrid.isDisplayed());
    }

}
