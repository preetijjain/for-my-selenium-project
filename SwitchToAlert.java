import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        
        WebElement alertbutton = driver.findElement(By.id("alert-button"));
        alertbutton.click();
        
        
        Alert alert = driver.switchTo().alert();
        Thread.sleep(10000);

        alert.accept(); 

        Thread.sleep(10000);
        
        
        
        

        driver.quit();
    }
}