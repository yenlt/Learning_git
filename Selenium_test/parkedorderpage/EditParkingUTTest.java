//package com.esoftsystems.f2.uitest.parkedorderpage;
//
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class EditParkingUTTest extends AbstractSeleniumTest {
//
//	public EditParkingUTTest(BrowserType browserType) throws Exception {
//		super(browserType);
//	}
//
//	public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//
//	// Edit Parking order successfully.
//	@Test
//	public void testEditParkingOrderSuccessfully() throws Exception {
//	  System.out.println("Test 1: testBookingOrderSuccessfully");  
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.parkOrder();  
//    Thread.sleep(1500);   
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    
//    // Click on "Parked Orders" link at left menu bar.    
//    driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();   
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();  
//    String EditParkedButton = "id.button.edit_parking." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(EditParkedButton)));
//    // Click on Edit Park button.
//    driver.findElement(By.id(EditParkedButton)).click();	
//		
//		// Identify the New Parking pop up
//		WebDriver popup1 = testHelpers.findPopup("Edit parking");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    //waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "Edit parking", element.getText());    
//    testHelpers.fillNewParkingForm(popup1, "2/28/14", "This is comment");
//    Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//    assertEquals("Wrong text present","The parking was updated successfully", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);  
//    testHelpers.logout();
//    
//	}
//
//	// Edit Parking order with blank activation date.
//	@Test
//	public void testActivationDateBlank() throws Exception {
//	  System.out.println("Test 2: testActivationDateBlank");  
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.parkOrder();  
//    Thread.sleep(1500);   
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    
//    // Click on "Parked Orders" link at left menu bar.    
//    driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();   
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();  
//    String EditParkedButton = "id.button.edit_parking." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(EditParkedButton)));
//    // Click on Edit Park button.
//    driver.findElement(By.id(EditParkedButton)).click();  
//    
//    // Identify the New Parking pop up
//    WebDriver popup1 = testHelpers.findPopup("Edit parking");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    //waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "Edit parking", element.getText());    
//    testHelpers.fillNewParkingForm(popup1, "", "This is comment");
//    Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);  
//    testHelpers.logout();
//    
//	}
//
//	// Edit Parking order with blank comment field.
//	@Test
//	public void testCommentFieldBlank() throws Exception {
//    System.out.println("Test 3: testCommentFieldBlank");  
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.parkOrder();  
//    Thread.sleep(1500);   
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    
//    // Click on "Parked Orders" link at left menu bar.    
//    driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();   
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();  
//    String EditParkedButton = "id.button.edit_parking." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(EditParkedButton)));
//    // Click on Edit Park button.
//    driver.findElement(By.id(EditParkedButton)).click();  
//    
//    // Identify the New Parking pop up
//    WebDriver popup1 = testHelpers.findPopup("Edit parking");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    //waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "Edit parking", element.getText());    
//    testHelpers.fillNewParkingForm(popup1, "2/28/14", "");
//    Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);  
//    testHelpers.logout();
//	}
//
//	// Edit Parking order with all Required fields are blank.
//	@Test
//	public void testRequiedFieldBlank() throws Exception {
//	  System.out.println("Test 4: testRequiedFieldBlank");  
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.parkOrder();  
//    Thread.sleep(1500);   
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    
//    // Click on "Parked Orders" link at left menu bar.    
//    driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();   
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();  
//    String EditParkedButton = "id.button.edit_parking." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(EditParkedButton)));
//    // Click on Edit Park button.
//    driver.findElement(By.id(EditParkedButton)).click();  
//    
//    // Identify the New Parking pop up
//    WebDriver popup1 = testHelpers.findPopup("Edit parking");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    //waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "Edit parking", element.getText());    
//    testHelpers.fillNewParkingForm(popup1, "", "");
//    Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);  
//    testHelpers.logout();
//    
//	}
//
//	// Edit Parking order with invalid Activation date: date in the past
//	@Test
//	public void testActivationDateinThePast() throws Exception {
//	  System.out.println("Test 5: testActivationDateinThePast");  
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.parkOrder();  
//    Thread.sleep(1500);   
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    
//    // Click on "Parked Orders" link at left menu bar.    
//    driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();   
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();  
//    String EditParkedButton = "id.button.edit_parking." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(EditParkedButton)));
//    // Click on Edit Park button.
//    driver.findElement(By.id(EditParkedButton)).click();  
//    
//    // Identify the New Parking pop up
//    WebDriver popup1 = testHelpers.findPopup("Edit parking");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    //waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "Edit parking", element.getText());    
//    testHelpers.fillNewParkingForm(popup1,  "2/28/12", "This is the comment");
//    Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);  
//    testHelpers.logout();
//    
//	}
//
//	// Edit Parking order with invalid Activation date: fill text into date form.
//	@Test
//	public void testActivationDateInvalid1() throws Exception {
//    System.out.println("Test 6: testActivationDateInvalid1");  
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.parkOrder();  
//    Thread.sleep(1500);   
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    
//    // Click on "Parked Orders" link at left menu bar.    
//    driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();   
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();  
//    String EditParkedButton = "id.button.edit_parking." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(EditParkedButton)));
//    // Click on Edit Park button.
//    driver.findElement(By.id(EditParkedButton)).click();  
//    
//    // Identify the New Parking pop up
//    WebDriver popup1 = testHelpers.findPopup("Edit parking");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    //waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "Edit parking", element.getText());    
//    testHelpers.fillNewParkingForm(popup1,  "ABC", "This is the comment");
//    Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);  
//    testHelpers.logout();
//	}
//
//	// Edit Parking order with invalid Activation date: wrong date format
//	@Test
//	public void testActivationDateWrongDateFormat() throws Exception {
//    System.out.println("Test 7: testActivationDateWrongDateFormat");  
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.parkOrder();  
//    Thread.sleep(1500);   
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    
//    // Click on "Parked Orders" link at left menu bar.    
//    driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();   
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();  
//    String EditParkedButton = "id.button.edit_parking." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(EditParkedButton)));
//    // Click on Edit Park button.
//    driver.findElement(By.id(EditParkedButton)).click();  
//    
//    // Identify the New Parking pop up
//    WebDriver popup1 = testHelpers.findPopup("Edit parking");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    //waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "Edit parking", element.getText());    
//    testHelpers.fillNewParkingForm(popup1,  "2-12-14", "This is the comment");
//    Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);  
//    testHelpers.logout();
//	}
//
//	// Close pop up window
//	@Test
//	public void testClosePopUpWindow() throws Exception {
//	   System.out.println("Test 8: testClosePopUpWindow");  
//	    testHelpers.createNewOrder();
//	    String orderId = testHelpers.parkOrder();  
//	    Thread.sleep(1500);   
//	    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//	    
//	    // Click on "Parked Orders" link at left menu bar.    
//	    driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();   
//	    
//	    // Before opening the popup window get the handle of main window and save it.
//	    String parentWindowHandle1 = driver.getWindowHandle();  
//	    String EditParkedButton = "id.button.edit_parking." + orderId;
//	    testHelpers.waitUntilPageLoad((By.id(EditParkedButton)));
//	    // Click on Edit Park button.
//	    driver.findElement(By.id(EditParkedButton)).click();  
//	    
//	    // Identify the New Parking pop up
//	    WebDriver popup1 = testHelpers.findPopup("Edit parking");
//	    Thread.sleep(3000);
//	    
//	    // Here we can perform operation in pop-up window.    
//	    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//	    //waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//	    Thread.sleep(1500);
//	    assertEquals("Wrong text present", "Edit parking", element.getText());  	   
//	    
//		popup1.findElement(By.id("id.button.cancel")).click();
//		driver.switchTo().window(parentWindowHandle1);
//		// Assert pop up window New parking is closed. and turn back to Unbooker
//		// Orders page.
//		WebElement element1 = driver.findElement(By.id("id.leftmenuitem.unbooked.orders"));
//		assertEquals("Wrong text present", "Unbooked Orders",element1.getText());
//	}
//
//}
