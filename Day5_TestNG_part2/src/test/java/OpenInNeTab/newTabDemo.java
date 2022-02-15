package OpenInNeTab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTabDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://omayo.blogspot.in/");
        String NewTabLink = Keys.chord(Keys.CONTROL, Keys.RETURN);
        driver.findElement(By.id("link1")).sendKeys(new CharSequence[]{NewTabLink});
        //want to perfrom action on the new tab only
      //a[text()='What is Selenium?']
       
        driver.findElement(By.xpath("//a[text()='What is Selenium?']")).click();

	}

}
