package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
	public  WebDriver driver;
	@Test
	public void brow()
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Harish\\chromedriver.exe");
		 driver=new ChromeDriver();
		  driver.get("http://webmail.cubicitsolution.co.in/logout/?locale=en");
		  Inspect in = new Inspect();
		  in.email();
	}


}
