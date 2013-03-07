//package com.esoftsystems.f2.uitest.common;
//
//
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class ShowCommentUTTest extends AbstractSeleniumTest {
//  
//  public ShowCommentUTTest(BrowserType browserType) throws Exception {
//      super(browserType);
//  }
//  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//  
//  // Show comment pop up display successfully. and Close this popup successful.
//  @Test
//  public void testDisplayandCloseShowCommentPopUp() throws Exception {
//    System.out.println("Test 1: testDisplayandCloseShowCommentPopUp");
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    
//    // Click on "Unbooked Orders" link at left menu bar.  
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    testHelpers.waitUntilPageLoad(By.id(elements.SHOW_COMMENTS_BUTTON.toValue()));
//    
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();    
//    driver.findElement(By.id(elements.SHOW_COMMENTS_BUTTON.toValue())).click(); 
//    
//    //Identify the pop up window
//    WebDriver popup1 = testHelpers.findPopup("Comments for order ORDERED1");
//    testHelpers.waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath("//div[@class ='v-window-header']"));
//    assertEquals("Wrong text present", "Comments for order ORDERED2", element.getText());
//    popup1.findElement(By.id("id.button.close")).click();   
//    
//    // Assert pop up window New parking is closed. and turn back to Unbooker Orders page.
//    WebElement element1 = driver.findElement(By.id("id.leftmenuitem.unbooked.orders"));
//    assertEquals("Wrong text present", "Unbooked Orders",element1.getText());   
//    driver.switchTo().window(parentWindowHandle1);      
//  } 
////
////  // Show comment, which was created by booker
////  @Test
////  public void testCommentCreatedbyBooker() throws Exception {
////    System.out.println("Test 1: testCreateOrderwithBlankTextField");
////    BookerCreateComment();
////  }
////
////  // Show comment, which was created by photographer
////  @Test
////  public void testCommentCreatedbyPhotographer() throws Exception {
////    System.out.println("Test 1: testCreateOrderwithBlankTextField");
////    PhotographerCreateComment();
////  }
////
////  // Show comment, which was created by editor
////  @Test
////  public void testCommentCreatedbyEditor() throws Exception {
////    System.out.println("Test 1: testCreateOrderwithBlankTextField");
////    EditorCreateComment();
////  }
////  // Show comment, which was created by customer
////  @Test
////  public void testCommentCreatedbyCustomer() throws Exception {
////    System.out.println("Test 1: testCreateOrderwithBlankTextField");
////    CustomerCreateCommentatOrdering();
////  }
////  
////  
////private void BookerCreateComment() throws InterruptedException {
////  login("booker@esoftsystems.com", "Pass1234");
////}
////  // Customer views comment at Open Orders page
////  @Test
////  public void testCustomerViewsCommentatOpenOrdersPage() throws Exception {
////    // TO DO
////  }
////  // Customer views comment at Done Orders page
////  @Test
////  public void testCustomerViewsCommentatDoneOrdersPage() throws Exception {
////    // TO DO
////  }
////  // Customer views comment at Cancelled Orders page
////  @Test
////  public void testCustomerViewsCommentatCancelledOrdersPage() throws Exception {
////    // TO DO
////  }
////
////  // Booker views comment at Done Orders page
////  @Test
////  public void testBookerViewsCommentatDoneOrdersPage() throws Exception {
////    // TO DO
////  }
////
////  // Booker creates new comment at Unbooked Orders page
////  @Test
////  public void testBookerViewsCommentatUnbookedOrdersPage()
////      throws Exception {
////    // TO DO
////
////  }
////
////  // Booker views comment at Parked Orders page
////  @Test
////  public void testBookerViewsCommentatParkedOrdersPage() throws Exception {
////    // TO DO
////  }
////
////  // Booker views comment at Booked Orders page
////  @Test
////  public void testBookerViewsCommentatBookedOrdersPage() throws Exception {
////    // TO DO
////  }
////
////  // Editor views comment at Done Orders page
////  @Test
////  public void testEditorViewsCommentatDoneOrdersPage() throws Exception {
////    // TO DO
////  }
////
////  // Editor views comment at Orders for Editing page
////  @Test
////  public void testEditorViewsCommentatOrdersforEditingPage()
////      throws Exception {
////    // TO DO
////  }
////
////  // Photographer views comment at Done Orders page
////  @Test
////  public void testPhotographerViewsCommentatDoneOrdersPage()
////      throws Exception {
////    // TO DO
////  }
////
////  // Photographer views comment at Orders for Editing page
////  @Test
////  public void testPhotographerViewsCommentatOrdersforPhotographer()
////      throws Exception {
////    // TO DO
////  }
////
////  // QA views comment at Orders for Editing page
////  @Test
////  public void testQAViewsCommentatDoneOrdersPage() throws Exception {
////    // TO DO
////  }
//}