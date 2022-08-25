package mainJava;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.BaseTest;

public class PimTest extends BaseTest {
	@BeforeMethod
	public void login() {
		loginPage.loginMethod();
		
	}
	@Test(priority=3)
	public void VerifyPimPage() {
		AssertJUnit.assertEquals(pimPage.titleofPimPage(), "PIM");
}

}
