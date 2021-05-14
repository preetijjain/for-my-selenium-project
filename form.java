import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ConfirmationPage;
import Pages.FormPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
//import org.junit.Assert;


public class form {
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jpreeti/eclipse-workspace/TestHelloWorld/chromedriver");

        WebDriver driver = new ChromeDriver();
        
		driver.get("http://formy-project.herokuapp.com/form");
		
		FormPage formpage = new FormPage();
		formpage.submitForm(driver);
		
		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitForAlertBanner(driver);
				
		Assert.assertEquals("The form was successfully submitted!", confirmationPage.getalerttext(driver));
		
		driver.close();
		
	}
	

}
