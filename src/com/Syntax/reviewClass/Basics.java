package com.Syntax.reviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        //setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance
        WebDriver driver=new ChromeDriver();
        //open the FB
        driver.get("https://www.facebook.com/");
        //maximize thw window
        driver.manage().window().maximize();
        //before closing wait for some time
        Thread.sleep(5000);

        //click on create new account
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(5000);




        //quit browser
        driver.quit();





    }
}
