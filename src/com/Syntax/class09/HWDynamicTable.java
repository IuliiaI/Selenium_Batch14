package com.Syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HWDynamicTable {
    /*        http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
      got to the url
      click on PIM
      click on Employee List
      from the table choose one id (it must be from the first page)
      and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)

      the user name is
      admin
      the password is
      Hum@nhrm123            */
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
        //click on PIM
        WebElement pimTextBx = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimTextBx.click();
        //click on Employee List
        WebElement empListTextBx = driver.findElement(By.xpath("//a[text()='Employee List']"));
        empListTextBx.click();
        //from the table choose one id (it must be from the first page) - 45137A
        //      and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
        List<WebElement> columnSecond = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for(int i=0;i< columnSecond.size();i++){
            String columnText = columnSecond.get(i).getText();

            if(columnText.equalsIgnoreCase("45137A")){
                System.out.println("the index of the row which contains 45137A is: "+(i+1));
                // //table[@id='resultTable']/tbody/tr[5]/td[1]
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();
                break;
            }

        }

    }
}
