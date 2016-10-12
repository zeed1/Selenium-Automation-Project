package com.LearnAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestMaven1Test {
	
	
	WebDriver driver;
	
	
	@Test
	public void maven1(){
		
		
		System.out.println("Hello");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
	
		