package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickbuttonsPage  {
    WebDriver driver;
    WebElement webclickbutton;
    WebElement conguralationstitle;
    WebElement maintitle;
    WebElement jsclickbutton;
    WebElement closebutton;
    WebElement clsbutton;
    public void webelementdefinition(){
        maintitle=driver.findElement(By.xpath("//div[@id='main-header']"));

        webclickbutton=driver.findElement(By.xpath("//span[@id='button1']"));
        conguralationstitle=driver.findElement(By.xpath("//h4[@class='modal-title']"));
        jsclickbutton=driver.findElement(By.xpath("//span[@id='button2']"));
        closebutton=driver.findElement(By.xpath("//button[@class='close']"));
        clsbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
    }

    public ClickbuttonsPage() {
        driver=Driver.getdriver();
        driver.get("http://www.webdriveruniversity.com/Click-Buttons/index.html");
    }
    //@FindBy(xpath ="//div[@id='main-header']")
   // public WebElement maintitle;
    public void maintitlecontrol(){
        webelementdefinition();
        maintitle.isDisplayed();
        System.out.println(maintitle);
        System.out.println("main title gorundu");

    }
    public void webelememntclickbuttoncontroll(){
        webelementdefinition();

        webclickbutton.isDisplayed();
        System.out.println("web element click button seemed");
    }
    public void javascriptclickbuttoncontroll(){
        webelementdefinition();

        jsclickbutton.isDisplayed();
        System.out.println("js click button seemed");
    }
    public void wbbuttonclick(){
        webelementdefinition();

        webclickbutton.click();
        conguralationstitle.isDisplayed();
    }
    public void clickclosewbpopup() throws InterruptedException {
        webelementdefinition();
        Thread.sleep(2000);
        closebutton.click();

    }
    public void jsbuttonclick(){
        webelementdefinition();
        jsclickbutton.click();

    }








}
