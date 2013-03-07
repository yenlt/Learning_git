/*
 * @(#)RemoteFirefox.java
 *
 * Copyright 2012 by esoft systems (tm).
 * All rights reserved.
 */

package com.esoftsystems.f2.uitest.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Browser configuration for Firefox running on a local machine.
 *
 * @author jhenning
 * @since 0.1
 */
public class LocalFirefox implements BrowserConfig {

  @Override
  public String getName() {
    return "Local Firefox";
  }

  @Override
  public WebDriver getDriver() {
    return new FirefoxDriver();
  }

  @Override
  public void shutDown(WebDriver driver) {
    driver.quit();
  }
}
