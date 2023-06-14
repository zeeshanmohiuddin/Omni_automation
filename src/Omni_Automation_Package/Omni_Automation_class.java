package Omni_Automation_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omni_Automation_class {

	public static void main(String[] args) throws InterruptedException {
		String Chrome_driver_path = "C:\\Users\\zeeshan.mohiuddin\\eclipse-workspace\\Omni_Automation\\Latest_chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Chrome_driver_path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("Save this code please !!!!!!!!!!!!!!!!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@name='btnK']")).sendKeys("Save this code please !!!!!!!!!!!!!!!!");

		Thread.sleep(3000);
		driver.close();

	}

}