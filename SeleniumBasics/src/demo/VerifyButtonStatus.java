package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyButtonStatus {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://letcode.in/buttons");
		
		//	4) Verify the button with 'Disabled' text is disabled (not clickable)by default.
		boolean disabledBtnStatus =  driver.findElement(By.id("isDisabled")).isEnabled();
		if (disabledBtnStatus == true) {
			System.out.println("Disabled button is clickable (enabled)");
		}
		
		else {
			System.out.println("Disabled button is not clickable (disabled)");
		}
		
		//	5) Close the browser
	}

}
