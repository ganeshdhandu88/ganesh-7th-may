package mainJava;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import test.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test(priority=2,groups= {"smoke","regression"})
	public void verifyLogin() {
		loginPage.loginMethod();
		pimPage.titleofPimPage();
		AssertJUnit.assertEquals(pimPage.titleofPimPage(),"PIM");
		
			
		
		
	}

}
