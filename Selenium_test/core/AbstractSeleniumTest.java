/*
 * @(#)AbstractSeleniumTest.java
 *
 * Copyright 2012 by esoft systems (tm). 
 * All rights reserved.
 */
package com.esoftsystems.f2.uitest.core;
import com.esoftsystems.f2.backend.common.AbstractF2RestTest;
import com.esoftsystems.f2.common.WebApplicationProperties;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

/**
 * <p>The base class for selenium tests. It switches between local drivers and remote grid drivers depending on whether
 * tests are run locally or on our CI. To run on the test grid, the system parameter "selenium.grid" must be set to
 * "true". Using Maven, this is achieved by appending "-Dselenium.grid=true" to the commandline.</p>
 *
 * <p>When running locally, this class defaults to using Firefox. This can be altered by setting the system variable
 * "selenium.local.driver" to "chrome", then it will execute the tests in Google Chrome instead. For Google Chrome to
 * work, additional software needs to be installed, see {@link LocalChrome} for details.</p>
 *
 * @author Christoffer Magnussen
 * @since 1.0
 *
 */
@RunWith(Parameterized.class)
public abstract class AbstractSeleniumTest extends AbstractF2RestTest {

  private final BrowserConfig browserConfig;
  protected WebDriver driver;
  protected final F2UITestHelpers testHelpers;

  public static final int WAIT_MAX_SECS_UNTIL_LOGGED_IN = 20;
  public static final String FRONTEND_BASE_URL = getBaseUrl() + WebApplicationProperties.FRONTEND_SERVLET_PATH;

  public AbstractSeleniumTest(BrowserType browserType) throws Exception {
    super();
    this.browserConfig = browserType.getConfig().newInstance();
    this.driver = browserConfig.getDriver();
    this.testHelpers = new F2UITestHelpers(driver, FRONTEND_BASE_URL);
  }

  /**
   * Returns the name of the browser being used currently.
   * @return the browser name
   * @see com.esoftsystems.f2.uitest.core.BrowserConfig#getName()
   */
  protected String getBrowserName() {
    return browserConfig.getName();
  }
  
  @Parameters
  public static Collection<Object[]> initDrivers() throws IOException {
    if ("true".equals(System.getProperties().get("selenium.grid"))) {
      return Collections.singletonList(new Object[]{BrowserType.REMOTE_FIREFOX});
    } else {
      return getLocalDrivers();
    }
  }

  private static Collection<Object[]> getLocalDrivers() throws IOException {
    BrowserType browser;
    if ("chrome".equals(System.getProperties().get("selenium.local.driver"))) {
      browser = BrowserType.LOCAL_CHROME;
    } else {
      browser = BrowserType.LOCAL_FIREFOX;
    }
    return Collections.singletonList(new Object[]{browser});
  }

  /**
   * Teardown-method to shut down the Chrome web driver.
   */
  @After
  public void shutDownDriver() {
    // Avoid calling this "tearDown", so you don't have to call super() when overriding in subclasses.
    // @After-Annotation is enough.
    browserConfig.shutDown(driver);
  }
}

