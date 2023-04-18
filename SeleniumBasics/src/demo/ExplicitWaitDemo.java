package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitDemo {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
		
		//	4) Click on Start button
		driver.findElement(By.id("start")).click();
		
		//	5) Wait for the text 'Hello World!' to be visible
		
		
		//	6) Verify text 'Hello World!' is visible on the page
		driver.findElement(By.cssSelector("#finish > h4")).isDisplayed();
	}

}
