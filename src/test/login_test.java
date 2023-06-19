package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

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
		login_test(0);
		Thread.sleep(5000);	
		
		logout_test();
		Thread.sleep(5000);
		
		login_test(1);
		Thread.sleep(5000);
			
		driver.close();


	}
	
	public static void login_test(int index) throws IOException, InterruptedException  { 	
		ArrayList<String> username = new ArrayList<String>();
		ArrayList<String> password = new ArrayList<String>();

		
		File src = new File("D:/Work/Automation/InputValues.xlsx");
		FileInputStream fis = new FileInputStream(src); 
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet0 = wb.getSheetAt(0);

		//user 1
		Row row1 = sheet0.getRow(1);		
		Cell user0 = row1.getCell(0);
		Cell pass0 = row1.getCell(1);
		
		//user 2
		Row row2 = sheet0.getRow(2);		
		Cell user1 = row2.getCell(0);
		Cell pass1 = row2.getCell(1);
		
		//convert into string 
//		String user0_str = user0.toString();
//		String pass0_str = pass0.toString();
//		
//		String user1_str = user1.toString();
//		String pass1_str = pass1.toString();
		
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
		Thread.sleep(15000);
		
		
		//login with 2nd user
//		login_page.input_username(driver).sendKeys(user1_str);
//		Thread.sleep(2000);
//		login_page.input_password(driver).sendKeys(pass1_str);
//		Thread.sleep(2000);
//		login_page.button_signin(driver).click();
//		Thread.sleep(20000);
//		System.out.println("----------Login Successfull-------------");
	}
	
	public static void logout_test() throws InterruptedException { 		
		Thread.sleep(30000);
		logout_page.div_logout(driver).click();
		Thread.sleep(2000);
		System.out.println("----------Logout Successfull-------------");
	}
	

}
