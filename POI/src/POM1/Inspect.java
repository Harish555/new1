package POM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inspect extends Browser
{
	
		 static By email = By.name("user");
	     static By password = By.name("pass");
	     WebDriver driver = super.driver;
		
	public void email()
	{
		System.out.println(driver);
		driver.findElement(email).sendKeys("fyfyy");
	}

}