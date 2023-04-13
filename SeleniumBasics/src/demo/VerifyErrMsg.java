package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrMsg {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Navigate to application
		driver.get("https://facebook.com");
		
		//	3) Enter invalid email address in the email textbox
		driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com");
		
		//	4) Enter invalid password in password textbox
		driver.findElement(By.id("pass")).sendKeys("password@123");
		
		//	5) Click on Log in button
		driver.findElement(By.name("login")).click();
		
		//	6) Verify an error message - 'The email address you entered isn't connected to an account. Find your account and log in.' is displayed.
		String expectedErrMessage = "The email address you entered isn't connected to an account. Find your account and log in.";
		String actualErrMessage = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		
				
		if(expectedErrMessage.equals(actualErrMessage)) {
			System.out.println("Test case passed");
		}
		
		else {
			System.out.println("Test Case Failed");
		}	
		
		
		//	7) Close the browser
		driver.quit();
		
		
		
	}

}
