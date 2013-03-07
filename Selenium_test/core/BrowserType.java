/*
 * @(#)BrowserType.java
 *
 * Copyright 2012 by esoft systems (tm).
 * All rights reserved.
 */

package com.esoftsystems.f2.uitest.core;

/**
* Enumeration of all supported browser types. Each element of this enum is mapped to a matching {@link BrowserConfig}.
*
* @author jhenning
* @since 0.1
*/
public enum BrowserType {
  LOCAL_FIREFOX (LocalFirefox.class),
  LOCAL_CHROME (LocalChrome.class),
  REMOTE_FIREFOX (RemoteFirefox.class),
  REMOTE_CHROME (RemoteChrome.class),
  REMOTE_IE (RemoteIE.class);

  private final Class<? extends BrowserConfig> config;

  BrowserType(Class<? extends BrowserConfig> config) {
    this.config = config;
  }

  protected Class<? extends BrowserConfig> getConfig() {
    return config;
  }
}
