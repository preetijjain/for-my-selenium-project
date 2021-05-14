import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class AutoCompleteImplicitWait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("733 Carlisle Way, Sunnyvale, CA");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
		
		WebElement autocompleteresult = driver.findElement(By.className("pac-item"));
		autocompleteresult.click();
		

		driver.close();
		
		
		
		
				
		
		
		
	}

}