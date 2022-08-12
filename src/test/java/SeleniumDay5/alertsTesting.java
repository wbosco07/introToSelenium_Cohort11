package SeleniumDay5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsTesting {
	
	
	WebDriver driver;
	String jessicaHello = "Heller";
	String actualAlertText;


	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

	}
	
	@Test
	public void alertsExample() throws InterruptedException {
		
		driver.findElement(By.id("alertexamples")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
	}
	
	@Test
	public void confirmexample() throws InterruptedException {
		driver.findElement(By.id("confirmexample")).click();
		
		Thread.sleep(3000);
		
		String alertText = driver.switchTo().alert().getText();
		
		
		Assert.assertEquals("I am a confirm alert", alertText);
		
		driver.switchTo().alert().dismiss();
		
		
	}
	
	
	@Test
	public void promptexample() throws InterruptedException {
		
		
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys(jessicaHello);
		driver.switchTo().alert().accept();
		actualAlertText = driver.findElement(By.id("promptreturn")).getText();
		Assert.assertEquals(jessicaHello, actualAlertText);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
