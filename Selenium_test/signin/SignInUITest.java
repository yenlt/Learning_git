//package com.esoftsystems.f2.uitest.signin;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.LoadPageException;
//import com.esoftsystems.f2.uitest.core.elements;
//
///**
// * Test signin in.
// *
// * @author Christoffer Magnussen
// * @author Yen
// * @since 1.0
// *
// */
//public class SignInUITest extends AbstractSeleniumTest {
//	
//	public SignInUITest(BrowserType browserType) throws Exception {
//	    super(browserType);
//	}
//	public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//
//  @Test
//  public void testTitleofSignInPage() throws Exception {
//    System.out.println("Test 0: testTitleofSignInPage");
//    testHelpers.login("all_roles@esoftsystems.com", "Pass1234");
//    // Check the title of the page    
//     assertEquals("Wrong page title", "esoft systems", driver.getTitle());
//  }
//  
//  // Text present
//	@Test
//	public void testTextPresent() throws Exception {
//		System.out.println("Test 1: testTextPresent");
//		driver.get(FRONTEND_BASE_URL);
//		driver.findElement(By.id("id.locale.English")).click();
//	  	Thread.sleep(1000);
//		WebElement element = driver.findElement(By.className("v-button-caption"));		
//		String text = element.getText();
//		assertEquals("English", text);		
//		WebElement element1 = driver.findElement(By.id("id.button.login"));
//		assertEquals("Wrong text present", "Sign in", element1.getText());				
//		WebElement element2 = driver.findElement(By.id("id.button.cancel"));
//		assertEquals("Wrong text present", "Cancel", element2.getText());		
//	}
//
//	// Logged in as all_roles
//	@Test
//	public void testSignInAllRoles() throws Exception {
//	  System.out.println("Test 2: testSignInAllRoles");	
//		testHelpers.login("all_roles@esoftsystems.com", "Pass1234");
//		WebElement element1 = driver.findElement(By.xpath(elements.LABEL.toValue()));		
//		assertTrue(element1.isDisplayed());
//		assertEquals("Wrong text present", "f2 user all roles |", element1.getText());
//		// Checking New Order menu display or not
//		WebElement element2 = driver.findElement(By.id("id.leftmenuitem.new.orders"));
//		assertEquals("Wrong text present", "New Order", element2.getText());
//		// Checking Open Orders menu display or not
//		WebElement element3 = driver.findElement(By.id("id.leftmenuitem.open.orders"));
//		assertEquals("Wrong text present", "Open Orders", element3.getText());
//		// Checking Done Orders menu display or not
//		WebElement element4 = driver.findElement(By.id("id.leftmenuitem.done.orders"));
//		assertEquals("Wrong text present", "Done Orders", element4.getText());
//		// Checking Cancelled Orders menu display or not
//		WebElement element5 = driver.findElement(By.id("id.leftmenuitem.cancelled.orders"));
//		assertEquals("Wrong text present", "Cancelled Orders", element5.getText());
//		// Checking Unbooked Orders menu display or not
//		WebElement element6 = driver.findElement(By.id("id.leftmenuitem.unbooked.orders"));
//		assertEquals("Wrong text present", "Unbooked Orders", element6.getText());
//		// Checking Booked Orders menu display or not
//		WebElement element7 = driver.findElement(By.id("id.leftmenuitem.booked.orders"));
//		assertEquals("Wrong text present", "Booked Orders", element7.getText());
//		// Checking Orders for Editing menu display or not
//		WebElement element8 = driver.findElement(By.id("id.leftmenuitem.for_editor.orders"));
//		assertEquals("Wrong text present", "Orders for Editing", element8.getText());
//	    //Checking Orders for Photographer menu display or not
//		WebElement element11 = driver.findElement(By.id("id.leftmenuitem.photographer.bookings"));
//		assertEquals("Wrong text present", "Orders for Photographer", element11.getText());	
//	    // Checking Booking statistics menu display or not
//		WebElement element12 = driver.findElement(By.id("id.leftmenuitem.statistic.listbooking"));
//		assertEquals("Wrong text present", "Booking statistics", element12.getText());	
//		// Checking Parked Orders menu display or not
//		WebElement element13 = driver.findElement(By.id("id.leftmenuitem.parked.orders"));
//		assertEquals("Wrong text present", "Parked Orders", element13.getText());	
//		// Checking Done order statistics menu display or not
//		WebElement element14 = driver.findElement(By.id("id.leftmenuitem.statistic.listdoneorder"));
//		assertEquals("Wrong text present", "Done order statistics", element14.getText());
//	}
//
//	// Logged in as Customer roles
//	@Test
//	public void testSignInCustomerRole() throws Exception {
//	  System.out.println("Test 3: testSignInCustomerRole");
//		testHelpers.login("customer@esoftsystems.com", "Pass1234");
//		Thread.sleep(5000);
//		// assert element present		
//		//WebElement element1 = driver.findElement(By.id("user.info.label"));
//		WebElement element1 = driver.findElement(By.xpath(elements.LABEL.toValue()));		
//		assertTrue(element1.isDisplayed());
//		assertEquals("Wrong text present", "f2 customer |", element1.getText());
//		// Checking New Order menu display or not
//		WebElement element2 = driver.findElement(By.id("id.leftmenuitem.new.orders"));
//		assertEquals("Wrong text present", "New Order", element2.getText());
//		// Checking Open Orders menu display or not
//		WebElement element3 = driver.findElement(By.id("id.leftmenuitem.open.orders"));
//		assertEquals("Wrong text present", "Open Orders", element3.getText());
//		// Checking Done Orders menu display or not
//		WebElement element4 = driver.findElement(By.id("id.leftmenuitem.done.orders"));
//		assertEquals("Wrong text present", "Done Orders", element4.getText());
//		// Checking Cancelled Orders menu display or not
//		WebElement element5 = driver.findElement(By.id("id.leftmenuitem.cancelled.orders"));
//		assertEquals("Wrong text present", "Cancelled Orders", element5.getText());		
//	}	
//	
//	// Logged in as Booker roles
//	@Test
//	public void testSignInBookerRole() throws Exception {
//		System.out.println("Test 4: testSignInBookerRole");
//		testHelpers.login("booker@esoftsystems.com", "Pass1234");
//		// assert element present				
//		WebElement element1 = driver.findElement(By.xpath(elements.LABEL.toValue()));	
//		assertTrue(element1.isDisplayed());
//		assertEquals("Wrong text present", "f2 booker |", element1.getText());
//		// Checking Done Orders menu display or not
//		WebElement element4 = driver.findElement(By.id("id.leftmenuitem.done.orders"));
//		assertEquals("Wrong text present", "Done Orders", element4.getText());
//		// Checking Unbooked Orders menu display or not
//		WebElement element6 = driver.findElement(By.id("id.leftmenuitem.unbooked.orders"));
//		assertEquals("Wrong text present", "Unbooked Orders", element6.getText());
//		// Checking Booked Orders menu display or not
//		WebElement element7 = driver.findElement(By.id("id.leftmenuitem.booked.orders"));
//		assertEquals("Wrong text present", "Booked Orders", element7.getText());
//		// Checking Parked Orders menu display or not
//		WebElement element13 = driver.findElement(By.id("id.leftmenuitem.parked.orders"));
//		assertEquals("Wrong text present", "Parked Orders", element13.getText());		
//	}
//
//	// Logged in as Editor roles
//	@Test
//	public void testSignInEditorRole() throws Exception {
//		System.out.println("Test 5: testSignInEditorRole");
//		testHelpers.login("editor@esoftsystems.com", "Pass1234");
//		// assert element present				
//		WebElement element1 = driver.findElement(By.xpath(elements.LABEL.toValue()));
//		assertTrue(element1.isDisplayed());
//		assertEquals("Wrong text present", "f2 editor |", element1.getText());
//		// Checking Done Orders menu display or not
//		WebElement element4 = driver.findElement(By.id("id.leftmenuitem.done.orders"));
//		assertEquals("Wrong text present", "Done Orders", element4.getText());
//		// Checking Orders for Editing menu display or not
//		WebElement element8 = driver.findElement(By.id("id.leftmenuitem.for_editor.orders"));
//		assertEquals("Wrong text present", "Orders for Editing", element8.getText());		
//	}
//
//	// Logged in as Photographer roles
//	@Test
//	public void testSignInPhotographerRole() throws Exception {
//		System.out.println("Test 6: testSignInPhotographerRole");
//		testHelpers.login("photographer@esoftsystems.com", "Pass1234");
//		// assert element present				
//		WebElement element1 = driver.findElement(By.xpath(elements.LABEL.toValue()));		
//		assertTrue(element1.isDisplayed());
//		assertEquals("Wrong text present", "f2 photographer |", element1.getText());
//		// Checking Done Orders menu display or not
//		WebElement element4 = driver.findElement(By.id("id.leftmenuitem.done.orders"));
//		assertEquals("Wrong text present", "Done Orders", element4.getText());
//		//Checking Orders for Photographer menu display or not
//		WebElement element11 = driver.findElement(By.id("id.leftmenuitem.photographer.bookings"));
//	    assertEquals("Wrong text present", "Orders for Photographer", element11.getText());	
//		 
//	}	
//	
//	// Logged in as QA roles
//	@Test
//	public void testSignInQARole() throws Exception {
//		System.out.println("Test 7: testSignInQARole");
//		testHelpers.login("qa@esoftsystems.com", "Pass1234");
//		// assert element present				
//		WebElement element1 = driver.findElement(By.id("user.info.label"));		
//		assertTrue(element1.isDisplayed());
//		assertEquals("Wrong text present", "f2 qa |", element1.getText());
//		// Checking Done Orders menu display or not
//		WebElement element4 = driver.findElement(By.id("id.leftmenuitem.done.orders"));
//		assertEquals("Wrong text present", "Done Orders", element4.getText());				
//	}
//
//	// Logged in as Accountance roles
//	@Test
//	public void testSignInAccountingRole() throws Exception {
//		System.out.println("Test 8: testSignInAccountingRole");
//		testHelpers.login("accounting@esoftsystems.com", "Pass1234");
//		// assert element present				
//		WebElement element1 = driver.findElement(By.xpath(elements.LABEL.toValue()));	
//		assertTrue(element1.isDisplayed());
//		assertEquals("Wrong text present", "f2 accountant |", element1.getText());
//		// Checking Booking statistics menu display or not
//		WebElement element12 = driver.findElement(By.id("id.leftmenuitem.statistic.listbooking"));
//		assertEquals("Wrong text present", "Booking statistics", element12.getText());
//		// Checking Done order statistics menu display or not
//		WebElement element14 = driver.findElement(By.id("id.leftmenuitem.statistic.listdoneorder"));
//		assertEquals("Wrong text present", "Done order statistics", element14.getText());		
//	}
//
//	// Logged in with invalid email
//  @Test
//	public void testSignInWithInvalidEmail1() throws Exception  {
//    System.out.println("Test 9: testSignInWithInvalidEmail1");
//    login("XXXXXXX", "Pass1234");
//    Thread.sleep(1000);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));      
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//	}
//	
//  // Logged in with invalid email
//  @Test
//  public void testSignInWithInvalidEmai2() throws Exception  {
//    System.out.println("Test 10: testSignInWithInvalidEmai2");
//    login("all_roles@abc_@####", "Pass1234");
//    Thread.sleep(1000);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));      
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//  } 
//
//	// Logged in with blank email
//  @Test
//	public void testSignInWithBlankEmail() throws Exception {
//    System.out.println("Test 11: testSignInWithBlankEmail");
//    login("", "Pass1234");
//    Thread.sleep(1000);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));      
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//	}
//
//	// Logged in with bank password
//  @Test
//	public void testSignInWithBlankPassword() throws Exception {
//    System.out.println("Test 12: testSignInWithBlankPassword");
//    login("all_roles@esoftsystems.com", "");
//    Thread.sleep(1000);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));      
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//	}
//
//	// Logged in with blank email and password
//	@Test
//	public void testSignInWithBlankEmailandPassword()  throws Exception {
//	  System.out.println("Test 13: testSignInWithBlankEmailandPassword");
//	  login("", "");
//	  Thread.sleep(1000);
//    WebElement element1 = driver.findElement(By.xpath("//div[@class='gwt-HTML']/h1"));      
//    assertEquals("Wrong text present","There are errors when committing form.", element1.getText());
//	}
//
//// Checking the "Remember me" function.
////1. Open the URL of the application.
////2. Go to the Login page.
////3. Enter the username and password and check the 'Remember Me' box. Click on the 'Login' button.
////4. Once logged in, close the browser window without clicking on the 'Logout' button.
////5. Open the browser again and go to the URL of the application.
////6. Verify that the user is automatically logged in.
//@Test
//public void testRememberMeFunction() throws Exception {
//  System.out.println("Test 14 - Manual Testing: testRememberMeFunction");     
//  driver.get(FRONTEND_BASE_URL);
//  Thread.sleep(1000); 
//  driver.findElement(By.id("id.locale.English")).click();
//  Thread.sleep(1000);     
//  driver.findElement(By.id("id.signup.user.email")).clear();
//  driver.findElement(By.id("id.signup.user.email")).sendKeys("customer@esoftsystems.com");
//  driver.findElement(By.id("id.signup.user.password")).clear();
//  driver.findElement(By.id("id.signup.user.password")).sendKeys("Pass1234");
//  Thread.sleep(1000);   
//  driver.findElement(By.id("gwt-uid-1")).click();     
//  driver.findElement(By.id("id.button.login")).click();   
//  Thread.sleep(2000);     
//  WebElement element1 = driver.findElement(By.xpath(elements.LABEL.toValue()));  
//  assertEquals("Wrong text present", "f2 customer |", element1.getText());  
//  System.out.println(" assert the user is automatically logged in");
//  assertTrue(true);       
//  }
//	
//  private void login(final String email, final String password) throws InterruptedException {
//    driver.get(FRONTEND_BASE_URL);
//    testHelpers.waitUntilPageLoad(By.id("id.locale.English"));
//    driver.findElement(By.id("id.locale.English")).click();
//    testHelpers.waitUntilPageLoad(By.id("id.signup.user.email"));
//    driver.findElement(By.id("id.signup.user.email")).clear();
//    driver.findElement(By.id("id.signup.user.email")).sendKeys(email);
//    driver.findElement(By.id("id.signup.user.password")).clear();
//    driver.findElement(By.id("id.signup.user.password")).sendKeys(password);
//    driver.findElement(By.id("id.button.login")).click();    
//    }	
//}
//
