package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import pages.login_page;
import pages.logout_page;

public class login_test {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		String Chrome_driver_path = "C:\\Users\\zeeshan.mohiuddin\\eclipse-workspace\\Omni_Automation\\Latest_chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Chrome_driver_path);
		driver = new ChromeDriver();
		driver.get("http://119.160.107.35:31007/apps/BBWebAgentAppBas/#/BBAuthMA/frmSignIn");
		driver.manage().window().maximize();
		Thread.sleep(5000);		
		
		//login 
		login_test();
		Thread.sleep(30000);	

		//logout
		logout_test();
		Thread.sleep(5000);	
		
		driver.close();


	}
	
	public static void login_test() throws IOException, InterruptedException  { 
		
		
		File src = new File("D:/Work/Automation/InputValues.xlsx");
		FileInputStream fis = new FileInputStream(src); 
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet0 = wb.getSheetAt(0);
		Row row1 = sheet0.getRow(1);
		
		Cell cell0 = row1.getCell(0);
		
		Cell cell1 = row1.getCell(1);
		
		String cell0_str = cell0.toString();
		String cell1_str = cell1.toString();
		System.out.println(cell0_str);
		System.out.println(cell1_str);
		fis.close();
		
		
		login_page.input_username(driver).sendKeys(cell0_str);
		Thread.sleep(2000);
		login_page.input_password(driver).sendKeys(cell1_str);
		Thread.sleep(2000);
		login_page.button_signin(driver).click();
		Thread.sleep(20000);
		System.out.println("----------Login Successfull-------------");
	}
	
	
	
	public static void logout_test() throws InterruptedException { 
		
		logout_page.div_logout(driver).click();
		Thread.sleep(2000);
		
		System.out.println("----------Logout Successfull-------------");
	}
	

}
