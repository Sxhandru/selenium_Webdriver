package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_WebDriver\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class=\"wp-categories-link maxheight\"])[9]")).click();
		
        driver.findElement(By.xpath("//button[@onclick=\"normalAlert()\"]")).click();
		
        driver.switchTo().alert();
        
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        String Text =alert.getText();
        System.out.println("Simple alert      "+Text);
        alert.accept();
        
        driver.findElement(By.xpath("//button[@onclick=\"confirmAlert()\"]")).click();
        
        Thread.sleep(2000);
        
        driver.switchTo().alert().dismiss();
        
        driver.findElement(By.xpath("//button[@onclick=\"confirmPrompt()\"]")).click();
        
        driver.switchTo().alert().sendKeys("Chandru");
        
        driver.switchTo().alert().accept();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@onclick=\"lineBreaks()\"]")).click();
        
        driver.switchTo().alert();
		
        org.openqa.selenium.Alert alert1 =driver.switchTo().alert();
        
        String Text1 =alert1.getText();
        System.out.println("Simple Alert   "+Text1);
        alert.accept();
        
        
	}

}
