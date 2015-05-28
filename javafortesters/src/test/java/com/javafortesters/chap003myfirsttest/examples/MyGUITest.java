package com.javafortesters.chap003myfirsttest.examples;

//import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tola on 21/05/2015.
 */
public class MyGUITest {
    public String baseURL = "http://www.sainsburys.com";
//    public WebDriver cdriver = new ChromeDriver();
    public String expected = null;
    public String actual = null;
    public Integer number = 1;

    @Test
    public void verifyHomePageTitle(){
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver cdriver = new ChromeDriver();
        cdriver.get(baseURL);

        expected = "Sainsbury's";
        actual = cdriver.getTitle();
        assertEquals("title is not correct", expected, actual);

    }
}
