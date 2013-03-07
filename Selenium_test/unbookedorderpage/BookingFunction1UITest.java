//package com.esoftsystems.f2.uitest.unbookedorderpage;
//
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class BookingFunction1UITest extends AbstractSeleniumTest {
//	
//	public BookingFunction1UITest(BrowserType browserType) throws Exception {
//	    super(browserType);
//	}
//	public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//	
//// Booking order successfully.
//	@Test
//	public void testBookingOrderSuccessfully() throws Exception {
//		System.out.println("Test 1: testBookingOrderSuccessfully");		
//		testHelpers.login("booker@esoftsystems.com", "Pass1234");
//		// Click on "Unbooked Orders" link at left menu bar.	
//		driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//		Thread.sleep(1500);
//		// Before opening the popup window get the handle of main window and save it.
//		String parentWindowHandle1 = driver.getWindowHandle();		
//		// Click on Book button.
//		driver.findElement(By.id(elements.UNBOOKED_BOOK_BUTTON.toValue())).click();	
//		//Identify the New Booking pop up
//		WebDriver popup1 = testHelpers.findPopup("New Booking");
//		Thread.sleep(3000);
//		// Here we can perform operation in pop-up window.		
//		WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//		Thread.sleep(1500);
//		assertEquals("Wrong text present", "New Booking", element.getText());		
//		testHelpers.fillNewBookingForm(popup1, "11/30/12 08:54 AM");
//		popup1.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
//		// Assert notification message present: The new booking was created successfully
//		Thread.sleep(1500);
//		WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//		assertEquals("Wrong text present","The new booking was created successfully", element1.getText());
//		driver.switchTo().window(parentWindowHandle1);		
//		// Log out
//		testHelpers.logout();
//	}
//
////	// Booking order with blank Photographer name.
////	@Test
////	public void testBookingOrderwithBlankPhotographerName() throws Exception {
////		System.out.println("Test 2: testBookingOrderwithBlankPhotographerName");
////		testHelpers.login("booker@esoftsystems.com", "Pass1234");
////		// Click on "Unbooked Orders" link at left menu bar.	
////		driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
////		// Before opening the popup window get the handle of main window and save it.
////		String parentWindowHandle1 = driver.getWindowHandle();
////		Thread.sleep(1500);
////		driver.findElement(By.id(elements.UNBOOKED_BOOK_BUTTON.toValue())).click();
////		WebDriver popup1 = testHelpers.findPopup("New Booking");
////		// Here you can perform operation in pop-up window
////		// Drop down list : Photographer name.
////		Thread.sleep(1500);
////		popup1.findElement(	By.xpath("//div[@id = 'id.booking.form.photographerName']/input")).sendKeys("");
////		// Booking date&time box
////		popup1.findElement(	By.xpath("//div[@id = 'id.booking.form.bookingTime']/input")).sendKeys("11/30/12 08:54 AM");
////		popup1.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();		
////		// Assert notification message present: Photographer name cannot be empty.
////		Thread.sleep(1500);
////		WebElement element1 = popup1.findElement(By.xpath("//div[@class = 'v-form-errormessage']/div"));
////		assertEquals("Wrong text present","Photographer name cannot be empty.", element1.getText());
////		driver.switchTo().window(parentWindowHandle1);
////
////	}
////
////	// Booking order with blank Date&Time.
////	@Test
////	public void testBookingOrderwithBlankDateandTime() throws Exception {
////		System.out.println("Test 3: testBookingOrderwithBlankDateandTime");
////		testHelpers.login("booker@esoftsystems.com", "Pass1234");
////		// Click on "Unbooked Orders" link at left menu bar.	
////		driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
////		Thread.sleep(1500);
////		driver.findElement(By.id(elements.UNBOOKED_BOOK_BUTTON.toValue())).click();
////		// Before opening the popup window get the handle of main window and save it.
////		String parentWindowHandle1 = driver.getWindowHandle();
////		WebDriver popup1 = testHelpers.findPopup("New Booking");
////		Thread.sleep(1500);
////		// Here you can perform operation in pop-up window.		
////		testHelpers.fillNewBookingForm(popup1, "");		
////		popup1.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
////		Thread.sleep(1500);
////		// Assert notification message present		
////		WebElement element1 = popup1.findElement(By.xpath("//div[@class = 'v-form-errormessage']/div"));
////		// Assert notification message present: Booking date and time cannot be empty.
////		assertEquals("Wrong text present","Booking date and time cannot be empty.", element1.getText());
////		driver.switchTo().window(parentWindowHandle1);
////	}
////
////	// Booking order with invalid Date and Time: wrong format of date&time .
////	@Test
////	public void testBookingOrderwithInvalidDateandTime1() throws Exception {
////		System.out.println("Test 4: testBookingOrderwithInvalidDateandTime1");
////		testHelpers.login("booker@esoftsystems.com", "Pass1234");
////		// Click on "Unbooked Orders" link at left menu bar.	
////		driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
////		Thread.sleep(1500);
////		driver.findElement(By.id(elements.UNBOOKED_BOOK_BUTTON.toValue())).click();
////		// Before opening the popup window get the handle of main window and save it.
////		String parentWindowHandle1 = driver.getWindowHandle();
////		WebDriver popup1 = testHelpers.findPopup("New Booking");
////		 Thread.sleep(1500);
////		// Here you can perform operation in pop-up window		
////		testHelpers.fillNewBookingForm(popup1, "28-10-12 10:47");
////		popup1.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
////		Thread.sleep(1500);
////		// Assert notification message present
////		WebElement element1 = popup1.findElement(By.xpath("//div[@class = 'v-form-errormessage']/div"));
////		// Assert notification message present: Date format not recognized
////		assertEquals("Wrong text present", "Date format not recognized",element1.getText());
////		driver.switchTo().window(parentWindowHandle1);
////
////	}
////
////	// Booking order with invalid Date and Time: wrong format of date&time .
////	@Test
////	public void testBookingOrderwithInvalidDateandTime2() throws Exception {
////		System.out.println("Test 5: testBookingOrderwithInvalidDateandTime2");
////		testHelpers.login("booker@esoftsystems.com", "Pass1234");
////		// Click on "Unbooked Orders" link at left menu bar.	
////		driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
////		Thread.sleep(1500);
////		driver.findElement(By.id(elements.UNBOOKED_BOOK_BUTTON.toValue())).click();
////		// Before opening the popup window get the handle of main window and save it.
////		Thread.sleep(1500);
////		String parentWindowHandle1 = driver.getWindowHandle();
////		WebDriver popup1 = testHelpers.findPopup("New Booking");
////		Thread.sleep(1500);
////		// Here you can perform operation in pop-up window		
////		testHelpers.fillNewBookingForm(popup1, "10/12/12");		
////		popup1.findElement(	By.xpath("//div[@id = 'id.button.submit']/span/span")).click();		
////		// Assert notification message present
////		WebElement element1 = popup1.findElement(By.xpath("//div[@class = 'v-form-errormessage']/div"));
////		// Assert notification message present: Date format not recognized
////		assertEquals("Wrong text present", "Date format not recognized",element1.getText());
////		driver.switchTo().window(parentWindowHandle1);	
////	}
////
////	// Booking order with invalid Date and Time mix text and number.
////	@Test
////	public void testBookingOrderwithInvalidDateandTime3() throws Exception {
////		System.out.println("Test 6: testBookingOrderwithInvalidDateandTime3");
////		testHelpers.login("booker@esoftsystems.com", "Pass1234");
////		// Click on "Unbooked Orders" link at left menu bar.	
////		driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
////		Thread.sleep(1500);
////		driver.findElement(By.id(elements.UNBOOKED_BOOK_BUTTON.toValue())).click();
////		// Before opening the popup window get the handle of main window and
////		// save it.
////		String parentWindowHandle1 = driver.getWindowHandle();
////		WebDriver popup1 = testHelpers.findPopup("New Booking");
////		// here you can perform operation in pop-up window
////		// action in pop up window
////		 Thread.sleep(1500);
////		 testHelpers.fillNewBookingForm(popup1, "agadfg@ ererer-we 23446");
////		Thread.sleep(1500);
////		popup1.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();		
////		// Assert notification message present
////		WebElement element1 = popup1.findElement(By.xpath("//div[@class = 'v-form-errormessage']/div"));
////		// Assert notification message present: Date format not recognized
////		assertEquals("Wrong text present", "Date format not recognized",element1.getText());
////		driver.switchTo().window(parentWindowHandle1);		
////	}	 
//
//}
