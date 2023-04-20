package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();

		// 2) Maximize it
		driver.manage().window().maximize();

		// 3) Navigate to application
		driver.get("https://whitecircleschool.com/implicitwait/");
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		String expectedText = "How are you !";
		String actualText = driver.findElement(By.className("show")).getText();
		
		System.out.println("Expected Text = " + expectedText);
		System.out.println("Actual Text = " + actualText);
		
		if(expectedText.equals(actualText)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		// Close the browser
		driver.quit();
	}

}
