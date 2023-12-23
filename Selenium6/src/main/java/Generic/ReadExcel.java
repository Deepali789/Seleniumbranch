package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel implements FrameworkConstants {
	File f = new File("EXCEL_PATH");
	public static Object[][] getMultipleData(String sheetName) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Deepali-eclipse-workspace\\Selenium6\\src\\test\\resources\\ExcelData\\SampleExcel.xlsx");

		Workbook w = WorkbookFactory.create(fis);
		Sheet s=w.getSheet("sheet1");
		int rowsize=s.getPhysicalNumberOfRows();
		int colsize=s.getRow(0).getPhysicalNumberOfCells();
		Object data[][] = new Object[rowsize][colsize];
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++)
			{
				data[i][j] = s.getRow(i).getCell(j).toString();
			}
		}
		return data;
	
	
	
		
	}	
	}


