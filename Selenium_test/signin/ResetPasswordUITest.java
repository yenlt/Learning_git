//package com.esoftsystems.f2.uitest.signin;
//
//import org.junit.*;
//import static org.junit.Assert.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.esoftsystems.f2.uitest.core.AbstractSeleniumTest;
//import com.esoftsystems.f2.uitest.core.BrowserType;
//import com.esoftsystems.f2.uitest.core.LoadPageException;
//
//public class ResetPasswordUITest extends AbstractSeleniumTest {
//  
//  public ResetPasswordUITest(BrowserType browserType) throws Exception {
//      super(browserType);
//  }
//  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
//  
//// Test Reset Password Successfully
//  @Test
//  public void testResetPasswordzSuccessfully() throws Exception {
//    System.out.println("Test 1: testResetPasswordzSuccessfully");      
//    driver.get(FRONTEND_BASE_URL);
//    Thread.sleep(3000);
//    driver.findElement(By.id("id.signup.user.resetpassword")).click();
//    Thread.sleep(3000);    
//    driver.findElement(By.id("id.signup.user.email")).sendKeys("quynh.nn@esoftsystems.com");
//    driver.findElement(By.id("id.button.resetPassword")).click();     
//  }
//  
// // The email address doesn't exist into the system
//  @Test
//  public void testResetPasswordzwithEmailAddressDonotExist() throws Exception {
//    System.out.println("Test 2: testResetPasswordzwithEmailAddressDonotExist");    
//    driver.get(FRONTEND_BASE_URL);
//    Thread.sleep(3000);
//    driver.findElement(By.id("id.signup.user.resetpassword")).click();
//    Thread.sleep(3000);    
//    driver.findElement(By.id("id.signup.user.email")).sendKeys("yen.lt@esoftsystems.com");
//    driver.findElement(By.id("id.button.resetPassword")).click();     
//  }
//  
////The email address field is blank
// @Test
// public void testResetPasswordzwithEmailAddressBlank() throws Exception {
//   System.out.println("Test 3: testResetPasswordzwithEmailAddressBlank");   
//   driver.get(FRONTEND_BASE_URL);
//   Thread.sleep(3000);
//   driver.findElement(By.id("id.signup.user.resetpassword")).click();
//   Thread.sleep(3000);    
//   driver.findElement(By.id("id.signup.user.email")).sendKeys("");
//   driver.findElement(By.id("id.button.resetPassword")).click();  
//   //String mess = closeAlertAndGetItsText();     
//  // assertEquals("Wrong text present", "There are errors when committing form.", mess);       
// }
// 
////The system send ResetPasswordEmail successfully.
//@Test
//public void testSystemSendResetPasswordEmailSuccessfully() throws Exception {
//  System.out.println("Test 4: testSystemSendResetPasswordEmailSuccessfully");   
//  driver.get(FRONTEND_BASE_URL);
//  Thread.sleep(3000);
//  driver.findElement(By.id("id.signup.user.resetpassword")).click();
//  Thread.sleep(3000);    
//  driver.findElement(By.id("id.signup.user.email")).sendKeys("");
//  driver.findElement(By.id("id.button.resetPassword")).click();  
//  System.out.println("Manual Testing: Assert the system send reset password email successfully");
//  assertTrue(true);  
//}
//
////The user can login into the system with right password if he/she hasn't reset password.
//@Test
//public void testUserCanLoginSuccessfullyIfHeHasnotResetPassword() throws Exception {
//System.out.println("Test 5: testUserCanLoginSuccessfullyIfHeHasnotResetPassword");   
//driver.get(FRONTEND_BASE_URL);
//Thread.sleep(3000);
//driver.findElement(By.xpath("//div/table/tbody/tr[4]/td[3]/div/span/span")).click();
//Thread.sleep(3000);    
//driver.findElement(By.id("id.signup.user.email")).sendKeys("");
//driver.findElement(By.id("id.button.resetPassword")).click();  
//testHelpers.login("quynh.nn@esoftsystems.com","Pass1234");
////TO_DO
////assertTextPresent();
//}
//
////The user can login into the system successfully if he/she reset password many times within 24 hours.
//@Test
//public void testUserCanLoginSuccessfullyIfChangePasswordManytimesOnTheSameResetPasswordLink() throws Exception {
//System.out.println("Test 6 - Manual Testing: testUserCanLoginSuccessfullyIfChangePasswordManytimesOnTheSameResetPasswordLink");
//assertTrue(true);
//}
//
////The reset password link will be expired after 24 hours.
//@Test
//public void testResetPasswordLinkWillBeExpiredAfter24H() throws Exception {
//System.out.println("Test 7 - Manual Testing: testResetPasswordLinkWillBeExpiredAfter24H");
//assertTrue(true);
//}
//  
////The New Password must be validated: 
////Password can't be blank and must be strong as: must contains at least one digit, 
////one lowercase characters, one uppercase characters, on special character and the length must > 6 and < 20.
//@Test
//public void testNewPasswordCannotbeBlankandMustBeValidated() throws Exception {
//System.out.println("Test 8 - Manual Testing: testNewPasswordCannotbeBlankandMustBeValidated");
//assertTrue(true);
//}
//
////The Confirm Password must be the same New Password.
//@Test
//public void testConfirmPassworkMustbeTheSameNewPassword() throws Exception {
//System.out.println("Test 9 - Manual Testing: testConfirmPassworkMustbeTheSameNewPassword");
//assertTrue(true);
//}
//
////The Confirm Password must be the same New Password.
//@Test
//public void testUserCanLoginSuccessfullywithNewPassword() throws Exception {
//System.out.println("Test 10 - Manual Testing: testUserCanLoginSuccessfullywithNewPassword");
//assertTrue(true);
//}
//
//}