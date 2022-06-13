package com.Testing.VyTrack.Ahmet;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Example extends TestBase {
/*


1.Verify that Store manager or sales manager should be able to see all vehicle information once navigate to Vehicle page


1. Given user logins with valid credentials
2. Then User clicks on log in button
3. When user clicks on Vehicle header on the main Menu page
4. Then user should be navigated to the vehicle page





 */

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

        WebElement cost = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        allVehiclesModel.click();

        WebElement Vehicles = driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/div/div/ul/li[9]"));
        Vehicles.click();

        Thread.sleep(5000);

    }


}
