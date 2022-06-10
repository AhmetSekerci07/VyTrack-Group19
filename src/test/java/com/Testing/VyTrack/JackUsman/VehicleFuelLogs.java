package com.Testing.VyTrack.JackUsman;

import com.Testing.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VehicleFuelLogs {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Before method is running");
        // set up chrome and create WebDriver instance
        driver = DriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//    1. GIVEN Open website, go to login page. https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");
    }

    //login: storemanager243, password:UserUser123
    //login: user153, password:UserUser123

    //    2. WHEN user enter username.
    //    3. AND user enter password.
    @Test
    public void login(){
        WebElement login=driver.findElement(By.xpath("//input[@name='_username']"));
        WebElement password=driver.findElement(By.xpath("//input[@name='_password']"));
        login.sendKeys("user153");
        password.sendKeys("UserUser123");

//    4. THEN user click "LOG IN" button.
        WebElement logInBttn= driver.findElement(By.xpath("//button[@type='submit']"));
        logInBttn.click();

//    5. THEN user main page.
        WebElement mainPage=driver.findElement(By.xpath("//html[@class='desktop-version']"));
        System.out.println("mainPage.isDisplayed() = " + mainPage.isDisplayed());
        Assert.assertTrue(mainPage.isDisplayed(),"Main page is not displayed");

//        WebElement fleetMenu=driver.
        WebElement fleetMenu=driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]"));
        fleetMenu.click();

//    7. THEN user click "Vehicle Fuel Logs" sub menu.





    }









//    8. THEN user will see "Vehicle Fuel Logs" information sheet.


}
/*
User Story: 9.As an authorized user I should be able to access Vehicle Feul logs
A.C. : 1.Verify that only authorized user can access Vehicle Fuel logs (Note: authorized user:truck driver)
Test Case ID:       VYT-1901
Test Case Category: Positive test case
Description:        Truck driver access to vehicle fuel logs.
Environment:        https://qa2.vytrack.com/user/login
Steps:              GIVEN Open website, go to login area.
                    WHEN user enter username.
                    AND user enter password.
                    THEN user click "LOG IN" button.
                    THEN user main page.
                    WHEN user click "Fleet" menu.
                    THEN user click "Vehicle Fuel Logs" sub menu.
                    THEN user will see "Vehicle Fuel Logs" information sheet.

Test Data:          https://qa2.vytrack.com/user/login
                    username: user153
                    password: UserUser123
Expected Result:    VyTrack login page should be displayed
                    Driver should be able to enter username in the input box
                    Driver should be able to enter password in the input box
                    Driver should be able to click login button.
                    Driver should be able login successfully.
                    Driver should be able to click fleet menu.
                    Driver should be able to click vehicle fuel logs sub menu.
                    Driver should be able to see fuel logs sheet page.



 */
/*
User Story: 10.As a truck driver I should be able to access Vehicle Fuel Logs
AC :
1.Verify that truck driver should be able to see all Vehicle Fuel information on the grid
2.Verify that truck driver should be able to create Vehicle Fuel logs or cancel it
3.Verify that truck driver should be able to Edit , delete Vehicle Fuel Logs or
add attachment , add event
4.Verify that truck driver should be able to reset the grid by clicking on Grid setting"

Test Case ID:       VYT-1902
Test Case Category: Positive test case
Description:        Truck driver access to vehicle fuel logs.
Environment:        https://qa2.vytrack.com/user/login
Steps:              GIVEN Open website, go to login page.
                    WHEN user enter username.
                    AND user enter password.
                    THEN user click "LOG IN" button.
                    THEN user main page.
                    WHEN user click "Fleet" menu.
                    THEN user click "Vehicle Fuel Logs" sub menu.
                    THEN user will see all Vehicle Fuel information on the grid.
                    AND user will click "Create Vehicle Fuel Logs"
                    OR user will click "Create Vehicle Fuel Logs" and cancel it.
                    THEN user will see "Create Vehicle Fuel Logs" page.
                    THEN user will be able to Edit.
                    AND user will be able to delete Vehicle Fuel Logs.
                    OR user will be able to click "+Add" and add attachment.
                    OR user will be able to click "+Add" and add event.
                    THEN user click "Refresh" button.

Test Data:          https://qa2.vytrack.com/user/login
                    username: user153
                    password: UserUser123
Expected Result:    VyTrack login page should be displayed
                    Driver should be able to enter username in the input box
                    Driver should be able to enter password in the input box
                    Driver should be able to click login button.
                    Driver should be able login successfully.
                    Driver should be able to click fleet menu.
                    Driver should be able to click vehicle fuel logs sub menu.
                    Driver should be able to see fuel logs sheet page.
 */