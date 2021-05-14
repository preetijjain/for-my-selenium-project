package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

	public void submitForm(WebDriver driver) {
		
	
		driver.findElement(By.id("first-name")).sendKeys("Preeti");
		driver.findElement(By.id("last-name")).sendKeys("Jain");
		
		
		driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
		driver.findElement(By.id("radio-button-2")).click();
		
		driver.findElement(By.id("checkbox-2")).click();
		
		
		driver.findElement(By.cssSelector("option[value='2']")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("02/02/2021");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}

	
	
	
}
