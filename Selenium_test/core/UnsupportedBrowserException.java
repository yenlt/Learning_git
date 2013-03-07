/*
 * @(#)UnsupportedBrowserException.java
 *
 * Copyright 2012 by esoft systems (tm).
 * All rights reserved.
 */

package com.esoftsystems.f2.uitest.core;

/**
 * Exception can be thrown by unsupported browser configurations.
 *
 * @author jhenning
 * @since 0.1
 */
public class UnsupportedBrowserException extends RuntimeException {

  /**
   * Creates a new exception with given message
   * @param message message discribing the situation
   */
  public UnsupportedBrowserException(String message) {
    super(message);
  }
}
