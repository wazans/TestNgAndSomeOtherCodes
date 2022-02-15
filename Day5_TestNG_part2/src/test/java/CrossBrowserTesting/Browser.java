package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Browser {
	public WebDriver driver;

	@Parameters("browser")
	@Test
	public void ChooseBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Utilities\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.get("https://www.youtube.com/");
		}
		if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Utilities\\msedgedriver.exe");
			driver = new EdgeDriver();
			//driver.get("https://www.youtube.com/");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Utilities\\geckodriver.exe");
			driver = new FirefoxDriver();
			//driver.get("https://www.youtube.com/");
			
		}
		driver.get("https://www.youtube.com/");
		

	}

	
}
