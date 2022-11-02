package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    /*          you must use Relative Xpath to do this
    Note: you are free to choose the type of relative Xpath, but try to use the one that seems more appropriate
         Navigate to http://syntaxprojects.com/
         Click on start practicing
         click on simple form demo
         enter any text on first text box
         click on show message
         quit the browser         */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item'][text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'your Message')]")).sendKeys("Greetings");
        driver.findElement(By.xpath("//button[contains(text(),'Message')]")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
