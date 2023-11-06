package com.fitto;

import java.time.Duration;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fitto3 {

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
		
		WebElement captchaInput = driver.findElement(By.id("loginCaptchaTextBox"));
	    String captchaSolution = JOptionPane.showInputDialog(captchaInput);
        captchaInput.sendKeys(captchaSolution);
		Thread.sleep(1000);
		
		WebElement login=driver.findElement(By.id("loginBtnId"));
	    login.click();
	    	    
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
	    Thread.sleep(10000);
	    WebElement eyecart=driver.findElement(By.xpath("//body/div[1]/div[3]/div[3]/div[1]/div[2]/div[2]/ul[1]/li[11]/i[1]"));//CHANGE
	   eyecart.click();
	   
	   WebElement Radio=driver.findElement(By.xpath("//input[@value='online']"));
		Radio.click();
	   
	    WebElement conform=driver.findElement(By.xpath("//form[@id='prescription-manual-payment-form']//button[@id='confirmClinic']"));
	    conform.click();
	    
	    WebElement cart =driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart fa-custom-appointment-status']"));
	    cart.click();
	    
	    WebElement C_dESCRIPTION =driver.findElement(By.xpath("//textarea[@id='prescriptionCaseDesc']"));
	    C_dESCRIPTION.click();
	    C_dESCRIPTION.sendKeys("WERTYU");
	    
	    Thread.sleep(1000);
	    
	    WebElement details =driver.findElement(By.name("complaintName[]"));
	    details.click();
	    details.sendKeys("RTYHJ");
	    Thread.sleep(1000);
	    
	    WebElement duration =driver.findElement(By.name("complaintDuration[]"));
	    duration.click();
	    duration.sendKeys("30");
	    
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,300)", "");
	    
	    
	    WebElement Radio2=driver.findElement(By.name("paramedicUserDtls"));
		Radio2.click();
		
		WebElement conform1=driver.findElement(By.id("confirmClinic"));
		conform1.click();
	}
}
