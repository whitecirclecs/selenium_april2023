package testngPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void launchBrowser() {
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.getWindowHandle());
	}

}
