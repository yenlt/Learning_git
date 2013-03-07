/*
 * @(#)RemoteIE.java
 *
 * Copyright 2012 by esoft systems (tm).
 * All rights reserved.
 */

package com.esoftsystems.f2.uitest.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;

/**
 * Browser config for Internet Explorer running on the Esoftsystems selenium cluster.
 *
 * @author jhenning
 * @since 0.1
 */
public class RemoteIE implements BrowserConfig {
  @Override
  public String getName() {
    return "Remote Internet Explorer";
  }

  @Override
  public WebDriver getDriver() throws IOException {
//    return new RemoteWebDriver(new URL("http://dev.esoftsystems.com:4444/wd/hub"), DesiredCapabilities.internetExplorer() );
    throw new UnsupportedBrowserException("Internet Explorer is not supported by grid yet");
  }

  @Override
  public void shutDown(WebDriver driver) {
    driver.quit();
  }
}
