package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.Assert;



public class Login 

{
	
	@Test (priority =1)
	public void successfullLoginWithValidCredentials()
	
	{
		System.out.println("This is the automated test case for Test ID - TUI_015 where we are verifying user is able to login successfully to Book Store with correct username and password");
		
		//Invoking browser
		System.setProperty("webdriver.gecko.driver", "/Users/Pranshu/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
						
		//maximising browser
		driver.manage().window().maximize();
						
		//navigating to Login page
		driver.get("https://demoqa.com/login");

		//printout the current URL
		System.out.println("User has navigated to Login Page " + driver.getCurrentUrl());
						
		//entering valid User Name
		System.out.println("User enters valid User name");
		driver.findElement(By.id("userName")).sendKeys("123@#");
						
		//entering valid password
		System.out.println("User enters valid Password");
		driver.findElement(By.id("password")).sendKeys("IwnLu@326");
				
		Actions a = new Actions(driver);
				
		//scrolling down
		a.scrollByAmount(950, 758).build().perform();
				
		//click Login Button
		System.out.println("User clicks Login button");
		driver.findElement(By.id("login")).click();
				
		//Verifying whether logged in User name is displayed
		String loggedInUser = driver.findElement(By.xpath("//*[text()='123@#']")).getText();
		Assert.assertEquals(loggedInUser, "123@#", "User Logs in Successfully");
		
		//Verifying whether Go To Book Store Button is displayed
		String bookStoreButton = driver.findElement(By.xpath("//button[@id='gotoStore']")).getText();
		Assert.assertEquals(bookStoreButton, "Go To Book Store", "Go to Book Store button is displayed");
				
		driver.quit();
			
	}
	

	@Test (priority=2)
	public void unsuccessfullLoginWithInvalidCredentials()
	
	{
		System.out.println("This is the automated test case for Test ID - TUI_020 where we are verifying user is not able to login successfully to Book Store with incorrect login credentials");
	
		//Invoking browser
		System.setProperty("webdriver.gecko.driver", "/Users/Pranshu/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
								
		//maximising browser
		driver.manage().window().maximize();
								
		//navigating to Login page
		driver.get("https://demoqa.com/login");

		//printout the current URL
		System.out.println("User has navigated to Login Page " + driver.getCurrentUrl());
								
		//entering invalid User Name
		System.out.println("User enters invalid User name");
		driver.findElement(By.id("userName")).sendKeys("123");
								
		//entering invalid password
		System.out.println("User enters invalid Password");
		driver.findElement(By.id("password")).sendKeys("123");
						
		Actions a = new Actions(driver);
						
		//scrolling down
		a.scrollByAmount(950, 758).build().perform();
						
		//click Login Button
		System.out.println("User clicks Login button");
		driver.findElement(By.id("login")).click();
						
		//Verifying user is not logged in with invalid credentials
		String user = driver.findElement(By.xpath("//*[text()='Invalid username or password!']")).getText();
		Assert.assertEquals(user, "Invalid username or password!", "User fails to Log in with invalid credentials");
	
		driver.quit();
	}
	
}
