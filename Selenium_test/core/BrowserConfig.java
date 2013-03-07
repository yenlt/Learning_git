/*
 * @(#)BrowserConfig.java
 *
 * Copyright 2012 by esoft systems (tm).
 * All rights reserved.
 */

package com.esoftsystems.f2.uitest.core;

import org.openqa.selenium.WebDriver;
import java.io.IOException;

/**
 * Simple interface representing a web browser configuration to be used with Selenium tests. Implementations of this
 * class <em>must</em> provide a zero-argument constructor, so they can be loaded from via reflection.
 *
 * @author jhenning
 * @since 0.1
 */
public interface BrowserConfig {

  /**
   * Get the display name for this browser config that can be shown in log output, etc.
   * @return human readable name for this configuration
   */
  String getName();

  /**
   * Get the preconfigured driver Selenium should use when this browser configuration is active.
   * @return the driver for selenium
   * @throws IOException if something goes wrong while configuring the driver
   */
  WebDriver getDriver() throws IOException;

  /**
   * Will be called after tests are done. Should do whatever necessary to shut down the driver.
   */
  void shutDown(WebDriver driver);
}
