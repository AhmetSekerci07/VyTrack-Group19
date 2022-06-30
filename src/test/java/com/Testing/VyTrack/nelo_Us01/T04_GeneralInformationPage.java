package com.Testing.VyTrack.nelo_Us01;

import com.Testing.utilities.Driver;
import com.Testing.utilities.US01_LoginAsTruckDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T04_GeneralInformationPage {
    /**
     *   Scenario: Truck driver should be able to add an event and should display under general information page
     *     Given track driver is on event page
     *     When  truck driver adds an event
     *     Then  event should be displayed under general information page
     */
    @Test
    public void task4_EventIsDisplayed_GeneralInfoPage(){
        US01_LoginAsTruckDriver.LoginVTruckAsDriver();

        WebElement activitiesFeature = Driver.getDriver().findElement(By.xpath("//div[@id='main-menu']/ul/li[3]/a/span"));
        activitiesFeature.click();

        WebElement calenderEvent = Driver.getDriver().findElement(By.xpath(
                "//div[@style='max-height: 44px;']/ul/li[@data-routes='[\"oro_calendar_event_*\"]']/a/span"));
        calenderEvent.click();
        System.out.println(calenderEvent.getTagName());

        WebElement verifyEventDisplayed = Driver.getDriver().findElement(By.xpath(
                "//tbody[@class='grid-body']/tr/following-sibling::tr[9]"
        ));
        System.out.println(verifyEventDisplayed.isDisplayed());

Driver.closeDriver();

    }

    }


