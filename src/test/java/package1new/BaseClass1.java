package package1new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass1 {
	WebDriver driver= null;

	public void setup() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.onedrive.com");		
		
	}

}
