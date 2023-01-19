package ddt_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
   public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("./testdata/Book1.xlsx");
	Workbook wb=WorkbookFactory.create(file);
	Sheet sh=wb.getSheet("Sheet1");
	Row r=sh.getRow(1);
	//create new cell by deleting the older data in the cell
	Cell c=r.createCell(1);
	
	//writes data into the cell
	c.setCellValue("hii");
	
	//save data into excel
	FileOutputStream fis=new FileOutputStream("./testdata/Book1.xlsx");
	wb.write(fis);
	
	wb.close();

}
}
