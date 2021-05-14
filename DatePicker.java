import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("02/02/2022");
        
        date.sendKeys(Keys.RETURN);
        
        
        
        Thread.sleep(10000);

        
        
        

        driver.quit();
    }
}