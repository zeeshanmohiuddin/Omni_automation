package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pages.login_page;
import pages.logout_page;
import pages.funds_transfer_WalletToWallet_page;
import pages.cashDeposit_omni_self_page;
import pages.cashDeposit_omni_walkin;

public class login_test {

  private static WebDriver driver = null;

  static File src;
  static FileInputStream fis;
  static Workbook wb;

  public static void main(String[] args) throws Exception {

    //		driver = cashDeposit_omni_self_page.setupDriver();

    String Chrome_driver_path = "C:\\Users\\zeeshan.mohiuddin\\eclipse-workspace\\Omni_Automation\\Latest_chrome_driver\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", Chrome_driver_path);
    driver = new ChromeDriver();
    driver.get("http://119.160.107.35:31007/apps/BBWebAgentAppBas/#/BBAuthMA/frmSignIn");
    driver.manage().window().maximize();

    Thread.sleep(5000);

    //login 
    login_test(0);
    Thread.sleep(20000);

    cashDeposit_omni_walikin_test();
    //cashDeposit_omni_self_test(0);
    //ft_WalletToWallet_test(0);

    logout_test();
    Thread.sleep(5000);

    //		login_test(1);
    //		Thread.sleep(5000);

    driver.close();

  }

  public static void login_test(int index) throws IOException, InterruptedException {
    ArrayList < String > username = new ArrayList < String > ();
    ArrayList < String > password = new ArrayList < String > ();

    src = new File("D:/Work/Automation/InputValues.xlsx");
    fis = new FileInputStream(src);
    wb = WorkbookFactory.create(fis);
    Sheet sheet0 = wb.getSheetAt(0);

    //user 1
    Row row1 = sheet0.getRow(1);
    Cell user0 = row1.getCell(0);
    Cell pass0 = row1.getCell(1);

    //user 2
    Row row2 = sheet0.getRow(2);
    Cell user1 = row2.getCell(0);
    Cell pass1 = row2.getCell(1);

    //Adding into list
    username.add(user0.toString());
    username.add(user1.toString());

    password.add(pass0.toString());
    password.add(pass1.toString());

    fis.close();

    login_page.input_username(driver).sendKeys(username.get(index));
    Thread.sleep(2000);
    login_page.input_password(driver).sendKeys(password.get(index));
    Thread.sleep(2000);
    login_page.button_signin(driver).click();
    Thread.sleep(10000);
    System.out.println("----------Login Successfull-------------");
    //Thread.sleep(15000);

  }

  public static void logout_test() throws InterruptedException {
    Thread.sleep(30000);
    logout_page.div_logout(driver).click();
    Thread.sleep(2000);
    System.out.println("----------Logout Successfull-------------");
  }

  public static void ft_WalletToWallet_test(int index) throws IOException, InterruptedException {

    ArrayList < String > from_account = new ArrayList < String > ();
    ArrayList < String > to_account = new ArrayList < String > ();
    src = new File("D:/Work/Automation/InputValues.xlsx");
    fis = new FileInputStream(src);
    wb = WorkbookFactory.create(fis);
    Sheet sheet1 = wb.getSheetAt(1);

    Row row1 = sheet1.getRow(1);
    Cell from0 = row1.getCell(0);
    Cell to0 = row1.getCell(1);

    from_account.add(from0.toString());

    to_account.add(to0.toString());

    funds_transfer_WalletToWallet_page.label_Funds_transfer(driver).click();
    Thread.sleep(2000);

    funds_transfer_WalletToWallet_page.label_WalletToWallet(driver).click();
    Thread.sleep(2000);

    funds_transfer_WalletToWallet_page.input_FromAccount(driver).sendKeys(from_account.get(index));
    Thread.sleep(2000);

    funds_transfer_WalletToWallet_page.input_ToAccount(driver).sendKeys(to_account.get(index));
    Thread.sleep(2000);

    funds_transfer_WalletToWallet_page.button_continue(driver).click();

    System.out.println("----------Continue..... -------------");
  }

  public static void cashDeposit_omni_self_test(int index) throws IOException, InterruptedException {

    ArrayList < String > cnic_list = new ArrayList < String > ();
    ArrayList < String > mobile_list = new ArrayList < String > ();
    ArrayList < String > amount_list = new ArrayList < String > ();

    src = new File("D:/Work/Automation/InputValues.xlsx");
    fis = new FileInputStream(src);
    wb = WorkbookFactory.create(fis);
    Sheet sheet1 = wb.getSheetAt(2);

    Row row1 = sheet1.getRow(1);
    Cell cnic1 = row1.getCell(0);
    Cell mobile1 = row1.getCell(1);
    Cell amount1 = row1.getCell(2);

    cnic_list.add(cnic1.toString());

    mobile_list.add(mobile1.toString());

    amount_list.add(amount1.toString());

    cashDeposit_omni_self_page.label_all_transaction(driver).click();
    Thread.sleep(2000);

    cashDeposit_omni_self_page.label_cash_deposit(driver).click();
    Thread.sleep(2000);

    cashDeposit_omni_self_page.onClick("frmOptions_flxCard3_lblPara");
    System.out.println("aaaaaa");

    Thread.sleep(2000);
    //cashDeposit_omni_self_page.input_cnic(cnic_list.get(index)).sendKeys(cnic_list.get(index));

    cashDeposit_omni_self_page.inputToTextField("frmOmniAccountSelfDeposit_flxNum_txtBxField", cnic_list.get(index));
    Thread.sleep(2000);
    cashDeposit_omni_self_page.input_number(driver).sendKeys(mobile_list.get(index));
    Thread.sleep(2000);
    cashDeposit_omni_self_page.input_amount(driver).sendKeys(amount_list.get(index));
    Thread.sleep(2000);
    cashDeposit_omni_self_page.button_continue(driver).click();
    Thread.sleep(2000);

    System.out.println("----------Continue..... -------------");
  }

  public static void cashDeposit_omni_walikin_test() throws InterruptedException {
    cashDeposit_omni_walkin cashDeposit_omni_walkin_object = new cashDeposit_omni_walkin(driver);
    Thread.sleep(2000);

    cashDeposit_omni_walkin_object.all_transaction_label();
    Thread.sleep(2000);

    cashDeposit_omni_walkin_object.cash_deposit_label();
    Thread.sleep(2000);

    cashDeposit_omni_walkin_object.Cash_deposit_walkin_label();
    Thread.sleep(2000);

    cashDeposit_omni_walkin_object.cnic_input("4210105681843");
    Thread.sleep(2000);

  }

}