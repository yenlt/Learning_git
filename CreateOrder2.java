package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOrder2 {
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
	public void testCreateOrder2() throws Exception {
		driver.get(baseUrl + "/f2/f2-frontend/");
		driver.findElement(By.id("id.signup.user.email")).clear();
		driver.findElement(By.id("id.signup.user.email")).sendKeys("all_roles@esoftsystems.com");
		driver.findElement(By.id("id.signup.user.password")).clear();
		driver.findElement(By.id("id.signup.user.password")).sendKeys("ctnlcosmos");
		driver.findElement(By.xpath("//div[@id='id.button.login']/span/span")).click();
		driver.findElement(By.id("id.order.form.reference")).clear();
		driver.findElement(By.id("id.order.form.reference")).sendKeys("Reference name");
		driver.findElement(By.id("gwt-uid-1")).click();
		driver.findElement(By.id("gwt-uid-5")).click();
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.contactPerson")).clear();
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.contactPerson")).sendKeys("Name of contact");
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.email")).click();
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.email")).clear();
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.email")).sendKeys("yen.lt@esoftflow.com");
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.telephone")).clear();
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.telephone")).sendKeys("2345566778");
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.name")).click();
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.name")).clear();
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.name")).sendKeys("Name location");
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.address.address")).clear();
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.address.address")).sendKeys("Ha Noi");
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.address.postalCode")).clear();
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.address.postalCode")).sendKeys("1233");
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.address.city")).clear();
		driver.findElement(By.id("id.order.form.orderedProductInputDto.location.address.city")).sendKeys("HN");
		driver.findElement(By.id("id.order.form.approvalEmail")).clear();
		driver.findElement(By.id("id.order.form.approvalEmail")).sendKeys("yen.lt@esoftflow.com");
		driver.findElement(By.id("id.order.form.orderInformation.comment")).click();
		driver.findElement(By.id("id.order.form.orderInformation.comment")).clear();
		driver.findElement(By.id("id.order.form.orderInformation.comment")).sendKeys("Comment");
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
