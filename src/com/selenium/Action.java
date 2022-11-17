package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_WebDriver\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		WebElement fr1 =driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(fr1);
		
		Actions ac = new Actions(driver);
		WebElement src1 = driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[4]"));
		WebElement trg1 = driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-state-default ui-droppable\"]"));
		ac.dragAndDrop(src1, trg1).build().perform();
		
		//Thread.sleep(2000);
		
		WebElement src2 = driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[3]"));
		WebElement trg2 = driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-state-default ui-droppable\"]"));
		ac.dragAndDrop(src2, trg2).build().perform();
		
		//Thread.sleep(2000);
		
		WebElement src3 = driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[1]"));
		WebElement trg3 = driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-state-default ui-droppable\"]"));
		ac.dragAndDrop(src3, trg3).build().perform();
		
		//Thread.sleep(2000);
		
		WebElement src4 = driver.findElement(By.xpath("(//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"])[2]"));
		WebElement trg4 = driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-state-default ui-droppable\"]"));
		ac.dragAndDrop(src4, trg4).build().perform();
			
		
		driver.switchTo().defaultContent();
		
		WebElement tb1 = driver.findElement(By.xpath("//li[@id=\"Propagation\"]"));
		tb1.click();
		
		//WebElement iframe = driver.findElement(By.xpath("(//iframe[@class=\"demo-frame lazyloaded\"])[2]"));
		// driver.switchTo().frame(iframe);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable-inner\"]"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		
	
		
		/*
		WebElement tb = driver.findElement(By.xpath("//li[@id=\"Accepted Elements\"]"));
		tb.click();
		
		
		WebElement iframe = driver.findElement(By.xpath("(//iframe[@class=\"demo-frame lazyloaded\"])[1]"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		
		WebElement drag= driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		ac.dragAndDrop(drag, drop).build().perform();
		*/
		
		
		
		 
		
		
	}

}
