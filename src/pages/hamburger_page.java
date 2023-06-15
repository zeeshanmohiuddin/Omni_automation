package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hamburger_page {
	
	private static WebElement element = null;
	
	public static WebElement div_hamburger(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@kwp='frmDashboard_flxSubHeader1_imgGrey']"));
		return element;
	}

}
