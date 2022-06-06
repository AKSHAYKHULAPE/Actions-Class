package com.qc.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "chromedriver_v112.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("file:///H:/Automation%20Testing/program%20file%20pre/Files/Offline%20Website/index.html");
		
		WebElement email =driver.findElement(By.xpath("//input[@type='text']"));
		
		Actions actions =new Actions(driver);
		Action action = actions.moveToElement(email)
				.click()
				.keyDown(Keys.SHIFT)
				.sendKeys("Queue")
				.doubleClick()
				.contextClick()
				.build();
		action.perform();
	}

}
