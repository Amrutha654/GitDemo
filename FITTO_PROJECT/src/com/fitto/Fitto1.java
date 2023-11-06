package com.fitto;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fitto1 {

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
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
	    Thread.sleep(10000);
	    WebElement cart =driver.findElement(By.xpath("//i[@class=\"fa fa-shopping-cart fa-custom-appointment-status\"]"));//c
	    cart.click();
	    Thread.sleep(10000);
	    WebElement Radio1=driver.findElement(By.xpath("//input[@value='N']"));
		Radio1.click();
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
		String Expectedaltmsg = "prescriptionCaseNumber does not exist.";
		System.out.println("The Expected Alert message is: "+Expectedaltmsg);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		String Actualaltmsg= alt.getText(); //         Accepting alert   
		System.out.println("The Actual Alert Message is: "+ Actualaltmsg );
		alt.accept();
		if (Expectedaltmsg.equals(Actualaltmsg)) 
		{     
			System.out.println("Pass");
		} 
		else
		{
			System.out.println("Fail"); 
		}	 
    	driver.quit();
	}
        }
