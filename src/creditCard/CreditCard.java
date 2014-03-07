/* 
  * ============================================================================ 
  * Name      : CreditCard.java
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
package creditCard;


/**
 * 
 *
 */
public class CreditCard {
    
    String number;
    int expiryMonth;
    int ecpiryYear;

    public CreditCard(String number, int expiryMonth, int ecpiryYear) {
        super();
        this.number = number;
        this.expiryMonth = expiryMonth;
        this.ecpiryYear = ecpiryYear;
    }

    @Override
    public String toString() {
        return "CreditCard [number=" + number + ", expiryMonth=" + expiryMonth + ", ecpiryYear=" + ecpiryYear + "]";
    }
}
