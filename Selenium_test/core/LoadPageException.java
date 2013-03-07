/*
 * @(#)LoadPageException.java
 *
 * Copyright 2012 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystems.f2.uitest.core;

/**
 *
 * @author Christoffer Magnussen
 * @since 1.0
 *
 */
public class LoadPageException extends RuntimeException {

  private static final long serialVersionUID = 4622667215424509679L;

  public LoadPageException(String msg) {
    super(msg);
  }
}
