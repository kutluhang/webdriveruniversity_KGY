package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;
    WebElement buttonlink;
    public HomePage(){
        /*System.setProperty("webdriver.chrome.driver","webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/index.html");*/

       // driver=new Driver();
        driver=Driver.getdriver();
        String homepageurl="https://webdriveruniversity.com/index.html";
        driver.get(homepageurl);

        /*PageFactory.initElements(Driver.getdriver(), this);*/

    }

    public void controltitle(){
        WebElement nav_title=driver.findElement(By.xpath("//a[@id='nav-title']"));
        nav_title.isDisplayed();
        System.out.println("title displayed");
    }
    public void islinkanabled(){
        buttonlink=driver.findElement(By.xpath("//a[@id='button-clicks']"));
        buttonlink.isEnabled();
    }

    public void clickbuttonlink(){
        buttonlink= driver.findElement(By.xpath("//a[@id='button-clicks']"));
        buttonlink.click();
        System.out.println("buttonlink  clicked");

    }







}
