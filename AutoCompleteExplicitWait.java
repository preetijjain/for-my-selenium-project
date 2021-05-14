import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.By;

public class AutoCompleteExplicitWait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("733 Carlisle Way, Sunnyvale, CA");
		

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement autocompleteresult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
		
		autocompleteresult.click();
		

		driver.close();
		
		
		
		
				
		
		
		
	}

}