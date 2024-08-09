package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Search {
	
	@Test (priority=1)
	public void searchForBookUsingKeywords()
	
	{
		System.out.println("This is the automated test case for Test ID - TUI_023 where we are verifying User can search for a book using keywords related to the book's content");
		
		//Invoking browser
		System.setProperty("webdriver.gecko.driver", "/Users/Pranshu/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
								
		//maximising browser
		driver.manage().window().maximize();
								
		//navigating to Books page
		driver.get("https://demoqa.com/books");

		//printout the current URL
		System.out.println("User has navigated to Books Page " + driver.getCurrentUrl());	
		
		//entering a keyword to search for a Book in search Box
		System.out.println("User enters a keyword Git to search for a Book in search Box");
		driver.findElement(By.id("searchBox")).sendKeys("Git");
		
		//Verifying whether book is displayed with matching keyword
		System.out.println("The book is displayed " + driver.findElement(By.linkText("Git Pocket Guide")).getText());
		
		driver.quit();
		
	}
	

	@Test (priority=2)
	public void searchForBookUsingSpecialCharacters()
	
	{
		System.out.println("This is the automated test case for Test ID - TUI_024 where we are verifying User can search for a book with special characters in book details e.g., O'Reilly, C. Zakas");
		
		//Invoking browser
		System.setProperty("webdriver.gecko.driver", "/Users/Pranshu/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
								
		//maximising browser
		driver.manage().window().maximize();
								
		//navigating to Books page
		driver.get("https://demoqa.com/books");

		//printout the current URL
		System.out.println("User has navigated to Books Page " + driver.getCurrentUrl());	
		
		//entering a keyword with special characters in search Box to search for a Book 
		System.out.println("User enters a keyword 'Don't' to search for a Book in search Box");
		driver.findElement(By.id("searchBox")).sendKeys("Don't");
		
		//Verifying whether book is displayed with matching keyword
		System.out.println("The book is displayed " + driver.findElement(By.linkText("You Don't Know JS")).getText());
		
		driver.quit();
	}
	
}
