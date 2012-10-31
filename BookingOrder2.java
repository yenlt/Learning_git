package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingOrder2 {
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
	public void testBookingOrder2() throws Exception {
		driver.get(baseUrl + "/f2/f2-frontend/");
		driver.findElement(By.id("id.signup.user.email")).clear();
		driver.findElement(By.id("id.signup.user.email")).sendKeys("all_roles@esoftsystems.com");
		driver.findElement(By.id("id.signup.user.password")).click();
		driver.findElement(By.id("id.signup.user.password")).clear();
		driver.findElement(By.id("id.signup.user.password")).sendKeys("Pass1234");
		driver.findElement(By.id("id.signin.button.ok")).click();
		driver.findElement(By.id("id.order.form.orderInformation.reference")).clear();
		driver.findElement(By.id("id.order.form.orderInformation.reference")).sendKeys("19 Oct");
		driver.findElement(By.id("gwt-uid-1")).click();
		driver.findElement(By.id("gwt-uid-5")).click();
		driver.findElement(By.id("id.order.form.orderedProduct.location.contactPerson")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.contactPerson")).sendKeys("Contact Person");
		driver.findElement(By.id("id.order.form.orderedProduct.location.email")).click();
		driver.findElement(By.id("id.order.form.orderedProduct.location.email")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.email")).sendKeys("yen.lt@esoftflow.com");
		driver.findElement(By.id("id.order.form.orderedProduct.location.telephone")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.telephone")).sendKeys("123456789");
		driver.findElement(By.id("id.order.form.orderedProduct.location.name")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.name")).sendKeys("Name Location");
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.address")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.address")).sendKeys("Address");
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.postalCode")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.postalCode")).sendKeys("1234");
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.city")).clear();
		driver.findElement(By.id("id.order.form.orderedProduct.location.address.city")).sendKeys("HN");
		driver.findElement(By.id("id.order.form.orderInformation.approvalEmail")).clear();
		driver.findElement(By.id("id.order.form.orderInformation.approvalEmail")).sendKeys("yen.lt@esoftflow.com");
		driver.findElement(By.id("id.order.form.orderInformation.comment")).clear();
		driver.findElement(By.id("id.order.form.orderInformation.comment")).sendKeys("This is comment.\nI love living life .\nI'm happy :) .");
		driver.findElement(By.id("id.order.form.submit")).click();
		driver.findElement(By.id("id.signup.user.email")).clear();
		driver.findElement(By.id("id.signup.user.email")).sendKeys("booker@esoftsystems.com");
		driver.findElement(By.id("id.signup.user.password")).clear();
		driver.findElement(By.id("id.signup.user.password")).sendKeys("Pass1234");
		driver.findElement(By.id("id.signin.button.ok")).click();
		driver.findElement(By.cssSelector("div.v-filterselect-button")).click();
		driver.findElement(By.xpath("//div[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr[2]/td")).click();
		driver.findElement(By.cssSelector("button.v-datefield-button")).click();
		driver.findElement(By.xpath("//table[@id='PID_VAADIN_POPUPCAL']/tbody/tr[2]/td/table/tbody/tr[4]/td[7]/span")).click();
		driver.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).clear();
		driver.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).sendKeys("This is comment form New Booking.");
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
