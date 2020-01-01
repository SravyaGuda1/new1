package package1new;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;

	BaseClass1 objBaseClass1 = new BaseClass1();
	SigninPage objSigninPage;
	
  @Test
  public void f() throws Exception {

	  System.out.println("Test method");
	  objSigninPage = new SigninPage(driver);
	  objSigninPage.signin(driver);
	  objSigninPage.signin(driver);
}
  
  
  @BeforeTest
  public void driverManager() throws Exception {

		System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.onedrive.com");
  }
  
  @AfterTest
  public void afterClass() {
	  System.out.println("After Test method");
	  driver.close();
  }

}
