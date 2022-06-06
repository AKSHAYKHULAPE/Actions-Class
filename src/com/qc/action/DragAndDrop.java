package com.qc.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "chromedriver_v112.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		Action action = actions.dragAndDrop(source, destination) 
						.build();
		action.perform();
		Thread.sleep(2000);
		
		driver.close();
	}

}
