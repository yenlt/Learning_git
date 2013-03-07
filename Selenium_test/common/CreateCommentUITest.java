//package com.esoftsystems.f2.uitest.common;
//
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class CreateCommentUITest extends AbstractSeleniumTest {
//
//    public CreateCommentUITest(BrowserType browserType) throws Exception {
//        super(browserType);
//    }
//    public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//    public static final int AMOUNT_PRODUCT = 15; 
//
//    // Booker creates new comment at Unbooked Orders page
//    // Cteate comment with blank text field.
//    @Test
//    public void testCreateCommentwithBlankTextField() throws Exception {
//        System.out.println("Test1: testCreateCommentwithBlankTextField");
//        testHelpers.login("booker@esoftsystems.com", "Pass1234");
//        
//        // Click on "Unbooked Orders" link at left menu bar.
//        driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();        
//        testHelpers.waitUntilPageLoad(By.id(elements.BOOKER_UNBOOKED_ORDERS_COMMENT_BUTTON.toValue()));
//        
//        // Before opening the popup window get the handle of main window and save it.
//        String parentWindowHandle1 = driver.getWindowHandle();
//        driver.findElement(By.id(elements.BOOKER_UNBOOKED_ORDERS_COMMENT_BUTTON.toValue())).click();
//        testHelpers.workWithCommentPopupWindow("","Comment cannot be empty.");       
//        driver.switchTo().window(parentWindowHandle1);        
//     }
//
//    // Create Order with text field not blank.
//    @Test
//    public void testCreateCommentwithTextFieldnotBlank() throws Exception {
//        System.out.println("Test2: testCreateCommentwithTextFieldnotBlank");
//        testHelpers.login("booker@esoftsystems.com", "Pass1234");
//        
//        // Click on "Unbooked Orders" link at left menu bar.
//        driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//        testHelpers.waitUntilPageLoad(By.id(elements.BOOKER_UNBOOKED_ORDERS_COMMENT_BUTTON.toValue()));
//        
//        // Before opening the popup window get the handle of main window and save it.
//        String parentWindowHandle1 = driver.getWindowHandle();     
//        driver.findElement(By.id(elements.BOOKER_UNBOOKED_ORDERS_COMMENT_BUTTON.toValue())).click();
//        testHelpers.workWithCommentPopupWindow("Create Comment","Comment created successfully");
//        driver.switchTo().window(parentWindowHandle1);   
//    }
//    
//    // Close the Cancel Comment popup
//    @Test
//    public void testClosePopUpWindow() throws Exception {
//        System.out.println("Test 3: testClosePopUpWindow");
//        testHelpers.login("booker@esoftsystems.com", "Pass1234");
//        
//        // Click on "Unbooked Orders" link at left menu bar.
//        driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//        testHelpers.waitUntilPageLoad(By.id(elements.BOOKER_UNBOOKED_ORDERS_COMMENT_BUTTON.toValue()));
//        
//        // Before opening the popup window get the handle of main window and save it.
//        String parentWindowHandle1 = driver.getWindowHandle();     
//        driver.findElement(By.id(elements.BOOKER_UNBOOKED_ORDERS_COMMENT_BUTTON.toValue())).click();
//
//        // Identify the Add Comment pop up
//        WebDriver popup1 = testHelpers.findPopup("Add Comment");
//        
//        // Here we can perform operation in pop-up window.
//        WebElement element = popup1.findElement(By.xpath("//div[@class ='v-window-header']"));
//        assertEquals("Wrong text present", "Add Comment", element.getText());
//        popup1.findElement(By.id("id.button.cancel")).click();
//        driver.switchTo().window(parentWindowHandle1);
//        
//        // Assert pop up window Create Comment is closed. and turn back to Unbooker Orders page.
//        WebElement element1 = driver.findElement(By.id("id.leftmenuitem.unbooked.orders"));
//        assertEquals("Wrong text present", "Unbooked Orders",element1.getText());
//    }
//  
//    // Booker creates new comment at Done Orders page
//    @Test
//    public void testBookerCreateNewCommentatDoneOrdersPage() throws Exception {
//      System.out.println("Test 4: testBookerCreateNewCommentatDoneOrdersPage");
//      testHelpers.login("booker@esoftsystems.com", "Pass1234");
//  
//      // Before opening the popup window get the handle of main window and save it.
//      String parentWindowHandle1 = driver.getWindowHandle();
//      testHelpers.waitUntilPageLoad(By.id(elements.DONE_ORDERS_COMMENT_BUTTON.toValue()));
//      driver.findElement(By.id(elements.DONE_ORDERS_COMMENT_BUTTON.toValue())).click();
//      testHelpers.workWithCommentPopupWindow("Create Comment", "Comment created successfully");
//      driver.switchTo().window(parentWindowHandle1);
//    }
//  
//    // Booker creates new comment at Parked Orders page
//    @Test
//    public void testBookerCreateNewCommentatParkedOrdersPage() throws Exception {
//      System.out.println("Test 5: testBookerCreateNewCommentatParkedOrdersPage");
//      
//      //Create Data    
//      testHelpers.createNewOrder();
//      String orderId = testHelpers.parkOrder();  
//      Thread.sleep(1500);   
//      testHelpers.login("booker@esoftsystems.com", "Pass1234");
//      
//      // Click on "Parked Orders" link at left menu bar.    
//      driver.findElement(By.id("id.leftmenuitem.parked.orders")).click();   
//      
//      // Before opening the popup window get the handle of main window and save it.
//      String parentWindowHandle1 = driver.getWindowHandle();  
//      String BookParkedOrdersCommentButton = "id.button.add_comment." + orderId;
//      testHelpers.waitUntilPageLoad((By.id(BookParkedOrdersCommentButton)));
//      driver.findElement(By.id(BookParkedOrdersCommentButton)).click();      
//      testHelpers.workWithCommentPopupWindow("Create Comment", "Comment created successfully");
//      driver.switchTo().window(parentWindowHandle1);
//      testHelpers.logout();
//    }
//
//    // Booker creates new comment at Booked Orders page
//    @Test
//    public void testBookerCreateNewCommentatBookedOrdersPage() throws Exception {
//      System.out.println("Test 6: testBookerCreateNewCommentatBookedOrdersPage");
//      testHelpers.login("booker@esoftsystems.com", "Pass1234");
//      
//       //Click on "Unbooked Orders" link at left menu bar.
//        driver.findElement(By.id("id.leftmenuitem.booked.orders")).click();
//        testHelpers.waitUntilPageLoad(By.id(elements.BOOKER_BOOKED_ORDERS_COMMENT_BUTTON.toValue()));
//        
//       // Before opening the popup window get the handle of main window and save it 
//       String parentWindowHandle1 = driver.getWindowHandle();     
//       driver.findElement(By.id(elements.BOOKER_BOOKED_ORDERS_COMMENT_BUTTON.toValue())).click();    
//       testHelpers.workWithCommentPopupWindow("Create Comment","Comment created successfully");
//       driver.switchTo().window(parentWindowHandle1);
//    }
//
//    // Editor creates new comment at Done Orders page
//    @Test
//    public void testEditorCreateNewCommentatDoneOrdersPage() throws Exception {
//      System.out.println("Test 7: testEditorCreateNewCommentatDoneOrdersPage");
//      testHelpers.login("editor@esoftsystems.com", "Pass1234");
//      
//       // Before opening the popup window get the handle of main window and save it     
//       String parentWindowHandle1 = driver.getWindowHandle();    
//       driver.findElement(By.id(elements.DONE_ORDERS_COMMENT_BUTTON.toValue())).click();     
//       testHelpers.workWithCommentPopupWindow("Create Comment","Comment created successfully");
//       driver.switchTo().window(parentWindowHandle1); 
//    }    
//
//    // Editor creates new comment at Orders for Editing page
//    @Test
//    public void testEditorCreateNewCommentatOrdersforEditingPage()throws Exception {
//      System.out.println("Test 8: testEditorCreateNewCommentatOrdersforEditingPage");
//      testHelpers.login("editor@esoftsystems.com", "Pass1234");
//      
//       //Click on "Order for Editing" link at left menu bar.
//       driver.findElement(By.id("id.leftmenuitem.for_editor.orders")).click();
//       testHelpers.waitUntilPageLoad(By.id(elements.EDITOR_OfE_COMMENT_BUTTON.toValue()));
//       // Before opening the popup window get the handle of main window and
//       // save it     
//       String parentWindowHandle1 = driver.getWindowHandle();
//       Thread.sleep(3000);
//       driver.findElement(By.id(elements.EDITOR_OfE_COMMENT_BUTTON.toValue())).click();    
//       testHelpers.workWithCommentPopupWindow("Create Comment","Comment created successfully");
//       driver.switchTo().window(parentWindowHandle1); 
//    }
//
//    // Photographer creates new comment at Done Orders page
//    @Test
//    public void testPhotographerCreateNewCommentatDoneOrdersPage() throws Exception {
//      System.out.println("Test 9: testPhotographerCreateNewCommentatDoneOrdersPage");
//      testHelpers.login("photographer@esoftsystems.com", "Pass1234");     
//      testHelpers.waitUntilPageLoad(By.id(elements.DONE_ORDERS_COMMENT_BUTTON.toValue()));
//      
//       // Before opening the popup window get the handle of main window and save it     
//       String parentWindowHandle1 = driver.getWindowHandle();    
//       driver.findElement(By.id(elements.DONE_ORDERS_COMMENT_BUTTON.toValue())).click();     
//       testHelpers.workWithCommentPopupWindow("Create Comment","Comment created successfully");
//       driver.switchTo().window(parentWindowHandle1); 
//    }
//
//    // Photographer creates new comment at Orders for Photographer page  
//    @Test
//    public void testPhotographerCreateNewCommentatOrdersforPhotographer() throws Exception {
//       System.out.println("Test 10: testPhotographerCreateNewCommentatOrdersforPhotographer");
//       
//       //Create data for "Order for Photographed" pagect");
//       testHelpers.createNewOrder();
//       String orderId = testHelpers.bookingTheOrder();      
//        
//        testHelpers.login("photographer@esoftsystems.com", "Pass1234");
//        
//        // Click on "Order for Photographer" link at left menu bar.
//        driver.findElement(By.id("id.leftmenuitem.photographer.bookings")).click();
//        
//        // Before opening the popup window get the handle of main window and save it.
//        String parentWindowHandle1 = driver.getWindowHandle();
//        String PhotographedButton = "id.button.add_comment." + orderId;
//        testHelpers.waitUntilPageLoad(By.id(PhotographedButton)); 
//       
//       // Before opening the popup window get the handle of main window and save it     
//       String parentWindowHandle2 = driver.getWindowHandle();   
//       driver.findElement(By.id(PhotographedButton)).click();    
//       testHelpers.workWithCommentPopupWindow("Create Comment","Comment created successfully");
//       driver.switchTo().window(parentWindowHandle1); 
//    }
//
//    // QA creates new comment at Orders for Editing page
//    @Test
//    public void testQACreateNewCommentatDoneOrdersPage() throws Exception {
//      System.out.println("Test 11: testQACreateNewCommentatDoneOrdersPage");
//      testHelpers.login("qa@esoftsystems.com", "Pass1234");
//      testHelpers.waitUntilPageLoad(By.id(elements.DONE_ORDERS_COMMENT_BUTTON.toValue()));
//      
//       // Before opening the popup window get the handle of main window and save it     
//       String parentWindowHandle1 = driver.getWindowHandle();    
//       driver.findElement(By.id(elements.DONE_ORDERS_COMMENT_BUTTON.toValue())).click();     
//       testHelpers.workWithCommentPopupWindow("Create Comment","Comment created successfully");
//       driver.switchTo().window(parentWindowHandle1); 
//    } 
//}
