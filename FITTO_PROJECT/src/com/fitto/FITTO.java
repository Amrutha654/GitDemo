package com.fitto;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FITTO {

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
	    
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
//	    WebElement eyecart=driver.findElement(By.xpath("//body/div[1]/div[3]/div[3]/div[1]/div[2]/div[2]/ul[1]/li[5]/i[1]"));//CHANGE//body/div[1]/div[3]/div[3]/div[1]/div[2]/div[2]/ul[1]/li[1]/i[1]
//	    eyecart.click();
//	    
//	    Thread.sleep(10000);
//		   
//	    WebElement Radio=driver.findElement(By.xpath("//input[@value='cash']"));
//		Radio.click();
//		
//		Thread.sleep(10000);
//		
//	 
//	    WebElement conform=driver.findElement(By.xpath("//form[@id='prescription-manual-payment-form']//button[@id='confirmClinic']"));
//	    conform.click();
//	    
	    Thread.sleep(10000);
	    WebElement eyecart1=driver.findElement(By.xpath("//body/div[1]/div[3]/div[3]/div[1]/div[2]/div[2]/ul[1]/li[13]/i[1]"));//CHANGE           //body/div[1]/div[3]/div[3]/div[1]/div[2]/div[2]/ul[1]/li[5]/i[1]
	    eyecart1.click();
	    
	    Thread.sleep(10000);
		
 WebElement C_dESCRIPTION =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[3]/div[2]/form[1]/div[2]/div[1]/div[1]/textarea[1]"));
 C_dESCRIPTION.click();
 C_dESCRIPTION.sendKeys("FGH VC GHJK DGHJ");
 
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
		
		 Thread.sleep(10000);
		 
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(120));
		 WebElement BeforeAppointmentElement = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div[3]/div[3]/div[1]/div[2]/div[2]/ul[1]/li[13]/a[1]")));
		 String BeforeAppointmentDetails = BeforeAppointmentElement.getText();
		 System.out.println("selected_Appointment: " + BeforeAppointmentDetails);
		 WebElement AfterAppointmentElement = driver.findElement(By.xpath("//body/div[1]/div[3]/div[3]/div[1]/div[2]/div[2]/ul[1]/li[13]/a[1]"));
		 String AfterAppointmentDetails = AfterAppointmentElement.getText();
		 System.out.println("conformed_Appointment: " + AfterAppointmentDetails);
		 if (BeforeAppointmentDetails.equals(AfterAppointmentDetails)) 
		 {    System.out.println("selected appointment and conformed appointments are same");
		 } 
		 else 
		 {   
			 System.out.println("selected appointment and conformed appointments are  different");
		 }
	}
}

        
//		













































