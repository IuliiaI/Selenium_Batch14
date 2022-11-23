package com.Syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HWActions {
    /*    goto https://demo.guru99.com/test/simple_context_menu.html
          right click  on the button, select edit and handle the alert
          double click on the button and handle the alert         */

    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action=new Actions(driver);
        action.contextClick(rightClickBtn).perform();


        WebElement editText = driver.findElement(By.xpath("//span[text()='Edit']"));
        editText.click();

        Alert alert1 = driver.switchTo().alert();
        WebDriverWait wait=new WebDriverWait(driver,20);
        alert1.accept();

        WebElement doubleclickBtn = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));

        Actions action1=new Actions(driver);
        action1.doubleClick(doubleclickBtn).perform();

        Alert alert2=driver.switchTo().alert();
        alert2.accept();

    }

}
