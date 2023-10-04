package com.testingdemo.project1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Testdemomvn {

	    ChromeDriver dr;

	    @BeforeMethod
	    public void setUp() {
	        dr = new ChromeDriver();
	    }

	    @Test
	    public void testSelenium() {
	        dr.get("https://www.google.com");
	        dr.findElement(By.id("APjFqb")).sendKeys("Selenium");
	        
	    }

	    @AfterMethod
	    public void tearDown() {
	        dr.quit();
	    }
	}



