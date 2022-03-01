package testinpackage;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataMine {

	
	@DataProvider(name="DataContainer")
    public Object[] myDataProvider() throws IOException {
         
		ReadExcelData readexcel = new ReadExcelData();
		Object obj [] =readexcel.readExcel();
		return obj;   
    }
}
