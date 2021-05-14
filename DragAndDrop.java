import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class DragAndDrop {
	
	public static void main (String[] args)  throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        
        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));
        
        
        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, box).build().perform();
        
        
        Thread.sleep(10000);
        
        
        
        driver.close();
		
		
		
		
	}
	
	
	
}