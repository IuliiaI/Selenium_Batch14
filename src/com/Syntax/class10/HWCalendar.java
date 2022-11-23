package com.Syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HWCalendar {
    /*      Go to syntax hrms .
        Go-to the recruitment tab.
        From the calendar  just select a date
        8 August 2023    */
    public static void main(String[] args) {
//        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //enter credentials and login to the web App
        WebElement usernameTextBx = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        usernameTextBx.sendKeys("admin");
        WebElement passworTextBx = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passworTextBx.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='LOGIN']"));
        loginBtn.click();
//Go-to the recruitment tab.
        WebElement recruitTab = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitTab.click();
//go to calendar Application from "date"
        WebElement calendar = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']/following-sibling::img"));
        calendar.click();
//From the calendar  just select a date
//        8 August 2023
       // WebElement textBox = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
       // textBox.click();

        WebElement dropDownMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(dropDownMonth);
        sel.selectByVisibleText("Aug");

        WebElement dropDownYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel2=new Select(dropDownYear);
        sel2.selectByValue("2023");

        WebElement table = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));

        List<WebElement> cellsValue = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

        for(WebElement cellValue:cellsValue){
            String celltext = cellValue.getText();
            if(celltext.equalsIgnoreCase("8")){
                cellValue.click();
            }
        }















    }
}
