/*
 * File name: YourPurchasesTest2.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 4
 * Date: June 20, 2023
 * Due Date: June 24, 2023
 * Professor: Daniel Cormier
 * Purpose: This is a test class used to test the CalculateChange and related methods of the YourPurchases class.
 */

package s23lab4;

import org.junit.Test;
import org.junit.Assert;

/**
 * This is a test class used to test the CalculateChange and related methods of the YourPurchases class.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see YourPurchasesTest
 * @see YourPurchases_GetPaymentTest
 * @see YourPurchases_ChangeCoins303Test
 * @since 11
 */
public class YourPurchasesTest2 {
	/**
	 * Tolerance for comparison between the expected and actual values.
	 */
	private static final double EPSILON = 1E-12;
	
	/**
	 * This test method tests the CalculateChange method.
	 * This expects the value to be 5 - 1.5 = 3.50.
	 */
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double expected = 3.50;
	    Assert.assertEquals(expected, aPurchase.CalculateChange(), EPSILON);
	    // NOTE: This test failed but not sure yet which method caused the failure.
	}
	
	/**
	 * This test method tests the recordPurchase method with a purchase of 1.5.
	 * This expects the value to be 1.5.
	 */
	@Test
	public void testRecordPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		double expected = 1.5;
	    Assert.assertEquals(expected, aPurchase.getPurchase(), EPSILON);
	    // NOTE: This test passed so recordPurchase method is not the cause of the failure.
	}
	
	/**
	 * This test method tests the receivePayment method with a received payment of 5 dollars.
	 * This expects the value to be 5.
	 */
	@Test
	public void testReceivePayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double expected = 5;
	    Assert.assertEquals(expected, aPurchase.getPayment(), EPSILON);
	    // NOTE: This test passed so receivePayment method is not the cause of the failure.
	}

	/**
	 * This test method tests the CalculateChange method with no purchase and no payment.
	 * This expects the value to be 0.
	 */
	@Test
	public void testCalculateChange_NoPurchaseAndNoPayment() {
		YourPurchases aPurchase = new YourPurchases();
		double expected = 0;
	    Assert.assertEquals(expected, aPurchase.CalculateChange(), EPSILON);
	    // NOTE: This test passed (maybe because there is both no purchase and payment).
	}
	
	/**
	 * This test method tests the CalculateChange method with a purchase of 1.5 but no payment.
	 * This expects the value to be 0 - 1.5 = -1.5.
	 */
	@Test
	public void testCalculateChange_WithPurchaseButNoPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		double expected = -1.5;
	    Assert.assertEquals(expected, aPurchase.CalculateChange(), EPSILON);
	    // NOTE: This test failed so there is something wrong with the calculation of the change.
	}
	
	/**
	 * This test method tests the CalculateChange method with no purchase but a payment of 5 dollars.
	 * This expects the value to be 5 - 0 = 5.
	 */
	@Test
	public void testCalculateChange_NoPurchaseButWithPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double expected = 5;
	    Assert.assertEquals(expected, aPurchase.CalculateChange(), EPSILON);
	    // NOTE: This test passed so there might be something wrong with how the purchase was used in the calculation of the change.
	}
	
	/**
	 * This test method tests the CalculateChange method with exact amount payment for the purchase.
	 * Purchase is 3.8 + 5.2 = 9.
	 * Received payment is 4 + 18(0.25) + 2(0.10) + 4(0.05) + 10(0.01) = 9.
	 * This expects the value to be 9 - 9 = 0.
	 */
	@Test
	public void testCalculateChange_ExactAmount() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(3.8);
		aPurchase.recordPurchase(5.2);
		aPurchase.receivePayment(4, 18, 2, 4, 10);
		double expected = 0;
	    Assert.assertEquals(expected, aPurchase.CalculateChange(), EPSILON);
	    // NOTE: This test failed so there is something wrong with how the purchased was used in the calculation of the change.
	}
	
	/**
	 * This test method tests the CalculateChange method with a zero amount payment.
	 * Purchase is 20 + 7 = 27.
	 * This expects the value to be 0 - (20 + 7) = -27.
	 */
	@Test
	public void testCalculateChange_ZeroPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(20);
		aPurchase.recordPurchase(7);
		aPurchase.receivePayment(0, 0, 0, 0, 0);
		double expected = -27;
	    Assert.assertEquals(expected, aPurchase.CalculateChange(), EPSILON);
	    // NOTE: This test failed so there is something wrong with how the purchased was used in the calculation of the change.
	}
	
	/**
	 * This test method tests the CalculateChange method with a zero amount purchase.
	 * Received payment is 15 + 4(0.25) = 16.
	 * This expects the value to be (15 + 4(0.25)) - 0 = 16.
	 */
	@Test
	public void testCalculateChange_ZeroPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(0);
		aPurchase.receivePayment(15, 4, 0, 0, 0);
		double expected = 16;
	    Assert.assertEquals(expected, aPurchase.CalculateChange(), EPSILON);
	    // NOTE: This test passed so there is something wrong with how the purchased was used in the calculation of the change.
	}
}
