package com.vndly.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteTodo {
	
	@Test
	public void deleteTodo() {
		//your code here
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-challenge.beta.vndly.com/");
		WebElement deleteBtn = driver.findElement(By.xpath("//button[@data-testid='todo-list-item-delete']"));
		deleteBtn.click();
		System.out.println("You have deleted a todo. Yay!");
	}
	
}
