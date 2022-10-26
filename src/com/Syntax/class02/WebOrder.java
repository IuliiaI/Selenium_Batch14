package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class WebOrder {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //goto fb.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize window
        driver.manage().window().maximize();
        //enter the user name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        //enter the password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        //click on login
        driver.findElement(By.className("button")).click();

        //make sure that title is correct i.e web Orders

        //get the title of the page
        String title=driver.getTitle();
        System.out.println(title);

        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The Title is correct: "+title);
        }else{
            System.out.println("The title is incorrect: "+title);
        }

    }
}
