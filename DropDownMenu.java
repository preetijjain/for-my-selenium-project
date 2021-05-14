import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class DropDownMenu {
	
	public static void main (String[] args)  throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        
        WebElement dropdownmenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownmenu.click();

        Thread.sleep(10000);
        
        
        WebElement dropdownmenuitem = driver.findElement(By.xpath("/html/body/div/div/div/a[5]"));
        dropdownmenuitem.click();
        
        
        
        
        Thread.sleep(10000);
        
        
        
        driver.close();
		
		
		
		
	}
	
	
	
}