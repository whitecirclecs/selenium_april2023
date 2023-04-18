package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		// 3.1) Go inside the frame that contains 'DEPRECTED' hyperlink
		driver.switchTo().frame("classFrame");
		
		//	4) Click DEPRECATED hyperlink
		driver.findElement(By.linkText("DEPRECATED")).click();
		
		//	5) Come out of existing frame
		driver.switchTo().defaultContent();
		
		//	6) Go inside the 2nd frame
		driver.switchTo().frame("packageFrame");
		
		//	7) Click on AbstractHttpCommmandCodec
		driver.findElement(By.linkText("AbstractHttpCommandCodec")).click();
	}

}
