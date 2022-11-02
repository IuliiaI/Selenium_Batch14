package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            //create a WebDriver instance
            WebDriver driver=new ChromeDriver();
            //use the get() function to open up the required website
            driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

            //find the webelement button
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
        //get the text from the btn webelement
        String text=btn.getText();
        //print it on console
        System.out.println(text);

        //get the value of the attribute "id" from this element
        String idvalue = btn.getAttribute("id");
        //print it on the concole
        System.out.println(idvalue);
    }
}
