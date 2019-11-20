package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassA {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		  driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		
		
		
	}

	@Test
	public void testMethod()
	{
		
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, "Google");
	}
	@Test
	public void testMethod2()
	{
		driver.findElement(By.linkText("Gmail")).click();
		String current_URL = driver.getCurrentUrl();
		Assert.assertEquals(current_URL, "https://wwwwwww.google.com/intl/en-GB/gmail/about/#");
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		System.out.println("closing");
	}
	
}
