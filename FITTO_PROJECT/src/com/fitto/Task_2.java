package com.fitto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrutha\\OneDrive\\Desktop\\JAVAWORKSPACE\\selenium_first_project\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitto-uat.fitto-at.com/fittoui/");
		
		String location=driver.findElement(By.id("searchDoctorDiv")).getText();
	    System.out.println(location);
	    
	    driver.quit();
	    
	   
		
//        WebElement search=driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-filter']"));
//		search.click();
//	  
//		
//		String appointments=driver.findElement(By.id("doctorListSectionId")).getText();
//	    System.out.println(appointments);
	    
	   // driver.quit();

	}

}
