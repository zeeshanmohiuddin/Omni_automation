package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logout_page {
	

	private static WebElement element = null;
	
	public static WebElement div_logout(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@kwp='frmDashboard_flxHeader_imgLogout']"));
		return element;
	}

}
