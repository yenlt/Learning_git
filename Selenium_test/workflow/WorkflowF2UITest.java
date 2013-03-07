//package com.esoftsystems.f2.uitest.workflow;
//
//import java.io.IOException;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;
//import org.junit.*;
//
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import com.esoftsystems.f2.uitest.core.LoadPageException;
//import com.esoftsystems.f2.uitest.core.elements;
//import com.esoftsystems.f2.uitest.core.LoadPageException;
//
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.awt.Toolkit;
//import java.awt.datatransfer.StringSelection;
//
////public class UploadingfunctionUITest extends AbstractSeleniumTest {
////
////  public UploadingfunctionUITest(BrowserType browserType) throws Exception {
////    super(browserType);
////  }
//public class WorkflowF2UITest {
//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();
//
//  @Before
//  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
//    baseUrl = "http://localhost:8080/f2/f2-frontend/";
//    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }
//  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//
//  // Uploading first file of final product.
//
////  @Test
////  public void testEditorUploadFirstFileofFinalProduct() throws Exception {
////    System.out.println("testEditorUploadFirstFileofFinalProduct");
////    CreateNewOrderFilmA();
////    String orderId = BookingTheOrder();
////    markOrderPhotographed(orderId);
////    uploadFinalProduct(orderId, 1);
////  }
////
////  // Uploading second file of final product.
////
////  @Test
////  public void testEditorUploadSecondFileofFinalProduct() throws Exception {
////    System.out.println("testEditorUploadSecondFileofFinalProduct");
////    CreateNewOrderFilmA();
////    String orderId = BookingTheOrder();
////    markOrderPhotographed(orderId);
////    uploadFinalProduct(orderId, 2);
////
////  }
////
////  // Uploading all file and delivery final product.
////
////  @Test
////  public void testEditorUploadAllFileandDeliverFinalProduct() throws Exception {
////    System.out.println("testEditorUploadAllFileandDeliverFinalProduct");
////    CreateNewOrderFilmA();
////    String orderId = BookingTheOrder();
////    markOrderPhotographed(orderId);
////    uploadFinalProduct(orderId, 3);
////  }
//  
//  
//  
//  // QA  replace first file of delivered product
//  @Test
//  public void testQAReplaceFirstFileofDeliveredProduct() throws Exception {
//    System.out.println("testQAReplaceFirstFileofDeliveredProduct");
//    CreateNewOrderFilmA();
//    String orderId = BookingTheOrder();
//    
//    System.out.print("Trang Yen print: " + orderId);
//    markOrderPhotographed(orderId);
//    uploadFinalProduct(orderId, 3);
//   login("qa@esoftsystems.com", "Pass1234");
//  String QAUploadButton = "id.button.upload." + orderId;
//  //  id.button.upload.469756a6-4bda-48fb-9bdc-ccd0fe08f7c2
//    //Click on Upload button.    
//  driver.findElement(By.id(QAUploadButton)).click();
//  // Before opening the popup window get the handle of main window and
//  // save it.
//  String parentWindowHandle1 = driver.getWindowHandle();
//  // Click on Upload button.
//  String UploadButton = "id.button.upload." + orderId;
//  
//  waitUntilPageLoad((By.id(UploadButton)));
//  driver.findElement(By.id(UploadButton)).click();
//  // Identify the Upload Final Product pop up
//  WebDriver popup1 = findPopup("Upload Final Product");
//  
//  waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//  // Here we can perform operation in pop-up window.
//  WebElement element = popup1.findElement(By
//      .xpath("//div[@class ='v-window-header']"));
//  assertEquals("Wrong text present", "Upload Final Product",
//      element.getText()); 
//  
//
//  // Choose first file to upload.
//  UploadingFirstFile(popup1);
//  // Choose second file to upload.
//  UploadingSecondFile(popup1);          
//  
//  
//  popup1.findElement(By.id("id.button.submit")).click();    
// // waitUntilPageLoad((By.id(UploadButton)));
////  Thread.sleep(90000);
//  Thread.sleep(50000);
//  driver.switchTo().window(parentWindowHandle1);   
//  waitUntilPageLoad(By.id("id.button.logout"));
//  System.out.println("Trang Yen Co gang len, du co kho khan cach may cung khong bo cuoc");
// //Thread.sleep(15000);
//  //Log out
//  logout();
// //Thread.sleep(90000);
//
//  
//  
//  
//  
//  
//  
//  
//  
//  
//  }
////
//////  // QA  replace second file of delivered product
//////
//////  @Test
//////  public void testQAReplaceSecondFileofDeliveredProduct() throws Exception {
//////    System.out.println("testQAReplaceSecondFileofDeliveredProduct");
//////    CreateNewOrderFilmA();
//////    String orderId = BookingTheOrder();
//////    markOrderPhotographed(orderId);
//////    uploadFinalProduct(orderId, 4);
//////    //id.button.upload.85f97f10-b690-4189-a511-15291fc52505    
//////    login("qa@esoftsystems.com", "Pass1234");
//////    String QAUploadButton = "id.button.upload" + orderId;
//////    //Click on Upload button.    
//////    driver.findElement(By.id(QAUploadButton)).click();
//////    uploadFinalProduct(orderId, 2);
//////  }
//////
//////  // QA  replace third file of delivered product
//////
//////  @Test
//////  public void testQAReplaceThirdFileofDeliveredProduct() throws Exception {
//////    System.out.println("testQAReplaceThirdFileofDeliveredProduct");
//////    CreateNewOrderFilmA();
//////    String orderId = BookingTheOrder();
//////    markOrderPhotographed(orderId);
//////    uploadFinalProduct(orderId, 4);
//////    //id.button.upload.85f97f10-b690-4189-a511-15291fc52505    
//////    login("qa@esoftsystems.com", "Pass1234");
//////    String QAUploadButton = "id.button.upload" + orderId;
//////    //Click on Upload button.    
//////    driver.findElement(By.id(QAUploadButton)).click();
//////    uploadFinalProduct(orderId, 3);
//////  }
//////
////////QA  replaces all files of delivered product
//////
////// @Test
////// public void testQAReplacesAllFilesofDeliveredProduct() throws Exception {
//////   System.out.println("testQAReplacesAllFilesofDeliveredProduct");
//////   CreateNewOrderFilmA();
//////   String orderId = BookingTheOrder();
//////   markOrderPhotographed(orderId);
//////   uploadFinalProduct(orderId, 4);
//////   //id.button.upload.85f97f10-b690-4189-a511-15291fc52505    
//////   login("qa@esoftsystems.com", "Pass1234");
//////   String QAUploadButton = "id.button.upload" + orderId;
//////   //Click on Upload button.    
//////   driver.findElement(By.id(QAUploadButton)).click();
//////   uploadFinalProduct(orderId, 4);
////// }
////// 
////// // Editor replace first file of delivered product
////// @Test
////// public void testEditorReplaceFirstFileofDeliveredProduct() throws Exception {
//////   System.out.println("testEditorReplaceFirstFileofDeliveredProduct");
//////   CreateNewOrderFilmA();
//////   String orderId = BookingTheOrder();
//////   markOrderPhotographed(orderId);
//////   uploadFinalProduct(orderId, 4);
//////   //id.button.upload.85f97f10-b690-4189-a511-15291fc52505    
//////   login("editor@esoftsystems.com", "Pass1234");
//////   String QAUploadButton = "id.button.upload" + orderId;
//////   //Click on Upload button.    
//////   driver.findElement(By.id(QAUploadButton)).click();
//////   uploadFinalProduct(orderId, 1);
////// }
//////
////// // Editor  replace second file of delivered product
//////
////// @Test
////// public void testEditorReplaceSecondFileofDeliveredProduct() throws Exception {
//////   System.out.println("testEditorReplaceSecondFileofDeliveredProduct");
//////   CreateNewOrderFilmA();
//////   String orderId = BookingTheOrder();
//////   markOrderPhotographed(orderId);
//////   uploadFinalProduct(orderId, 4);
//////   //id.button.upload.85f97f10-b690-4189-a511-15291fc52505    
//////   login("editor@esoftsystems.com", "Pass1234");
//////   String QAUploadButton = "id.button.upload" + orderId;
//////   //Click on Upload button.    
//////   driver.findElement(By.id(QAUploadButton)).click();
//////   uploadFinalProduct(orderId, 2);
////// }
//////
////// // Editor replace third file of delivered product
//////
////// @Test
////// public void testEditorReplaceThirdFileofDeliveredProduct() throws Exception {
//////   System.out.println("testEditorReplaceThirdFileofDeliveredProduct");
//////   CreateNewOrderFilmA();
//////   String orderId = BookingTheOrder();
//////   markOrderPhotographed(orderId);
//////   uploadFinalProduct(orderId, 4);
//////   //id.button.upload.85f97f10-b690-4189-a511-15291fc52505    
//////   login("editor@esoftsystems.com", "Pass1234");
//////   String QAUploadButton = "id.button.upload" + orderId;
//////   //Click on Upload button.    
//////   driver.findElement(By.id(QAUploadButton)).click();
//////   uploadFinalProduct(orderId, 3);
////// }
//////
////////Editor replaces all files of delivered product
//////
//////@Test
//////public void testEditorReplacesAllFilesofDeliveredProduct() throws Exception {
//////  System.out.println("testEditorReplacesAllFilesofDeliveredProduct");
//////  CreateNewOrderFilmA();
//////  String orderId = BookingTheOrder();
//////  markOrderPhotographed(orderId);
//////  uploadFinalProduct(orderId, 4);
//////  //id.button.upload.85f97f10-b690-4189-a511-15291fc52505    
//////  login("editor@esoftsystems.com", "Pass1234");
//////  String QAUploadButton = "id.button.upload" + orderId;
//////  //Click on Upload button.    
//////  driver.findElement(By.id(QAUploadButton)).click();
//////  uploadFinalProduct(orderId, 4);
//////}
////// 
// 
// 
//  // Creating new order.
//  private void CreateNewOrderFilmA() throws Exception {
//
//    login("customer@esoftsystems.com", "Pass1234");
//    driver.findElement(By.id("id.reference")).sendKeys("Ref");
//    // Choose product: Film A1
//    // Choose product: Film A1
//    System.out.println("Choosing Product A1");
//    
//    driver.findElement(By.xpath(elements.SELECT_PRODUCT.toValue())).click();     
//
//    waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_A.toValue()));
//    
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A.toValue())).click();       
////    // Choose add ons of Film A1
//   waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_A_ADD_ON1.toValue()));
//   
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON1.toValue())).click();
// 
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON2.toValue())).click();
//   
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON3.toValue())).click();
//    waitUntilPageLoad(By.id(elements.SELECT_AMOUNT_FIELD.toValue()));
//   driver.findElement(By.id(elements.SELECT_AMOUNT_FIELD.toValue())).clear();
//   Thread.sleep(1000);
//    driver.findElement(By.id(elements.SELECT_AMOUNT_FIELD.toValue())).sendKeys("15");     
//    Thread.sleep(1000);    
//    driver.findElement(
//        By.id("id.orderedProductInputDto.location.contactPerson"))
//        .sendKeys("NameC");
//    driver.findElement(By.id("id.orderedProductInputDto.location.email"))
//        .sendKeys("yen.lt@esoftflow.com");
//    driver.findElement(
//        By.id("id.orderedProductInputDto.location.telephone"))
//        .sendKeys("123456789");
//    driver.findElement(By.id("id.orderedProductInputDto.location.name"))
//        .sendKeys("Name Location");
//    driver.findElement(
//        By.id("id.orderedProductInputDto.location.address.address"))
//        .sendKeys("Address");
//    driver.findElement(
//        By.id("id.orderedProductInputDto.location.address.postalCode"))
//        .sendKeys("Postal 1234");
//    driver.findElement(
//        By.id("id.orderedProductInputDto.location.address.city"))
//        .sendKeys("City");
//    driver.findElement(By.id("id.order.form.comment")).sendKeys("Comment");
//    driver.findElement(By.id("id.button.add_order")).click();      
//   Thread.sleep(1500);    
//    logout();
//  }
//
//  // Booking for oder which was created above.
//  private String BookingTheOrder() throws Exception {
//    login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click(); 
//    
//    waitUntilPageLoad(By.xpath("//div/table/tbody/tr/td[8]/div/div/div/div[2]/div/button"));
//                                 
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Book button.
//    String FIRST_BOOK_BUTTON = "//div/table/tbody/tr/td[8]/div/div/div/div[2]/div/button";
//  //*[@id="id.button.book.34b8a503-88d8-42c0-b0ea-8c3f52249b64"]
//   
//    
//    WebElement element1 = driver.findElement(By.xpath(FIRST_BOOK_BUTTON));
//    WebElement element2= driver.findElement(By.xpath("//div/table/tbody/tr/td[8]/div/div/div/div[2]/div/button"));
//                                                      
//
//    // Get id of created order
//    String originOrderId = element2.getAttribute("id");
//    String newOrderId = originOrderId.substring(originOrderId.indexOf("id.button.book.") + "id.button.book.".length());
//
//    element1.click();
//
//    // Identify the New Booking pop up
//    WebDriver popup1 = findPopup("New Booking");
//    waitUntilPageLoad(By.xpath(elements.POPUP_HEADER.toValue()));
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));    
//    assertEquals("Wrong text present", "New Booking", element.getText());
//    FillNewBookingForm(popup1, "11/30/12 08:54 AM");
//    popup1.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
//    // Assert notification message present: The new booking was created
//    // successfully
//    //Thread.sleep(1500);
//    driver.switchTo().window(parentWindowHandle1);
////    WebElement element3 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));
//   
// //   assertEquals("Wrong text present","The new booking was created successfully", element3.getText());
//    driver.switchTo().window(parentWindowHandle1);
//    Thread.sleep(5000);
//    // Log out
//    logout();
//    return newOrderId;
//  }
//
//  // Fill New Booking Form
//  private void FillNewBookingForm(WebDriver popup, final String BookDateTime)
//      throws InterruptedException {
//    // Drop down list : Photographer name.
//    popup.findElement(By.xpath("//div[@class='v-filterselect-button']")).click();
//    // Choose one option in drop down list.
//    Thread.sleep(1500);
//    popup.findElement(
//        By.xpath("//div[@class='v-filterselect-suggestmenu']/table/tbody/tr[2]/td/span"))
//        .click();
//    // Drop down list: Booking date and time
//    popup.findElement(
//        By.xpath("//div[@id = 'id.booking.form.bookingTime']/input"))
//        .sendKeys(BookDateTime);
//    // Fill comment
//    popup.findElement(By.id("id.booking.form.comment")).sendKeys(
//        "This is comment.");
//  }
//
//  // Making photographed for Order.
//  private void markOrderPhotographed(String orderId)
//      throws InterruptedException {
//    System.out.println("Test 1: testBookingOrderSuccessfully");
//    login("photographer@esoftsystems.com", "Pass1234");
//    // Click on "Orders for Photographer" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.photographer.bookings")).click();   
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//
//    String PhotographedButton = "id.button.photographed." + orderId;
//
//    waitUntilPageLoad(By.id(PhotographedButton));
//    // Click on Photographed button.
//    // driver.findElement(By.xpath(elements.PHOTOGRAPHED_BUTTON.toValue())).click();
//    driver.findElement(By.id(PhotographedButton)).click();
//    // Identify the New Booking pop up
//    WebDriver popup1 = findPopup("Confirm");
//    waitUntilPageLoad(By.xpath(elements.POPUP_HEADER.toValue()));
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));    
//    assertEquals("Wrong text present", "Confirm", element.getText());
//    popup1.findElement(By.id("id.button.ok")).click();       
//    driver.switchTo().window(parentWindowHandle1);
//   Thread.sleep(1500);
//     //waitUntilPageLoad((By.id("id.leftmenuitem.photographer.bookings")));
//    // Assert pop-up is closed. and turn back to Orders for Photographer
//    // page.
//    WebElement element1 = driver.findElement(By
//        .id("id.leftmenuitem.photographer.bookings"));
//    assertEquals("Wrong text present", "Orders for Photographer",
//        element1.getText());   
//    // Log out
//    logout();
//  }
//
//  // Uploading final product
//  private void uploadFinalProduct(String orderId, int numberfileupload)
//      throws InterruptedException {
//
//    login("editor@esoftsystems.com", "Pass1234");
//    // Click on "Orders for Editing" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.for_editor.orders")).click();
//  
//    // Before opening the popup window get the handle of main window and
//    // save it.
//    String parentWindowHandle1 = driver.getWindowHandle();
//    // Click on Upload button.
//    String UploadButton = "id.button.upload." + orderId;
//    
//    waitUntilPageLoad((By.id(UploadButton)));
//    driver.findElement(By.id(UploadButton)).click();
//    // Identify the Upload Final Product pop up
//    WebDriver popup1 = findPopup("Upload Final Product");
//    
//    waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));
//    // Here we can perform operation in pop-up window.
//    WebElement element = popup1.findElement(By
//        .xpath("//div[@class ='v-window-header']"));
//    assertEquals("Wrong text present", "Upload Final Product",
//        element.getText()); 
//
//    switch (numberfileupload) {
//    case 1:
//      // Choose first file to upload.
//      UploadingFirstFile(popup1);
//
//      break;
//    case 2:
//      // Choose second file to upload.
//      UploadingSecondFile(popup1);
//      break;
//    case 3:
//      // Choose first file to upload.
//      UploadingFirstFile(popup1);
//      // Choose second file to upload.
//      UploadingSecondFile(popup1);          
//      CheckingCheckBoxtoDeliveryFinalProduct(popup1);
//      break;
//    default:
//      System.out.println("Without file upload");
//    }    
//    popup1.findElement(By.id("id.button.submit")).click();    
//   // waitUntilPageLoad((By.id(UploadButton)));
//  //  Thread.sleep(90000);
//    Thread.sleep(50000);
//    driver.switchTo().window(parentWindowHandle1);   
//    waitUntilPageLoad(By.id("id.button.logout"));
//    System.out.println("Trang Yen Co gang len, du co kho khan cach may cung khong bo cuoc");
//   //Thread.sleep(15000);
//    //Log out
//    logout();
//   //Thread.sleep(90000);
//      
//  }
//
//  private void UploadingFirstFile(WebDriver popup1)
//      throws InterruptedException {
//    // Select first file to upload
//    WebElement fileInput1 = popup1.findElement(By
//        .xpath(elements.FIRST_UPLOAD_FILE_BUTTON.toValue()));
//    fileInput1.sendKeys("/home/yen.lt/Videos/Video_for_test/VIDEO0012.mp4");    
//    waitUntilPageLoad(By.xpath(elements.FIRST_UPLOAD_FILE_BUTTON.toValue()));
//    // Click on first Upload file button.
//    popup1.findElement(By.xpath(elements.FIRST_UPLOAD_FILE_BUTTON.toValue())).click();
//    waitUntilPageLoad(By.xpath(elements.REPLACE_FIRST_UPLOAD_FILE_BUTTON.toValue()));
//  }
//
//  private void UploadingSecondFile(WebDriver popup1)
//      throws InterruptedException {
//    // Select second file to upload
//    WebElement fileInput2 = popup1.findElement(By
//        .xpath(elements.SECOND_UPLOAD_FILE_BUTTON.toValue()));
//    fileInput2.sendKeys("/home/yen.lt/Videos/Video_for_test/VIDEO0011.mp4");
//    //Thread.sleep(3000);
//    // Click on second Upload file button.
//    popup1.findElement(By.xpath(elements.SECOND_UPLOAD_FILE_BUTTON.toValue())).click();
//    waitUntilPageLoad(By.xpath(elements.REPLACE_SECOND_UPLOAD_FILE_BUTTON.toValue()));
//  }
//
// 
//  private void CheckingCheckBoxtoDeliveryFinalProduct(WebDriver popup1)
//      throws InterruptedException {
//    // Click on check box delivery.
//    popup1.findElement(
//        By.xpath("//div/span[@id='id.editing.final-product.upload.checkbox.delivery-order']/input"))
//        .click();
//    }
//  
//  
//  /**
//   * Logs the user in or throws exceptions.
//   * @param email of user
//   * @param password of user
//   * @throws InterruptedException
//   * @throws LoginException if the user cannot log in and a notification popup is shown
//   * @throws NoSuchElementException if the user cannot log but no popup is shown
//   */
//  protected void login(final String email, final String password) throws InterruptedException {
//    driver.get(baseUrl);
//    waitUntilPageLoad(By.id("id.locale.English"));
//    driver.findElement(By.id("id.locale.English")).click();
//    waitUntilPageLoad(By.id("id.signup.user.email"));
//    driver.findElement(By.id("id.signup.user.email")).clear();
//    driver.findElement(By.id("id.signup.user.email")).sendKeys(email);
//    driver.findElement(By.id("id.signup.user.password")).clear();
//    driver.findElement(By.id("id.signup.user.password")).sendKeys(password);
//    driver.findElement(By.id("id.button.login")).click();  
//    waitUntilPageLoad(By.id("id.button.logout"));
//  }
//
//  // Wait for page load
//  protected void waitUntilPageLoad(final By webelement) {
//    WebElement myDynamicElement = (new WebDriverWait(driver, WAIT_MAX_SECS_UNTIL_LOGGED_IN))
//        .until(new ExpectedCondition<WebElement>(){
//      @Override
//      public WebElement apply(WebDriver d) {
//        try {
//          if (d.findElement(By.className("v-Notification")) != null) {
//            throw new LoadPageException(
//                "Error trying to load page or find element");
//          }
//        } catch (NoSuchElementException nsee) {
//          //ignor for no -
//        }
//     
//        return d.findElement(webelement);
//      }});   
//  }
//  
//  
//  
//  
//  
//  
//  
//  /**
//   * Log out from the current F2 session.
//   * @throws InterruptedException
//   */
//  protected void logout() throws InterruptedException {
//    driver.findElement(By.id("id.button.logout")).click();
//    System.out.println(" At Log out page : He He");  
//    waitUntilPageLoad(By.id("id.locale.English"));
//  }
//
//  /**
//   * Find an open popup window by name and switch the driver into the context of that popup.
//   * @param name the name of the popup
//   * @return the popup window
//   *
//   * @deprecated seems to be unused. Does F2 have browser popups?
//   */
//  protected WebDriver findPopup(final String name) {
//    WebDriver popup = null;
//    Set<String> windowids1 = driver.getWindowHandles();
//    for (String popupHandle1 : windowids1) {
//      popup = driver.switchTo().window(popupHandle1);
//      System.out.print("popup: " + popup);
//      if (popup.getTitle().equals(name)) {
//        break;
//      }
//    }
//    return popup;
//  }
//  
//  @After
//  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
//  }
//
//  
//  
//}
//
//
//
