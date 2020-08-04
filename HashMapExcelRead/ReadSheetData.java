package HashMapExcelRead;

import java.io.IOException;

public class ReadSheetData {
	public static void main(String[] args) throws IOException {
		ReadExcelSheetData r = new ReadExcelSheetData();
		String val = r.getMapData("1");
		System.out.println("Value of the keyword (search) is- " + val);
	}
}