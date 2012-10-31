package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingOrder1 {
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
	public void testBookingOrder1() throws Exception {
		driver.get(baseUrl + "/f2/f2-frontend/");
		driver.findElement(By.cssSelector("div.v-filterselect-button")).click();
		driver.findElement(By.xpath("//div[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr[2]/td/span")).click();
		driver.findElement(By.cssSelector("button.v-datefield-button")).click();
		driver.findElement(By.xpath("//table[@id='PID_VAADIN_POPUPCAL']/tbody/tr[2]/td/table/tbody/tr[4]/td[7]/span")).click();
		driver.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).clear();
		driver.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).sendKeys("This is comment from New Booking order");
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
