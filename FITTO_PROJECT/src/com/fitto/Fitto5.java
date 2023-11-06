package com.fitto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fitto5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrutha\\OneDrive\\Desktop\\JAVAWORKSPACE\\FITTO_PROJECT\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitto-uat.fitto-at.com/fittoui/");
		WebElement signin=driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
		signin.click();
		WebElement username=driver.findElement(By.xpath("//input[@id='loginUserNameId']"));
		username.click();
        username.sendKeys("dr.trial@fitto-at.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='loginPasswordId']"));
		password.click();
		password.sendKeys("Password#5");
		WebElement captchaText = driver.findElement(By.id("loginCaptchaId"));
		String captchaSolution = captchaText.getText();
		WebElement captchaInput = driver.findElement(By.id("loginCaptchaTextBox"));
		captchaInput.sendKeys(captchaSolution);
		Thread.sleep(1000);
		WebElement login=driver.findElement(By.id("loginBtnId"));
	    login.click();
	    
	    WebElement Pappointment=driver.findElement(By.xpath("//a[@title=\"Past Appointment\"]"));
	    Pappointment.click();
	    
	    WebElement yesr=driver.findElement(By.id("yearSelectId"));  //dropdown
	       Select year1=new Select(yesr);
	       year1.selectByValue("2010");
	       
	       WebElement month=driver.findElement(By.id("monthSelectId"));  //dropdown
	       Select month1=new Select(month);
	       month1.selectByValue("January");
	       
	       WebElement search=driver.findElement(By.xpath("//button[@class='btn']"));
	       search.click();
	       
	       Thread.sleep(5000);
	       String myText = driver.findElement(By.xpath("//ul[@id='archiveAppointmentId']")).getText();
	       System.out.println(myText);
	       String expectedErrorMessage = "No appointment found.";
	       String actualErrorMessage = driver.findElement(By.xpath("//ul[@id='archiveAppointmentId']")).getText();
	       if (actualErrorMessage.equals(expectedErrorMessage))
	       { 
	    	   System.out.println("Error messages match!");
	       } 
	       else
	       { 
	    	   System.out.println("Error messages do not match.");
	    	   System.out.println("Expected: " + expectedErrorMessage); 
	    	   System.out.println("Actual: " + actualErrorMessage);
	       }
	       driver.quit();
	}
}
