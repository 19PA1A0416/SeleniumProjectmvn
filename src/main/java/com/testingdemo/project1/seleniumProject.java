package com.testingdemo.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://www.google.com");
		dr.findElement(By.id("APjFqb")).sendKeys("Selinium");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		dr.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollBy(0,500)");
		dr.get("https://www.selenium.dev/documentation/webdriver/");
		dr.findElement(By.cssSelector("#main_navbar > ul > li:nth-child(3) > a > span")).click();
	    JavascriptExecutor jr=(JavascriptExecutor)dr;
	    jr.executeScript("window.scrollBy(0,500)");
		dr.findElement(By.xpath("/html/body/div/main/div[3]/div[3]/div/div[2]/p[2]/a")).click();

		
		

	}

}