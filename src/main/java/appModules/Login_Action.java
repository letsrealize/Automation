package appModules;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import utility.Constant;
import utility.ExcelUtils;
import utility.Utils;

public class Login_Action {
	
	public static void Execute(int iTestCaseRow) throws Exception
	{
		String userName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
		String password = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		LoginPage.txtbx_UserName().sendKeys(userName);
		LoginPage.txtbx_Password().sendKeys(password);
		LoginPage.btn_Login().click();
		Utils.waitForElement(HomePage.logo_GR());
	}
}
