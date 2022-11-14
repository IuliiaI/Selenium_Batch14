package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    /*     1.Go to facebook
           2.click on create New Account
           3.Fill out the whole form
           4.Take screen shot of filled out form manually and share in HW channel along with code     */
    public static void main(String[] args) throws InterruptedException {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("https://www.facebook.com/");
        //maximize your window
        driver.manage().window().maximize();

        //find webelement "create New Account" and click on it
        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(3000);
        //get the webelements firstname,lastName,email,NewPassword and enter credentials
        driver.findElement(By.name("firstname")).sendKeys("She");
        driver.findElement(By.name("lastname")).sendKeys("IsTester");
        driver.findElement(By.name("reg_email__")).sendKeys("3476685432");
        driver.findElement(By.name("reg_passwd__")).sendKeys("666Evening");
        //find the WebElement dropDown by looking for select tag
        WebElement dropDown = driver.findElement(By.id("month"));
        //use select class
        Select sel=new Select(dropDown);
        //select an option by index
        sel.selectByIndex(6);

        //find the WebElement dropDown by looking for select tag
        WebElement dropDown2 = driver.findElement(By.name("birthday_day"));
        //use select class
        Select sel2=new Select(dropDown2);
        //select an option by Index
        sel2.selectByIndex(1);

        //find the WebElement dropDown by looking for select tag
        WebElement dropDown3 = driver.findElement(By.id("year"));
        //use select class
        Select sel3=new Select(dropDown3);
        //select an option by Value
        sel3.selectByValue("1984");

        //find elenent radio button and click on it
        driver.findElement(By.xpath("//label[text()='Female']")).click();

    }
}
