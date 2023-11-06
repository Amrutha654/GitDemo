package com.fitto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrutha\\OneDrive\\Desktop\\JAVAWORKSPACE\\selenium_first_project\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitto-uat.fitto-at.com/fittoui/");
		
	   WebElement signin=driver.findElement(By.className("prac-know-more-btn"));
		signin.click();
		
		String appointments=driver.findElement(By.className("know-more-modal-content")).getText();
	    System.out.println(appointments);
	    
	    driver.quit();

	}

}
