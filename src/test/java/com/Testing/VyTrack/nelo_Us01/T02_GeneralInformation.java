package com.Testing.VyTrack.nelo_Us01;

import com.Testing.utilities.Driver;
import com.Testing.utilities.US01_LoginAsTruckDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class T02_GeneralInformation {

    @Test
    public void generalInformationOfCars() throws InterruptedException {
       US01_LoginAsTruckDriver.LoginVTruckAsDriver();

        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Fleet')])[1]"));
        fleetModule.click();

        Thread.sleep(3000);

        WebElement vehicleModal = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles Model']"));
        vehicleModal.click();



        List<WebElement> availableCars = Driver.getDriver().findElements(By.xpath("//table[contains(@class,'grid table')]//tbody/child::tr"));

        for (int i = 0; i < availableCars.size(); i++){
            System.out.println(availableCars.get(i).getText());


        }

        WebElement toyota = Driver.getDriver().findElement(By.xpath("//table[contains(@class,'grid table')]//tbody/child::tr[2]"));
        toyota.click();

        Thread.sleep(2);
        List<WebElement> generalInformation = Driver.getDriver().findElements(By.xpath("//h5[@class='user-fieldset']/following-sibling::div"));
        for(WebElement eachElement : generalInformation){
            System.out.println("Is displayed: " + eachElement.isDisplayed());

            System.out.println(eachElement.getText());
        }

     Driver.closeDriver();
    }
    }

