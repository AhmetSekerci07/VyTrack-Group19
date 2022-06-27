package com.Testing.VyTrack.Lena;

import com.Testing.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class US_6 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.get("https://qa1.vytrack.com/");

        //user name
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager51");

        //password
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        driver.findElement(By.id("_submit")).click();

        //Move mouse to fleet
    WebElement fleet = driver.findElement(By.xpath("//*[contains(text(), '    Fleet')]"));
    Actions action = new Actions(driver);
        action.moveToElement(fleet).build().perform();

    //Vehicle cost page+
    WebElement vehCostsBtn= driver.findElement(By.xpath("//*[.='Vehicle Costs']"));
        vehCostsBtn.click();


    //Reset button from grid settings
    WebElement reset = driver.findElement(By.xpath("//div[@class='actions-panel pull-right form-horizontal']/div/a[3]"));
        Assert.assertTrue(reset.isEnabled());
        reset.click();


    //Create vehicle cost page
    WebDriverWait wait=new WebDriverWait(driver,100, 3000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@title='Create Vehicle Costs']")))).click();

       // Assert.assertEquals(driver.getTitle(), "All - Vehicle Costs - Entities - System - Car - Entities - System");

        //choose a value
        WebElement chooseValue=driver.findElement(By.xpath("//span[.='Choose a value...']"));
        chooseValue.click();

        //road assistance
        WebElement roadAssistance=driver.findElement(By.xpath("//div[.='Road Assistance']"));
        roadAssistance.click();

        //total price
        WebElement totalPrice= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        totalPrice.sendKeys("200");

        //choose month
        WebElement chooseDate=driver.findElement(By.xpath("//input[@placeholder='Choose a date']"));
        chooseDate.click();

        Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        monthDropdown.selectByIndex(10);

        //select year
        Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        yearDropdown.selectByIndex(3);

        //select a date
        WebElement selectDate= driver.findElement(By.xpath("//a[.='20']"));
        selectDate.click();

        //cost description
        WebElement costDescription=driver.findElement(By.xpath("//textarea[@name='custom_entity_type[CostDescriptions]']"));
        costDescription.sendKeys("abc");


        //End test


        //Close and Save
    WebElement saveCloseBtn=driver.findElement(By.xpath("//div[@class='btn-group pull-right']"));
        Assert.assertTrue(saveCloseBtn.isEnabled());
        saveCloseBtn.click();


    //Delete Vehicle
    WebElement deleteBtn= driver.findElement(By.xpath("//a[@title='Delete Vehicle Costs']"));
        Assert.assertTrue(deleteBtn.isEnabled());
        deleteBtn.click();

    //Confirm Delete
    WebElement yesDeleteBtn= driver.findElement(By.xpath("//a[.='Yes, Delete']"));
        yesDeleteBtn.click();

        //Check box "Snow tires"
    WebElement snowTiresCheckBox= driver.findElement(By.xpath("//*[contains(text(),'Snow')]"));
        snowTiresCheckBox.click();

    //Click "More actions"
    WebElement moreActions=driver.findElement(By.xpath("//a[@class='btn dropdown-toggle']"));
        moreActions.click();


    //Click Attached File
    WebElement addAttachment= driver.findElement(By.xpath("//a[@class=' no-hash'][1]"));
        addAttachment.click();


    //Upload file
    WebElement choseFileBtn= driver.findElement(By.xpath("//input[@type='file']"));
        choseFileBtn.sendKeys("/Users/elenafarima/IdeaProjects/VyTrack-Group19_19/src/test/java/com/Testing/VyTrack/Lena/upload/Test.png");

    //Click on Save button
    WebElement saveBtn=driver.findElement(By.xpath("//span[.='Save']"));
        saveBtn.click();

    //Click "More Action and Add Note
        moreActions.click();

        driver.findElement(By.xpath("//a[@title='Add note']")).click();

    //Close comment on events
        driver.findElement(By.xpath("//button[@type='reset']")).click();


        //Click "More Action and Add Events
        moreActions.click();

        driver.findElement(By.xpath("//a[@title='Add an event to this record']")).click();

        driver.findElement(By.name("oro_calendar_event_form[title]")).sendKeys("Test");
        driver.findElement(By.name("oro_calendar_event_form[organizerDisplayName]")).sendKeys("Test");
        driver.findElement(By.name("oro_calendar_event_form[organizerEmail]")).sendKeys("Test@test.com");

        driver.findElement(By.xpath("//button[.='Save']")).click();



        driver.quit();






}
}

