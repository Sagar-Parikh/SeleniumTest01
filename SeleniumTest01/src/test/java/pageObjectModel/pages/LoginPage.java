package pageObjectModel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver remoteDriver) {
		super(remoteDriver);
	}

	public static String usernameField = "";
	public static String passwordField = "";
	public static String loginButton = "";

	public void enterCredentials(String receivedEmail, String receivedPassword) {
		waitHelper.waitForPageReadyState();
		// Enter Code to identify Username field with validation

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(receivedEmail);

		// Enter Code to identify Password field with validation

		driver.findElement(By.xpath("//input[@data-bind='value: Password']")).sendKeys(receivedPassword);

		
	}

	public void sendCredentials() {
		// Enter Code to submit the credentials with validation
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
	}
}
