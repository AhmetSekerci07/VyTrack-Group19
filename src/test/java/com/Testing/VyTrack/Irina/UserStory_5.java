package com.Testing.VyTrack.Irina;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserStory_5 extends TestBase {

@Test
    public void userStory5 (){

    driver.get("https://qa2.vytrack.com/user/login");

    WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
    userName.sendKeys("user154");

    WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
    password.sendKeys("UserUser123");

    WebElement loginBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
    loginBtn.click();

    WebElement fleetBtn = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
    fleetBtn.click();

    WebElement vehicleCost = driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/div/div/ul/li[5]"));
    vehicleCost.click();





    //1. truck driver see all cars' cost information on the Vehicle Costs page.

//    WebElement setting = driver.findElement(By.xpath("//i[@class='fa-cog hide-text']"));
//    setting.click();


//    2. truck driver can create Vehicle cost.
//    3. truck driver can cancel Vehicle cost.
//    4. truck driver can edit Vehicle cost
//    5. truck driver can delete Vehicle cost
//    6. truck driver can add Attachment on General information page by click on any of the car on the grid.
//    7. truck driver can reset the grid by click on Grid setting
}

}
