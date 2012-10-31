package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SignOut1 {
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
	public void testSignOut1() throws Exception {
		driver.get(baseUrl + "/f2-frontend/");
		driver.findElement(By.id("id.order.form.orderInformation.reference")).clear();
		driver.findElement(By.id("id.order.form.orderInformation.reference")).sendKeys("Test @ # $ % ^ & * ( )  - + ~");
		driver.findElement(By.id("gwt-uid-5")).click();
		driver.findElement(By.id("gwt-uid-9")).click();
		driver.findElement(By.id("id.order.form.orderedProduct.location.contactPerson")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.contactPerson")).sendKeys("Trang YEn");
		driver.findElement(By.id("id.order.form.orderedProduct.location.email")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.email")).sendKeys("yen.lt@esoftflow.com");
		driver.findElement(By.id("id.order.form.orderedProduct.location.telephone")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.telephone")).sendKeys("123456789");
		driver.findElement(By.id("id.order.form.orderedProduct.location.name")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.name")).sendKeys("Location");
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.address")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.address")).sendKeys("Address");
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.postalCode")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.postalCode")).sendKeys("1234");
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.city")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.city")).sendKeys("Yen Nhi");
		driver.findElement(By.id("id.order.form.orderInformation.approvalEmail")).clear();
		driver.findElement(By.id("id.order.form.orderInformation.approvalEmail")).sendKeys("yen.lt@esoftflow.com");
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
