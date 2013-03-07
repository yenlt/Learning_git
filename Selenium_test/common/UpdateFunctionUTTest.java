//package com.esoftsystems.f2.uitest.common;
//
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.elements;
//
//public class UpdateFunctionUTTest extends AbstractSeleniumTest {
//	
//	public UpdateFunctionUTTest(BrowserType browserType) throws Exception {
//	    super(browserType);
//	}
//	
//// Booker updates order successfully.
//	@Test
//	public void testBookerUpdateOrder() throws Exception {
//  	 System.out.println("Test 1: testBookerUpdateOrder");		
//  	 testHelpers.login("booker@esoftsystems.com", "Pass1234");
//  	 
//  	 // Click on "Unbooked Orders" link at left menu bar.	
//  	 driver.findElement(By.id("id.leftmenuitem.unbooked.orders")).click();
//  	 testHelpers.waitUntilPageLoad(By.id(elements.BOOKER_UPDATE_BUTTON.toValue()));
//  	 driver.findElement(By.id(elements.BOOKER_UPDATE_BUTTON.toValue())).click();		
//  	 testHelpers.waitUntilPageLoad((By.id("id.reference")));
//  	 UpdateORder();		
//  	 testHelpers.waitUntilPageLoad(By.id(elements.BOOKER_UPDATE_BUTTON.toValue()));
//  	 WebElement element_button = driver.findElement(By.id(elements.BOOKER_UPDATE_BUTTON.toValue()));
//     assertTrue(element_button.isDisplayed());    		
//	}
//	
//  //Customer updates order successfully.
//	@Test
//	public void testCustomerUpdateOrder() throws Exception {
//		System.out.println("Test 2: testCustomerUpdateOrder");		
//		 testHelpers.login("customer@esoftsystems.com", "Pass1234");
//		 
//		// Click on "Open Orders" link at left menu bar.	
//		driver.findElement(By.id("id.leftmenuitem.open.orders")).click();
//		testHelpers.waitUntilPageLoad(By.id(elements.CUSTOMER_UPDATE_BUTTON.toValue()));		
//		driver.findElement(By.id(elements.CUSTOMER_UPDATE_BUTTON.toValue())).click();		
//		testHelpers.waitUntilPageLoad((By.id("id.reference")));
//		UpdateORder();		
//		testHelpers.waitUntilPageLoad(By.id(elements.CUSTOMER_UPDATE_BUTTON.toValue()));
//		WebElement element_button = driver.findElement(By.id(elements.CUSTOMER_UPDATE_BUTTON.toValue()));
//    assertTrue(element_button.isDisplayed());		
//	}
//	
//	private void UpdateORder() throws InterruptedException {
//	  driver.findElement(By.id("id.reference")).clear();
//    driver.findElement(By.id("id.reference")).sendKeys("Update_Reference"); 
//    
//    // Choose product: Film A1       
//    driver.findElement(By.xpath(elements.SELECT_PRODUCT.toValue())).click();     
//    testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_A.toValue()));    
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A.toValue())).click();       
//    
//    // Choose add ons of Film A1
//    testHelpers.waitUntilPageLoad(By.xpath(elements.PRODUCT_FILM_A_ADD_ON1.toValue()));   
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON1.toValue())).click(); 
//    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON2.toValue())).click();   
////    driver.findElement(By.xpath(elements.PRODUCT_FILM_A_ADD_ON3.toValue())).click();
////    testHelpers.waitUntilPageLoad(By.id(elements.SELECT_AMOUNT_FIELD.toValue()));
////    driver.findElement(By.id(elements.SELECT_AMOUNT_FIELD.toValue())).clear();
////    Thread.sleep(1000);
////    driver.findElement(By.id(elements.SELECT_AMOUNT_FIELD.toValue())).sendKeys("" + testHelpers.MAX_AMOUNT_PRODUCT);    
////    Thread.sleep(1000);    
//    driver.findElement(By.id("id.orderedProductInputDto.location.contactPerson")).clear();
//    driver.findElement(By.id("id.orderedProductInputDto.location.contactPerson")).click();
//    driver.findElement(By.id("id.orderedProductInputDto.location.contactPerson")).sendKeys("Update_Name_contactP");   
//    driver.findElement(By.id("id.orderedProductInputDto.location.email")).clear();
//    driver.findElement(By.id("id.orderedProductInputDto.location.email")).click();
//    driver.findElement(By.id("id.orderedProductInputDto.location.email")).sendKeys("update@email.com");   
//    driver.findElement(By.id("id.orderedProductInputDto.location.telephone")).clear();
//    driver.findElement(By.id("id.orderedProductInputDto.location.telephone")).click();
//    driver.findElement(By.id("id.orderedProductInputDto.location.telephone")).sendKeys("1254587555");    
//    driver.findElement(By.id("id.orderedProductInputDto.location.name")).clear();
//    driver.findElement(By.id("id.orderedProductInputDto.location.name")).click();
//    driver.findElement(By.id("id.orderedProductInputDto.location.name")).sendKeys("Update_Name_Location");    
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.address")).clear();
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.address")).click();
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.address")).sendKeys("Update Address");   
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.postalCode")).clear();
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.postalCode")).click();
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.postalCode")).sendKeys("Update Postal");   
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.city")).clear();   
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.city")).click();
//    driver.findElement(By.id("id.orderedProductInputDto.location.address.city")).sendKeys("Update_City");     
//    driver.findElement(By.id("id.order.form.comment")).sendKeys("Add new comment.");
//    driver.findElement(By.id("id.button.update")).click();
//	}
//}