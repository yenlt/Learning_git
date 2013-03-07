//package com.esoftsystems.f2.uitest.photographer;
//
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class PhotographedUITest extends AbstractSeleniumTest {
//  
//  public PhotographedUITest(BrowserType browserType) throws Exception {
//      super(browserType);
//  }
//  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//
//  // Making Photograph Order successfully.
//  @Test
//  public void testMakingPhotographOrderSuccessfully() throws Exception {
//    System.out.println("Test 1: testMakingPhotographOrderSuccessfully");         
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.bookingTheOrder();
//    testHelpers.markOrderPhotographed(orderId);     
//  }
//
//  // Close the popup
//  @Test
//  public void testCloseOrderPopUp() throws Exception {    
//    System.out.println("Test 2: testCloseOrderPopUp");   
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.bookingTheOrder();    
//    testHelpers.login("photographer@esoftsystems.com", "Pass1234");
//
//    // Click on "Orders for Photographer" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.photographer.bookings")).click();
//
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    String PhotographedButton = "id.button.photographed." + orderId;
//    testHelpers.waitUntilPageLoad(By.id(PhotographedButton));
//
//    // Click on Photographed button.
//    driver.findElement(By.id(PhotographedButton)).click();
//
//    // Identify the New Booking pop up
//    WebDriver popup1 = testHelpers.findPopup("Confirm");
//    testHelpers.waitUntilPageLoad(By.xpath(elements.POPUP_HEADER.toValue()));
//
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    assertEquals("Wrong text present", "Confirm", element.getText());
//    popup1.findElement(By.id("id.button.cancel")).click(); 
//    driver.switchTo().window(parentWindowHandle1);    
//    // Assert pop-up is closed. and turn back to Orders for Photographer page.
//    WebElement element1 = driver.findElement(By.id("id.leftmenuitem.photographer.bookings"));
//    assertEquals("Wrong text present", "Orders for Photographer",element1.getText());   
//    testHelpers.logout();      
//  }  
//}
