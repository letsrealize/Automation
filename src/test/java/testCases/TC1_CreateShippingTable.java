package testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModules.Login_Action;
import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;
import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

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
		iTestCaseRow = ExcelUtils.getCellData(2, 1);
		System.out.println(iTestCaseRow);
	}

}
