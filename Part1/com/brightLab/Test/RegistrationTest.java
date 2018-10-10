package com.brightLab.Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {
	
String email = "testbrightlab17813@mailinator.com";
/*
@Test
	public void brightLab_RegistrationTest() throws InterruptedException
	{
		//Running chrome driver server and launching chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximizing window
		driver.manage().window().maximize();
		
		//Navigating to project URL
		driver.get("https://dev.mconnectedlab.com/auth/");
		
		//Clicking on Registration Link
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		
		Thread.sleep(5000);
		
		//Clicking on Registration Tab
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		Thread.sleep(5000);
		
		//Filling Registration Form
		driver.findElement(By.id("fname")).sendKeys("Test");
		driver.findElement(By.id("lname")).sendKeys("BrightLab");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.id("password_confirm")).sendKeys("admin123");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("txtCaptchaId")).sendKeys("akshjda387");
		driver.findElement(By.id("accept")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("agreeButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("validate")).click();
		Thread.sleep(5000);
		
		//Validating mail has sent to proper mail address
		String message = driver.findElement(By.xpath("//p[contains(text(),'"+email+"')]")).getText();
		if(message.contains(email))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		
		//Browser Close
		driver.quit();
	}
	
@Test

	public void brightLab_LoginTest() throws InterruptedException
	{
	//Running chrome driver server and launching chrome browser
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	//Maximizing window
	
			driver.manage().window().maximize();
			
			//Navigating to project URL
			
			driver.get("https://dev.mconnectedlab.com/auth/");
			
			//Clicking on Login Link
			driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
			
			//Filling Login Details
			
			driver.findElement(By.id("loginForm:username")).sendKeys("qamyuser01@mailinator.com");
			driver.findElement(By.id("loginForm:password")).sendKeys("admin12345");
			driver.findElement(By.id("signInButton")).click();
			Thread.sleep(4000);
			
          // Edit User Profile
			
			driver.findElement(By.id("header-nameshortId1")).click();
			System.out.println("Clicking on Gear Button placed right top corner");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href = '/devtest/faces/private/user/profile.xhtml']/i")).click();
			System.out.println("Clicking on Settings icon");
			driver.findElement(By.xpath("//a[@class = 'dropdown-toggle profile-icons']/i")).click();
			System.out.println("Clicking on Setting icon");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),' Edit')]")).click();
			System.out.println("Clicking on Edit profile");
			Thread.sleep(1000);
			driver.findElement(By.id("user-profile-form:first-name")).clear();
			driver.findElement(By.id("user-profile-form:first-name")).sendKeys("Bright");
			driver.findElement(By.id("user-profile-form:last-name")).clear();
			driver.findElement(By.id("user-profile-form:last-name")).sendKeys("Lab");
			driver.findElement(By.id("user-profile-form:phoneNumber")).sendKeys("111.111.1111");
			driver.findElement(By.id("user-profile-form:country")).sendKeys("Oman");
			driver.findElement(By.id("user-profile-form:timezone")).sendKeys("(GMT-6:00) CST");
			driver.findElement(By.id("user-profile-form:validate")).click();
			Thread.sleep(5000);
			// Bowser.Close
						driver.quit();
	}
	*/

@Test
public void brightLab_ChangePassword() throws InterruptedException
{
//Running chrome driver server and launching chrome browser

System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

//Maximizing window

		driver.manage().window().maximize();
		
		//Navigating to project URL
		
		driver.get("https://dev.mconnectedlab.com/auth/");
		
		//Clicking on Login Link
		driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
		
			driver.findElement(By.id("loginForm:username")).sendKeys("testbrightlab1999@mailinator.com");
			driver.findElement(By.id("loginForm:password")).sendKeys("admin123");
			driver.findElement(By.id("signInButton")).click();
			Thread.sleep(5000);
//Change Password
			driver.findElement(By.id("header-nameshortId1")).click();
			System.out.println("Clicking on Gear Button placed right top corner");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href = '/devtest/faces/private/user/profile.xhtml']/i")).click();
			System.out.println("Clicking on Settings icon");
			driver.findElement(By.xpath("//a[@class = 'dropdown-toggle profile-icons']/i")).click();
			System.out.println("Clicking on Setting icon");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul[@class=\"dropdown-menu user-settings-wrapper\"]/li[1]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("change-password-form:currentPwd")).sendKeys("admin123");
			Thread.sleep(1000);
			driver.findElement(By.id("change-password-form:newPwd")).sendKeys("admin12345");
			Thread.sleep(1000);
			driver.findElement(By.id("change-password-form:repeatPwd")).sendKeys("admin12345");
			Thread.sleep(1000);
			driver.findElement(By.id("change-password-form:password-validate")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div/div[3]/div/div[1]/button")).click();
			Thread.sleep(1000);
			System.out.println("Click on User Settings and logout");
			driver.findElement(By.id("header-nameshortId1")).click();
			driver.findElement(By.id("logoutForm:logoutLink")).click();
			Thread.sleep(4000);
			// Handled Application bug through script
			driver.findElement(By.xpath("//*[@id=\"j_idt27\"]/ul/li[2]/a")).click();
			Thread.sleep(1000);
			System.out.println("Verify Weather the Password change by logging in to Application");
			//Re-Login
			driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]")).click();
			
			driver.findElement(By.id("loginForm:username")).sendKeys("testbrightlab1999@mailinator.com");
			driver.findElement(By.id("loginForm:password")).sendKeys("admin12345");
			driver.findElement(By.id("signInButton")).click();
			Thread.sleep(4000);
			
			//Revert to Previous Password
			
			System.out.println("Revert back to Previous Password");
			driver.findElement(By.id("header-nameshortId1")).click();
			System.out.println("Clicking on Gear Button placed right top corner");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href = '/devtest/faces/private/user/profile.xhtml']/i")).click();
			System.out.println("Clicking on Settings icon");
			driver.findElement(By.xpath("//a[@class = 'dropdown-toggle profile-icons']/i")).click();
			System.out.println("Clicking on Setting icon");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ul[@class=\"dropdown-menu user-settings-wrapper\"]/li[1]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("change-password-form:currentPwd")).sendKeys("admin12345");
			Thread.sleep(1000);
			driver.findElement(By.id("change-password-form:newPwd")).sendKeys("admin123");
			Thread.sleep(1000);
			driver.findElement(By.id("change-password-form:repeatPwd")).sendKeys("admin123");
			Thread.sleep(1000);
			driver.findElement(By.id("change-password-form:password-validate")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div/div[3]/div/div[1]/button")).click();
			Thread.sleep(1000);
			System.out.println("Click on User Settings and logout");
			driver.findElement(By.id("header-nameshortId1")).click();
			driver.findElement(By.id("logoutForm:logoutLink")).click();
			Thread.sleep(4000);
			// Handled Application bug through script
			driver.findElement(By.xpath("//*[@id=\"j_idt27\"]/ul/li[2]/a")).click();
			Thread.sleep(1000);
			// Bowser.Close
			driver.quit();


	}
}


