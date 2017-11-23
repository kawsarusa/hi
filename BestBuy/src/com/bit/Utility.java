package com.bit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Utility {
WebDriver dr;
Utility(WebDriver d) {
	this.dr = d;
	
}
public void type() {
dr.findElement(By.xpath("//*[@id=\"menu0\"]")).click();
dr.findElement(By.xpath("//*[@id=\"group0\"]/div[1]/div[1]/ul/li[4]/a")).click();
//dr.findElement(By.xpath("//*[@id=\"gh-search-input\"]")).sendKeys("iphone x");
//dr.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/form/button[2]/span")).click();




}





}
