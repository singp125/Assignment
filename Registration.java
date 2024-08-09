package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Registration 

{
	
	@Test (priority=1)
	public void registrationWithSpecialCharacters()
	{
		System.out.println("This is the automated test case for Test ID - TUI_002 where we are verifying user can successfully register to Book Store by entering special characters in name fields e.g., O'Brien, Mary-Jane");
	
		//Invoking browser
		System.setProperty("webdriver.gecko.driver", "/Users/Pranshu/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		//maximising browser
		driver.manage().window().maximize();
				
		//navigating to registration page
		driver.get("https://demoqa.com/register");
				
		//printout the current URL
		System.out.println("The User has navigated to registration page" + driver.getCurrentUrl());
				
		//entering First name with special characters
		System.out.println("User entered first name as Mary-Jane");
		driver.findElement(By.id("firstname")).sendKeys("Mary-Jane");
				
		//entering Last name with special characters
		System.out.println("User entered last name as O'Brien");
		driver.findElement(By.id("lastname")).sendKeys("O'Brien");
				
		//entering valid user name and password
		System.out.println("User entered valid user name and password");
		driver.findElement(By.id("userName")).sendKeys("Mary123");
		driver.findElement(By.id("password")).sendKeys("IwnLu@326");
        
		Actions a = new Actions(driver);
		
		//scrolling down
		a.scrollByAmount(708, 705).build().perform();
		
		//explicit Wait, also for manually handling the reCaptcha
		WebDriverWait w = new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("register")));
		
		//click on Register Button
		a.moveToElement(driver.findElement(By.id("register"))).click().build().perform();
		
		//Registration takes place successfully
		String alertWindowText = driver.switchTo().alert().getText();
		Assert.assertEquals(alertWindowText, "User Register Successfully.", "The verification passed");
        driver.switchTo().alert().accept();
		
		driver.quit();
	 }
	
	@Test (priority=2)
	public void failedregistrationWithAlreadyRegisteredUser()
	{
		System.out.println("This is the automated test case for Test ID - TUI_008 where we are verifying user cannot register to Book Store with already taken username.");
		
		//Invoking browser
		System.setProperty("webdriver.gecko.driver", "/Users/Pranshu/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		//maximising browser
		driver.manage().window().maximize();
		
		//navigating to registration page
		driver.get("https://demoqa.com/register");
		
		//printout the current URL
		System.out.println("The User has navigated to registration page" + driver.getCurrentUrl());
		
		//entering any valid First name
		System.out.println("User entered first name as Pranshu");
		driver.findElement(By.id("firstname")).sendKeys("Pranshu");
		
		//entering any valid Last name
		System.out.println("User entered last name as Singh");
		driver.findElement(By.id("lastname")).sendKeys("Singh");
		
		//entering already taken user name
		System.out.println("User entered already registered user name");
		driver.findElement(By.id("userName")).sendKeys("Mary123");
		driver.findElement(By.id("password")).sendKeys("IwnLu@326");
		
		Actions a = new Actions(driver);
		
		//scrolling down
		a.scrollByAmount(708, 705).build().perform();
		
		//explicit Wait, also for manually handling the reCaptcha
		WebDriverWait w = new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("register")));
		
		//click on Register Button
		a.moveToElement(driver.findElement(By.id("register"))).click().build().perform();
		
		//Registration does not takes place successfully and an error message is displayed
		String alreadyRegisteredUser = driver.findElement(By.xpath("//*[text()='User exists!']")).getText();
		Assert.assertEquals(alreadyRegisteredUser, "User exists!", "The verification passed");
        
		driver.quit();
     }
	
}
