package BrowserInvoking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelretrivecode 
{
	public static XSSFSheet xs;
	public static XSSFSheet excelcode(String filename,String sheetname) throws IOException
    {
    	File f =new File(filename);
    	FileInputStream fs=new FileInputStream(f);
    	XSSFWorkbook wb=new XSSFWorkbook(fs);
    	xs=wb.getSheet(sheetname);
    	return xs;
    }
	
	public static String value(int row,int column)
	{
		XSSFCell xc=xs.getRow(row).getCell(column);
	    String t=	xc.getStringCellValue();
    	return t;
   }
	
	
	
	
	
	
}
