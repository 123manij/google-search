//package miniproject;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class DataInExcel {
//	public static String dataSet() throws IOException {
//		File f= new File("C:\\Users\\2318837\\eclipse-workspace\\miniproject(2318837-MANOJ CB )\\ScreenShot\\Excel\\miniproject.xlsx");
//		FileInputStream file = new FileInputStream(f);
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		XSSFSheet s = workbook.getSheet("cognizant");
//		String name = s.getRow(1).getCell(0).toString();
//		return name;
//	}
//
//}
