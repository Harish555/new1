    import java.io.FileInputStream;
	import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.Test;

public class Excel
{
        @Test
		public void Exe() throws Exception
		{
			FileInputStream fis=new FileInputStream("D:\\Harish\\POI\\exceldata\\example.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
			XSSFCell cell;
			 FileOutputStream fos=new FileOutputStream("D:\\Harish\\POI\\exceldata\\example.xlsx");
		     
			  sh.getRow(0).createCell(0).setCellValue("User ID");
			  sh.getRow(0).createCell(1).setCellValue("password");
			  sh.getRow(1).createCell(0).setCellValue("ha@cubicitsolution.com");
			  sh.getRow(1).createCell(1).setCellValue("harish.r@123");
			  sh.getRow(2).createCell(0).setCellValue("harish.r@");
			  sh.getRow(2).createCell(1).setCellValue("h24535");
				wb.write(fos);

			int i;
			for(i=1;i<=sh.getLastRowNum();i++)
			  {
			    System.out.println(sh.getLastRowNum());
			    cell=sh.getRow(i).getCell(0);
			    System.out.println("1st data "+cell);
			    System.setProperty("webdriver.chrome.driver","D:\\Harish\\chromedriver.exe");
			    WebDriver driver=new ChromeDriver();
			    driver.get("http://webmail.cubicitsolution.co.in/logout/?locale=en");
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
              //  driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
			  //  driver.findElement(By.xpath("//*[@id='login_submit']")).click();
			   // Thread.sleep(2000);
			 //   FileOutputStream fos=new FileOutputStream("D:\\Harish\\POI\\exceldata\\excelex.xlsx");
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
