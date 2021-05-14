import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        
        WebElement newtabbutton = driver.findElement(By.id("new-tab-button"));
        newtabbutton.click();
        
        String originalhandle = driver.getWindowHandle();
        
        for (String handle: driver.getWindowHandles()) {
        	driver.switchTo().window(handle);
        	Thread.sleep(10000);
        }
        
        driver.switchTo().window(originalhandle);
        
    	Thread.sleep(10000);

        
        
        
        

        driver.quit();
    }
}
