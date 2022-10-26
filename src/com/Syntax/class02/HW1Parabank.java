package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Parabank {
    /*   navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser   */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Iuliia");
        driver.findElement(By.id("customer.lastName")).sendKeys("Iaremko");
        driver.findElement(By.id("customer.address.street")).sendKeys("Hamilton Street 45");
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("13445");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("3475556756");
        driver.findElement(By.id("customer.ssn")).sendKeys("987654321");
        driver.findElement(By.id("customer.username")).sendKeys("Tester");
        driver.findElement(By.id("customer.password")).sendKeys("123true");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123true");
        driver.findElement(By.className("button")).click();

        Thread.sleep(2000);

        driver.quit();



    }
}
