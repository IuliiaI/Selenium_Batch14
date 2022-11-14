package com.Syntax.reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("https://www.facebook.com/");
        //maximize your window
        driver.manage().window().maximize();

        //get the webelement
        WebElement createAccountBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        //click on Webelement
        createAccountBtn.click();
        //sleep for 3 seconds
        Thread.sleep(3000);
        //select the data from the drop down
        //1 find the webelement thatt contains the select tag
        //2 use select class Select sel=new Select(Webelement)

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel=new Select(day);

        //1 select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);
        //2 select by visible text
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
        //3 select by value
        sel.selectByValue("16");
        Thread.sleep(2000);
        //..................

        //1 find the webelement
        //2 use the select class
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMonth=new Select(month);
        selectMonth.selectByVisibleText("Aug");

        //print all the available monthes in console
        //gets u all the available options in the drop down
        List<WebElement> options = selectMonth.getOptions();
        //traverse through the loop and print each webelement
        for(int i=0;i<options.size();i++){

            String months=options.get(i).getText();
            System.out.println(months);
        }


    }
}
