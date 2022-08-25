package mainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest{
	
	// all the locators of page
	
	@FindBy(name="username")
	 WebElement userName;
	
	@FindBy(name="password")
	 WebElement password;
	
	@FindBy(xpath="//*[text()=' Login ']")
	 WebElement btnlogin;
	
	@FindBy(name="//h5[text()='Login']")
	 WebElement txtLoginPage;
	
	// initilisation of locators
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	// methods required to perform test steps 
	public void loginMethod() {
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		btnlogin.click();
		
	}

}
