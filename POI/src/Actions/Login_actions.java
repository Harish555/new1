package Actions;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ExcelSheet.ExcelSh;
import Repository.InspectElements;
import Repository.InvokeBrowser;

public class Login_actions extends ExcelSh
{
  public void login()
  {
	  InspectElements.email().sendKeys(cell.getStringCellValue());
	  InspectElements.pwd().sendKeys(cell.getStringCellValue());
	  int s= (int) cell.getNumericCellValue();
	  InspectElements.pwd().sendKeys(String.valueOf(s));
  }
  

	
}
  
