package com.Testing.VyTrack.Ahmet;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestZeliha extends TestBase {
    @Test
    public void testzel() throws InterruptedException {

        driver.get("https://qa2.vytrack.com/user/login");


        WebElement username = driver.findElement(By.name("_username"));
        username.sendKeys("user153");


        WebElement password = driver.findElement(By.name("_password"));
        password.sendKeys("UserUser123");

        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        Thread.sleep(3000);

        driver.get("https://qa2.vytrack.com/entity/Extend_Entity_VehiclesOdometer");

        Thread.sleep(3000);

        WebElement create = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]"));
        create.click();

        Thread.sleep(3000);

        WebElement save = driver.findElement(By.xpath("//button[@class='btn btn-success action-button']"));
        save.click();


        WebElement verif = driver.findElement(By.xpath("//div[.=\"Entity saved\"]"));
        Assert.assertEquals(verif.getText(), "Entity saved");


    }
}

