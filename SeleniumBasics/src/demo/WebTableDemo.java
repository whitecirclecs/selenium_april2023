package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
	
	public static void main(String[] args) {
		//  1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://letcode.in/table");
		
		//	4) Read all the prices from the webtable and verify the sum matches to the 'Total' value mentioned on the web-page
		//  a) Locate the webtable
		WebElement shoppingTable  = driver.findElement(By.id("shopping")); 
		
		//  b) Get all the rows of the table and put them in a list #list1
		List<WebElement> rows = shoppingTable.findElements(By.tagName("tr"));
		
		//  c) Pick up one row at-a-time from the list and then create another list consisting of all the column values of
		//     the row.
		int sum = 0;
		for(int i=1; i<5; i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.tagName("td"));		
			
			//  d) Read the 2nd value from the list2 and save it in a variable
			String price = columns.get(1).getText();
			sum = sum + Integer.parseInt(price);
			//System.out.println("Price = " + price);
		}
		
		int expectedSum = 858;
		int actualSum = sum;
		
		if(expectedSum == actualSum) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		
	}

}
