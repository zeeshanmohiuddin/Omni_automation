package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cashDeposit_omni_self_page {
	
private static WebElement element = null;
	
private static WebDriver driver;

    public static WebDriver setupDriver() {
    	
    	if (driver != null){
    		return driver;
    	}
    	
    	String Chrome_driver_path = "C:\\Users\\zeeshan.mohiuddin\\eclipse-workspace\\Omni_Automation\\Latest_chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Chrome_driver_path);
		driver = new ChromeDriver();
		driver.get("http://119.160.107.35:31007/apps/BBWebAgentAppBas/#/BBAuthMA/frmSignIn");
		driver.manage().window().maximize();
		return driver;
    }

	//frmDashboard_flxMain0dbc5c03cc8e54e_lblPara
	
	public static WebElement label_all_transaction(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[@kwp='frmDashboard_flxMain0dbc5c03cc8e54e_lblPara']"));
		return element;
	}

	public static WebElement label_cash_deposit(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[@kwp='frmSubMenu_flxCard1_lblPara']"));
		return element;
	}
	
	public static WebElement label_cash_depositSelf(WebDriver driver,String path) {
		element = driver.findElement(By.xpath("//label[@kwp='frmOptions_flxCard3_lblPara']"));
		return element;
	}
	
//	public static void onClick(String path) {
//		element = setupDriver().findElement(By.xpath("//label[@kwp='"+path+"']"));
//	    element.click();
//	}
	
	public static void onClick(String path) {
		element = driver.findElement(By.xpath("//label[@kwp='"+path+"']"));
	    element.click();
	}
	
	public static void inputToTextField(String path,String data) {
		element = setupDriver().findElement(By.xpath("//input[@kwp='"+path+"']"));
		element.sendKeys(data);
	}
	
	public static WebElement input_number(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@kwp='frmOmniAccountSelfDeposit_flxNum1_txtBxField']"));
		return element;
	}
	
	public static WebElement input_amount(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@kwp='frmOmniAccountSelfDeposit_flxNum2_txtBxField']"));
		return element;
	}
	
	public static WebElement div_checkbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@kwp='frmOmniAccountSelfDeposit_CheckBox_flxCheckBox']"));
		return element;
	}
	
	public static WebElement button_continue(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@kwp='frmOmniAccountSelfDeposit_flxMain_btnContinue']"));
		return element;
	}

}
