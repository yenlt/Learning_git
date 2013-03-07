//
//package com.esoftsystems.f2.uitest.accounting;
//
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.BrowserType;
//
//public class StatisticsFilesEachPhotographerUITest extends AbstractSeleniumTest {
//  
//  public StatisticsFilesEachPhotographerUITest(BrowserType browserType) throws Exception {
//      super(browserType);
//  }
//  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//
//  @Test
//  public void testPhotographerStatisticsBlankPhotographerName() throws Exception {    
//    System.out.println("Test 1: testPhotographerStatisticsBlankPhotographerName");
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    Thread.sleep(2000);  
//    driver.findElement(By.id("id.leftmenuitem.statistic.listphotographer")).click();   
//    testHelpers.waitUntilPageLoad(By.id("id.button.submit")); 
//    Thread.sleep(1000);    
//    fillPhotographerStatisticsForm("f2 photographer", "3/7/13","3/31/13");
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
//    assertEquals("Wrong text present","The system did not find any results.", element1.getText());
//    testHelpers.logout();
//  }
//    
//  @Test
//  public void testPhotographerStatisticsInvalidPhotographerName() throws Exception { 
//    System.out.println("Test 2: testPhotographerStatisticsInvalidPhotographerName");
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    Thread.sleep(2000);    
//    fillPhotographerStatisticsForm("f2 gdfggf", "3/7/13","4/20/13");
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    testHelpers.logout();
//  }
//  
//  @Test
//  public void testFromDateInvalidDate() throws Exception { 
//    System.out.println("Test 3: testFromDateInvalidDate");
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    Thread.sleep(2000);    
//    fillPhotographerStatisticsForm("f2 photographer", "fgdgsfstf","4/20/13");
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    testHelpers.logout();
//  }
//  
//  @Test
//  public void testFromDateWrongDateFormat() throws Exception { 
//    System.out.println("Test 4: testFromDateWrongDateFormat");
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    Thread.sleep(2000);    
//    fillPhotographerStatisticsForm("f2 photographer", "2-5-13","4/20/13");
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    testHelpers.logout();
//  }
//  
//  @Test
//  public void testToDateInvalidDate() throws Exception { 
//    System.out.println("Test 5: testToDateInvalidDate");
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    Thread.sleep(2000);    
//    fillPhotographerStatisticsForm("f2 photographer", "asd","14545656");
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    testHelpers.logout();
//  }
//  
//  @Test
//  public void testToDateWrongDateFormat() throws Exception { 
//    System.out.println("Test 6: testToDateWrongDateFormat");
//    testHelpers.login("accounting@esoftsystems.com", "Pass1234");  
//    Thread.sleep(2000);    
//    fillPhotographerStatisticsForm("f2 photographer", "2-20-13","4-20-13");
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));    
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//    testHelpers.logout();
//  }
//    
//  // Manual testing
//  @Test
//  public void testPhotographerStatisticsNotNull() throws Exception {      
//    System.out.println("Test 7 - Manual Testing: testPhotographerStatisticsNotNull");
//    assertTrue(true);
//  }
//
//  /**
//   * Fill New Booking statistics Form
//   */
//public void fillPhotographerStatisticsForm(final String photographerName, final String fromDate, final String toDate) throws InterruptedException {
//  
//  // Drop down list : Photographer name.
//  driver.findElement(By.xpath("//div[@id = 'id.booking.form.photographerName']/input")).clear();
//  Thread.sleep(1000);
//  driver.findElement(By.xpath("//div[@id = 'id.booking.form.photographerName']/input")).sendKeys("f2 photographer");
//  Thread.sleep(1000);
//  driver.findElement(By.xpath("//div[@id = 'id.booking.form.photographerName']/input")).click();  
//  Thread.sleep(1000);
//  driver.findElement(By.xpath("//div[@id = 'id.statistic.form.fromDate']/input")).sendKeys(fromDate);
//  Thread.sleep(1000);
//  driver.findElement(By.xpath("//div[@id = 'id.statistic.form.toDate']/input")).sendKeys(toDate);  
//  Thread.sleep(1000);
//  driver.findElement(By.xpath("//div[@id = 'id.button.submit']/span/span")).click();
//  Thread.sleep(2000);
//  }
//
//}