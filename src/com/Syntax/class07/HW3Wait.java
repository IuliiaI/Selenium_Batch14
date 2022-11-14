package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3Wait {
    /* do not use Thread.sleep() or Explicite wait
    1. go to https://syntaxprojects.com/dynamic-elements-loading.php
    2. click on Start button
    3. get the text Welcome Syntax Technologies and print on the console
    the text will be empty
    write down whatever the reason you understand of text of being empty after exploring DOM
*/
    public static void main(String[] args) {
        //go to google.com
        //maximize your window
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //go to google.com
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        //maximize
        driver.manage().window().maximize();

        WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();
        WebElement welcomeBtn = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text = welcomeBtn.getText();
        System.out.println("The text is: "+text);

        //in the dicription of Start button we have "display: none" and below "Click below button to Loaded Page Element".
        //DOM and UI are not synchronyzed. It takes one more step to be syncronyzed.
    }
}
