package SeleniumDay5;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

	}
	
	@Test
	public void daynoDrop() {
		
	WebElement fromDropDown= 	driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input"));
		
	fromDropDown.click();
	fromDropDown.sendKeys("AGR");
		
		
		
		
		
	}
	
	
	
	

}
