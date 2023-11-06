package com.fitto;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fitto331 {
	
	public static void main(String[] args) throws InterruptedException  {
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
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
	    List<WebElement>total=driver.findElements(By.xpath("//li"));
	    int totalAppointments=total.size();
	    System.out.println("numberofAppointments:" +totalAppointments );
	    List<WebElement> linksize1 = driver.findElements(By.xpath("//a[@style='cursor: default']")); 
	    
	    System.out.println("unconiformed appointments : " + linksize1.size()); 
	    for(WebElement link1:linksize1) {
	    String url=link1.getAttribute("href");
//	    System.out.println(url);
	           }
        List<WebElement> linksize = driver.findElements(By.xpath("//a[@style='cursor: default; background-color: lime !important']")); 
	    System.out.println("coniformed appointments : " + linksize.size()); 
	    for(WebElement link:linksize) {
	    String url=link.getAttribute("href");
//	    System.out.println(url);
	    }
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	    
//	   System.out.println("Conformed Appointments:");
//	   List<WebElement>limeGreenElements=driver.findElements(By.id("clinicAppointments"));
//	   for(WebElement element:limeGreenElements) { 
//		   System.out.println(element.getText());      }
	   driver.quit();
	   }
       }
		
        
        
        
        









	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    




