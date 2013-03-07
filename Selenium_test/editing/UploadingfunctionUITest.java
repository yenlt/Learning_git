//package com.esoftsystems.f2.uitest.editing;
//
//import static org.junit.Assert.assertTrue;
//import org.junit.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.BrowserType;
//
//public class UploadingfunctionUITest extends AbstractSeleniumTest {
//
//  public UploadingfunctionUITest(BrowserType browserType) throws Exception {
//    super(browserType);
//  }
//
//  // Uploading first file of final product.
//  @Test
//  public void testEditorUploadFirstFileofFinalProduct() throws Exception {
//    System.out.println("Test1: testEditorUploadFirstFileofFinalProduct");
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.bookingTheOrder();
//    testHelpers.markOrderPhotographed(orderId);
//    testHelpers.uploadFinalProduct(orderId, 1);
//  }
//
//  // Uploading second file of final product.
//  @Test
//  public void testEditorUploadSecondFileofFinalProduct() throws Exception {
//    System.out.println("Test2: testEditorUploadSecondFileofFinalProduct");
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.bookingTheOrder();
//    testHelpers.markOrderPhotographed(orderId);
//    testHelpers.uploadFinalProduct(orderId, 2);
//  }
//  
//  // Uploading all file and delivery final product.
//  @Test
//  public void testEditorUploadAllFileandDeliverFinalProduct() throws Exception {
//    System.out.println("Test3: testEditorUploadAllFileandDeliverFinalProduct");
//    testHelpers.createNewOrder();
//    String orderId = testHelpers.bookingTheOrder();
//    testHelpers.markOrderPhotographed(orderId);
//    testHelpers.uploadFinalProduct(orderId, 3);
//  }
//  
////Uploading second file of final product.
// @Test
// public void testChangeStatusFromPhotographedtoEdited() throws Exception {
//  //To-Do
//   assertTrue(true);
// }
//
//
//// Manual testing: Check send delivered email after deliver final products.
//
//@Test
//public void testSendDeliveredEmailafterDeliverFinalProducts() throws Exception {
//   System.out.println("Test4-Manual Testing: testEditorUploadAllFileandDeliverFinalProduct");
//   assertTrue(true);
//}
//}
//
//
