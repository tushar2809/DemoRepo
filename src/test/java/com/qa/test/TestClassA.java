package com.qa.test;

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
//test comment 12345
	@Test
	public void testMethod()
	{
		
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, "Google");
		;
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
