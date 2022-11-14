package com.Syntax.reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        //maximize your window
        driver.manage().window().maximize();

        // find checkboxes
        List<WebElement> checkBxes = driver.findElements(By.xpath("//input[@name='color']"));

        //it contains all 6 webelements
        //traverse thriough loop

        for(WebElement checkbx:checkBxes){
           String color=checkbx.getAttribute("value");  //checkbx.click(); to click all checkboxes
           if(color.equalsIgnoreCase("blue")){
               checkbx.click();
               break;

           }
        }








    }
}
