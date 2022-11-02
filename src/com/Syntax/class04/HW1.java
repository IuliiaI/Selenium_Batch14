package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*     Open chrome browser
     Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
     Enter valid username and password (username - Admin, password - Hum@nhrm123)
     Click on login button
     Then verify the message "Welcome Admin " is there on the top right corner     */
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
        //enter valid password
        driver.findElement(By.cssSelector("input[id*='Password']")).sendKeys("Hum@nhrm123");
        //click on login btn
        driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
        //find webelement Welcome Admin
        WebElement welcomeBox = driver.findElement(By.cssSelector("a#welcome"));
        //get the text from this webelement
        String message=welcomeBox.getText();
        //verify the message "Welcome Admin " is there on the top right corner
        if(message.equalsIgnoreCase("Welcome Admin")){
            System.out.println("The message of Welcome Admin is there on the top right corner");
        }else{
            System.out.println("The message of Welcome Admin is not there on the top right corner");
        }

    }
}
