package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cashDeposit_omni_walkin {
	
	private WebDriver driver;
	
	private By all_transaction = By.xpath("//label[@kwp='frmDashboard_flxMain0dbc5c03cc8e54e_lblPara']");
	private By Cash_deposit = By.xpath("//label[@kwp='frmSubMenu_flxCard1_lblPara']");
	private By Cash_deposit_walkin = By.xpath("//label[@kwp='frmOptions_flxCard2_lblPara']");
	private By cnic = By.xpath("//input[@kwp='frmOmniAccountWalkInCustomer_flxNum_txtBxField']");
	
    
	//frmOmniAccountWalkInCustomer_flxNum_txtBxField
	public cashDeposit_omni_walkin(WebDriver driver) {
        this.driver = driver;
    }
    
    public void all_transaction_label() {
        driver.findElement(all_transaction).click();
    }
    
    public void cash_deposit_label() {
        driver.findElement(Cash_deposit).click();
    }
    
    public void Cash_deposit_walkin_label() {
        driver.findElement(Cash_deposit_walkin).click();
    }
    
    public void cnic_input(String cnic_data) {
        driver.findElement(cnic).sendKeys(cnic_data);
    }

}
