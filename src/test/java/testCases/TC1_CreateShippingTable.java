package testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModules.CreateShippingTable_Action;
import appModules.Login_Action;
import pageObjects.BaseClass;
import pageObjects.HomePage;
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
			HomePage.TopNavigation.NewShippingTable();
			CreateShippingTable_Action.Execute(iTestCaseRow);
			Utils.takeScreenshot(driver, sTestCaseName);
			ExcelUtils.setCellData(BaseClass.shippingTableCode, iTestCaseRow,
					Constant.shippingTableData.Col_ShippingTableCode);
		} catch (Exception e) {
			Utils.takeScreenshot(driver, sTestCaseName);
			ExcelUtils.setCellData("ERROR-Please check the log file.", iTestCaseRow,
					Constant.shippingTableData.Col_ShippingTableCode);
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
