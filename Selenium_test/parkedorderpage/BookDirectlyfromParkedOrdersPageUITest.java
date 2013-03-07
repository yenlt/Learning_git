///*
// * @(#)BookDirectlyfromParkedOrdersPageUITest.java
// *
// * Copyright 2012 by esoft systems (tm).
// * All rights reserved.
// */
//
//package com.esoftsystems.f2.uitest.parkedorderpage;
//
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class BookDirectlyfromParkedOrdersPageUITest extends AbstractSeleniumTest {
//	
//	public BookDirectlyfromParkedOrdersPageUITest(BrowserType browserType) throws Exception {
//	    super(browserType);
//	}
//	public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//
//	@Test
//	public void testBookingOrderSuccessfully() throws Exception {
//		System.out.println("Test 1: testBookingOrderSuccessfully");	
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.parkOrder();  
//    Thread.sleep(1500);   
//		testHelpers.login("booker@esoftsystems.com", "Pass1234");
//		
//		// Click on "Parked Orders" link at left menu bar.		
//		driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();		
//		
//		// Before opening the popup window get the handle of main window and save it.
//		String parentWindowHandle1 = driver.getWindowHandle();	
//		String ParkedBookButton = "id.button.book." + orderId;
//		testHelpers.waitUntilPageLoad((By.id(ParkedBookButton)));
//		driver.findElement(By.id(ParkedBookButton)).click();
//		 
//		//Identify the New Booking pop up
//		WebDriver popup1 = testHelpers.findPopup("New Booking");
//		Thread.sleep(3000);
//		
//		// Here we can perform operation in pop-up window.		
//		WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//		//waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//		Thread.sleep(1500);
//		assertEquals("Wrong text present", "New Booking", element.getText());		 
//		testHelpers.fillNewBookingForm(popup1, "2/21/13 01:15 PM");
//		Thread.sleep(1500);
//		WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//		assertEquals("Wrong text present","The new booking was created successfully", element1.getText());
//		driver.switchTo().window(parentWindowHandle1);	
//		testHelpers.logout();
//	}
//
//	// Booking order with blank Date&Time.
//	@Test
//	public void testBookingOrderwithBlankDateandTime() throws Exception {
//	  System.out.println("Test 2: testBookingOrderwithBlankDateandTime"); 
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
//    String ParkedBookButton = "id.button.book." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(ParkedBookButton)));
//    driver.findElement(By.id(ParkedBookButton)).click();
//     
//    //Identify the New Booking pop up
//    WebDriver popup1 = testHelpers.findPopup("New Booking");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    //waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "New Booking", element.getText());    
//    testHelpers.fillNewBookingForm(popup1, "");
//    Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
//    Thread.sleep(5000);
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);        
//    testHelpers.logout();	
//	}
//
//	// Booking order with invalid Date and Time: wrong format of date&time .
//	@Test
//	public void testBookingOrderwithInvalidDateandTime1() throws Exception {
//    System.out.println("Test 3: testBookingOrderwithInvalidDateandTime1"); 
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
//    String ParkedBookButton = "id.button.book." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(ParkedBookButton)));
//    driver.findElement(By.id(ParkedBookButton)).click();
//     
//    //Identify the New Booking pop up
//    WebDriver popup1 = testHelpers.findPopup("New Booking");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    //waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "New Booking", element.getText());    
//    testHelpers.fillNewBookingForm(popup1, "28-10-2013 10:47");  
//		Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));  
//    Thread.sleep(5000);
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);        
//    testHelpers.logout(); 
//	}
//
//	// Booking order with invalid Date and Time mix text and number.
//	@Test
//	public void testBookingOrderwithInvalidDateandTime2() throws Exception {
//	  System.out.println("Test 4: testBookingOrderwithInvalidDateandTime2"); 
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
//    String ParkedBookButton = "id.button.book." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(ParkedBookButton)));
//     driver.findElement(By.id(ParkedBookButton)).click();
//     
//    //Identify the New Booking pop up
//    WebDriver popup1 = testHelpers.findPopup("New Booking");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));    
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "New Booking", element.getText());    
//    testHelpers.fillNewBookingForm(popup1, "28-10-abc");  
//    Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));  
//    Thread.sleep(5000);
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);        
//    testHelpers.logout(); 
//	}	
//}