package testinpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public Object[] readExcel() throws IOException {
		
		
		File file = new File("src\\Excel\\note.xlsx");

		FileInputStream inputStream = new FileInputStream(file);

		XSSFWorkbook ws = new XSSFWorkbook(inputStream);

		XSSFSheet excelSheet = ws.getSheet("Sheet2");
		int rownCount=excelSheet.getLastRowNum()+1;
		Object data[][]=  new Object[rownCount][2];
		System.out.println("row count: "+rownCount);
		for (int i = 0; i < rownCount; i++) {
			
			
             data[i][0]=excelSheet.getRow(i).getCell(0).getStringCellValue();
             data[i][1]=excelSheet.getRow(i).getCell(1).getStringCellValue();
            
			//System.out.println("Coulumn 1 values: "+excelSheet.getRow(i).getCell(0).getStringCellValue());
			//System.out.println("Coulumn 2 values: "+excelSheet.getRow(i).getCell(1).getStringCellValue());
		}
		return data;
	}
}

