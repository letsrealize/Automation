package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingTablePage extends BaseClass {
	private static WebElement element = null;

	public ShippingTablePage(WebDriver driver) {
		super(driver);
	}

	public static WebElement txtbx_Description() {
		element = driver.findElement(By.id("description"));
		return element;
	}

	public static void drpdwn_ProductLine(String productLineCode) {
		element = null;
		Select element = new Select(driver.findElement(By.id("productLineCode")));
		element.selectByVisibleText(productLineCode);
	}

	public static void drpdwn_Currency(String currencyCode) {
		element = null;
		Select element = new Select(driver.findElement(By.id("currencyId")));
		element.selectByVisibleText(currencyCode);
	}

	public static void drpdwn_Intent(String intent) {
		element = null;
		Select element = new Select(driver.findElement(By.id("intentId")));
		element.selectByVisibleText(intent);
	}

	public static WebElement dateTxt_startDate() {
		element = driver.findElement(By.id("startDateInput"));
		return element;
	}

	public static WebElement dateTxt_endDate() {
		element = driver.findElement(By.id("endDateInput"));
		return element;
	}

	public static WebElement btn_addShippingEntry() throws Exception {
		element = driver.findElement(By.id("addShippingEntry"));
		return element;
	}

	public static WebElement txt_upperBaseAmount() throws Exception {
		element = driver.findElement(By.id("rate-basisQuantity-0"));
		return element;
	}

	public static WebElement txt_StandardRate() throws Exception {
		element = driver.findElement(By.id("rate-standardRate-0"));
		return element;
	}

	public static WebElement txt_RushRate() throws Exception {
		element = driver.findElement(By.id("rate-rushRate-0"));
		return element;
	}

	public static WebElement txt_2DayRate() throws Exception {
		element = driver.findElement(By.id("rate-toDayRate-0"));
		return element;
	}

	public static WebElement txt_sameDayRate() throws Exception {
		element = driver.findElement(By.id("rate-sameDateRate-0"));
		return element;
	}

	public static WebElement btn_done() throws Exception {
		element = driver.findElement(By.id("done0"));
		return element;
	}

	public static WebElement btn_save() throws Exception {
		element = driver.findElement(By.id("BUTTON_save"));
		return element;
	}

	public static WebElement btn_validate() throws Exception {
		element = driver.findElement(By.id("BUTTON_validate"));
		return element;
	}

	public static WebElement shippingTableCode() throws Exception {
		element = driver.findElement(By.id("shippingTableCode"));
		return element;
	}
	
}
