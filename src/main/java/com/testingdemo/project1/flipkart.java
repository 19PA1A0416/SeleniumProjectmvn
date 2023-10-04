package com.testingdemo.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class flipkart {

	private static final String ENTER = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver dr=new EdgeDriver();
		
		dr.get("http://www.google.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("APjFqb")).sendKeys("Amazon");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		dr.findElement(By.xpath("/html/body/div[5]/div/div[9]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/cite")).click();
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14pro");
		dr.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		dr.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	    //@SuppressWarnings("unused")
		//WebElement buyNowButton = dr.findElement(By.id("buyNowButton"));
	   // buyNowButton.click();
        JavascriptExecutor js = (JavascriptExecutor)dr;
        js.executeScript("window.scrollBy(0,1000)");
        WebElement buyNowButton = dr.findElement(By.id("buy-now-button"));
        buyNowButton.click();

		
		
		

	
		

	}

}
