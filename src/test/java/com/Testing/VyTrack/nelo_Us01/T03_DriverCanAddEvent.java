package com.Testing.VyTrack.nelo_Us01;

import com.Testing.utilities.Driver;
import com.Testing.utilities.US01_LoginAsTruckDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T03_DriverCanAddEvent {
    /**
     *  Scenario: Truck driver should be able to add an event and should display under activity tab
     *     Given track driver is on event page
     *     When  truck driver adds an event
     *     Then  event should be displayed under activity tap
     */

    @Test
    public static void driverCanAddEvent() throws InterruptedException {
        US01_LoginAsTruckDriver.LoginVTruckAsDriver();

        WebElement activity = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span"));
        activity.click();

        Thread.sleep(3000);

        WebElement calenderEvent = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
        Thread.sleep(5000);
        calenderEvent.click();


        WebElement createCalenderEvent = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", createCalenderEvent);
        Thread.sleep(5000);
        createCalenderEvent.click();
        Thread.sleep(5000);

        WebElement ownerDropDown = Driver.getDriver().findElement(By.xpath("//div[@id='s2id_oro_calendar_event_form_calendar']"));
        Thread.sleep(5000);
        ownerDropDown.click();

        WebElement owner = Driver.getDriver().findElement(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable'][2]"));
        Thread.sleep(5000);
        owner.click();

        WebElement title = Driver.getDriver().findElement(By.xpath("(//div[@class='controls'])[2]/input"));
        Thread.sleep(5000);
        title.sendKeys("sickTimeOff");

        // driver.switchTo().frame(driver.findElement(By.id("oro_calendar_event_form_description-uid-62b2011516b22_ifr")));

        WebElement description = Driver.getDriver().findElement(By.xpath("(//div[@class='controls'])[3]/div/div"));
        Thread.sleep(5000);
        description.sendKeys("Day Off");

        WebElement guest = Driver.getDriver().findElement(By.xpath("(//div[@class='controls'])[5]/div"));
        Thread.sleep(5000);
        guest.click();

        WebElement guestName = Driver.getDriver().findElement(By.xpath("(//div[@class='select2-result-label'])[10]"));
        Thread.sleep(5000);
        guestName.click();

        WebElement remindersAddBtn = Driver.getDriver().findElement(By.xpath("(//div[@class='controls'])[6]/div"));
        Thread.sleep(5000);
        remindersAddBtn.click();

     /* Select emailDropDown = new Select( driver.findElement(By.xpath("(//div[@class='selector input-widget-select']/child::select)[1]")));
        Thread.sleep(15000);
        emailDropDown.selectByVisibleText("Email");



        Select timeDropDown = new Select(driver.findElement(By.xpath("(//select[@data-bound-input-widget='uniform'])[2]")));
        Thread.sleep(15000);
        timeDropDown.selectByVisibleText("hours");
         */




          WebElement startDateDropDown = Driver.getDriver().findElement(By.xpath("((//div[@class='controls'])[7]//span/following-sibling::input)[1]"));
           startDateDropDown.click();

        WebElement dayAndYearDateStart = Driver.getDriver().findElement(By.xpath("(//table[@class='ui-datepicker-calendar']/thead/following-sibling::tbody/tr)[1]/td[@data-month='5'][2]"));
           Thread.sleep(3000);
           dayAndYearDateStart.click();



           WebElement timeBox = Driver.getDriver().findElement(By.xpath("(//div[@class='controls'])[7]//span/following-sibling::input[2]"));
           Thread.sleep(3000);
           timeBox.sendKeys("8:00 am" + Keys.TAB);





        WebElement endDateBox =  Driver.getDriver().findElement(By.xpath("(//div[@class='controls'])[8]/div/span/following-sibling::input[1]"));
        endDateBox.sendKeys("Oct 12, 2022"+ Keys.TAB);


        WebElement endTime = Driver.getDriver().findElement(By.xpath("//input[contains(@id,\"time_selector_oro_calendar_event_form_end\")]"));
        Thread.sleep(3000);
        endTime.sendKeys("9:34 AM" + Keys.TAB);
        Thread.sleep(3000);






        WebElement allDayEvent =  Driver.getDriver().findElement(By.xpath("(//div[@class='controls'])[9]/input"));
        Thread.sleep(3000);
        allDayEvent.click();
        Thread.sleep(3000);
        System.out.println(allDayEvent.isSelected());



        // Save and close button

        WebElement saveAndCloseBtn =  Driver.getDriver().findElement(By.xpath("(//div[@class='pull-right pinned-dropdown'])/div/button"));
        Thread.sleep(3000);
        saveAndCloseBtn.click();
        Thread.sleep(3000);

        WebElement notificationPage = Driver.getDriver().findElement(By.xpath("//div[@class='modal modal-primary in']/child::div[@class='modal-footer']/a[.='Notify']"));
        Thread.sleep(3000);
        notificationPage.click();

        //Verify general information page
        WebElement generalInformation =  Driver.getDriver().findElement(By.xpath("//div[@class='container-fluid']/ul/li/a"));
        System.out.println(generalInformation.getText());
        System.out.println(generalInformation.isDisplayed());

        Driver.closeDriver();
    }
}
