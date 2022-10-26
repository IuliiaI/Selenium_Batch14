package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatingElements {
    public static void main(String[] args) throws InterruptedException{
        //got to Fb.com
        //Enter Username
        //Enter password
        //click login
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //goto fb.com
        driver.get("https://www.facebook.com/");
        //maximize your window
        driver.manage().window().maximize();
        //enter the Username in the textbox
        //1. locate the element and seng keys
        driver.findElement(By.id("email")).sendKeys("abracadabra");
        //enter the password in the textbox
        driver.findElement(By.name("pass")).sendKeys("waow12345678");
        //click the login
       driver.findElement(By.name("login")).click();

        //for the following task to work make sure to comment login functionality
        //task2:
        //click on forgot password
//        driver.findElement(By.linkText("Forgot password?")).click();

        //for the following task to work make sure to comment Task 2 and login functionality
        //task3
        //click on forgot password using Partial linkText locator
//        driver.findElement(By.partialLinkText("Forgot")).click();

    }
}
