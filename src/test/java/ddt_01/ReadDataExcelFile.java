package ddt_01;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcelFile {
  public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream("./src/test/resources/data1.xlsx");
	Workbook wb=WorkbookFactory.create(file);
	Sheet sh=wb.getSheet("Sheet1");
	Row r=sh.getRow(1);
	String value = r.getCell(1).toString();
	System.out.println(value);
	
}
}
