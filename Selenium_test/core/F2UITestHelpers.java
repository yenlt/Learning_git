/*
 * @(#)CreateNewOrder.java
 *
 * Copyright 2012 by esoft systems (tm).
 * All rights reserved.
 */

package com.esoftsystems.f2.uitest.core;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public final class F2UITestHelpers {

  public static final Integer AMOUNT_PRODUCT = 15;
  public static final Integer MIN_AMOUNT_PRODUCT = 1;
  public static final Integer MAX_AMOUNT_PRODUCT = 20;

  private final WebDriver driver;
  public final String baseUrl;

  public F2UITestHelpers(WebDriver driver, String baseUrl) {
    this.driver = driver;
    this.baseUrl = baseUrl;
  }

  /**
   * Create a new order.
   */
  public void createNewOrder() throws Exception {
    login("customer@esoftsystems.com", "Pass1234");
    driver.findElement(By.id("id.reference")).sendKeys("Ref");

    // Choose product: Film A1    
    driver.findElement(By.xpath(elements.SELECT_PRODUCT.toValue())).click();
    waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_A.toValue()));
    driver.findElement(By.xpath(elements.PRODUCT_FILM_A.toValue())).click();

    // Choose add ons of Film A1
    waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_A_ADD_ON1.toValue()));
    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON1.toValue())).click();
    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON2.toValue())).click();
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON3.toValue())).click();
//    waitUntilPageLoad(By.id(elements.SELECT_AMOUNT_FIELD.toValue()));
//    driver.findElement(By.id(elements.SELECT_AMOUNT_FIELD.toValue())).clear();
//    Thread.sleep(1000);
//    driver.findElement(By.id(elements.SELECT_AMOUNT_FIELD.toValue())).sendKeys(AMOUNT_PRODUCT.toString());
//    Thread.sleep(1000);

    // Fill out order information
    driver.findElement(By.id("id.orderedProductInputDto.location.contactPerson")).sendKeys("NameC");
    driver.findElement(By.id("id.orderedProductInputDto.location.email")).sendKeys("yen.lt@esoftflow.com");
    driver.findElement(By.id("id.orderedProductInputDto.location.telephone")).sendKeys("123456789");
    driver.findElement(By.id("id.orderedProductInputDto.location.name")).sendKeys("Name Location");
    driver.findElement(By.id("id.orderedProductInputDto.location.address.address")).sendKeys("Address");
    driver.findElement(By.id("id.orderedProductInputDto.location.address.postalCode")).sendKeys("Postal 1234");
    driver.findElement(By.id("id.orderedProductInputDto.location.address.city")).sendKeys("City");
    driver.findElement(By.id("id.order.form.comment")).sendKeys("Comment");
    driver.findElement(By.id("id.button.add_order")).click();

    // This will fade out the "Order created" notification
    driver.findElement(By.tagName("body")).sendKeys(Keys.RETURN);
    logout();
  }

  public String parkOrder() throws InterruptedException {
    login("booker@esoftsystems.com", "Pass1234");

    // Click on "Unbooked Orders" link at left menu bar.
    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
    waitUntilPageLoad(By.xpath(elements.FIRST_PARK_BUTTON.toValue()));

    // Before opening the popup window get the handle of main window and save it.
    String parentWindowHandle1 = driver.getWindowHandle();

    // Click on Park button.
    WebElement element1 = driver.findElement(By.xpath(elements.FIRST_PARK_BUTTON.toValue()));

    // Get id of created order
    String originOrderId = element1.getAttribute("id");
    String newOrderId = originOrderId.substring(originOrderId.indexOf("id.button.park.") + "id.button.park.".length());
    element1.click();

    // Identify the New Parking pop up
    WebDriver popup1 = findPopup("New Parking");
    waitUntilPageLoad(By.xpath(elements.POPUP_HEADER.toValue()));  
    
    // Here we can perform operation in pop-up window.
    fillNewParkingForm(popup1,"2/21/14", "This is the comment");
    // Assert notification message present: The new booking was created successfully
    driver.switchTo().window(parentWindowHandle1);     
    
    Thread.sleep(5000);
    
 // This will fade out the "Order created" notification
    driver.findElement(By.tagName("body")).sendKeys(Keys.RETURN);
    logout();
    return newOrderId;
  }

  
  /**
   * Fill New Booking Form
   */
public void fillNewBookingForm(WebDriver popup, final String BookDateTime) throws InterruptedException { 
  
  // Drop down list : Photographer name.
  popup.findElement(By.xpath("//div[@id = 'id.booking.form.photographerName']/input")).clear();
  Thread.sleep(1000);
  popup.findElement(By.xpath("//div[@id = 'id.booking.form.photographerName']/input")).sendKeys("f2 photographer");
  Thread.sleep(1000);
  popup.findElement(By.xpath("//div[@id = 'id.booking.form.photographerName']/input")).click();
  
  Thread.sleep(1000);
  // Drop down list: Booking date and time
  popup.findElement(By.xpath("//div[@id = 'id.booking.form.bookingTime']/input")).sendKeys(BookDateTime);
  // Fill comment
  popup.findElement(By.id("id.booking.form.comment")).sendKeys("This is comment.");
  popup.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();  
  
}
  
  
  /**
   * Fill New Parking Form
   */
  public void fillNewParkingForm(WebDriver popup, final String parkDateTime,  final String comment)throws InterruptedException {
   
    // Drop down list: Activation date
    popup.findElement(By.xpath("//div[@id = 'id.parking.form.activationDate']/input")).clear();
    Thread.sleep(1000);
    popup.findElement(By.xpath("//div[@id = 'id.parking.form.activationDate']/input")).sendKeys(parkDateTime);
  
    // Fill comment
    popup.findElement(By.id("id.parking.form.comment")).sendKeys(comment);
    popup.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
  }

  /**
   * Booking for order which was created via #createNewOrder().
   * @return the order id
   * @throws Exception
   */
  public String bookingTheOrder() throws Exception {
    login("booker@esoftsystems.com", "Pass1234");

    // Click on "Unbooked Orders" link at left menu bar.
    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
    waitUntilPageLoad(By.xpath(elements.FIRST_BOOK_BUTTON.toValue()));

    // Before opening the popup window get the handle of main window and save it.
    String parentWindowHandle1 = driver.getWindowHandle();

    // Click on Book button.
    WebElement element1 = driver.findElement(By.xpath(elements.FIRST_BOOK_BUTTON.toValue()));

    // Get id of created order
    String originOrderId = element1.getAttribute("id");
    String newOrderId = originOrderId.substring(originOrderId.indexOf("id.button.book.") + "id.button.book.".length());
    element1.click();

    // Identify the New Booking pop up
    WebDriver popup1 = findPopup("New Booking");
    waitUntilPageLoad(By.xpath(elements.POPUP_HEADER.toValue()));

    // Here we can perform operation in pop-up window.
    fillNewBookingForm(popup1, "11/30/13 08:54 AM");
    popup1.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();

    // Assert notification message present: The new booking was created successfully
    driver.switchTo().window(parentWindowHandle1);
    Thread.sleep(5000);
 // This will fade out the "Order created" notification
    driver.findElement(By.tagName("body")).sendKeys(Keys.RETURN);
    logout();
    return newOrderId;
  }

  /**
   * Log out from the current F2 session.
   * @throws InterruptedException
   */
  public void logout() throws InterruptedException {
    driver.findElement(By.id("id.button.logout")).click();    
    waitUntilPageLoad(By.id("id.locale.English"));
  }

  /**
   * Logs the user in or throws exceptions.
   * @param email of user
   * @param password of user
   * @throws InterruptedException
   * @throws NoSuchElementException if the user cannot log but no popup is shown
   */
  public void login(final String email, final String password) throws InterruptedException {
    driver.get(baseUrl);
    waitUntilPageLoad(By.id("id.locale.English"));
    driver.findElement(By.id("id.locale.English")).click();
    waitUntilPageLoad(By.id("id.signup.user.email"));
    driver.findElement(By.id("id.signup.user.email")).clear();
    driver.findElement(By.id("id.signup.user.email")).sendKeys(email);
    driver.findElement(By.id("id.signup.user.password")).clear();
    driver.findElement(By.id("id.signup.user.password")).sendKeys(password);
    driver.findElement(By.id("id.button.login")).click();
    waitUntilPageLoad(By.id("id.button.logout"));
  }

  /**
   * Wait until an element identified by a selector is present on the page. Internally delegates to a new
   * {@code WebDriverWait}
   *
   * @param selector the selector to wait for
   * @return the web element
   * @see WebDriverWait
   */
  public WebElement waitUntilPageLoad(final By selector, final int timeOutSeconds) {
    return new WebDriverWait(driver, timeOutSeconds).until(new ExpectedCondition<WebElement>() {
      @Override
      public WebElement apply(WebDriver d) {
        try {
          return d.findElement(selector);
        } catch (NoSuchElementException e) {
          return null;
        }
      }
    });
  }

  /**
   * Same as {@link #waitUntilPageLoad(org.openqa.selenium.By, int)} with a default value of 10 seconds for timeout.
   * @param selector the selector
   * @return the web element
   *
   * @see #waitUntilPageLoad(org.openqa.selenium.By)
   */
  public WebElement waitUntilPageLoad(final By selector) {
    return waitUntilPageLoad(selector, 10);
  }

  /**
   * Find an open popup window by name and switch the driver into the context of that popup.
   * @param name the name of the popup
   * @return the popup window
   */
  public WebDriver findPopup(final String name) {
    WebDriver popup = null;
    Set<String> windowids1 = driver.getWindowHandles();
    for (String popupHandle1 : windowids1) {
      popup = driver.switchTo().window(popupHandle1);
      System.out.print("popup: " + popup);
      if (popup.getTitle().equals(name)) {
        break;
      }
    }
    return popup;
  }

  /**
   * Mark an order as photographed.
   * @param orderId the id of the order
   */
  public void markOrderPhotographed(String orderId) throws Exception {
    
    login("photographer@esoftsystems.com", "Pass1234");

    // Click on "Orders for Photographer" link at left menu bar.
    driver.findElement(By.id("id.leftmenuitem.photographer.bookings")).click();

    // Before opening the popup window get the handle of main window and save it.
    String parentWindowHandle1 = driver.getWindowHandle();
    String PhotographedButton = "id.button.photographed." + orderId;
    waitUntilPageLoad(By.id(PhotographedButton));

    // Click on Photographed button.
    driver.findElement(By.id(PhotographedButton)).click();

    // Identify the New Booking pop up
    WebDriver popup1 = findPopup("Confirm");
    waitUntilPageLoad(By.xpath(elements.POPUP_HEADER.toValue()));

    // Here we can perform operation in pop-up window.
    WebElement element = popup1.findElement(By.xpath(elements.POPUP_HEADER.toValue()));
    assertEquals("Wrong text present", "Confirm", element.getText());
    popup1.findElement(By.id("id.button.ok")).click();
    driver.switchTo().window(parentWindowHandle1);
    Thread.sleep(1500);

    // Assert pop-up is closed. and turn back to Orders for Photographer page.
    WebElement element1 = driver.findElement(By.id("id.leftmenuitem.photographer.bookings"));
    assertEquals("Wrong text present", "Orders for Photographer", element1.getText());
    
 // This will fade out the "Order created" notification
    driver.findElement(By.tagName("body")).sendKeys(Keys.RETURN);
    logout();
  }

  /**
   * Upload the final product for an order.
   * @param orderId the order id
   * @param numberfileupload the number of files to upload
   */
  public void uploadFinalProduct(String orderId, int numberfileupload) throws Exception {
    login("editor@esoftsystems.com", "Pass1234");

    // Click on "Orders for Editing" link at left menu bar.
    driver.findElement(By.id("id.leftmenuitem.for_editor.orders")).click();

    // Before opening the popup window get the handle of main window and save it.
    String parentWindowHandle1 = driver.getWindowHandle();

    // Click on Upload button.
    String UploadButton = "id.button.upload." + orderId;
    waitUntilPageLoad((By.id(UploadButton)));
    driver.findElement(By.id(UploadButton)).click();

    // Identify the Upload Final Product pop up
    WebDriver popup1 = findPopup("Upload Final Product");
    waitUntilPageLoad(By.xpath("//div[@class ='v-window-header']"));

    // Here we can perform operation in pop-up window.
    WebElement element = popup1.findElement(By.xpath("//div[@class ='v-window-header']"));
    assertEquals("Wrong text present", "Upload Final Product", element.getText());

    switch (numberfileupload) {
      case 1:
        // Choose first file to upload.
        uploadFirstFile(popup1);
        break;
      case 2:
        // Choose second file to upload.
        uploadSecondFile(popup1);
        break;
      case 3:
        // Choose first file to upload.
        uploadFirstFile(popup1);
        // Choose second file to upload.
        uploadSecondFile(popup1);
        CheckingCheckBoxtoDeliveryFinalProduct(popup1);
        break;
      default:
        System.out.println("Without file upload");
    }
    
    popup1.findElement(By.id("id.button.submit")).click();
    driver.switchTo().window(parentWindowHandle1);
    waitUntilPageLoad(By.id("id.button.logout"));
 // This will fade out the "Order created" notification
    driver.findElement(By.tagName("body")).sendKeys(Keys.RETURN);
    logout();
  }

  private void uploadFirstFile(WebDriver popup) throws Exception {
    // Select first file to upload
    WebElement fileInput1 = popup.findElement(By.xpath(elements.FIRST_UPLOAD_FILE_BUTTON.toValue()));
    fileInput1.sendKeys("/home/yen.lt/Videos/Video_for_test/VIDEO0012.mp4");
    waitUntilPageLoad(By.xpath(elements.FIRST_UPLOAD_FILE_BUTTON.toValue()));

    // Click on first Upload file button.
    popup.findElement(By.xpath(elements.FIRST_UPLOAD_FILE_BUTTON.toValue())).click();
    waitUntilPageLoad(By.xpath(elements.REPLACE_FIRST_UPLOAD_FILE_BUTTON.toValue()));
  }

  private void uploadSecondFile(WebDriver popup) throws Exception {
    // Select second file to upload
    WebElement fileInput2 = popup.findElement(By.xpath(elements.SECOND_UPLOAD_FILE_BUTTON.toValue()));
    fileInput2.sendKeys("/home/yen.lt/Videos/Video_for_test/VIDEO0011.mp4");

    // Click on second Upload file button.
    popup.findElement(By.xpath(elements.SECOND_UPLOAD_FILE_BUTTON.toValue())).click();
    waitUntilPageLoad(By.xpath(elements.REPLACE_SECOND_UPLOAD_FILE_BUTTON.toValue()));
  }

  private void CheckingCheckBoxtoDeliveryFinalProduct(WebDriver popup1) throws Exception {
    // Click on check box delivery.
    popup1.findElement(
        By.xpath("//div/span[@id='id.editing.final-product.upload.checkbox.delivery-order']/input")).click();
  }
  
  /**
   * 
   * @param comment,
   * @param confirm_message
   * @throws InterruptedException
   */
  // Fill Comment Form
  public void workWithCommentPopupWindow(final String comment,final String confirm_message) throws InterruptedException{
    
     // Identify the Add Comment pop up
     WebDriver popup1 = findPopup("Add Comment");
     
     // Here we can perform operation in pop-up window.
     WebElement element = popup1.findElement(By.xpath("//div[@class ='v-window-header']"));
     assertEquals("Wrong text present", "Add Comment", element.getText());
     WebElement frame = popup1.findElement(By.className("gwt-RichTextArea"));  
     popup1.switchTo().frame(frame);
     popup1.findElement(By.xpath("html/body")).sendKeys(comment);  
     
     // We have to get back out of the Iframe with the following code:
     popup1.switchTo().defaultContent();
     popup1.findElement(By.id("id.button.add_comment")).click();
     Thread.sleep(1000);
     
     // Assert notification message present: Comment created successfully
     WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']"));   
     assertEquals("Wrong text present", confirm_message, element1.getText());   
}  
  
}