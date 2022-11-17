package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_WebDriver\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/");

		
	    System.out.println("Title :"+driver.getTitle());
	    System.out.println("Current Url :"+driver.getCurrentUrl());
	    
		driver.findElement(By.xpath("(//a[@class=\"wp-categories-link maxheight\"])[10]")).click();


		WebElement myFrame = driver.findElement(By.xpath("//iframe[@src=\"default.html\"]"));
		driver.switchTo().frame(myFrame);
		WebElement S= driver.findElement(By.xpath("//button[@id=\"Click\"]"));
		S.click();
		System.out.println("Displayed Text :"+S.getText());

		driver.switchTo().defaultContent();
		WebElement myframe1 =driver.findElement(By.xpath("//iframe[@src=\"page.html\"]"));
		driver.switchTo().frame(myframe1);
		
		WebElement myframe2 = driver.findElement(By.xpath("(//iframe[@id=\"frame2\"])[1]"));
		driver.switchTo().frame(myframe2);
		
		WebElement S1= driver.findElement(By.xpath("//button[@id=\"Click1\"]"));
		S1.click();
		System.out.println("Displayed Text Frame2 "+S1.getText());



		driver.switchTo().defaultContent();
		List<WebElement> tf = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Number of frames : "+ tf.size());

		

	}

}
