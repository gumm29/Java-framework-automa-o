package setUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtil {
	public WebDriver driver;

	public BaseUtil() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.cielo.com.br/");
	}
	
	public WebElement idSelector(String id) {
		return driver.findElement(By.id(id));
	}
	
	public WebElement cssSelector(String css, int index) {
		List<WebElement> elements = driver.findElements(By.cssSelector(css));
		return elements.get(index);
	}
}
