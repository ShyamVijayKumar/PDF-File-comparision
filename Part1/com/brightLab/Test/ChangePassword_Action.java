package com.brightLab.Test;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.brightLab.TestBaseutil.TestBaseCore;

import pageLibrary.LoginPage;
import testBase.TestBase;

public class ChangePassword_Action  extends TestBaseCore
{

	@Test
	public void ChangePassword() throws Exception{
		
		Reporter.log("Login to Application with Specific User One");
		init();
		getWebElement("BrightLab.login.username").click();
		getWebElement("BrightLab.login.username").sendKeys("testbrightlab1999@mailinator.com");
		getWebElement("BrightLab.login.password").sendKeys("admin12345");
		Thread.sleep(2000);
		getWebElement("BrightLab.resetpassword.loginButton").click();
		
		Reporter.log("Click on User Settings and go to My Profile");
		impliciteWait(5);
		getWebElement("UserSettings").click();
		getWebElement("UserProfile").click();
		
		Reporter.log("Click on Profile Settings and Select Change Password");
		getWebElement("ProfileSettings").click();
		getWebElement("ChangePassword").click();
		
		Reporter.log("Enter the required field and click on Save");
		Thread.sleep(2000);
		getWebElement("CurrentPassword").sendKeys("admin12345");
		Thread.sleep(1000);
		getWebElement("NewPassword").sendKeys("admin123");
		Thread.sleep(2000);
		getWebElement("ConfirmPassword").sendKeys("admin123");
		Thread.sleep(2000);
		getWebElement("SavePassword").click();
		Thread.sleep(10000);
		getWebElement("ChangePasswordCancelButton").click();
		
		Thread.sleep(2000);
		Reporter.log("Click on User Settings and logout");
		Thread.sleep(5000);
		getWebElement("UserSettings").click();
		getWebElement("Logout").click();
		
		Reporter.log("Verify the Password change by logging to Application");
		Thread.sleep(2000);
		getWebElement("BrightLab.clicklogin.username").click();
		getWebElement("BrightLab.login.username").sendKeys("testbrightlab1999@mailinator.com");
		getWebElement("BrightLab.login.password").sendKeys("admin123");
		Thread.sleep(2000);
		getWebElement("BrightLab.login.loginButton").click();
		
		Reporter.log("Revert Previous Password");
		Thread.sleep(2000);
		getWebElement("UserSettings").click();
		getWebElement("UserProfile").click();
		Thread.sleep(2000);
		getWebElement("ProfileSettings").click();
		Thread.sleep(2000);
		getWebElement("ChangePassword").click();
		Thread.sleep(2000);
		getWebElement("CurrentPassword").sendKeys("admin123");
		Thread.sleep(1000);
		getWebElement("NewPassword").sendKeys("admin12345");
		Thread.sleep(2000);
		getWebElement("ConfirmPassword").sendKeys("admin12345");
		getWebElement("SavePassword").click();
		Thread.sleep(10000);
		getWebElement("ChangePasswordCancelButton").click();
		
		Reporter.log("Click on User Settings->logout and Close the application");
		Thread.sleep(5000);
		LoginPage login = new LoginPage();
		System.out.println("Click on User Settings and logout");
		driver.findElement(By.id("header-nameshortId1")).click();
		driver.findElement(By.id("logoutForm:logoutLink")).click();
		Thread.sleep(4000);
		
	}
}
