package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOrder3 {
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
	public void testCreateOrder3() throws Exception {
		driver.get(baseUrl + "/f2/f2-frontend/");
		driver.findElement(By.id("id.reference")).clear();
		driver.findElement(By.id("id.reference")).sendKeys("Reference Name");
		driver.findElement(By.id("gwt-uid-10")).click();
		driver.findElement(By.id("gwt-uid-12")).click();
		driver.findElement(By.id("id.orderedProductInputDto.location.contactPerson")).clear();
		driver.findElement(By.id("id.orderedProductInputDto.location.contactPerson")).sendKeys("Name Contact person");
		driver.findElement(By.id("id.orderedProductInputDto.location.email")).click();
		driver.findElement(By.id("id.orderedProductInputDto.location.email")).clear();
		driver.findElement(By.id("id.orderedProductInputDto.location.email")).sendKeys("yen.lt@esoftflow.com");
		driver.findElement(By.id("id.orderedProductInputDto.location.telephone")).clear();
		driver.findElement(By.id("id.orderedProductInputDto.location.telephone")).sendKeys("123456789");
		driver.findElement(By.id("id.orderedProductInputDto.location.name")).click();
		driver.findElement(By.id("id.orderedProductInputDto.location.name")).clear();
		driver.findElement(By.id("id.orderedProductInputDto.location.name")).sendKeys("Name of location");
		driver.findElement(By.id("id.orderedProductInputDto.location.address.address")).click();
		driver.findElement(By.id("id.orderedProductInputDto.location.address.address")).clear();
		driver.findElement(By.id("id.orderedProductInputDto.location.address.address")).sendKeys("Address");
		driver.findElement(By.id("id.orderedProductInputDto.location.address.postalCode")).click();
		driver.findElement(By.id("id.orderedProductInputDto.location.address.postalCode")).clear();
		driver.findElement(By.id("id.orderedProductInputDto.location.address.postalCode")).sendKeys("1234");
		driver.findElement(By.id("id.orderedProductInputDto.location.address.city")).click();
		driver.findElement(By.id("id.orderedProductInputDto.location.address.city")).clear();
		driver.findElement(By.id("id.orderedProductInputDto.location.address.city")).sendKeys("HN");
		driver.findElement(By.id("id.approvalEmail")).click();
		driver.findElement(By.id("id.approvalEmail")).clear();
		driver.findElement(By.id("id.approvalEmail")).sendKeys("yen.lt@esoftflow.com");
		driver.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).click();
		driver.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).clear();
		driver.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).sendKeys("This is comment.");
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
