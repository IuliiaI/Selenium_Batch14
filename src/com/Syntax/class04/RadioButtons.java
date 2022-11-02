package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        //get the radio button Male
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        //check if the radio btn is displayed
        boolean displayStatus=maleRadioBtn.isDisplayed();
        //print the display status
        System.out.println("The radio button is Displayed :"+displayStatus);

        //check if the radio button male is Enabled
        boolean enableStatus= maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled :"+enableStatus);

        //check if the radio btn male is selected
        boolean selectStatus= maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected :"+selectStatus);

        //check if the radio btn male is not selected then click on it
        if(!selectStatus){
            //perform click operation on the radio button
            maleRadioBtn.click();
        }
        selectStatus= maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected :"+selectStatus);
    }
}