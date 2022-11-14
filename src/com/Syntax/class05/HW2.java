package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {
    /*       1.Go to ebay.com
     2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
     3.select Computers/Tables & Networking
     4.click on search
     5.verify the title     */
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create a WebDriver instance
        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("https://www.ebay.com/");
        //maximize your window
        driver.manage().window().maximize();

        //find the WebElement dropDown by looking for select tag
        WebElement dropDown=driver.findElement(By.cssSelector("select[aria-label^='Select a category ']"));

        //use select class
        Select select=new Select(dropDown);



        //get all the options available in the dropdown
        List<WebElement> options = select.getOptions();
        //traverse through the options
        for(int i=0;i< options.size();i++){
            WebElement option = options.get(i);
            System.out.println(option.getText());
        }
        System.out.println(options.size());
        //select Computers/Tables & Networking webelement from dropdown
        select.selectByValue("58058");

        //find element Search and click on it
        WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        searchBtn.click();
        //verify the title

        //WebElement title1=driver.findElement(By.xpath("//title")); - we find it by contr F - //title

        String title = driver.getTitle();
        System.out.println(title);

        //to find title we use Cntrl F and put //title - because it is inside code but not that is appeared on the page
        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("Title is verified");
        }else{
            System.out.println("Title is not correct");
        }
    }
}
