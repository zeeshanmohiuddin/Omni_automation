package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.login_page;

public class login_test {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		String Chrome_driver_path = "C:\\Users\\zeeshan.mohiuddin\\eclipse-workspace\\Omni_Automation\\Latest_chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Chrome_driver_path);
		driver = new ChromeDriver();
		driver.get("http://119.160.107.35:31007/apps/BBWebAgentAppBas/#/BBAuthMA/frmSignIn");
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		
		System.out.print("asdsad");
		
		login_page.input_username(driver).sendKeys("03313055859");
		Thread.sleep(2000);
		login_page.input_password(driver).sendKeys("070509");
		Thread.sleep(2000);
		login_page.button_signin(driver).click();
		Thread.sleep(20000);
		driver.close();


	}

}
