package com.Testing.VyTrack.Irina;

import com.Testing.utilities.ConfigurationReader;
import com.Testing.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory_5 {

    @Test
    public void userStory_5() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("qa2.vytrak.url"));
        Thread.sleep(3000);

        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        userName.sendKeys("user154");

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");

        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//button[@id='_submit']"));
        loginBtn.click();

        WebElement fleetBtn = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetBtn.click();

        WebElement vehicleCost = Driver.getDriver().findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/div/div/ul/li[5]"));
        Thread.sleep(3000);
        vehicleCost.click();

//        1. truck driver see all cars' cost information on the Vehicle Costs page.

        WebElement setting = Driver.getDriver().findElement(By.xpath("//i[@class='fa-cog hide-text']"));
        Thread.sleep(3000);
        setting.click();
        Thread.sleep(3000);

        WebElement selectID = Driver.getDriver().findElement(By.xpath("//input[@id='column-c136']"));
        Thread.sleep(3000);
        selectID.click();
        Thread.sleep(3000);

        WebElement table = Driver.getDriver().findElement(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']"));
        System.out.println("table.isDisplayed() = " + table.isDisplayed());

//        2. truck driver can create Vehicle cost.

        WebElement createVehicleCostBtn = Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        Thread.sleep(3000);
        createVehicleCostBtn.click();
        Thread.sleep(3000);


//        3. truck driver can cancel Vehicle cost.

        WebElement cancelBtn = Driver.getDriver().findElement(By.xpath("//a[@title='Cancel']"));
        cancelBtn.click();
        Thread.sleep(2000);

//        4. truck driver can edit Vehicle cost

        WebElement threeDots = Driver.getDriver().findElement(By.xpath("(//a[@data-toggle='dropdown'])[8]"));
        System.out.println("threeDots.isDisplayed() = " + threeDots.isDisplayed());

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(threeDots).perform();

        WebElement editBtn = Driver.getDriver().findElement(By.xpath("(//a[@title='Edit'])[3]"));
        System.out.println("editBtn.isDisplayed() = " + editBtn.isDisplayed());


//        5. truck driver can delete Vehicle cost

        //WebElement deleteBtn = Driver.getDriver().findElement(By.xpath("(//a[@title='Delete'])[3]"));

        //List<WebElement> dots = Driver.getDriver().findElement(By.xpath("(//a[@data-toggle='dropdown'])[8]"));

//        6.  truck driver can add Attachment on General information by click on any of the car on the grid.
//        7. truck driver can reset the grid by click on Grid setting

        Driver.getDriver().quit();
    }


}
