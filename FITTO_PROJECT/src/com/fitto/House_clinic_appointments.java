package com.fitto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class House_clinic_appointments {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrutha\\OneDrive\\Desktop\\JAVAWORKSPACE\\FITTO_PROJECT\\Driver\\chromedriver.exe");
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
		Thread.sleep(1000);
		WebElement login=driver.findElement(By.id("loginBtnId"));
	    login.click();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
        WebElement drilldown=driver.findElement(By.xpath("//body/div[1]/div[2]/a[4]/i[1]/img[1]"));
        drilldown.click();
        
        driver.quit();
        
   
	}
	
	

}
