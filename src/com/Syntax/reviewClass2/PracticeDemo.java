package com.Syntax.reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //maximize your window
        driver.manage().window().maximize();

        //when user sends in the username Admin
        WebElement userName = driver.findElement(By.id("txtUsername"));
        //send the user name
        userName.sendKeys("Admin");
        //then user sends in the wrong password
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("abracadabra");
        //then user clicks on login button
        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();

        //then verify the error "Invalid credentials" is displayed
        //get the error message from the DOM
        WebElement errorMSG = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error = errorMSG.getText();

        //verification
        if(error.equalsIgnoreCase("Invalid credentials")){
            System.out.println("The correct error message is there");
        }else{
            System.out.println("The correct error message is not there");
        }



    }
}
