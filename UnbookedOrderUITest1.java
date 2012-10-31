//package com.esoftsystems.f2.uitest.signin;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;
//import org.junit.*;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class UnbookedOrderUITest {
//	private WebDriver driver;
//	private String baseUrl;
//	private StringBuffer verificationErrors = new StringBuffer();
//	@Before
//	public void setUp() throws Exception {
//		driver = new FirefoxDriver();
//		//baseUrl = "http://localhost:8080/";
//		baseUrl = "http://f2-test1.esoftsystems.com/f2-frontend/";
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//
//	@Test
//	public void testBookingOrder2() throws Exception {
//		driver.get(baseUrl);
//		driver.findElement(By.id("id.signup.user.email")).clear();
//		driver.findElement(By.id("id.signup.user.email")).sendKeys(
//				"booker@esoftsystems.com");
//		driver.findElement(By.id("id.signup.user.password")).clear();
//		driver.findElement(By.id("id.signup.user.password")).sendKeys(
//				"Pass1234");
//		driver.findElement(By.id("id.button.login")).click();
////		driver.findElement(
////				By.id("id.button.book.83395093-1957-4d72-a56f-b030abc0aed8"))
////				.click();
//		
//		driver.findElement(By.xpath("//div[@class= 'v-table-body-noselection']/table/tbody/tr/td[9]/div/div/div/div/div/div/span")).click();
//
//		// Identify the New Booking pop up
//		// Before opening the popup window get the handle of main window and
//		// save it.
//		String parentWindowHandle1 = driver.getWindowHandle();   
//		System.out.print("parentWindowHandle1: " + parentWindowHandle1);
//		WebDriver popup1 = null;
//		Set<String> windowids1 = driver.getWindowHandles();
//		Iterator<String> windowIterator1 = windowids1.iterator();
//		System.out.print("windowIterator1: " + windowIterator1);
//		
//		while (windowIterator1.hasNext()) {
//			String popupHandle1 = windowIterator1.next();
//			popup1 = driver.switchTo().window(popupHandle1);
//			System.out.print("popup1: " + popup1);
//			 if (popup1.getTitle().equals("Ny booking")){
//				 break;
//				 }						
//		}	
//		// here you can perform operation in pop-up window
//		// action in pop up window	
//				WebElement element = popup1.findElement(By
//						.xpath("/html/body/div[4]/div/div/div/div[2]/div"));
//				assertEquals("Wrong text present", "Ny booking",
//						element.getText());
//				Thread.sleep(1500);
//				// Drop down list : Photographer name.
//
//				popup1.findElement(
//						By.xpath("//div[@class='v-filterselect-button']"))
//						.click();
//				// Choose one option in drop down list.
//				popup1.findElement(
//						By.xpath("//div[@class='v-filterselect-suggestmenu']/table/tbody/tr[5]/td/span"))
//						.click();
//
//				// Drop down list: Booking date and time
//
////				popup1.findElement(
////						By.xpath("//div[@id = 'id.booking.form.bookingTime']/button[@class='v-datefield-button']"))
////						.click();
//				
//				//popup1.findElement(By.id("id.booking.form.bookingTime")).sendKeys("28/10/12");
//				//div/div/table/tbody/tr[2]/td[3]/div/input
//				popup1.findElement(By.xpath("//div/div/table/tbody/tr[2]/td[3]/div[@id = 'id.booking.form.bookingTime']/input")).sendKeys("28-10-12 10:47");
//				
//				Thread.sleep(1500);
//
//				popup1.findElement(By.id("id.booking.form.comment")).sendKeys("This is comment.");
//				Thread.sleep(1500);
//				
//				popup1.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
//				
//				Thread.sleep(1500);
//				driver.close();
//				driver.switchTo().window(parentWindowHandle1);
//				// Assert notification message present
//				
//				WebElement element1 = driver.findElement(By.xpath("div[@class = 'gwt-HTML']/h1"));
//				assertEquals("Wrong text present", "Den nye booking blev oprettet",element1.getText());
//				
////				String parentWindowHandle2 = driver.getWindowHandle();   
////				WebDriver popup2 = null;
////				Set<String> windowids2 = driver.getWindowHandles();
////				Iterator<String> windowIterator2 = windowids2.iterator();	
////				
////				while (windowIterator2.hasNext()){
////					String popupHandle2 = windowIterator2.next();
////					popup2 = driver.switchTo().window(popupHandle2); 
////					System.out.print(popup2.)
////					 if (popup2.getTitle().equals("Ny booking")){
////						 break;
////						 }						
////				}
////				
////				popup2.findElement(
////						By.xpath("//table[@id = 'PID_VAADIN_POPUPCAL']/tbody/tr[2]/td[@class ='v-datefield-calendarpanel-body']/table/tbody/tr[6]/td[5]"))
////						.click();
//				
//				// After finished operation in pop-up just select the main
//				// window again
////				driver.close();
////				driver.switchTo().window(parentWindowHandle1);
//		
////		while (windowIterator1.hasNext()) {
////
////			String popupHandle1 = windowIterator1.next();
////			
////			if (!popupHandle1.contains(parentWindowHandle1)) {
////
////				popup1 = driver.switchTo().window(popupHandle1);
//
////				// here you can perform operation in pop-up window
////				// action in pop up window				
////				
////				WebElement element = popup1.findElement(By
////						.xpath("/html/body/div[4]/div/div/div/div[2]/div"));
////				assertEquals("Wrong text present", "Ny booking",
////						element.getText());
////
////				Thread.sleep(1500);
////
////				// Identify the Date & Time pop-up
////				String parentWindowHandle2 = driver.getWindowHandle();
////				WebDriver popup2 = null;
////				Set<String> windowids2 = driver.getWindowHandles();
////				Iterator<String> windowIterator2 = windowids2.iterator();
////				while (windowIterator2.hasNext()) {
////					String popupHandle2 = windowIterator2.next();
////					if (!popupHandle2.contains(parentWindowHandle2)) {
////						popup2 = driver.switchTo().window(popupHandle2);
////						popup2.findElement(
////								By.xpath("//table[@id = 'PID_VAADIN_POPUPCAL']/tbody/tr[2]/td[@class ='v-datefield-calendarpanel-body']/table/tbody/tr[6]/td[5]"))
////								.click();
////						// After finished operation in pop-up just select the
////						// main window again
//////						popup1.close();
//////						popup1.switchTo().window(parentWindowHandle2);
////					}
////				}				
////			
////		
////		// After finished operation in pop-up just select the main
////		// window again
////		driver.close();
////		driver.switchTo().window(parentWindowHandle1);
////
////		// popup.findElement(By.cssSelector("button.v-datefield-button")).click();
////		// popup.findElement(By.xpath("//table[@id='PID_VAADIN_POPUPCAL']/tbody/tr[2]/td/table/tbody/tr[4]/td[7]/span")).click();
////		// popup.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).clear();
////		// popup.findElement(By.cssSelector("textarea.v-textarea.v-textarea-focus")).sendKeys("This is comment form New Booking.");
////		//
//
//	}
//
//	// Booking order with blank Photographer name.
//	@Test
//	public void testBookingOrderwithBlankPhotographerName() throws Exception {
//		System.out.println("Test 2");
//		driver.get(baseUrl);
//		driver.findElement(By.id("id.signup.user.email")).clear();
//		driver.findElement(By.id("id.signup.user.email")).sendKeys(
//				"booker@esoftsystems.com");
//		driver.findElement(By.id("id.signup.user.password")).clear();
//		driver.findElement(By.id("id.signup.user.password")).sendKeys(
//				"Pass1234");
//		driver.findElement(By.id("id.button.login")).click();
//		driver.findElement(
//				By.xpath("//div[@class= 'v-table-body-noselection']/table/tbody/tr/td[9]/div/div/div/div/div/div/span"))
//				.click();
//
//		// Identify the New Booking pop up
//		// Before opening the popup window get the handle of main window and
//		// save it.
//		String parentWindowHandle1 = driver.getWindowHandle();
//		System.out.print("parentWindowHandle1: " + parentWindowHandle1);
//		WebDriver popup1 = null;
//		Set<String> windowids1 = driver.getWindowHandles();
//		Iterator<String> windowIterator1 = windowids1.iterator();
//		System.out.print("windowIterator1: " + windowIterator1);
//
//		while (windowIterator1.hasNext()) {
//			String popupHandle1 = windowIterator1.next();
//			popup1 = driver.switchTo().window(popupHandle1);
//			System.out.print("popup1: " + popup1);
//			if (popup1.getTitle().equals("Ny booking")) {
//				break;
//			}
//		}
//		// here you can perform operation in pop-up window
//		// action in pop up window
//		WebElement element = popup1.findElement(By
//				.xpath("/html/body/div[4]/div/div/div/div[2]/div"));
//		assertEquals("Wrong text present", "Ny booking", element.getText());
//		Thread.sleep(1500);
//		// Drop down list : Photographer name.
//		// div/div/table/tbody/tr/td[3]/div/input
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.booking.form.photographerName']/input"))
//				.sendKeys("");
//		// Drop down list: Booking date and time
//
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.booking.form.bookingTime']/input"))
//				.sendKeys("28-10-12 10:47");
//
//		Thread.sleep(1500);
//
//		popup1.findElement(By.id("id.booking.form.comment")).sendKeys(
//				"This is comment.");
//		Thread.sleep(1500);
//
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
//
//		Thread.sleep(1500);
//		driver.close();
//		driver.switchTo().window(parentWindowHandle1);
//		// Assert notification message present
//		WebElement element1 = popup1.findElement(By
//				.xpath("//div[@class = 'v-form-errormessage']/div"));
//		assertEquals("Wrong text present", "Fotograf kan ikke være tomt.",
//				element1.getText());
//
//	}
//
//	// Booking order with blank Date&Time.
//	@Test
//	public void testBookingOrderwithBlankDateandTime() throws Exception {
//		driver.get(baseUrl);
//		driver.findElement(By.id("id.signup.user.email")).clear();
//		driver.findElement(By.id("id.signup.user.email")).sendKeys(
//				"booker@esoftsystems.com");
//		driver.findElement(By.id("id.signup.user.password")).clear();
//		driver.findElement(By.id("id.signup.user.password")).sendKeys(
//				"Pass1234");
//		driver.findElement(By.id("id.button.login")).click();
//		driver.findElement(
//				By.xpath("//div[@class= 'v-table-body-noselection']/table/tbody/tr/td[9]/div/div/div/div/div/div/span"))
//				.click();
//
//		// Identify the New Booking pop up
//		// Before opening the popup window get the handle of main window and
//		// save it.
//		String parentWindowHandle1 = driver.getWindowHandle();
//		System.out.print("parentWindowHandle1: " + parentWindowHandle1);
//		WebDriver popup1 = null;
//		Set<String> windowids1 = driver.getWindowHandles();
//		Iterator<String> windowIterator1 = windowids1.iterator();
//		System.out.print("windowIterator1: " + windowIterator1);
//
//		while (windowIterator1.hasNext()) {
//			String popupHandle1 = windowIterator1.next();
//			popup1 = driver.switchTo().window(popupHandle1);
//			System.out.print("popup1: " + popup1);
//			if (popup1.getTitle().equals("Ny booking")) {
//				break;
//			}
//		}
//		// here you can perform operation in pop-up window
//		// action in pop up window
//		WebElement element = popup1.findElement(By
//				.xpath("/html/body/div[4]/div/div/div/div[2]/div"));
//		assertEquals("Wrong text present", "Ny booking", element.getText());
//		Thread.sleep(1500);
//		// Drop down list : Photographer name.
//
//		popup1.findElement(By.xpath("//div[@class='v-filterselect-button']"))
//				.click();
//		// Choose one option in drop down list.
//		popup1.findElement(
//				By.xpath("//div[@class='v-filterselect-suggestmenu']/table/tbody/tr[5]/td/span"))
//				.click();
//		// Booking date and time box.
//
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.booking.form.bookingTime']/input"))
//				.sendKeys("");
//
//		Thread.sleep(1500);
//
//		popup1.findElement(By.id("id.booking.form.comment")).sendKeys(
//				"This is comment.");
//		Thread.sleep(1500);
//
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
//
//		Thread.sleep(1500);
//		driver.close();
//		driver.switchTo().window(parentWindowHandle1);
//		// Assert notification message present
//		WebElement element1 = popup1.findElement(By
//				.xpath("//div[@class = 'v-form-errormessage']/div"));
//		// Booking date and time cannot be empty.
//		assertEquals("Wrong text present",
//				"Booking dato og tid kan ikke være tomt.", element1.getText());
//
//	}
//
//	// Booking order with blank Photographer name and Blank Date&Time.
//	@Test
//	public void testBookingOrderwithoutRequiredFields() throws Exception {
//		driver.get(baseUrl);
//		driver.findElement(By.id("id.signup.user.email")).clear();
//		driver.findElement(By.id("id.signup.user.email")).sendKeys(
//				"booker@esoftsystems.com");
//		driver.findElement(By.id("id.signup.user.password")).clear();
//		driver.findElement(By.id("id.signup.user.password")).sendKeys(
//				"Pass1234");
//		driver.findElement(By.id("id.button.login")).click();
//		driver.findElement(
//				By.xpath("//div[@class= 'v-table-body-noselection']/table/tbody/tr/td[9]/div/div/div/div/div/div/span"))
//				.click();
//
//		// Identify the New Booking pop up
//		// Before opening the popup window get the handle of main window and
//		// save it.
//		String parentWindowHandle1 = driver.getWindowHandle();
//		System.out.print("parentWindowHandle1: " + parentWindowHandle1);
//		WebDriver popup1 = null;
//		Set<String> windowids1 = driver.getWindowHandles();
//		Iterator<String> windowIterator1 = windowids1.iterator();
//		System.out.print("windowIterator1: " + windowIterator1);
//
//		while (windowIterator1.hasNext()) {
//			String popupHandle1 = windowIterator1.next();
//			popup1 = driver.switchTo().window(popupHandle1);
//			System.out.print("popup1: " + popup1);
//			if (popup1.getTitle().equals("Ny booking")) {
//				break;
//			}
//		}
//		// here you can perform operation in pop-up window
//		// action in pop up window
//		WebElement element = popup1.findElement(By
//				.xpath("/html/body/div[4]/div/div/div/div[2]/div"));
//		assertEquals("Wrong text present", "Ny booking", element.getText());
//		Thread.sleep(1500);
//		// Drop down list : Photographer name.
//		// div/div/table/tbody/tr/td[3]/div/input
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.booking.form.photographerName']/input"))
//				.sendKeys("");
//		// Drop down list: Booking date and time
//
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.booking.form.bookingTime']/input"))
//				.sendKeys("");
//
//		Thread.sleep(1500);
//
//		popup1.findElement(By.id("id.booking.form.comment")).sendKeys(
//				"This is comment.");
//		Thread.sleep(1500);
//
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
//
//		Thread.sleep(1500);
//		driver.close();
//		driver.switchTo().window(parentWindowHandle1);
//		// Assert notification message present
//		WebElement element1 = popup1.findElement(By
//				.xpath("//div[@class = 'v-form-errormessage']/div"));
//		// There are errors when committing form.
//		assertEquals("Wrong text present", "Fotograf kan ikke være tomt.",
//				element1.getText());
//
//	}
//
//	// Booking order with invalid Date and Time
//	@Test
//	public void testBookingOrderwithInvalidDateandTime1() throws Exception {
//		driver.get(baseUrl);
//		driver.findElement(By.id("id.signup.user.email")).clear();
//		driver.findElement(By.id("id.signup.user.email")).sendKeys(
//				"booker@esoftsystems.com");
//		driver.findElement(By.id("id.signup.user.password")).clear();
//		driver.findElement(By.id("id.signup.user.password")).sendKeys(
//				"Pass1234");
//		driver.findElement(By.id("id.button.login")).click();
//		driver.findElement(
//				By.xpath("//div[@class= 'v-table-body-noselection']/table/tbody/tr/td[9]/div/div/div/div/div/div/span"))
//				.click();
//
//		// Identify the New Booking pop up
//		// Before opening the popup window get the handle of main window and
//		// save it.
//		String parentWindowHandle1 = driver.getWindowHandle();
//		System.out.print("parentWindowHandle1: " + parentWindowHandle1);
//		WebDriver popup1 = null;
//		Set<String> windowids1 = driver.getWindowHandles();
//		Iterator<String> windowIterator1 = windowids1.iterator();
//		System.out.print("windowIterator1: " + windowIterator1);
//
//		while (windowIterator1.hasNext()) {
//			String popupHandle1 = windowIterator1.next();
//			popup1 = driver.switchTo().window(popupHandle1);
//			System.out.print("popup1: " + popup1);
//			if (popup1.getTitle().equals("Ny booking")) {
//				break;
//			}
//		}
//		// here you can perform operation in pop-up window
//		// action in pop up window
//		WebElement element = popup1.findElement(By
//				.xpath("/html/body/div[4]/div/div/div/div[2]/div"));
//		assertEquals("Wrong text present", "Ny booking", element.getText());
//		Thread.sleep(1500);
//		// Drop down list : Photographer name.
//		// div/div/table/tbody/tr/td[3]/div/input
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.booking.form.photographerName']/input"))
//				.sendKeys("f2 photographer");
//		// Drop down list: Booking date and time
//
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.booking.form.bookingTime']/input"))
//				.sendKeys("gfdgdf434 45546");
//
//		Thread.sleep(1500);
//
//		popup1.findElement(By.id("id.booking.form.comment")).sendKeys(
//				"This is comment.");
//		Thread.sleep(1500);
//
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
//
//		Thread.sleep(1500);
//		driver.close();
//		driver.switchTo().window(parentWindowHandle1);
//		// Assert notification message present
//		WebElement element1 = popup1.findElement(By
//				.xpath("//div[@class = 'v-form-errormessage']/div"));
//		// Date format not recognized
//
//		assertEquals("Wrong text present", "Date format not recognized",
//				element1.getText());
//
//	}
//
//	// Booking order with invalid Date and Time
//	@Test
//	public void testBookingOrderwithInvalidDateandTime2() throws Exception {
//		driver.get(baseUrl);
//		driver.findElement(By.id("id.signup.user.email")).clear();
//		driver.findElement(By.id("id.signup.user.email")).sendKeys(
//				"booker@esoftsystems.com");
//		driver.findElement(By.id("id.signup.user.password")).clear();
//		driver.findElement(By.id("id.signup.user.password")).sendKeys(
//				"Pass1234");
//		driver.findElement(By.id("id.button.login")).click();
//		driver.findElement(
//				By.xpath("//div[@class= 'v-table-body-noselection']/table/tbody/tr/td[9]/div/div/div/div/div/div/span"))
//				.click();
//
//		// Identify the New Booking pop up
//		// Before opening the popup window get the handle of main window and
//		// save it.
//		String parentWindowHandle1 = driver.getWindowHandle();
//		System.out.print("parentWindowHandle1: " + parentWindowHandle1);
//		WebDriver popup1 = null;
//		Set<String> windowids1 = driver.getWindowHandles();
//		Iterator<String> windowIterator1 = windowids1.iterator();
//		System.out.print("windowIterator1: " + windowIterator1);
//
//		while (windowIterator1.hasNext()) {
//			String popupHandle1 = windowIterator1.next();
//			popup1 = driver.switchTo().window(popupHandle1);
//			System.out.print("popup1: " + popup1);
//			if (popup1.getTitle().equals("Ny booking")) {
//				break;
//			}
//		}
//		// here you can perform operation in pop-up window
//		// action in pop up window
//		WebElement element = popup1.findElement(By
//				.xpath("/html/body/div[4]/div/div/div/div[2]/div"));
//		assertEquals("Wrong text present", "Ny booking", element.getText());
//		Thread.sleep(1500);
//		// Drop down list : Photographer name.
//		// div/div/table/tbody/tr/td[3]/div/input
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.booking.form.photographerName']/input"))
//				.sendKeys("f2 photographer");
//		// Drop down list: Booking date and time
//
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.booking.form.bookingTime']/input"))
//				.sendKeys("10/12/12");
//
//		Thread.sleep(1500);
//
//		popup1.findElement(By.id("id.booking.form.comment")).sendKeys(
//				"This is comment.");
//		Thread.sleep(1500);
//
//		popup1.findElement(
//				By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
//
//		Thread.sleep(1500);
//		driver.close();
//		driver.switchTo().window(parentWindowHandle1);
//		// Assert notification message present
//		WebElement element1 = popup1.findElement(By
//				.xpath("//div[@class = 'v-form-errormessage']/div"));
//		// Date format not recognized
//
//		assertEquals("Wrong text present", "Date format not recognized",
//				element1.getText());
//
//	}
	
//	@After
//	public void tearDown() throws Exception {
//		driver.quit();
//		String verificationErrorString = verificationErrors.toString();
//		if (!"".equals(verificationErrorString)) {
//			fail(verificationErrorString);
//		}
//	}
//
//	private boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}
//}