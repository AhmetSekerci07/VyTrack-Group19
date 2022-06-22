package com.Testing.VyTrack.Anna;

import com.Base.TestBase;
import com.google.common.base.Verify;
import org.apache.hc.core5.annotation.Contract;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class Story8And7 extends TestBase {

   /*

   Vehicle Contract page:

7. As an authorized user I should be able to access"

    1. Verify that Only authorized user should be able to access Vehicle Contract. (Note: authorized users: store manager, sales manager)

8. As an authorized user (store manager , Sales manager) I should be able to Access Vehicle Contract

            1.Verify that authorized user should be able to access Vehicle Contract and able to see all vehicle contracts on the grid.
            2.Verify that authorized user should be able to create Vehicle contract.
            3.Verfity that authorized user should be able to cancel Vehicle Contract
            4.Verify that authorized user should be able to Edit or delete the Vehicle Contract .
            5.Verify that authorized user should be able to reset the grid by click on Grid setting."
    */

    @Test
    public void testAnna() throws InterruptedException{
            driver.get("https://qa2.vytrack.com/user/login");

            // Enter Username
            WebElement username = driver.findElement(By.name("_username"));
            username.sendKeys("storemanager243");

            // Enter password
            WebElement password = driver.findElement(By.name("_password"));
            password.sendKeys("UserUser123");

            // Click login button
            WebElement loginBtn = driver.findElement(By.id("_submit"));
            loginBtn.click();

        // 1. Verify that authorized user should be able to access Vehicle Contract and able to see all vehicle contracts on the grid.
        WebElement allVehicleContract = driver.findElement(By.xpath("(//span[@class='oro-subtitle'])"));
        Thread.sleep(3000);
        allVehicleContract.click();

        // 2. Verify that authorized user should be able to create Vehicle contract.
        WebElement newVehicle = driver.findElement(By.xpath("//a[@title='Create Vehicles Contract']"));
        Thread.sleep(3000);
        newVehicle.click();

        // 3. Verfity that authorized user should be able to cancel Vehicle Contract
        //cancel button is created:
        WebElement cancelBtnForVehicleContract = driver.findElement(By.xpath("//a[@data-action='cancel']"));
        Thread.sleep(3000);
        System.out.println("cancelBtnForVehicleContract.isDisplayed() = " + cancelBtnForVehicleContract.isDisplayed());
        cancelBtnForVehicleContract.click();

        //  4. Verify that authorized user should be able to Edit or delete the Vehicle Contract.
        //edit button is created:
        //delete button is created:
        WebElement editBtnForVehicleContract = driver.findElement(By.xpath("//a[@data-action='edit']"));
        Thread.sleep(3000);
        System.out.println("editBtnForVehicleContract.isDisplayed() = " + editBtnForVehicleContract.isDisplayed());
        editBtnForVehicleContract.click();

        WebElement deleteBtnForVehicleContract = driver.findElement(By.xpath("//a[@data-action='delete']"));
        Thread.sleep(3000);
        System.out.println("deleteBtnForVehicleContract.isDisplayed() = " + deleteBtnForVehicleContract.isDisplayed());
        editBtnForVehicleContract.click();


        //5. Verify that authorized user should be able to reset the grid by click on Grid setting.
        //reset button:
        WebElement resetBtnForVehicleContract = driver.findElement(By.xpath("//a[@data-action='fa-refresh']"));
        Thread.sleep(3000);
        System.out.println("resetBtnForVehicleContract.isDisplayed() = " + resetBtnForVehicleContract.isDisplayed());
        resetBtnForVehicleContract.click();
    }

}
