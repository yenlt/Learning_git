//package com.esoftsystems.f2.uitest.unbookedorderpage;
//
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class ParkingFunctionUITest extends AbstractSeleniumTest {
//
//  public ParkingFunctionUITest(BrowserType browserType) throws Exception {
//    super(browserType);
//  }
//
//  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//
//  // Parking order successfully.
//  @Test
//  public void testParkingOrderSuccessfully() throws Exception {
//    System.out.println("Test 1: testParkingOrderSuccessfully");   
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Park button.
//    driver.findElement(By.id(elements.PARK_BUTTON.toValue())).click();
//    // Identify the New Parking pop up
//    WebDriver popup1 = testHelpers.findPopup("New parking");
////    // Here we can perform operation in pop-up window.
////    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
////    assertEquals("Wrong text present", "New parking", element.getText());
//    Thread.sleep(1500);
//    testHelpers.fillNewParkingForm(popup1, "5/31/13",
//        "This is comment for Parking Order.");
//    popup1.findElement(By.id("id.button.submit")).click();
//    // Assert notification message present: The new parking was created
//    // successfully
//    Thread.sleep(1500);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//    assertEquals("Wrong text present","The new parking was created successfully", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);
//    // Log out
//    testHelpers.logout();
//  }
//
//  // Parking order with blank activation date.
//  @Test
//  public void testActivationDateBlank() throws Exception {
//    System.out.println("Test 2: testActivationDateBlank");
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Park button.
//    driver.findElement(By.id(elements.PARK_BUTTON.toValue())).click();
//    // Identify the New Paring pop up
//    WebDriver popup1 = testHelpers.findPopup("New parking");
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    assertEquals("Wrong text present", "New parking", element.getText());
//    testHelpers.fillNewParkingForm(popup1, "", "This is comment for Parking Order.");
//    popup1.findElement(By.id("id.button.submit")).click();
//    // Assert notification message present: Activation date cannot be empty.
//    // successfully
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']"));
//    assertEquals("Wrong text present", "Activation date cannot be empty.",element1.getText());
//    driver.switchTo().window(parentWindowHandle1);
//  }
//
//  // Parking order with blank comment field.
//  @Test
//  public void testCommentFieldBlank() throws Exception {
//    System.out.println("Test 3: testCommentFieldBlank");
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Park button.
//    driver.findElement(By.id(elements.PARK_BUTTON.toValue())).click();
//    // Identify the New Paring pop up
//    WebDriver popup1 = testHelpers.findPopup("New parking");
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    assertEquals("Wrong text present", "New parking", element.getText());
//    testHelpers.fillNewParkingForm(popup1, "5/31/13", "");
//    popup1.findElement(By.id("id.button.submit")).click();
//    // Assert notification message present: Activation date cannot be empty.
//    // successfully
//    WebElement element1 = driver.findElement(By.xpath("//div/fieldset/div[2]/div[@class='gwt-HTML']"));   
//    assertEquals("Wrong text present", "Comment cannot be empty.",element1.getText());
//    //There are errors when committing form.
//    driver.switchTo().window(parentWindowHandle1);
//  }
//
//  // Parking order with all Required fields are blank.
//  @Test
//  public void testRequiedFieldBlank() throws Exception {
//    System.out.println("Test 4: testRequiedFieldBlank");
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Park button.
//    driver.findElement(By.id(elements.PARK_BUTTON.toValue())).click();
//    // Identify the New Paring pop up
//    WebDriver popup1 = testHelpers.findPopup("New parking");
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    assertEquals("Wrong text present", "New parking", element.getText());
//    testHelpers.fillNewParkingForm(popup1, "", "");
//    popup1.findElement(By.id("id.button.submit")).click();
//    // Assert notification message present: Activation date cannot be empty.
//    // successfully
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']"));
//    assertEquals("Wrong text present", "Activation date cannot be empty.",element1.getText());
//    driver.switchTo().window(parentWindowHandle1);
//  }
//
//  // Parking order with invalid Activation date: date in the pass.
//  @Test
//  public void testActivationDateinThePast() throws Exception {
//    System.out.println("Test 5: testActivationDateinThePass");
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Park button.
//    driver.findElement(By.id(elements.PARK_BUTTON.toValue())).click();
//    // Identify the New Paring pop up
//    WebDriver popup1 = testHelpers.findPopup("New parking");
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    assertEquals("Wrong text present", "New parking", element.getText());
//    testHelpers.fillNewParkingForm(popup1, "11/1/12", "");
//    popup1.findElement(By.id("id.button.submit")).click();
//    // Assert notification message present: Activation date cannot be empty.
//    // successfully
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']"));
//    assertEquals("Wrong text present","The activation date must be a future date", element1.getText());
//    driver.switchTo().window(parentWindowHandle1);
//  }
//
//  // Parking order with invalid Activation date: fill text into date form.
//  @Test
//  public void testActivationDateInvalid1() throws Exception {
//    System.out.println("Test 6: testActivationDateInvalid");
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Park button.
//    driver.findElement(By.id(elements.PARK_BUTTON.toValue())).click();
//    // Identify the New Paring pop up
//    WebDriver popup1 = testHelpers.findPopup("New parking");
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    assertEquals("Wrong text present", "New parking", element.getText());
//    testHelpers.fillNewParkingForm(popup1, "fgfg23556", "");
//    popup1.findElement(By.id("id.button.submit")).click();
//    // Assert notification message present: Activation date cannot be empty.
//    // successfully
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']"));
//    assertEquals("Wrong text present", "Date format not recognized",element1.getText());
//    driver.switchTo().window(parentWindowHandle1);
//  }
//
//  // Parking order with invalid Activation date: wrong date format
//  @Test
//  public void testActivationDateWrongDateFormat() throws Exception {
//    System.out.println("Test 7: testActivationDateWrongDateFormat");
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Park button.
//    driver.findElement(By.id(elements.PARK_BUTTON.toValue())).click();
//    // Identify the New Paring pop up
//    WebDriver popup1 = testHelpers.findPopup("New parking");
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    assertEquals("Wrong text present", "New parking", element.getText());
//    testHelpers.fillNewParkingForm(popup1, "12-12-12", "");
//    popup1.findElement(By.id("id.button.submit")).click();
//    // Assert notification message present: Activation date cannot be empty.
//    // successfully
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']"));
//    assertEquals("Wrong text present", "Date format not recognized",element1.getText());
//    driver.switchTo().window(parentWindowHandle1);
//
//  }
//
//  // Close pop up window
//  @Test
//  public void testClosePopUpWindow() throws Exception {
//    System.out.println("Test 8: testClosePopUpWindow");
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Park button.
//    driver.findElement(By.id(elements.PARK_BUTTON.toValue())).click();
//    // Identify the New Paring pop up
//    WebDriver popup1 = testHelpers.findPopup("New parking");
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    assertEquals("Wrong text present", "New parking", element.getText());
//    popup1.findElement(By.id("id.button.cancel")).click();
//    driver.switchTo().window(parentWindowHandle1);
//    // Assert pop up window New parking is closed. and turn back to Unbooker
//    // Orders page.
//    WebElement element1 = driver.findElement(By.id("id.leftmenuitem.unbooked.orders"));
//    assertEquals("Wrong text present", "Unbooked Orders",element1.getText());
//  }
//  
//}