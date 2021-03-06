/* 
  * ============================================================================ 
  * Name      : GoogleCheckoutCreditCardProcessor.java
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

import billing.ChargeResult;
import billing.UnreachableException;


public class GoogleCheckoutCreditCardProcessor implements CreditCardProcessor {

	@Override
	public ChargeResult charge(CreditCard creditCard, int amount) throws UnreachableException {
		return new ChargeResult(true, "Google");
	}

}
