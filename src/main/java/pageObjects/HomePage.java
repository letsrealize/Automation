package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.Utils;

public class HomePage extends BaseClass {

	private static WebElement element = null;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public static class TopNavigation {
		static WebElement mainElementRate = driver.findElement(By.xpath("//ul[@class='nav grNav']/li[3]/a"));

		public static void NewShippingTable() throws Exception {
			try {
				Utils.mouseHoverAction(mainElementRate, "Shipping Table", "New");
			} catch (Exception e) {
				Log.error("Accessories link is not found under Product Category");
				throw (e);
			}
		}

	}

	public static WebElement logo_GR() {
		element = driver.findElement(By.xpath("//div[@id='logo']/img"));
		return element;
	}

}
