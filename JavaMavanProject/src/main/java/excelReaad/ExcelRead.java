package excelReaad;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	  
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
public static String readstringdata(int a,int b) throws IOException
{
	fis=new FileInputStream("C:\\Users\\Alan-HP\\Downloads\\Salary.xlsx");
	wb= new XSSFWorkbook(fis);
	sh=wb.getSheet("sheet1");
	XSSFRow r=sh.getRow(a);
	XSSFCell c=r.getCell(b);
	return c.getStringCellValue();
			
}
public static String readintegerdata(int a,int b) throws IOException
{
	fis=new FileInputStream("C:\\Users\\Alan-HP\\Downloads\\Salary.xlsx");
	wb= new XSSFWorkbook(fis);
	sh=wb.getSheet("sheet1");
	XSSFRow r=sh.getRow(a);
	XSSFCell c=r.getCell(b);
	int x=(int)c.getNumericCellValue();
	return String.valueOf(x);
	
	
}




}
