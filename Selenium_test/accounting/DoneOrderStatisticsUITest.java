//package com.esoftsystems.f2.uitest.accounting;
//
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.BrowserType;
//
//public class DoneOrderStatisticsUITest extends AbstractSeleniumTest {
//  
//  public DoneOrderStatisticsUITest(BrowserType browserType) throws Exception {
//      super(browserType);
//  }
//  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//
//  @Test
//  public void testDoneOrderStatisticsNoData() throws Exception {
//    System.out.println("Test 1: testDoneOrderStatisticsNoData"); 
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    driver.findElement(By.id("id.leftmenuitem.statistic.listdoneorder")).click();   
//    testHelpers.waitUntilPageLoad(By.id("id.button.submit")); 
//    Thread.sleep(1000);
//    fillDoneOrderStatisticsForm("Feb/2013");    
//    Thread.sleep(2000);       
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
//    assertEquals("Wrong text present","The system did not find any results.", element1.getText());
//    testHelpers.logout();
//  }
//    
//  @Test
//  public void testDoneOrderStatisticsInvalidDate() throws Exception {
//    System.out.println("Test 2: testDoneOrderStatisticsInvalidDate");  
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    driver.findElement(By.id("id.leftmenuitem.statistic.listdoneorder")).click();   
//    testHelpers.waitUntilPageLoad(By.id("id.button.submit"));    
//    Thread.sleep(1000);
//    fillDoneOrderStatisticsForm("abc/2013");    
//    Thread.sleep(2000);       
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));         
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    testHelpers.logout();
//  }
//  
//  @Test
//  public void testDoneOrdersStatisticsWrongDateFormat() throws Exception {
//    System.out.println("Test 3: testDoneOrdersStatisticsWrongDateFormat");  
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    driver.findElement(By.id("id.leftmenuitem.statistic.listdoneorder")).click();   
//    testHelpers.waitUntilPageLoad(By.id("id.button.submit"));   
//    Thread.sleep(1000);
//    fillDoneOrderStatisticsForm("2/2013");    
//    Thread.sleep(2000);       
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));         
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    testHelpers.logout();
//  }
//  
//  // Manual Testing
//  @Test
//  public void testDoneOrdersStatisticsNotNull() throws Exception {
//    System.out.println("Test 4 - Manual Testing: testDoneOrdersStatisticsNotNull");       
//    assertTrue(true);
//  }
//
//  /**
//   * Fill New Booking statistics Form
//   */
//    public void fillDoneOrderStatisticsForm(final String fromDate) throws InterruptedException {  
//    driver.findElement(By.xpath("//div[@id = 'id.statistic.form.forMonth']/input")).sendKeys(fromDate); 
//    driver.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
//    Thread.sleep(2000);     
//    }
//}