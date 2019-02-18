package commapsnq.assignment.test.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {

	/*
	 * FileInputStream fis = null; XSSFWorkbook workbook = null; XSSFSheet sheet
	 * = null; XSSFRow row = null; XSSFCell cell = null; String xlFilePath;
	 * 
	 * public void ExcelHelper(String xlFilePath) throws Exception {
	 * this.xlFilePath = xlFilePath; fis = new FileInputStream(xlFilePath);
	 * workbook = new XSSFWorkbook(fis); fis.close(); }
	 * 
	 * public int getRowCount(String sheetName) { sheet =
	 * workbook.getSheet(sheetName); int rowCount = sheet.getLastRowNum() + 1;
	 * return rowCount; }
	 * 
	 * public int getColumnCount(String sheetName) { sheet =
	 * workbook.getSheet(sheetName); row = sheet.getRow(0); int colCount =
	 * row.getLastCellNum(); return colCount; }
	 */
	public Object[][] readExcel(String xlFilePath, String sheetName) {

		File file = new File(xlFilePath);
		XSSFWorkbook workbook = null;
		//Workbook workbook= null;
		try {
			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet(sheetName);	
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum()+1 ;
	
		 
		String [][] datahelper = new String [rowCount][3];
		//System.out.println("******************Row Count*****************");
		System.out.println(rowCount);
		for(int i = 1; i<rowCount;i++){
			Row row = sheet.getRow(i);
            for(int j=0 ; j<row.getLastCellNum();j++)
            {

            	datahelper[i][j]= row.getCell(j).getStringCellValue();
            	
            }
           
		}
		return datahelper;
	}

}
