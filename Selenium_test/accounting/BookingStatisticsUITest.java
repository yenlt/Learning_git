
package com.esoftsystems.f2.uitest.accounting;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
import com.esoftsystems.f2.uitest.core.BrowserType;

public class BookingStatisticsUITest extends AbstractSeleniumTest {
  
  public BookingStatisticsUITest(BrowserType browserType) throws Exception {
      super(browserType);
  }
  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;

  @Test
  public void testBookingStatisticsNoData() throws Exception {    
    System.out.println("Test 1: testBookingStatisticsNoData");
    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
   // Thread.sleep(2000);  
    // 
    fillNewBookingStatisticsForm("2/20/13","4/20/13");
    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
    assertEquals("Wrong text present","The system did not find any results.", element1.getText());
    testHelpers.logout();
  }
    
//  @Test
//  public void testBookingStatisticsInvalidDate() throws Exception { 
//    System.out.println("Test 2: testBookingStatisticsInvalidDate");
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    Thread.sleep(2000);    
//    fillNewBookingStatisticsForm("rgergs","4/20/13");
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    testHelpers.logout();
//  }
//  
//  @Test
//  public void testBookingStatisticsWrongDateFormat() throws Exception { 
//    System.out.println("Test 3: testBookingStatisticsWrongDateFormat");
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    Thread.sleep(2000);    
//    fillNewBookingStatisticsForm("1-2-13","4/20/13");
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    testHelpers.logout();
//  }
//  
//  // Manual testing
//  @Test
//  public void testBookingStatisticsNotNull() throws Exception {      
//    System.out.println("Test 4 - Manual Testing: testBookingStatisticsNotNull");
//    assertTrue(true);
//  }

  /**
   * Fill New Booking statistics Form
   */
public void fillNewBookingStatisticsForm(final String fromDate, final String toDate) throws InterruptedException {
  
  driver.findElement(By.xpath("//div[@id = 'id.statistic.form.fromDate']/input")).sendKeys(fromDate);

  driver.findElement(By.xpath("//div[@id = 'id.statistic.form.toDate']/input")).sendKeys(toDate);  
 
  driver.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
  waitUntilPageLoad
  //Thread.sleep(2000);
  }


///**
// * Fill New Booking statistics Form
// */
//public void wait_for_text_present() throws InterruptedException {
//
//  assertEquals("Wrong text present","The system did not find any results.", element1.getText());
//  WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));  
//
//}

}