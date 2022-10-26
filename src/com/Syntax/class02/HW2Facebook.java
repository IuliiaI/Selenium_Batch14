package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2Facebook {
    /*    navigate to fb.com
     click on create new account
     fill up all the textboxes

     close the pop up
     close the browser    */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.partialLinkText("account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("She");
        driver.findElement(By.name("lastname")).sendKeys("IsTester");
        driver.findElement(By.name("reg_email__")).sendKeys("3476685432");
        driver.findElement(By.name("reg_passwd__")).sendKeys("666Evening");
        driver.findElement(By.id("month")).sendKeys("Jul");
        driver.findElement(By.id("day")).sendKeys("27");
        driver.findElement(By.id("year")).sendKeys("1984");
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(3000);
        //driver.findElement(By.name("websubmit")).click();
        driver.quit();


    }
}
