package testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModules.Login_Action;
import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class TC1_CreateShippingTable {
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		sTestCaseName = Utils.getTestCaseName(this.toString());
		Log.startTestCase(sTestCaseName);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);
		driver = Utils.OpenBrowser(iTestCaseRow);
		new BaseClass(driver);
	}

	@Test
	public void main() throws Exception {
		try {
			Login_Action.Execute(iTestCaseRow);
			// ExcelUtils.setCellData(BaseClass.shippingTableCode,
			// iTestCaseRow,Constant.shippingTableData.Col_ShippingTableCode);
			ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.shippingTableData.Col_Status);
		} catch (Exception e) {
			ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.shippingTableData.Col_Status);
			Utils.takeScreenshot(driver, sTestCaseName);
			Log.error(e.getMessage());
			throw (e);
		}
	}

	@AfterMethod
	public void afterMethod() {
		Log.endTestCase(sTestCaseName);
		driver.close();
	}

}
