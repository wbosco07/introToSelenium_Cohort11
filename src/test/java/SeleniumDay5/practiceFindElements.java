package SeleniumDay5;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceFindElements {

	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

	}

	@Test
	public void printList() {

		List<WebElement> shoppingItems = driver.findElements(By.xpath("//*[@id='homefeatured']/li"));

		
		for (WebElement eachItem : shoppingItems) {
			
			System.out.println(eachItem.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
