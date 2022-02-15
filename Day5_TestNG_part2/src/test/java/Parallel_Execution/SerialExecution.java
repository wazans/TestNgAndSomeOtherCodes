package Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SerialExecution {
	public WebDriver driver;

	@Test
	public void OpenFB() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.quit();
		
	}

	@Test
	public void OpenGoogle() throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./Drivers//msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.quit();
		
	}
}
