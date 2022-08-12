package SeleniumDay5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsTests {

	WebDriver driver;


	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

	}
	
	
	@Test
	public void assertionTest() {
		
		
		String actualResult_women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]")).getText();

		String actualResult_dresses = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]")).getText();
		
		String actualResult_tShirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]")).getText();

		
		String expectedResult_women = "WOMEN";
		String expectedResult_dresses = "DRESSES";
		String expectedResult_tShirt= "tShirt";

		Assert.assertEquals(expectedResult_women, actualResult_women);
		
		
		
		Assert.assertTrue(actualResult_dresses.equals(expectedResult_dresses));
		
		
		System.out.println("passed");
		
		Assert.assertFalse(actualResult_tShirt.equals(expectedResult_tShirt));
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
