package introToSeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/techcircle/Desktop/selenium-java-3.141.59/chromedriver");
		 
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.youtube.com/");
		
		
		
		
		

	}

}
