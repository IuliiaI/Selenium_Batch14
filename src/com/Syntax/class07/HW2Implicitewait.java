package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2Implicitewait {
    /*   1. go to https://syntaxprojects.com/dynamic-data-loading-demo.php
         2. click on get new user
         3. get the first name of user and print it on console     */
    public static void main(String[] args) {
        //go to google.com
        //maximize your window
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create instance of WebDriver
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to google.com
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        //maximize
        driver.manage().window().maximize();

        WebElement getNewUserBtn = driver.findElement(By.xpath("//button[text()='Get New User']"));
        getNewUserBtn.click();

        WebElement firstNameBtn = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String text = firstNameBtn.getText();
        System.out.println(text);


    }
}
