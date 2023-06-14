package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_page {
	
	private static WebElement element = null;
	
	public static WebElement input_username(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@kwp='frmSignIn_flxAlphaNum_txtBxField']"));
		return element;
	}
		
	public static WebElement input_password(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@kwp='frmSignIn_flxAlphaNum1_txtBxField']"));
		return element;
	}
	
	public static WebElement button_signin(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@kwp='frmSignIn_btnContinue']"));
		return element;
	}

}
