//package com.esoftsystems.f2.uitest.searchingfunction;
//
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class SearchatUnbookOrdersUITest extends AbstractSeleniumTest {
//  
//  public SearchatUnbookOrdersUITest(BrowserType browserType) throws Exception {
//      super(browserType);
//  }
//  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10; 
//  public static final int NUMBER_ORDERS = 5;
//  
//  @Test
//  public void testSearchwithNormalCharacter() throws Exception {
//    System.out.println("Test 1: testSearchatUnbookedOrders");
//    // Test data: Crate new orders
//    testHelpers.login("customer@esoftsystems.com", "Pass1234");
//    CreateNewOrderFilmA();
//    testHelpers.logout();
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    driver.findElement(By.id("id.null")).sendKeys("599");
//    driver.findElement(By.id("id.button.search")).click();
//    //Count result of Searching process.
//    Thread.sleep(3000);
//    int number_row = driver.findElements(By.xpath("//div/table[@class='v-table-table']/tbody/tr")).size();    
//    assertEquals(3,number_row);   
//    testHelpers.logout();
//  }
//  
//  @Test
//  public void testSearchwithSpecialCharacter1() throws Exception {
//    System.out.println("Test 2: testSearchwithSpecialCharacter1");
//
//    // Test data: Crate new orders
//    testHelpers.login("customer@esoftsystems.com", "Pass1234");
//    CreateNewOrderFilmA();
//    testHelpers.logout();
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    driver.findElement(By.id("id.null")).sendKeys("@#$%^&()");
//    driver.findElement(By.id("id.button.search")).click();
//    //Count result of Searching process.
//    Thread.sleep(3000);
//    int number_row = driver.findElements(By.xpath("//div/table[@class='v-table-table']/tbody/tr")).size();    
//    assertEquals(1,number_row);      
//    testHelpers.logout();
//  } 
//  
//  @Test
//  public void testSearchwithSpecialCharacter2() throws Exception {
//    System.out.println("Test 3: testSearchwithSpecialCharacter2");
//    // Test data: Crate new orders
//    testHelpers.login("customer@esoftsystems.com", "Pass1234");
//    CreateNewOrderFilmA();
//    testHelpers.logout();
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    driver.findElement(By.id("id.null")).sendKeys("1");
//    driver.findElement(By.id("id.button.search")).click();
//    //Count result of Searching process.
//    Thread.sleep(3000);
//    int number_row = driver.findElements(By.xpath("//div/table[@class='v-table-table']/tbody/tr")).size();    
//    assertEquals(2,number_row);           
//    Thread.sleep(3000);
//    testHelpers.logout();
//  }
//  
//  @Test
//  public void testSearchwithSpecialCharacter3() throws Exception {
//    System.out.println("Test 4: testSearchwithSpecialCharacter3");
//    // Test data: Crate new orders
//    testHelpers.login("customer@esoftsystems.com", "Pass1234");
//    CreateNewOrderFilmA();
//    testHelpers.logout();
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    driver.findElement(By.id("id.null")).sendKeys("");
//    driver.findElement(By.id("id.button.search")).click();
//    //Count result of Searching process.
//    Thread.sleep(3000);
//    int number_row = driver.findElements(By.xpath("//div/table[@class='v-table-table']/tbody/tr")).size();    
//    assertEquals(6,number_row);          
//    Thread.sleep(3000);
//    testHelpers.logout();
//  }
//  
//  //Not support for searching with "*"
//  
//  @Test
//  public void testSearchwithSpecialCharacter4() throws Exception {
//    System.out.println("Test 5: testSearchwithSpecialCharacter4");
//
//    // Test data: Crate new orders
//    testHelpers.login("customer@esoftsystems.com", "Pass1234");
//    CreateNewOrderFilmA();
//    testHelpers.logout();
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    driver.findElement(By.id("id.null")).sendKeys("*");
//    driver.findElement(By.id("id.button.search")).click();
//    //Count result of Searching process.
//    Thread.sleep(3000);
//    int number_row = driver.findElements(By.xpath("//div/table[@class='v-table-table']/tbody/tr")).size();    
//    assertEquals(0,number_row);       
//    Thread.sleep(3000);
//    testHelpers.logout();
//  }
//  
//  //Not support for searching with "*"
//  
//  @Test
//  public void testSearchwithnoDataFit() throws Exception {
//    System.out.println("Test 6: testSearchwithnoDataFit");
//    // Test data: Crate new orders
//    testHelpers.login("customer@esoftsystems.com", "Pass1234");
//    CreateNewOrderFilmA();
//    testHelpers.logout();
//    testHelpers.login("booker@esoftsystems.com", "Pass1234");
//    // Click on "Unbooked Orders" link at left menu bar.
//    driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//    Thread.sleep(1500);
//    driver.findElement(By.id("id.null")).sendKeys("abcdef");
//    driver.findElement(By.id("id.button.search")).click();
//    //Count result of Searching process.
//    Thread.sleep(3000);
//    int number_row = driver.findElements(By.xpath("//div/table[@class='v-table-table']/tbody/tr")).size();    
//    assertEquals(0,number_row);       
//    Thread.sleep(3000);
//    testHelpers.logout();
//  }
//  
//  // Creating new order.
//  private void CreateNewOrderFilmA() throws Exception {
//    
//    for (int x = 1; x < NUMBER_ORDERS; x = x + 1) {     
//      switch (x) {
//      case 1:
//        driver.findElement(By.id("id.reference")).sendKeys(
//            "Test FF 599 s");
//        FillOrderInfo();
//        driver.findElement(By.id("id.leftmenuitem.new.orders")).click();
//        Thread.sleep(1500);
//        break;
//      case 2:
//        driver.findElement(By.id("id.reference")).sendKeys(
//            "Test FF 599 searching function.");
//        FillOrderInfo();
//        driver.findElement(By.id("id.leftmenuitem.new.orders")).click();
//        Thread.sleep(1500);
//        break;
//      case 3:
//        driver.findElement(By.id("id.reference")).sendKeys(
//            "Test FF 599");
//        FillOrderInfo();
//        driver.findElement(By.id("id.leftmenuitem.new.orders")).click();
//        Thread.sleep(1500);
//        break;
//      case 4:
//        driver.findElement(By.id("id.reference")).sendKeys("123456abc");
//        FillOrderInfo();
//        driver.findElement(By.id("id.leftmenuitem.new.orders")).click();
//        Thread.sleep(1500);
//      case 5:
//        driver.findElement(By.id("id.reference"))
//            .sendKeys("XYZ_123@#$%^&()");
//        FillOrderInfo();
//        driver.findElement(By.id("id.leftmenuitem.new.orders")).click();
//        Thread.sleep(1500);
//        break;
//      default:
//        System.out.println("No create order");
//      }
//    }
//  }
//
//  // Creating new order.
//  private void FillOrderInfo() throws Exception {
//    // Choose product: Film A1
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A.toValue())).click();
//    // Choose add ons of Film A1
//    testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_A_ADD_ON1.toValue()));
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON1.toValue()))
//        .click();
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON2.toValue()))
//        .click();
////    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON3.toValue()))
////        .click();
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
//    Thread.sleep(1500);
//  }
//
//}
