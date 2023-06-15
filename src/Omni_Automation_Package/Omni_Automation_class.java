package Omni_Automation_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Omni_Automation_class {

	public static void main(String[] args) throws InterruptedException, IOException {
//		String Chrome_driver_path = "C:\\Users\\zeeshan.mohiuddin\\eclipse-workspace\\Omni_Automation\\Latest_chrome_driver\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver",Chrome_driver_path);
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://119.160.107.35:31007/apps/BBWebAgentAppBas/#/BBAuthMA/frmSignIn");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);		
//		driver.findElement(By.xpath("//input[@kwp='frmSignIn_flxAlphaNum_txtBxField']")).sendKeys("03313055859");
//		driver.findElement(By.xpath("//input[@kwp='frmSignIn_flxAlphaNum1_txtBxField']")).sendKeys("070509");
//		Thread.sleep(2000);
//		
//		for(int i=0;i<=15;i++) {
//			driver.findElement(By.xpath("//button[@kwp='frmSignIn_btnContinue']")).click();
//			System.out.println("click");
//		}
//		
//		
//		Thread.sleep(20000);
//		driver.close();
		
		
		
		File src = new File("D:/Work/Automation/InputValues.xlsx");
		FileInputStream fis = new FileInputStream(src); 
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet0 = wb.getSheetAt(0);
		Row row0 = sheet0.getRow(1);
		Cell cell0 = row0.getCell(0);
		System.out.println(cell0);
		fis.close();
//		

//		XSSFWorkbook xsf = new XSSFWorkbook(fis);
//		System.out.println("3");
//		XSSFSheet sheet = xsf.getSheetAt(0);
//		System.out.println("4");
//		String entry1 = sheet.getRow(1).getCell(1).getStringCellValue();
//		System.out.println("5");
//		xsf.close();
//		System.out.println("6");
//		
//		System.out.println(entry1);
//		System.out.println("7");

	}

}