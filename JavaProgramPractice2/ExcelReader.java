package JavaProgramPractice2;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception {
		ReadExcelSheetData r = new ReadExcelSheetData();

		String val = r.getValue("nokia");

		System.out.println("Value of the keyword (search) is- " + val);

	}

}

class ReadExcelSheetData {

	public static final String EXCEFILELOCATION = System.getProperty("user.dir")
			+ "\\src\\JavaProgramPractice2\\list2015.xlsx";
	private static FileInputStream fisFileInputStream;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFRow row;

	public static Map<String, Map<String, String>> getDataMap() throws Exception {
		if (sheet == null) {
			loadExcel();
		}

		Map<String, Map<String, String>> superMap = new HashMap<String, Map<String, String>>();
		Map<String, String> myMap = new HashMap<String, String>();
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			row = sheet.getRow(i);
			String keyCell = row.getCell(0).getStringCellValue();

			int colNum = row.getLastCellNum();
			for (int j = 1; j < colNum; j++) {
				String value = row.getCell(j).getStringCellValue();
				myMap.put(keyCell, value);
			}
			superMap.put("MASTERDATA", myMap);
		}

		return superMap;
	}

	public static String getValue(String key) throws Exception {
		Map<String, String> myVal = getDataMap().get("MASTERDATA");
		String retValue = myVal.get(key);
		return retValue;
	}

	public static void loadExcel() throws Exception {
		System.out.println("Loading excel data..." + EXCEFILELOCATION);

		File file = new File(EXCEFILELOCATION);
		fisFileInputStream = new FileInputStream(file);
		workbook = new XSSFWorkbook(fisFileInputStream);
		sheet = workbook.getSheet("DataSheet");

	}

}
