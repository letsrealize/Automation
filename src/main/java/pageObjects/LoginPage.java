package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
	private static WebElement element = null;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement txtbx_UserName() throws Exception {
		element = driver.findElement(By.id("username"));
		return element;
	}

	public static WebElement txtbx_Password() throws Exception {
		element = driver.findElement(By.id("password"));
		return element;
	}

	public static WebElement btn_Login() throws Exception {
		element = driver.findElement(By.id("Login_0"));
		return element;
	}
}
