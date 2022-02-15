package TableHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableHandleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/Wasim%20Ansari/OneDrive%20-%20GMO%20GlobalSign/topic%20wise%20notes/HTML/table.html");
        WebElement FourthRowSecondValue=driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]"));
        String getLabel=FourthRowSecondValue.getText();
        Assert.assertEquals(getLabel, "Manual");
        System.out.println("The text for the FourthRowSecondValue is "+getLabel);

	}

}
