package com.Testing.VyTrack.nelo_Us01;

import com.Testing.utilities.Driver;
import com.Testing.utilities.US01_LoginAsTruckDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T05_ResetFeature {
    /**
     * Scenario: Truck driver can reset the setting
     *     Given truck driver is on the setting page
     *     When truck driver clicks on reset setting
     *     Then the setting is successfully reset
     */
    @Test
    public void resetFeature() throws InterruptedException {
        US01_LoginAsTruckDriver.LoginVTruckAsDriver();

        WebElement activitiesFeature = Driver.getDriver().findElement(By.xpath("//div[@id='main-menu']/ul/li[3]/a/span"));
        activitiesFeature.click();

        WebElement calenderEvent = Driver.getDriver().findElement(By.xpath(
                "//div[@style='max-height: 44px;']/ul/li[@data-routes='[\"oro_calendar_event_*\"]']/a/span"));
        calenderEvent.click();
        System.out.println(calenderEvent.getTagName());
        Thread.sleep(3000);
        WebElement gridSetting = Driver.getDriver().findElement(By.xpath("//div[@class='column-manager dropdown']/a"));
        Thread.sleep(3000);
        gridSetting.click();

        WebElement gridSettingCheckBox = Driver.getDriver().findElement(By.xpath
                ("(//div[@class='table-wrapper']/table/child::tbody/tr/td[@class='visibility-cell'])[1]"));
        Thread.sleep(3000);
        gridSettingCheckBox.click();

        WebElement closSetting = Driver.getDriver().findElement(By.xpath("//span[@class='close']"));
        closSetting.click();
        Thread.sleep(3000);

        WebElement resetFeature = Driver.getDriver().findElement(By.xpath("//a[@title='Reset']"));
        Thread.sleep(5000);
        resetFeature.click();

        Driver.closeDriver();
    }

    }

