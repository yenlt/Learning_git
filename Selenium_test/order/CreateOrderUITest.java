//package com.esoftsystems.f2.uitest.order;
//
//import static org.junit.Assert.assertEquals;
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class CreateOrderUITest extends AbstractSeleniumTest {
//
//  public CreateOrderUITest(BrowserType browserType) throws Exception {
//    super(browserType);   
//  }
//  
//  private static final int WAIT_MAX_SECS_WHEN_CREATE_NEW_ORDER = 10;  
//  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10; 
//  
//  // Creating new order with product Film A1
//  @Test
//  public void testCreateOrderWithFilmA() throws Exception {
//    System.out.println("Test 1: testCreateOrderWithFilmA");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "yen.lt@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//
//    // Assert notification message present: Order created successfully
//    assertEquals("Wrong text present", "Order created successfully",element1.getText());
//    testHelpers.logout();
//    
//  }
//
//  // Creating new order with product Film C
//  @Test
//  public void testCreateOrderWithFilmC() throws Exception {
//    System.out.println("Test 2: testCreateOrderWithFilmC");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 2,
//        "Name Contact person", "yen.lt@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//
//    // Assert notification message present: Order created successfully
//    assertEquals("Wrong text present", "Order created successfully", element1.getText());
//    testHelpers.logout();
//    
//  }
//
//  // Creating new order with product Korrektur speak dansk
//  @Test
//  public void testCreateOrderWithProductSpeakDansk() throws Exception {
//    System.out.println("Test 3: testCreateOrderWithProductSpeakDansk");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 3,
//        "Name Contact person", "yen.lt@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//
//    // Assert notification message present: Order created successfully
//    assertEquals("Wrong text present", "Order created successfully", element1.getText());
//    testHelpers.logout();
//  }
//
//  // Creating new order with product Korrektur speak engelsk
//  @Test
//  public void testCreateOrderWithSpeakEnglish() throws Exception {
//    System.out.println("Test 4: testCreateOrderWithSpeakEnglish");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 4,
//        "Name Contact person", "yen.lt@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//
//    // Assert notification message present: Order created successfully
//    assertEquals("Wrong text present", "Order created successfully", element1.getText());
//    testHelpers.logout();
//  }
//
//  // Creating new order with product Speak German
//  @Test
//  public void testCreateOrderWithSpeakGerman() throws Exception {
//    System.out.println("Test 5: testCreateOrderWithSpeakGerman");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 5,
//        "Name Contact person", "yen.lt@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//
//    // Assert notification message present: Order created successfully
//    assertEquals("Wrong text present", "Order created successfully", element1.getText());
//    testHelpers.logout();
//  }
//
//  // Creating new order with product Re-editing movies
//  @Test
//  public void testCreateOrderWithReeditingMovies() throws Exception {
//    System.out.println("Test 6: testCreateOrderWithReeditingMovies");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 6,
//        "Name Contact person", "yen.lt@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//
//    // Assert notification message present: Order created successfully
//    assertEquals("Wrong text present", "Order created successfully", element1.getText());
//    testHelpers.logout();
//  }
//
//  // Creating new order with product Re-filming
//  @Test
//  public void testCreateOrderWithRefilming() throws Exception {
//    System.out.println("Test 7: testCreateOrderWithRefilming");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 7,
//        "Name Contact person", "yen.lt@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//
//    // Assert notification message present: Order created successfully
//    assertEquals("Wrong text present", "Order created successfully", element1.getText());
//    testHelpers.logout();
//  }  
//  
//  // Creating new order with Valid email:
//  // The character dot provided that it is not the first or last character,
//  // and provided also that it does not appear two or more times consecutively
//  @Test
//  public void testCreateOrderValidEmail1() throws Exception {
//    System.out.println("Test 8: testCreateOrderValidEmail1");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "a.little.unusual@example.com",
//        "01679199779", "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "Order created successfully", element1.getText());
//    
//  }
//
//  @Test
//  public void testCreateOrderValidEmail2() throws Exception {
//    System.out.println("Test 9: testCreateOrderValidEmail2");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person",
//        "a.little.more.unusual@dept.example.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "Order created successfully", element1.getText());
//    
//  }
//
//  // Creating new order with Valid email: The domain name with dash in between words
//  @Test
//  public void testCreateOrderValidEmail3() throws Exception {
//    System.out.println("Test 10: testCreateOrderValidEmail3");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "a.little.unusual@exa-mple.com",
//        "01679199779", "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "Order created successfully", element1.getText());
//    
//  }
//
//  // Creating new order with Valid email: The domain part may be an IP address
//  // literal, surrounded by square braces
//  @Test
//  public void testCreateOrderValidEmail4() throws Exception {
//    System.out.println("Test 11: testCreateOrderValidEmail4");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "smith@[192.168.2.1]", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "Order created successfully", element1.getText());
//   
//  }
//
//  // Creating new order with invalid email: The domain name contains underscore "_"
//  @Test
//  public void testCreateOrderInvalidEmail1() throws Exception {
//    System.out.println("Test 12: testCreateOrderInvalidEmail1");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "yen.lt@eso_ftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//    
//  }
//
//  // Creating new order with invalid email: Character dot(.) is last in local
//  // part.
//  @Test
//  public void testCreateOrderInvalidEmail2() throws Exception {
//    System.out.println("Test 13: testCreateOrderInvalidEmail2");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "Abc.@example.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//    
//  }
//
//  // Creating new order with invalid email: Character dot(.) is first in local
//  // part.
//  @Test
//  public void testCreateOrderInvalidEmail3() throws Exception {
//    System.out.println("Test 14: testCreateOrderInvalidEmail3");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", ".Abc@example.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//   
//  }
//
//  // Creating new order with invalid email: Character dot(.) is double
//  @Test
//  public void testCreateOrderInvalidEmail4() throws Exception {
//    System.out.println("Test 15: testCreateOrderInvalidEmail4");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "Abc..123@example.com ", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//    
//  }
//
//  // Creating new order with invalid email: An @ character must separate the
//  // local and domain parts
//  @Test
//  public void testCreateOrderInvalidEmail5() throws Exception {
//    System.out.println("Test 16: testCreateOrderInvalidEmail5");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "Abc.example.com ", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//    
//  }
//
//  // Creating new order with invalid email: Only one @ is allowed outside
//  // quotation marks
//  @Test
//  public void testCreateOrderInvalidEmail6() throws Exception {
//    System.out.println("Test 17: testCreateOrderInvalidEmail6");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "A@b@c@example.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//    
//  }
//
//  // Creating new order with invalid email: A Space special character is not
//  // allowed
//  @Test
//  public void testCreateOrderInvalidEmail7() throws Exception {
//    System.out.println("Test 18: testCreateOrderInvalidEmail7");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "Yen Le@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//    
//  }
//
//  // Creating new order with invalid email: A () special character is not
//  // allowed
//  @Test
//  public void testCreateOrderInvalidEmail8() throws Exception {
//    System.out.println("Test 19: testCreateOrderInvalidEmail8");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "Yen()Le@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//    
//  }
//
//  // Creating new order without product.
//  @Test
//  public void testCreateOrderWithoutProduct() throws Exception {
//    System.out.println("Test 20: testCreateOrderWithoutProduct");
//    WebElement element1 = fillNewOrderFormAndSubmit("", 0,
//        "Name Contact person", "yen.lt@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present:
//    // "There are errors when committing form."
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//   
//
//  }
//
//  // Creating new order with required Reference field is blank.
//  @Test
//  public void testCreateOrderWithRequiredReferenceBlank() throws Exception {
//    System.out.println("Test 21: testCreateOrderWithRequiredReferenceBlank");
//    WebElement element1 = fillNewOrderFormAndSubmit("", 1,
//        "Name Contact person", "yen.lt@esoftflow.com", "01679199779",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present:
//    // "There are errors when committing form."
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//   
//
//  }
//
//  // Creating new order with required Name Contact person field is blank.
//  @Test
//  public void testCreateOrderWithRequiredContactBlank() throws Exception {
//    System.out.println("Test 22: testCreateOrderWithRequiredContactBlank");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "", "yen.lt@esoftflow.com", "01679199779", "Name of Location",
//        "Address", "1234", "Ha Noi", "This is comment",
//        "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//    
//  }
//
//  // Creating new order with required Email field is blank.
//  @Test
//  public void testCreateOrderWithRequiredEmailBlank() throws Exception {
//    System.out.println("Test 23: testCreateOrderWithRequiredEmailBlank");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "", "01679199779", "Name of Location",
//        "Address", "1234", "Ha Noi", "This is comment",
//        "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//   
//  }
//
//  @Test
//  public void testCreateOrderInvalidTelephone() throws Exception {
//    System.out.println("Test 24: testCreateOrderInvalidTelephone");
//    WebElement element1 = fillNewOrderFormAndSubmit("Reference_Order", 1,
//        "Name Contact person", "yen.lt@esoftflow.com", "0167",
//        "Name of Location", "Address", "1234", "Ha Noi",
//        "This is comment", "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//  
//  }
//
//  @Test
//  public void testCreateOrderWithAllSpace() throws Exception {
//    System.out.println("Test 25: testCreateOrderWithAllSpace");
//    WebElement element1 = fillNewOrderFormAndSubmit("             ", 1,
//        "           ", "          ", "         ", "        ",
//        "          ", "           ", "            ", "            ",
//        "//div[@class = 'gwt-HTML']/h1");
//    // Assert notification message present
//    assertEquals("Wrong text present", "There are errors when committing form.", element1.getText());
//    
//  }
//
//  private WebElement fillNewOrderFormAndSubmit(String Ref, int product,
//      String NameC, String E, String Te, String NameL, String Address,
//      String Postal, String City, String Com,
//      final String waitForElementXPath) throws Exception {
//
//    testHelpers.login("customer@esoftsystems.com", "Pass1234");
//    testHelpers.waitUntilPageLoad(By.id("id.reference"));  
//    driver.findElement(By.id("id.reference")).sendKeys(Ref);
//
//    chooseProduct(product);
//    
//    driver.findElement(By.id("id.orderedProductInputDto.location.contactPerson")).sendKeys(NameC);   
//    driver.findElement(By.id("id.orderedProductInputDto.location.email")).sendKeys(E);    
//    driver.findElement(By.id("id.orderedProductInputDto.location.telephone")).sendKeys(Te);
//    driver.findElement(By.id("id.orderedProductInputDto.location.name")).sendKeys(NameL);   
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.address")).sendKeys(Address);   
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.postalCode")).sendKeys(Postal);   
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.city")).sendKeys(City); 
//    driver.findElement(By.id("id.order.form.comment")).sendKeys(Com);
//    driver.findElement(By.id("id.button.add_order")).click();
//    try {
//      return (new WebDriverWait(driver,
//          WAIT_MAX_SECS_WHEN_CREATE_NEW_ORDER))
//          .until(new ExpectedCondition<WebElement>() {
//            @Override
//            public WebElement apply(WebDriver d) {
//              return d.findElement(By.xpath(waitForElementXPath));
//            }
//          });
//    } catch (Exception e) {
//      e.printStackTrace();
//      throw new RuntimeException(
//          "error getting popup when creating order in ");
//    }
//  }
//
//  private void chooseProduct(int product) throws InterruptedException {
//    switch (product) {
//    case 1:
//      // Choose product: Film A1   
//      
//      driver.findElement(By.xpath(elements.SELECT_PRODUCT.toValue())).click();     
// 
//      testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_A.toValue()));
//      
//      driver.findElement(By.xpath(elements.PRODUCT_FILM_A.toValue())).click();       
////      // Choose add ons of Film A1
//      testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_A_ADD_ON1.toValue()));
//     
//      driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON1.toValue())).click();
//   
//      driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON2.toValue())).click();
////     
////      driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON3.toValue())).click();
////      testHelpers.waitUntilPageLoad(By.id(elements.SELECT_AMOUNT_FIELD.toValue()));
////     driver.findElement(By.id(elements.SELECT_AMOUNT_FIELD.toValue())).clear();
////     Thread.sleep(1000);
////     driver.findElement(By.id(elements.SELECT_AMOUNT_FIELD.toValue())).sendKeys("" + testHelpers.MAX_AMOUNT_PRODUCT);    
////      Thread.sleep(1000);
//      break;
//    case 2:
//      // Choose product: Film C      
//      driver.findElement(By.xpath(elements.SELECT_PRODUCT.toValue())).click();  
//      testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_C.toValue()));
//      driver.findElement(By.xpath(elements.PRODUCT_FILM_C.toValue())).click();      
//      testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_C_ADD_ON1.toValue()));
//      // Choose add ons of Film C
//      driver.findElement(By.xpath(elements.PRODUCT_FILM_C_ADD_ON1.toValue())).click();
//      driver.findElement(By.xpath(elements.PRODUCT_FILM_C_ADD_ON2.toValue())).click();
//      driver.findElement(By.xpath(elements.PRODUCT_FILM_C_ADD_ON3.toValue())).click();
//      driver.findElement(By.xpath(elements.PRODUCT_FILM_C_ADD_ON4.toValue())).click();
//      driver.findElement(By.xpath(elements.PRODUCT_FILM_C_ADD_ON5.toValue())).click();
////      driver.findElement(By.xpath(elements.PRODUCT_FILM_C_ADD_ON6.toValue())).click();
////      testHelpers.waitUntilPageLoad(By.id(elements.SELECT_AMOUNT_FIELD.toValue()));
////      driver.findElement(By.id(elements.SELECT_AMOUNT_FIELD.toValue())).clear();
////      Thread.sleep(1000);
////      driver.findElement(By.id(elements.SELECT_AMOUNT_FIELD.toValue())).sendKeys("" + testHelpers.MIN_AMOUNT_PRODUCT);         
//      break;
//    case 3:
//      // Choose product: Film Korrektur speak dansk     
//      driver.findElement(By.xpath(elements.SELECT_PRODUCT.toValue())).click();  
//      testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_SPEAK_DANSK.toValue()));
//      driver.findElement(By.xpath(elements.PRODUCT_SPEAK_DANSK.toValue())).click();     
//      Thread.sleep(1000);
//      break;
//    case 4:
//      // Choose product: Korrektur speak english      
//      driver.findElement(By.xpath(elements.SELECT_PRODUCT.toValue())).click();  
//      testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_SPEAK_ENGLISH.toValue()));
//      driver.findElement(By.xpath(elements.PRODUCT_SPEAK_ENGLISH.toValue())).click();     
//      Thread.sleep(1000);
//      break;
//    case 5:
//      // Choose product: Korrektur speak German     
//      driver.findElement(By.xpath(elements.SELECT_PRODUCT.toValue())).click();  
//      testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_SPEAK_GERMAN.toValue()));
//      driver.findElement(By.xpath(elements.PRODUCT_SPEAK_GERMAN.toValue())).click();
//      Thread.sleep(1000);
//      break;
//    case 6:
//      // Choose product: Re-editing movies      
//      driver.findElement(By.xpath(elements.SELECT_PRODUCT.toValue())).click();  
//      testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_SPEAK_RE_EDITING.toValue()));
//      driver.findElement(By.xpath(elements.PRODUCT_SPEAK_RE_EDITING.toValue())).click();
//      Thread.sleep(1000);
//      break;
//    case 7:
//      // Choose product: Re-filmning     
//      driver.findElement(By.xpath(elements.SELECT_PRODUCT.toValue())).click();  
//      testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_SPEAK_RE_FILMING.toValue()));
//      driver.findElement(By.xpath(elements.PRODUCT_SPEAK_RE_FILMING.toValue())).click();
//      Thread.sleep(1000);
//      break;
//    default:
//      System.out.println("Without product.");
//    }
//  } 
//}
//
//
