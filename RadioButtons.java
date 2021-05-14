import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        
        WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
        radiobutton1.click();
        Thread.sleep(10000);
        
        WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radiobutton2.click();
        Thread.sleep(10000);

        WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radiobutton3.click();
        Thread.sleep(10000);

        
        
        
                
        
        
        

        driver.quit();
    }
}