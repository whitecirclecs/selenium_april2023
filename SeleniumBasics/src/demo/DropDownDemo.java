package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://letcode.in/dropdowns");
		
		//	4) Select Apple from first drop-down
		WebElement fruitsDropDown = driver.findElement(By.id("fruits"));
		Select selectFruit = new Select(fruitsDropDown); //Class object = new Class();
		selectFruit.selectByVisibleText("Apple"); //object.method() 
		
		// 5) Select Brazil from last drop-down
		WebElement countryDropDown = driver.findElement(By.id("country"));
		Select selectCountry = new Select(countryDropDown);
		//object.method()
		selectCountry.selectByVisibleText("Brazil");
	}

}
