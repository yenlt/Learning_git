/*
 * @(#)AbstractSeleniumTest.java
 *
 * Copyright 2012 by esoft systems (tm). 
 * All rights reserved.
 */
package com.esoftsystems.f2.uitest.core;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.esoftsystems.f2.backend.common.AbstractRestTest;
import com.esoftsystems.f2.common.F2RestProperties;
import com.esoftsystems.f2.common.WebApplicationProperties;

/**
 * The base class for selenium tests. 
 * It switches between local drivers and remote grid drivers depending on whether tests are run locally or on our CI.
 * 
 * For now it cannot run parallel since tests needs to clear the datebases before running. 
 * 
 * @author Christoffer Magnussen
 * @since 1.0
 *
 */
//@RunWith(ConcurrentParameterized.class)
//@Concurrent(threads = 5)
@RunWith(Parameterized.class)
public abstract class AbstractSeleniumTest extends AbstractRestTest {
  private static final String LOCALHOST_PREFIX ="http://localhost";
  private static final String DEV3_PREFIX = "http://dev3.dmz.esoftsystems.com";
  private BrowserType browserType;

  protected RemoteWebDriver driver;
  protected String browserName;

  public enum BrowserType { LOCAL_FIREFOX, REMOTE_FIREFOX, REMOTE_CHROME, REMOTE_IE };
  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 10;
  public static final String FRONTEND_BASE_URL = F2RestProperties.BASE_URL + WebApplicationProperties.FRONTEND_SERVLET_PATH + "/";
  
  public AbstractSeleniumTest(BrowserType browserType) throws IOException {
    this.browserType = browserType;
    switch (browserType) {
      case LOCAL_FIREFOX : this.driver = getLocalFirefox(); this.browserName = "local firefox"; break;
      case REMOTE_CHROME : this.driver = getRemoteChrome(); this.browserName = "remote chrome"; break;
      case REMOTE_FIREFOX : this.driver = getRemoteFirefox(); this.browserName = "remote firefox"; break;
      case REMOTE_IE : throw new IllegalArgumentException("Grid not support ie yet");
      default : throw new IllegalArgumentException("Unknow browser type");
    }
  }
  
  @Parameters
  public static Collection<Object[]> initDrivers() throws IOException {
    if (F2RestProperties.BASE_URL.startsWith(DEV3_PREFIX)) {
      List<Object[]> parameters = new ArrayList<Object[]>(3);
      parameters.add(new Object[] { BrowserType.REMOTE_CHROME});
      //parameters.add(new Object[] { getRemoteIE() });
      parameters.add(new Object[] { BrowserType.REMOTE_FIREFOX });
      return parameters;
    } else if (F2RestProperties.BASE_URL.startsWith(LOCALHOST_PREFIX)) {
      return Collections.singletonList(new Object[] { BrowserType.LOCAL_FIREFOX });
    } else {
      throw new IllegalStateException("Selenium tests can only be run on localhost or dev3");
    }
  }
  
  
  
  @Before
  public void setup() {
    // TODO Christoffer Magnussen - Oct 18, 2012: fix this - need to clean up since, mvn clean is not run before tests starts
    try {
      super.tearDown();
    } catch (SQLException e) {
      throw new RuntimeException("error cleaning up sql db", e);
    }
    super.setup();
  }
  
  @After
  public void tearDown() {
    if (!BrowserType.REMOTE_CHROME.equals(browserType)) {
      driver.close(); // delete session is sent twice for chrome if both close and quit is called
    }
    driver.quit();
    try {
      super.tearDown();
    } catch (SQLException e) {
      throw new RuntimeException("error cleaning up sql db", e);
    }
  }
  
  
  
  
  private RemoteWebDriver getLocalFirefox() {
    return new FirefoxDriver();    
    
  }

  private RemoteWebDriver getRemoteChrome() throws IOException {
    return new RemoteWebDriver(new URL("http://dev.esoftsystems.com:4444/wd/hub"), DesiredCapabilities.chrome() );
  }

  private RemoteWebDriver getRemoteIE() throws IOException {
    return new RemoteWebDriver(new URL("http://dev.esoftsystems.com:4444/wd/hub"), DesiredCapabilities.internetExplorer() );
  }
  
  private RemoteWebDriver getRemoteFirefox() throws IOException {
    return new RemoteWebDriver(new URL("http://dev.esoftsystems.com:4444/wd/hub"), DesiredCapabilities.firefox() );
  }

  /**
   * Logs the user in or throws exceptions.
   * @param email of user
   * @param password of user
   * @throws LoginException if the user cannot log in and a notification popup is shown
   * @throws NoSuchElementException if the user cannot log but no popup is shown
   */
  protected void loginF2(final String email, final String password) {
  	driver.get(FRONTEND_BASE_URL);
  	driver.findElement(By.id("id.signup.user.email")).clear();
  	driver.findElement(By.id("id.signup.user.email")).sendKeys(email);
  	driver.findElement(By.id("id.signup.user.password")).clear();
  	driver.findElement(By.id("id.signup.user.password")).sendKeys(password);
  	driver.findElement(By.id("id.button.login")).click();
  	new WebDriverWait(driver, WAIT_MAX_SECS_UNTIL_LOGGED_IN)
    .until(new ExpectedCondition<WebElement>(){
    @Override
    public WebElement apply(WebDriver d) {
      try {
      if (d.findElement(By.className("v-Notification")) != null) {
        throw new LoginException("Error trying to login with " + email + " - using " + password + " on " + browserName);
      }
      } catch (NoSuchElementException nsee) {
        //ignor for no - 
      }
      return d.findElement(By.id("id.button.logout"));
    }});
  }
}

