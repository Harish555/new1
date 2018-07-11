package BrowserInvoking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser
{
	public static WebDriver driver;
	public static void brosercode()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public static void fbappInvoke()
	{
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	System.out.println("hiii");
	}
	public static void fbemail()
	{
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("pyatarojareddy@gmail.com");
		
	}
	public static void fbpass()
	{
		
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1424235");
		
	}
}
