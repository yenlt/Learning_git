//package com.esoftsystems.f2.uitest.datacard;
//
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class DataCardUITest extends AbstractSeleniumTest {
//  
//  public DataCardUITest(BrowserType browserType) throws Exception {
//      super(browserType);
//  }
//
// //Test Data Card at Unbooked Orders page
//  @Test
//  public void testBookerSeeDataCardatUnBookedOrderPage() throws Exception {
//  System.out.println("Test1: testBookerSeeDataCardatUnBookedOrderPage");
//  testHelpers.login("booker@esoftsystems.com", "Pass1234");
//  
//  // Click on "Unbooked Orders" link at left menu bar.  
//  driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//  Thread.sleep(1500);
//  
//  // Before opening the popup window get the handle of main window and save it.
//  String parentWindowHandle1 = driver.getWindowHandle();  
//  
//  // Click on DaTa Card button.
//  driver.findElement(By.id(elements.DATA_CARD_BUTTON_AT_UNBOOKED_ORDER_PAGE.toValue())).click(); 
//  
//  //Identify the New Booking pop up
//  WebDriver popup1 = testHelpers.findPopup("Data Card for order ORDERED1");
//  Thread.sleep(3000);
//  
//  // Here we can perform operation in pop-up window.    
//  WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//  Thread.sleep(1500);
//  assertEquals("Wrong text present", "Data Card for order ORDERED2", element.getText());   
//  assertResult(popup1);    
//  driver.switchTo().window(parentWindowHandle1);    
//  testHelpers.logout();
//  
//  }
//    
//  @Test
//  public void testBookerSeeDataCardatBookedOrderPage() throws Exception {    
//    System.out.println("Test2: testBookerSeeDataCardatBookedOrderPage");
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    
//    // Click on "Unbooked Orders" link at left menu bar.  
//    driver.findElement(By.id("id.leftmenuitem.booked.orders")).click();
//    Thread.sleep(1500);
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();  
//    
//    // Click on DaTa Card button.
//    driver.findElement(By.id(elements.DATA_CARD_BUTTON_AT_BOOKED_ORDER_PAGE.toValue())).click(); 
//    
//    //Identify the New Booking pop up
//    WebDriver popup1 = testHelpers.findPopup("Data Card for order BOOKED1");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "Data Card for order BOOKED1", element.getText());   
//    assertResult(popup1);    
//    driver.switchTo().window(parentWindowHandle1);    
//    testHelpers.logout();
//  
//  
//  }
//  
//  @Test
//  public void testBookerSeeDataCardatParkedOrderPage() throws Exception {
//    System.out.println("Test 3: testBookerSeeDataCardatParkedOrderPage");  
//  testHelpers.createNewOrder();
//  String orderId = testHelpers.parkOrder();  
//  Thread.sleep(1500);   
//  testHelpers.login("booker@esoftsystems.com", "Pass1234");
//  
//  // Click on "Parked Orders" link at left menu bar.    
//  driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();   
//  
//  // Before opening the popup window get the handle of main window and save it.
//  String parentWindowHandle1 = driver.getWindowHandle();  
//  String DataCardButton = "id.button.show_datacard." + orderId;
//  testHelpers.waitUntilPageLoad((By.id(DataCardButton)));
//  driver.findElement(By.id(DataCardButton)).click();
//   
////Identify the New Booking pop up
//  WebDriver popup1 = testHelpers.findPopup("Data Card for order Ref");
//  Thread.sleep(3000);
//  
//  // Here we can perform operation in pop-up window.    
//  WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//  Thread.sleep(1500);
//  assertEquals("Wrong text present", "Data Card for order Ref", element.getText());   
//  assertResult(popup1);    
//  driver.switchTo().window(parentWindowHandle1);    
//  testHelpers.logout();
//  
//  }
//  
//  @Test
//  public void testPhotographerSeeDataCardatOrderforPhotographerPage() throws Exception {
//    System.out.println("Test 4: testPhotographerSeeDataCardatOrderforPhotographerPage");  
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.bookingTheOrder();  
//    Thread.sleep(1500);   
//    testHelpers.login("photographer@esoftsystems.com", "Pass1234");
//    
//    // Click on "Order for Photographer" link at left menu bar.    
//    driver.findElement(By.id("id.leftmenuitem.photographer.bookings")).click();   
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();  
//    String DataCardButton = "id.button.show_datacard." + orderId;
//    testHelpers.waitUntilPageLoad((By.id(DataCardButton)));
//    driver.findElement(By.id(DataCardButton)).click();
//     
//   //Identify the New Booking pop up
//    WebDriver popup1 = testHelpers.findPopup("Data Card for order Ref");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "Data Card for order Ref", element.getText());   
//    assertResult(popup1);    
//    driver.switchTo().window(parentWindowHandle1);    
//    testHelpers.logout();
//  
//  }
//  
//  @Test
//  public void testEditorSeeDataCardatOrderforEditingPage() throws Exception {
//    System.out.println("Test 5 testEditorSeeDataCardatOrderforEditingPage");     
//    testHelpers.login("editor@esoftsystems.com", "Pass1234");
//    Thread.sleep(2000);
//    // Click on "Order for Editing" link at left menu bar.  
//    driver.findElement(By.id("id.leftmenuitem.for_editor.orders")).click();
//    Thread.sleep(1500);
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();  
//    
//    // Click on DaTa Card button.
//    driver.findElement(By.id(elements.DATA_CARD_BUTTON_AT_ORDER_FOR_EDITOR_PAGE.toValue())).click(); 
//    
//    //Identify the New Booking pop up
//    WebDriver popup1 = testHelpers.findPopup("Data Card for order EDITED2");
//    Thread.sleep(3000);
//    
//    // Here we can perform operation in pop-up window.    
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    Thread.sleep(1500);
//    assertEquals("Wrong text present", "Data Card for order EDITED2", element.getText());   
//    assertResult(popup1);    
//    driver.switchTo().window(parentWindowHandle1);    
//    testHelpers.logout();
// 
//  }
//  
//  
////Test Data Card at Done Order for Booker
//  @Test
//  public void testDataCardatatDoneOrderPageforBooker() throws Exception {    
//    System.out.println("Test6: testDataCardatatDoneOrderPageforBooker");
//    dataCardatDoneOrderPage("booker@esoftsystems.com", "Pass1234");    
//  }
//  
////Test Data Card at Unbooked Orders page
//  @Test
//  public void testDataCardatatDoneOrderPageforEditor() throws Exception {
//    System.out.println("Test7: testDataCardatatDoneOrderPageforEditor");
//    dataCardatDoneOrderPage("editor@esoftsystems.com", "Pass1234");
//  }
//  
////Test Data Card at Unbooked Orders page
//  @Test
//  public void testDataCardatatDoneOrderPageforQA() throws Exception {
//    System.out.println("Test8: testDataCardatatDoneOrderPageforQA");
//    dataCardatDoneOrderPage("qa@esoftsystems.com", "Pass1234");
//  }
//  
////Test Data Card at Unbooked Orders page
//  @Test
//  public void testDataCardatatDoneOrderPageforPhotographer() throws Exception {       
//    System.out.println("Test9: testDataCardatatDoneOrderPageforPhotographer");     
//    dataCardatDoneOrderPage("photographer@esoftsystems.com", "Pass1234");    
//  }
//  
//private void dataCardatDoneOrderPage(final String userName, final String passWord) throws Exception {
//  testHelpers.login(userName, passWord);   
//  Thread.sleep(1500);
//  
//  // Before opening the popup window get the handle of main window and save it.
//  String parentWindowHandle1 = driver.getWindowHandle();  
//  
//  // Click on DaTa Card button.
//  driver.findElement(By.id(elements.DATA_CARD_BUTTON_AT_DONE_ORDERS_PAGE.toValue())).click(); 
//  
//  //Identify the New Booking pop up
//  WebDriver popup1 = testHelpers.findPopup("Data Card for order DELIVERED1");
//  Thread.sleep(3000);
//  
//  // Here we can perform operation in pop-up window.    
//  WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//  Thread.sleep(1500);
//  assertEquals("Wrong text present", "Data Card for order DELIVERED1", element.getText());   
//  assertResult(popup1);    
//  driver.switchTo().window(parentWindowHandle1);    
//  testHelpers.logout();
//    
//  }
//
//  //Test Data Card at Unbooked Orders page
//  
//  private void assertResult(WebDriver popup1) {
//  //Assert there are 5 areas in this data card.
//    WebElement element1 = popup1.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div"));
//    assertEquals("Wrong text present", "Order Information", element1.getText()); 
//    
//    WebElement element2 = popup1.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div/div/div/div"));
//    assertEquals("Wrong text present", "Customer Information", element2.getText()); 
//    
//    WebElement element3 = popup1.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/div/div/div[3]/div/div/div/div/div/div"));
//    assertEquals("Wrong text present", "Final Product", element3.getText());  
//    
//    WebElement element4 = popup1.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/div/div/div[4]/div/div/div/div/div/div"));
//    assertEquals("Wrong text present", "Booking Status", element4.getText());  
//    
//    WebElement element5 = popup1.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/div/div/div[5]/div/div/div/div/div/div"));
//    assertEquals("Wrong text present", "Comment", element5.getText());  
//  }
//
// 
//}