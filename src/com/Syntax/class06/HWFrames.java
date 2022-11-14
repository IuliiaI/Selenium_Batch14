package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWFrames {
    /*
    goto https://chercher.tech/practice/frames

    1.check the checkBox
    2.Select BabyCat from drop dwon
    3. Send text in text box "DONE"
     */
    public static void main(String[] args) {
        //go to google.com
        //maximize your window
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //go to google.com
        driver.get("https://chercher.tech/practice/frames");
        //maximize
        driver.manage().window().maximize();


//        switch the focus of the driver to the parent iframe whose id is iframe1
        driver.switchTo().frame("frame1");
//        switch the focus to the child frame
        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        //        switch the focus back to home content
        driver.switchTo().defaultContent();

//          switching to the frame which has drop down
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);

//        find the select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel= new Select(dropDown);// if you have Select tag it is best way to use select class

        sel.selectByIndex(1);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");

        driver.findElement(By.xpath("//input")).sendKeys("abracdabra");

    }
}
