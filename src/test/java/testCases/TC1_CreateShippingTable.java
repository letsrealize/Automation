package testCases;

import org.openqa.selenium.WebDriver;

import utility.Constant;
import utility.ExcelUtils;
import utility.GetRandoms;

public class TC1_CreateShippingTable {
	public static WebDriver driver;
	private static String sTestCaseName;
	private static String iTestCaseRow;
	
	public static void main(String[] args) throws Exception {
		//DOMConfigurator.configure("log4j.xml");
		sTestCaseName = "TC1_CreateShippingTable";
	//	sTestCaseName = Utils.getTestCaseName(this.toString());
		//Log.startTestCase(sTestCaseName);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		iTestCaseRow = ExcelUtils.getCellData(1, 1);
		System.out.println(iTestCaseRow);
		System.out.println(GetRandoms.getNews());
		System.out.println(GetRandoms.getDate.startDate());
	}

}
