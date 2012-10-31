package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SignIn {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://f2-test1.esoftsystems.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSignIn() throws Exception {
		driver.get(baseUrl + "/f2-frontend/");
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		try {
			assertEquals("", driver.findElement(By.id("id.signup.user.email")).getAttribute("value"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		assertEquals("", driver.findElement(By.id("id.signup.user.email")).getAttribute("value"));
		assertEquals("", driver.findElement(By.id("id.signup.user.email")).getText());
		// ERROR: Caught exception [ERROR: Unsupported command [getTable]]
		assertEquals("", driver.findElement(By.id("id.signup.user.password")).getAttribute("value"));
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		assertEquals("Log på", driver.findElement(By.xpath("//div[@id='f2frontend-9260702']/div/div[2]/div/div[2]/div/div/div/div/div/div/fieldset/div[3]/div/div/div/div/div/span/span")).getText());
		assertTrue(isElementPresent(By.xpath("//div[@id='f2frontend-9260702']/div/div[2]/div/div[2]/div/div/div/div/div/div/fieldset/div[3]/div/div/div/div/div/span/span")));
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		driver.findElement(By.id("id.signup.user.email")).clear();
		driver.findElement(By.id("id.signup.user.email")).sendKeys("all_roles@esoftsystems.com");
		driver.findElement(By.id("id.signup.user.password")).clear();
		driver.findElement(By.id("id.signup.user.password")).sendKeys("Pass123");
		driver.findElement(By.id("id.signup.user.password")).clear();
		driver.findElement(By.id("id.signup.user.password")).sendKeys("gff");
		driver.findElement(By.id("id.signup.user.password")).clear();
		driver.findElement(By.id("id.signup.user.password")).sendKeys("Pass1234");
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
		// ERROR: Caught exception [ERROR: Unsupported command [isTextPresent]]
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
