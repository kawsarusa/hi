package com.bit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
WebDriver dr;

@Before
public void openBrowser() {
System.setProperty("webdriver.chrome.driver", "/Users/jarrellsimon/Downloads/chromedriver");
dr = new ChromeDriver();
dr.get("https://www.bestbuy.com/");


}
@After
public void closeBrowser() {
//dr.quit();
}

}
