package testCases;

import org.testng.annotations.Test;

import utility.Constant;
import utility.ExcelUtils;

public class Temp {

	public void test() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		String description = ExcelUtils.getCellData(1, Constant.shippingTableData.Col_Description);
		System.out.println(description);
		ExcelUtils.setCellData("aaaaaaaa", 1, Constant.shippingTableData.Col_ShippingTableCode + 5);
		ExcelUtils.setCellData("12", 1, Constant.shippingTableData.Col_ShippingTableCode + 6);
	}

	@Test
	public void test1() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet3");
		ExcelUtils.setCellData("aaaaaaaa", 1, 0);
		ExcelUtils.setCellData("12", 1, Constant.shippingTableData.Col_ShippingTableCode);
	}

}
