package appModules;

import java.util.Random;

import pageObjects.BaseClass;
import pageObjects.ShippingTablePage;
import utility.Constant;
import utility.Constant.shippingTableData;
import utility.ExcelUtils;
import utility.GetRandoms;
import utility.Utils;

public class CreateShippingTable_Action {

	public static void Execute(int iTestCaseRow) throws Exception {
		String description = ExcelUtils.getCellData(iTestCaseRow, Constant.shippingTableData.Col_Description);
		String startDate = ExcelUtils.getCellData(iTestCaseRow, Constant.shippingTableData.Col_StartDate);
		String endDate = ExcelUtils.getCellData(iTestCaseRow, Constant.shippingTableData.Col_EndDate);
		String productLineCode = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductLine);
		String currencyCode = ExcelUtils.getCellData(iTestCaseRow, Constant.shippingTableData.Col_Currency);
		String intent = ExcelUtils.getCellData(iTestCaseRow, Constant.shippingTableData.Col_Intent);
		String shippingRange = ExcelUtils.getCellData(iTestCaseRow, Constant.shippingTableData.Col_NoOfShippingRange);
		int noOfShippingRange = Integer.parseInt(shippingRange);
		if (description == null) {
			description = GetRandoms.getNews();
		}
		if (startDate == null) {
			startDate = GetRandoms.getDate.startDate();
		}
		if (endDate == null) {
			endDate = GetRandoms.getDate.endDate();
		}
		if (shippingRange == null) {
			noOfShippingRange = 2;
		}
		ShippingTablePage.txtbx_Description().sendKeys(description);
		ShippingTablePage.drpdwn_ProductLine(productLineCode);
		ShippingTablePage.drpdwn_Currency(currencyCode);
		ShippingTablePage.drpdwn_Intent(intent);
		ShippingTablePage.dateTxt_startDate().click();
		ShippingTablePage.dateTxt_startDate().sendKeys(startDate);
		ShippingTablePage.txtbx_Description().click();
		ShippingTablePage.dateTxt_endDate().click();
		ShippingTablePage.dateTxt_endDate().sendKeys(endDate);	
		ShippingTablePage.txtbx_Description().click();
		//Thread.sleep(1000);
		for (int i = 0; i < noOfShippingRange; i++) {
			ShippingTablePage.btn_addShippingEntry().click();
			ShippingTablePage.txt_upperBaseAmount().sendKeys(GetRandoms.randomNumbersString(100 * (i + 1), 200 * (i + 1)));
			ShippingTablePage.txt_StandardRate().sendKeys(GetRandoms.randomNumbersString(2 + i * 2, 6 + i * 2));
			ShippingTablePage.txt_RushRate().sendKeys(GetRandoms.randomNumbersString(7 + i * 2, 9 + i * 2));
			ShippingTablePage.txt_2DayRate().sendKeys(GetRandoms.randomNumbersString(10 + i * 2, 12 + i * 2));
			ShippingTablePage.txt_sameDayRate().sendKeys(GetRandoms.randomNumbersString(14 + i * 2, 16 + i * 2));
			ShippingTablePage.btn_done().click();
		}
		ShippingTablePage.btn_validate().click();
		Utils.waitForElement(ShippingTablePage.shippingTableCode());
		BaseClass.shippingTableCode = ShippingTablePage.shippingTableCode().getText();
	}
}
