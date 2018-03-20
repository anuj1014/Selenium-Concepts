package selenium.practice.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceloutput {
	
	XSSFWorkbook workbook=null;
	XSSFSheet sheet= null;
	File f=null;
	String path=null;
	FileInputStream s =null;
	Row row =null;
	
	
	public void output_operation(String sheetname, String path) throws IOException{
		f = new File(path);
		s = new FileInputStream(f);
		workbook = new XSSFWorkbook(s);
		sheet=workbook.getSheet(sheetname);
		int lastrow = sheet.getLastRowNum();
		System.out.println(lastrow);
		int lastcell=sheet.getRow(0).getLastCellNum();
		System.out.println(lastcell);
		Row newrow = sheet.createRow(lastrow+1);
		
		for(int j=0;j<lastcell;j++){
			newrow.createCell(j).setCellValue("Value of j "+j);
			//newrow.getCell(j).setCellValue("Value of j "+j);
		}
		FileOutputStream output = new FileOutputStream(path);
		workbook.write(output);
		
		
		
	}public static void main(String args[]) throws IOException{
		
		exceloutput e = new exceloutput();
		e.output_operation("LoginTest", "C:\\Users\\Anuj Chaudhary\\Desktop\\excel.xlsx");
	}

}
