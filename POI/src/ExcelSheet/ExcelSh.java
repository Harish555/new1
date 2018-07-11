package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Repository.InvokeBrowser;

public class ExcelSh extends InvokeBrowser
{
	public XSSFCell cell;
	public static  void Exe() throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\Harish\\POI\\exceldata\\example.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		XSSFCell cell;
		 FileOutputStream fos=new FileOutputStream("D:\\Harish\\POI\\exceldata\\example.xlsx");
	     
		int i;
		for(i=1;i<=sh.getLastRowNum();i++)
		  {
		    System.out.println(sh.getLastRowNum());
		    cell=sh.getRow(i).getCell(0);
		    System.out.println("1st data "+cell);
		   
		    
		    if(cell.getCellType()==cell.CELL_TYPE_STRING)
		    {
		     driver.findElement(By.id("user")).sendKeys(cell.getStringCellValue());
		    }
		    else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
		    {
			 int s= (int) cell.getNumericCellValue();
			 driver.findElement(By.id("user")).sendKeys(String.valueOf(s));
		    	
			}
		    cell=sh.getRow(i).getCell(1);
		    System.out.println("2nd data "+cell);
		    if(cell.getCellType()==cell.CELL_TYPE_STRING)
		    {
		     driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
		     driver.findElement(By.xpath("//*[@id='login_submit']")).click();
			    Thread.sleep(2000);
		    }
		    else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
		    {
			 int s= (int) cell.getNumericCellValue();
			 driver.findElement(By.id("pass")).sendKeys(String.valueOf(s));
			   driver.findElement(By.xpath("//*[@id='login_submit']")).click();
			    Thread.sleep(2000);
			}
  
		    try
		   {
		    WebElement e=driver.findElement(By.xpath("//*[@id='lnkHeaderLogout']"));
		    if(e.isDisplayed())
		    {
		     e.click();
	         sh.getRow(i).createCell(2).setCellValue("pass");
	         wb.write(fos);
	        }
		   }
		   catch(Exception e)
		   {
			sh.getRow(i).createCell(2).setCellValue("Fail");
			wb.write(fos);
		   }
		  driver.close();
     }			
}
}
