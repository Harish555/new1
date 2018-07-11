package Repository;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InspectElements extends InvokeBrowser 
{
	static By email=By.xpath("//*[@id=\"user\"]");
	static By pwd=By.xpath("//*[@id=\"pass\"]");

public static WebElement email()
{
	return driver.findElement(email);
}
public static WebElement pwd()
{
    return driver.findElement(pwd);
}
}
