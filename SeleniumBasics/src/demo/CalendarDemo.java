package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://www.expedia.com/");
		
		//	4) Click on Calendar icon
		driver.findElement(By.id("d1-btn")).click();
		
		//	5) Select 14th from next month
		//  a) Locate the calendar
		WebElement nextMonth = driver.findElement(By.xpath("(//table[contains(@class,'weeks')])[2]"));
		
		//  b) Get all the rows of the calendar and put them in a list #list1
		List<WebElement> rows = nextMonth.findElements(By.tagName("tr"));		
		
		//  c) Pick up one row at-a-time from the list and then create another list consisting of all the column values of
		//     the row.
		for(int i=1; i<rows.size(); i++) {
			WebElement row = rows.get(i);		
			List<WebElement> columns =  row.findElements(By.tagName("button")); //list2		
			
			//  d) Read all the values from the list 2 and click on it as soon as the desired value is found
			for (WebElement x : columns) {
				if (x.getAttribute("data-day").equals("20")) {
					x.click();
					break; //stop searching the loop further once value 14 is found
				}
			}
		}
		
	}

}
