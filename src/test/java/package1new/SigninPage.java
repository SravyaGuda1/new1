package package1new;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SigninPage {
	WebDriver driver;

	By SigninLocator = By.className("msame_Header_name");
	By emailFieldDescendantLocator = By.className("form-group col-md-12 placeholderContainer");
	By emailFieldLocator = By.className("form-control");
	By NextLocator = By.xpath("//submit[@class='btn btn-block btn-primary']");

	//By accountSelectorLocator = By.className("row text-body margin-bottom-12");
	By accountSelectorLocator = By.xpath("//*[@id='pickerDescription']/following::*[2]");

	By passWordFieldLocator = By.name("passwd");
	By signInLocator = By.xpath("//input[@class='btn btn-block btn-primary']");
	
	
	public SigninPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void signin(WebDriver driver) throws InterruptedException {
	WebDriverWait w = new WebDriverWait(driver,500);
	//WebDriverWait w1 = new WebDriverWait(driver,200);

	w.until(ExpectedConditions.elementToBeClickable(SigninLocator));
	driver.findElement(SigninLocator).click();
	//w1.until(ExpectedConditions.elementToBeClickable(NextLocator));
	Thread.sleep(5000);
	WebElement iframeSwitchEmailfield = driver.findElement(By.className("SignIn"));
	driver.switchTo().frame(iframeSwitchEmailfield); System.out.println("Switched to email field selector");

	driver.findElement(emailFieldLocator).click();
	System.out.println("Clicked in email field");
	Thread.sleep(2000);
	driver.findElement(emailFieldLocator).sendKeys("sravya.guda@zenq.com",Keys.ENTER);
	driver.switchTo().defaultContent();
	Thread.sleep(6000);
	WebElement iframeAccountSelector = driver.findElement(By.className("SignIn"));
	driver.switchTo().frame(iframeAccountSelector); System.out.println("Switched to account selector frame");
	
	driver.findElement(accountSelectorLocator).click();
	Thread.sleep(5000);

	driver.findElement(By.id("aadTile")).click();
	
	Thread.sleep(5000);
	//w.until(ExpectedConditions.elementToBeClickable(passWordFieldLocator));

	driver.findElement(passWordFieldLocator).click();
	Thread.sleep(2000);
	driver.findElement(passWordFieldLocator).sendKeys("Window@02");
	Thread.sleep(2000);

	driver.findElement(signInLocator).click();
	Thread.sleep(2000);
	driver.findElement(signInLocator).click();

	String Title = driver.getTitle();
	System.out.println("Signed in Successfully");
	//Assert.assertEquals("Signed in to OneDrive", driver.getTitle().contains("Onedrive"), "True");
	Thread.sleep(5000);
	}

}
