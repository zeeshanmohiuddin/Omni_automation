package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class funds_transfer_WalletToWallet_page {
	

	private static WebElement element = null;
	
	public static WebElement label_Funds_transfer(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[@kwp='frmDashboard_flxMain1_lblPara']"));
		return element;
	}
	
	public static WebElement label_WalletToWallet(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[@kwp='frmFundsTransferMenu_flxCard1_lblPara']"));
		return element;
	}
	
	public static WebElement input_FromAccount(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@kwp='frmFTWithInAccountSelectAccount_flxNum_txtBxField']"));
		return element;
	}
	
	public static WebElement input_ToAccount(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@kwp='frmFTWithInAccountSelectAccount_flxNum1_txtBxField']"));
		return element;
	}
	
	public static WebElement button_continue(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@kwp='frmFTWithInAccountSelectAccount_flxMain_btnContinue']"));
		return element;
	}

}
