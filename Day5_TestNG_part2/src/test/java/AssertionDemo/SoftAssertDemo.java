package AssertionDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	// Soft Assertions are the type of assertions that do not throw an exception
	// when an assertion fails and would continue with the next step after
	@Test
	public void SoftAssert() {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		SoftAssert s = new SoftAssert();
		s.assertEquals("xyz", driver.getTitle());// should fail
		System.out.println("something after soft assertion !! "); // will show if fail
	}
}
