package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_Executor {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_WebDriver\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		
		jse.executeScript("window.scroll(0,1000)", "");
		
		Thread.sleep(5000);
		
		jse.executeScript("window.scroll(0,500)","");
		
		Thread.sleep(5000);
		
		 jse.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		 Thread.sleep(3000);
		 
		 jse.executeScript("window.scroll(0,0)", "");
		 Thread.sleep(3000);
		 
		 jse.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		 Thread.sleep(3000);
		 
		 WebElement x = driver.findElement(By.xpath("(//a[@class=\"nav_a\"])[27]"));
		 jse.executeScript("arguments[0].scrollIntoView(true)", x);
		 x.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

