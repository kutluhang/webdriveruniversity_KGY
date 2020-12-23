package org.cb.ta;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
    HomePage homePage=new HomePage();

    @Test
    public void navtitleiddisplayed(){
        homePage.controltitle();

    }
    @Test
    public void enablitycontrolforbuttonlink(){
        Assert.assertEquals(true, homePage.islinkanabled());
    }
    @Test
    public void clickbutonlink(){

        homePage.clickbuttonlink();

    }

    @Test
    public void clickToDoListLink(){
        homePage.clickToDoListLink();
    }



}
