package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Driver {


    public static WebDriver driver;
    public static WebDriver getdriver(){
        System.setProperty("webdriver.chrome.driver","webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        return driver;

    }


}
