package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW1WindowHandles {
    /* 1. Go to http://accounts.google.com/signup
       2. click on Help and Privacy button
       3. click on Community button
       4. go to gmail.com page and enter your user name in form
       Hint: you can save the window handle in variables for later use

     */
    static String parentWHandle;
    static String privacyWHandle;
    static String helpWHandle;

    public static void main(String[] args) throws InterruptedException {
        //go to google.com
        //maximize your window
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //go to google.com
        driver.get("http://accounts.google.com/signup");
        //maximize
        driver.manage().window().maximize();

        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        Set<String> windowHandles = driver.getWindowHandles();
        for(String handle:windowHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Create your Google Account")) {
                parentWHandle = driver.getWindowHandle();
                System.out.println("the current page under focus is Gmail Parent Page Window: " + parentWHandle);
            } else if (title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")) {
                privacyWHandle = driver.getWindowHandle();
                System.out.println("the current page under focus is Privacy Page Window: " + privacyWHandle);
            } else if (title.equalsIgnoreCase("Google Account Help")) {
                helpWHandle = driver.getWindowHandle();
                System.out.println("the current page under focus is Help Page Window: " + helpWHandle);
            }
        }
            driver.switchTo().window(helpWHandle);
            WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
            communityBtn.click();

            Thread.sleep(1000);

            driver.switchTo().window(parentWHandle);
            WebElement userNameBtn = driver.findElement(By.xpath("//input[@name='Username']"));
            userNameBtn.sendKeys("Tester");

    }
}
