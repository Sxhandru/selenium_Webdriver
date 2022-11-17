package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_WebDriver\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Chandrusrinivasan");

		WebElement Password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		Password.sendKeys("9RG8E2");

		WebElement login = driver.findElement(By.xpath("//input[@name=\"login\"]"));
		login.click();

		WebElement location = driver.findElement(By.xpath("//select[@name=\"location\"]"));
		Select a = new Select(location);
		a.selectByValue("Paris");

		Thread.sleep(2000);
		WebElement Hotels = driver.findElement(By.xpath("//select[@name=\"hotels\"]"));
		Select b = new Select(Hotels);
		b.selectByIndex(3);

		Thread.sleep(2000);
		WebElement Roomtype = driver.findElement(By.xpath("//select[@name=\"room_type\"]"));
		Select c = new Select(Roomtype);
		c.selectByVisibleText("Super Deluxe");

		Thread.sleep(2000);
		WebElement NumberofRooms = driver.findElement(By.xpath("//select[@name=\"room_nos\"]"));
		Select d = new Select(NumberofRooms);
		System.out.println(d);
		
		/*Select d = new Select(NumberofRooms);
        d.getFirstSelectedOption();
        */
		/*Thread.sleep(2000);
		WebElement Adults_per_Rooms = driver.findElement(By.xpath("//select[@name=\"adult_room\"]"));
		Select e = new Select(Adults_per_Rooms);
		e.getFirstSelectedOption();
		*/





	}

}
