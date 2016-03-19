package testCases;

import org.testng.annotations.Test;

import utility.Constant;
import utility.ExcelUtils;

public class Temp {
	
	@Test
	public void test() throws Exception
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		String x = ExcelUtils.getCellData(1, Constant.shippingTableData.Col_ShippingTableCode);

	}

}
