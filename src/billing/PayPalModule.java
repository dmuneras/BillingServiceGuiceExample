/* 
  * ============================================================================ 
  * Name      : BillingModule.java
  * Part of     :  NEON
  * 
  * Copyright (c) 2007-2011 Nokia.  All rights reserved.
  * This material, including documentation and any related computer
  * programs, is protected by copyright controlled by Nokia.  All
  * rights are reserved.  Copying, including reproducing, storing,
  * adapting or translating, any or all of this material requires the
  * prior written consent of Nokia.  This material also contains
  * confidential information which may not be disclosed to others
  * without the prior written consent of Nokia.
 * 
  * ============================================================================
  */
package billing;

import com.google.inject.AbstractModule;

import creditCard.CreditCardProcessor;
import creditCard.PaypalCreditCardProcessor;

public class PayPalModule extends AbstractModule {
  @Override 
  protected void configure() {
    bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
  }
}