package WenDriverManager_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Example {

	public static void main(String[] args) {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Utilities\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
		 */
		ChromeOptions options=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://mvnrepository.com/");

	}

}
