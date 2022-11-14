package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        //maximize your window
        driver.manage().window().maximize();

        //find the checkbox
        WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
        //click on it
        checkbox.click();

    }
}
