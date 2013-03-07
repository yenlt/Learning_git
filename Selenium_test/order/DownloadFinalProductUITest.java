//package com.esoftsystems.f2.uitest.order;
//
//import static org.junit.Assert.assertTrue;
//import org.junit.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class DownloadFinalProductUITest extends AbstractSeleniumTest {
//
//  public DownloadFinalProductUITest(BrowserType browserType) throws Exception {
//    super(browserType);
//  }
//
//  // Uploading all file and delivery final product.
//  @Test
//  public void testDownloadFinalProductSuccessfully() throws Exception {
//    System.out.println("Test1: testDownloadFinalProductSuccessfully");
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.bookingTheOrder();
//    testHelpers.markOrderPhotographed(orderId);
//    testHelpers.uploadFinalProduct(orderId, 3);
//    testHelpers.login("customer@esoftsystems.com", "Pass1234");
//    
// // Click on "Done Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.done.orders")).click();    
//    String DownloadButton = "id.button.download." + orderId;
//    testHelpers.waitUntilPageLoad(By.id(DownloadButton));    
//    driver.findElement(By.id(DownloadButton)).click();   
//    WebDriver popup1 = testHelpers.findPopup("Download files");
//    testHelpers.waitUntilPageLoad(By.xpath(elements.POPUP_HEADER.toValue()));   
//    WebElement element1 = popup1.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/a"));
//   
//    // Get id of created order
//    String url_download_file = element1.getAttribute("href"); System.out.println(url_download_file);   
//    
//    popup1.get(url_download_file);
//    System.out.println("Manual Testing: Download file successfully from pop-up download");
//    Thread.sleep(1000);    
//    assertTrue(true);    
//  }
//
//}
//
//
//
//
