package com.Syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HWExcpliciteWait {
    /* go to https://the-internet.herokuapp.com/dynamic_controls
       click on checkbox and click on remove
       verify the text
       click on enable verify the textbox is enabled
       enter text and click disable
       verify the textbox is disable */
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //  maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //Button 1
        //click on checkbox
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        //click on remove

        //WebDriverWait wait=new WebDriverWait(driver,20);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Remove']")));

        WebElement removeBtn = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeBtn.click();
        //verify the text
        //here we use implicite wait because we refresh page, we cant see It's gone text and in DOM also no this text
        //when we click remove Btn and check: we can see text It's gone also at UI and DOM then

        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));
        String textMsg = text.getText();
        if(textMsg.equalsIgnoreCase("It's gone!")){
            System.out.println("Text is verified");
        }
        //Button 2

        //click on enable
        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBtn.click();
        //verify the textbox is enabled
        WebElement textBx = driver.findElement(By.xpath("//input[@type='text']"));
        WebDriverWait wait1=new WebDriverWait(driver,20);
        wait1.until(ExpectedConditions.elementToBeClickable(textBx));


        System.out.println(textBx.isEnabled());
        //enter text
        textBx.sendKeys("Test");
        //click disable
        WebElement disableBtn = driver.findElement(By.xpath("//button[text()='Disable']"));
        disableBtn.click();
        //verify the textbox is disable

        WebElement disabledText = driver.findElement(By.xpath("//p[@id='message']"));

        WebDriverWait wait2=new WebDriverWait(driver,20);
        wait2.until(ExpectedConditions.visibilityOf(disabledText));

        System.out.println(textBx.isEnabled());
























    }
}
