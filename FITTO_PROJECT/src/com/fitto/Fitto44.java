package com.fitto;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fitto44 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrutha\\OneDrive\\Desktop\\JAVAWORKSPACE\\selenium_first_project\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitto-uat.fitto-at.com/fittoui/");
		
		WebElement signin=driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
	     signin.click();

		WebElement username=driver.findElement(By.xpath("//input[@id='loginUserNameId']"));
		username.click();
		username.sendKeys("fitto_b@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='loginPasswordId']"));
		password.click();
		password.sendKeys("Password#5");
		
		WebElement captchaText = driver.findElement(By.id("loginCaptchaId"));
		 String captchaSolution = captchaText.getText();
		WebElement captchaInput = driver.findElement(By.id("loginCaptchaTextBox"));
		 captchaInput.sendKeys(captchaSolution);
		
		WebElement login=driver.findElement(By.id("loginBtnId"));
	    login.click();
	    
	    Thread.sleep(10000);
		
		
	    WebElement eyecart1=driver.findElement(By.xpath("//i[@class=\"fa fa-shopping-cart fa-custom-appointment-status\"]"));
	    eyecart1.click();
	    
	    Thread.sleep(10000);
 
     WebElement details =driver.findElement(By.name("complaintName[]"));
     details.click();
     details.sendKeys("FVGHJKL");
     Thread.sleep(10000);
 
 WebElement duration =driver.findElement(By.name("complaintDuration[]"));
 duration.click();
 duration.sendKeys("20");
 
 
 JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("window.scrollBy(0,300)", "");
 	    
 WebElement Radio2=driver.findElement(By.name("paramedicUserDtls"));
	Radio2.click();
	
	WebElement conform1=driver.findElement(By.id("confirmClinic"));
	conform1.click();
		
	
		
		
		
		
	    
	    
	    
	    
	    

	}

}
