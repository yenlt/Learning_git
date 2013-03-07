/*
 * @(#)LocalChrome.java
 *
 * Copyright 2012 by esoft systems (tm).
 * All rights reserved.
 */

package com.esoftsystems.f2.uitest.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

/**
 * Browser configuration for Chrome running on a local machine. To get it running, <tt>chromedriver</tt> executable
 * must be installed locally. For instructions, see
 * <a href="https://confluence.esoftsystems.com/display/F2/Selenium+Tests+with+Local+Chrome+Driver">this page</a>.
 *
 * @author jhenning
 * @since 0.8
 */
public class LocalChrome implements BrowserConfig {
  @Override
  public String getName() {
    return "Local Chrome";
  }

  @Override
  public WebDriver getDriver() throws IOException {
    return new ChromeDriver();
  }

  @Override
  public void shutDown(WebDriver driver) {
    driver.close();
    driver.quit();
  }
}
