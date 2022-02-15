package FileUploadAndDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/upload/";
		
		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("C:\\Utilities\\UploadMe.txt");

		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();

	}

}
