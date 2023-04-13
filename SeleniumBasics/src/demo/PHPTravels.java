package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTravels {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.com/demo/");
		
		driver.findElement(By.name("first_name")).sendKeys("Tim");
		
		driver.findElement(By.name("last_name")).sendKeys("Smith");
		
		driver.findElement(By.name("business_name")).sendKeys("ABC Corp.");
		
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		
		//read the numbers
		String number1 = driver.findElement(By.id("numb1")).getText();
		String number2 = driver.findElement(By.id("numb2")).getText();
		
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		
		int sum = num1+num2;
		
		String total = String.valueOf(sum);
		
		driver.findElement(By.id("number")).sendKeys(total);
		
		//System.out.println(num1 + num2);
		
	}

}
