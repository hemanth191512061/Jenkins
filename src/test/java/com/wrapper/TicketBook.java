package com.wrapper;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TicketBook {

	@Test
	public void test() throws InterruptedException{
		// TODO Auto-generated method stub/////
		

		
		WebDriver web;
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\Version 102\\chromedriver.exe");
		
		web= new ChromeDriver();
		
		web.manage().window().maximize();
		
		web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		web.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		
		WebElement ele1=web.findElement(By.id("src"));
		
		ele1.sendKeys("Hyderabad");
		
		ele1.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement ele2=web.findElement(By.id("dest"));
		
		Thread.sleep(2000);   
		
		ele2.sendKeys("Chennai");
		
		ele2.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);   
		
		web.close();
		
		
		
	}

}
