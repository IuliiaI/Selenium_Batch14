package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*   HRMS Application Negative Login:
         Open chrome browser
         Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
         Enter valid username
         Leave password field empty
         Click on login button
         Verify error message with text “Password cannot be empty” is displayed.      */
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //maximize your window
        driver.manage().window().maximize();

        //enter valid username
        driver.findElement(By.cssSelector("input[id$='Username']")).sendKeys("Admin");
        //click on login btn
        driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
        //get webelement "password cannot be empty'
        WebElement passError = driver.findElement(By.xpath("//span[contains(text(),'cannot be empty')]"));
        //get the text from this element
        String text=passError.getText();
        //Verify error message with text “Password cannot be empty” is displayed
        if(text.equalsIgnoreCase("Password cannot be empty")) {
            System.out.println("Password cannot be empty is displayed ");
        }else{
            System.out.println("Password cannot be empty is not displayed ");
        }

    }
}
