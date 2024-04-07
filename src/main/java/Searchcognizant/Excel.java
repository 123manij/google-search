package Searchcognizant;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static String dataSet() throws IOException {
		File f= new File(System.getProperty("user.dir")+"\\Testd\\miniproject.xlsx");
		FileInputStream file = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet s = workbook.getSheet("cognizant");
		String name = s.getRow(1).getCell(0).toString();
		return name;
	}
}
