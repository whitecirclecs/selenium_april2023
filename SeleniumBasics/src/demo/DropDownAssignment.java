package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://letcode.in/dropdowns");
		
		//	4) Select 'Java' from the drop-down
		WebElement languageDropDown = driver.findElement(By.id("lang"));
		Select selectLanguage = new Select(languageDropDown);
		selectLanguage.selectByVisibleText("Java");
	}

}
