package HashMapExcelRead;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheetData {
	public static String getMapData(String key) throws IOException {
		Map<String, String> map = setMap().get("Key-Value");
		String value = map.get(key);
		return value;
	}

	public static HashMap<String, HashMap<String, String>> setMap() throws IOException {

		String pathString = "C:\\Users\\Dhiraj varma\\Desktop\\Jar\\HashMap_ReadValue.xlsx";
		FileInputStream fis = new FileInputStream(pathString);
		XSSFWorkbook wbs = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbs.getSheetAt(0);
		int lastRowCount = sheet.getLastRowNum();
		HashMap<String, HashMap<String, String>> hashMap = new HashMap<String, HashMap<String, String>>();
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < lastRowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell valueCell = row.getCell(1);
			XSSFCell keyCell = row.getCell(0);
			String valueString = valueCell.getStringCellValue().trim();
			String keyString = keyCell.getStringCellValue().trim();
			map.put(keyString, valueString);
			hashMap.put("Key-Value", map);
		}
		return hashMap;
	}

}
