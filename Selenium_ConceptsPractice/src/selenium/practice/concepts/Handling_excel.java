package selenium.practice.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;


public class Handling_excel {

	XSSFWorkbook  workbook = null;
	XSSFSheet sheet =null;
	XSSFRow row =null;
	XSSFCell col = null;
	File file =null;
	FileInputStream f=null;
	int rowcount;
	int colcount;
	String path;
	
	public Handling_excel(String path, String sheetname) throws IOException 
	{
		this.path=path;
		file =new File(path);
		f = new FileInputStream(file);
		workbook = new XSSFWorkbook(f);
		sheet = workbook.getSheet(sheetname);	
		System.out.println("sheetobject created");
		row=sheet.getRow(0);
		rowcount = sheet.getLastRowNum();
		colcount = row.getLastCellNum();
		System.out.println(rowcount+" "+colcount);
	}



	public int getAllData(){
		
		for(int i=0;i<rowcount;i++){
			for(int j=0;j<colcount;j++){
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				}
		}return 0;
		
	}
	
	
	public void set_data() throws IOException{
				
		int totalrow = sheet.getLastRowNum();
		System.out.println(totalrow);
		Row row = sheet.getRow(totalrow);
		int cel=row.getLastCellNum();
		System.out.println(cel);
		
		Row newrow= sheet.createRow(totalrow+1);

		
		for(int j=0;j<cel;j++)
		{	System.out.println("j=="+j);  
			newrow.createCell(j).setCellValue("Value of j "+j);
				            
		}
		
		FileOutputStream outputstream = new FileOutputStream(path);
		workbook.write(outputstream);
		
			
}
		
		
		
		
	}
	
	
	

