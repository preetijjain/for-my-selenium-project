import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ScrollToElement {
	
	public static void main (String[] args)  throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        
        WebElement name = driver.findElement(By.id("name"));
        
        Actions actions = new Actions(driver);
        
        actions.moveToElement(name);
        name.sendKeys("Preeti Jain");
        
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("02/02/2021");
        
        
        Thread.sleep(2000);
        
        
        
        driver.close();
		
		
		
		
	}
	
	
	
}
