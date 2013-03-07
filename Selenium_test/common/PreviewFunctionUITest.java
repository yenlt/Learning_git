//package com.esoftsystems.f2.uitest.common;
//
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class PreviewFunctionUITest extends AbstractSeleniumTest {
//
//  public PreviewFunctionUITest(BrowserType browserType) throws Exception {
//    super(browserType);
//  }
//
//  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//
//  // QA can preview delivered order.
//  @Test
//  public void testQAPreviewProduct() throws Exception {
//    System.out.println("Test 1: testQAPreviewProduct");
//    testHelpers.login("qa@esoftsystems.com", "Pass1234");
//    PreviewFunction();
//  }
//
//  // Photographer can preview delivered order.
//  @Test
//  public void testPhotographerPreviewProduct() throws Exception {
//    System.out.println("Test 2: testPhotographerPreviewProduct");
//    testHelpers.login("photographer@esoftsystems.com", "Pass1234");
//    PreviewFunction();
//  }
//
//  // Booker can preview delivered order.
//  @Test
//  public void testBookerPreviewProduct() throws Exception {
//    System.out.println("Test 3: testBookerPreviewProduct");
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    PreviewFunction();
//  }
//
//  // Editor can preview delivered order.
//  @Test
//  public void testEditorPreviewProduct() throws Exception {
//    System.out.println("Test 4: testEditorPreviewProduct");
//    testHelpers.login("editor@esoftsystems.com", "Pass1234");
//    PreviewFunction();
//  }
//  
//  // Customer can preview delivered order.
//  @Test
//  public void testCustomerPreviewProduct() throws Exception {
//    System.out.println("Test 5: testCustomerPreviewProduct");
//    testHelpers.login("customer@esoftsystems.com", "Pass1234");
//    PreviewFunction();
//  }
//
//  // Preview Function
//  private void PreviewFunction() throws InterruptedException {
//    
//    // Click on Done Orders link at left menu bar
//    driver.findElement(By.id("id.leftmenuitem.done.orders")).click();    
//    testHelpers.waitUntilPageLoad(By.id(elements.PREVIEW_BUTTON.toValue()));
//    // Before opening the popup window get the handle of main window and save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Preview button.
//    driver.findElement(By.id(elements.PREVIEW_BUTTON.toValue())).click();
//    // Identify the New Booking pop up
//    WebDriver popup1 = testHelpers.findPopup("Final Result");
//    testHelpers.waitUntilPageLoad(By.xpath(elements.POPUP_HEADER.toValue()));
//    // Here we can perform operation in pop-up window.
//    WebElement element1 = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
//    assertEquals("Wrong text present", "Final Result", element1.getText());
//    WebElement element2 = popup1.findElement(By.xpath("//div/table/tbody/tr[2]/td[3]/div/div[2]/div/div/video"));    
//    assertTrue(element2.isDisplayed());
//    popup1.findElement(By.id("id.button.close")).click();
//    // Assert pop up window Final Result is closed. and turn back to Done Orders page
//    Thread.sleep(1500);
//    WebElement element3 = driver.findElement(By.id("id.leftmenuitem.done.orders"));
//    assertEquals("Wrong text present", "Done Orders", element3.getText());
//    driver.switchTo().window(parentWindowHandle1); 
//    testHelpers.logout();
//  }
//
//}