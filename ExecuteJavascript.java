	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/modal");
        
        WebElement modalbutton = driver.findElement(By.id("modal-button"));
        modalbutton.click();
        
        WebElement closebutton = driver.findElement(By.id("close-button"));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(10000);

        js.executeScript("arguments[0].click();", closebutton);
        
        Thread.sleep(10000);

        
        
        
        

        driver.quit();
    }
}
