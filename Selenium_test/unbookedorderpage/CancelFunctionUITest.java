//package com.esoftsystems.f2.uitest.unbookedorderpage;
//
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class CancelFunctionUITest extends AbstractSeleniumTest {
//
//	public CancelFunctionUITest(BrowserType browserType) throws Exception {
//		super(browserType);
//	}
//
//	public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//
//	// Cancel Order successfully.
//	@Test
//	public void testDisplayCancelOrderPopUp() throws Exception {
//		System.out.println("Test 1: testDisplayCancelOrderPopUp");
//		testHelpers.login("booker@esoftsystems.com", "Pass1234");
//		// Click on "Unbooked Orders" link at left menu bar.
//		driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//		Thread.sleep(1500);
//		// Before opening the popup window get the handle of main window and
//		// save it.
//		String parentWindowHandle1 = driver.getWindowHandle();
//		// Click on Cancel button.
//		driver.findElement(By.id(elements.CANCEL_BUTTON.toValue())).click();
//		// Identify the Cancel pop up
//		WebDriver popup1 = testHelpers.findPopup("Cancel Order");
//		// Here we can perform operation in pop-up window.
//		WebElement element = popup1.findElement(By.xpath("//div[@class ='v-window-header']"));
//		assertEquals("Wrong text present", "Cancel Order", element.getText());
//		popup1.findElement(By.id("id.button.ok")).click();		
//		driver.switchTo().window(parentWindowHandle1);
//		// Assert pop up window New parking is closed. and turn back to Unbooker
//		// Orders page.
//		WebElement element1 = driver.findElement(By.id("id.leftmenuitem.unbooked.orders"));
//		assertEquals("Wrong text present", "Unbooked Orders",element1.getText());
//	}
//
//	// Close the Cancel Order popup
//	@Test
//	public void testCloseCancelOrderPopUp() throws Exception {
//		System.out.println("Test 2: testCloseCancelOrderPopUp");
//		testHelpers.login("booker@esoftsystems.com", "Pass1234");
//		// Click on "Unbooked Orders" link at left menu bar.
//		driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//		Thread.sleep(1500);
//		// Before opening the popup window get the handle of main window and
//		// save it.
//		String parentWindowHandle1 = driver.getWindowHandle();
//		// Click on cancel button.
//		driver.findElement(By.id(elements.CANCEL_BUTTON.toValue())).click();
//		// Identify the Cancel pop up
//		WebDriver popup1 = testHelpers.findPopup("Cancel Order");
//		// Here we can perform operation in pop-up window.
//		WebElement element = popup1.findElement(By.xpath("//div[@class ='v-window-header']"));
//		assertEquals("Wrong text present", "Cancel Order", element.getText());
//		popup1.findElement(By.id("id.button.cancel")).click();
//		driver.switchTo().window(parentWindowHandle1);
//		// Assert pop up window New parking is closed. and turn back to Unbooker
//		// Orders page.
//		WebElement element1 = driver.findElement(By.id("id.leftmenuitem.unbooked.orders"));
//		assertEquals("Wrong text present", "Unbooked Orders",element1.getText());
//
//	}
//
//}