package org.cb.ta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class Driver {


    public static WebDriver driver;
    public static WebDriver getdriver(){
        System.setProperty("webdriver.chrome.driver","webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        return driver;

    }


}
