package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAndCheckBoxes {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://letcode.in/radio");
		
		//	4) Select 'Yes' option from the first radio button 
		driver.findElement(By.id("yes")).click();
		
		//	5) Verify 'Bar' option from 4th radio button is selected by default when a user loads this page
		boolean barRadioBtnStatus = driver.findElement(By.id("notfoo")).isSelected();
		if(barRadioBtnStatus == true) {
			System.out.println("Bar Radio button is selected by default");
		}
		else {
			System.out.println("Bar radio button is not selected by default");
		}		
		
		//	6) Verify 'Remember me' checkbox is selected by default when a user loads this page
		boolean rememberMeChkBox = driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[1]")).isSelected();
		if(rememberMeChkBox == true) {
			System.out.println("Remember Me check Box is selected by default");
		}
		else {
			System.out.println("Remember Me check Box is not selected by default");
		}
				
		//	7) Select 'T & C' checkbox
		driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();
		
		//	8) Close the browser
	}

}
