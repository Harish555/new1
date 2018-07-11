package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser 
{
	public static WebDriver driver;
  public static  void Browser() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Harish\\chromedriver.exe");
	     driver=new ChromeDriver();
	    driver.get("http://webmail.cubicitsolution.co.in/logout/?locale=en");
  }
  public static void Clo()
  {
	driver.close();
  }
}
