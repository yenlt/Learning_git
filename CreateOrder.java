package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOrder {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCreateOrder() throws Exception {
		driver.get(baseUrl + "/f2/f2-frontend/");
		driver.findElement(By.id("id.signup.user.email")).clear();
		driver.findElement(By.id("id.signup.user.email")).sendKeys("all_roles@esoftsystems.com");
		driver.findElement(By.id("id.signup.user.password")).clear();
		driver.findElement(By.id("id.signup.user.password")).sendKeys("Pass1234");
		driver.findElement(By.id("id.forms.order.orderInformation.reference")).clear();
		driver.findElement(By.id("id.forms.order.orderInformation.reference")).sendKeys("Reference_Order");
		driver.findElement(By.id("gwt-uid-1")).click();
		driver.findElement(By.id("gwt-uid-5")).click();
		driver.findElement(By.id("id.forms.order.orderedProduct.location.contactPerson")).clear();
		driver.findElement(By.id("id.forms.order.orderedProduct.location.contactPerson")).sendKeys("Name Contact person");
		driver.findElement(By.id("id.forms.order.orderedProduct.location.email")).clear();
		driver.findElement(By.id("id.forms.order.orderedProduct.location.email")).sendKeys("yen.lt@esoftflow.com");
		driver.findElement(By.id("id.forms.order.orderedProduct.location.telephone")).clear();
		driver.findElement(By.id("id.forms.order.orderedProduct.location.telephone")).sendKeys("01679199779");
		driver.findElement(By.id("id.forms.order.orderedProduct.location.name")).clear();
		driver.findElement(By.id("id.forms.order.orderedProduct.location.name")).sendKeys("Name of Location");
		driver.findElement(By.id("id.forms.order.orderedProduct.location.address.address")).clear();
		driver.findElement(By.id("id.forms.order.orderedProduct.location.address.address")).sendKeys("Address");
		driver.findElement(By.id("id.forms.order.orderedProduct.location.address.postalCode")).clear();
		driver.findElement(By.id("id.forms.order.orderedProduct.location.address.postalCode")).sendKeys("1234");
		driver.findElement(By.id("id.forms.order.orderedProduct.location.address.city")).clear();
		driver.findElement(By.id("id.forms.order.orderedProduct.location.address.city")).sendKeys("Ha Noi");
		driver.findElement(By.id("id.forms.order.orderInformation.approvalEmail")).clear();
		driver.findElement(By.id("id.forms.order.orderInformation.approvalEmail")).sendKeys("yen.lt@esoftflow.com");
		driver.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).click();
		driver.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).clear();
		driver.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).sendKeys("This is comment");
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
