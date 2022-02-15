package DragAndDropDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    Actions act = new Actions(driver);
	    act.dragAndDrop(driver.findElement(By.xpath(".//*[@id='box1']")),driver.findElement(By.xpath(".//*[@id='box107']"))).build().perform();
	  

	}

}
