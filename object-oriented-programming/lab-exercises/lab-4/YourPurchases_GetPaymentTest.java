/*
 * File name: YourPurchases_GetPaymentTest.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 4
 * Date: June 20, 2023
 * Due Date: June 24, 2023
 * Professor: Daniel Cormier
 * Purpose: This is a test class used to test the getPayment method of the YourPurchases class.
 */

package s23lab4;

import org.junit.Test;
import org.junit.Assert;

/**
 * This is a test class used to test the getPayment method of the YourPurchases class.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see YourPurchasesTest
 * @see YourPurchasesTest2
 * @see YourPurchases_ChangeCoins303Test
 * @since 11
 */
public class YourPurchases_GetPaymentTest {
	/**
	 * Tolerance for comparison between the expected and actual values.
	 */
	private static final double EPSILON = 1E-12;
	
	/**
	 * This test method tests the getPayment method using only dollars (17 dollars).
	 * This expects the value to be 17.
	 */
	@Test
	public void testGetPayment_Dollars() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(17, 0, 0, 0, 0);
		double expected = 17;
		Assert.assertEquals(expected, purchase.getPayment(), EPSILON);
		// NOTE: This test passed.
	}
	
	/**
	 * This test method tests the getPayment method using only quarters (7 quarters).
	 * This expects the value to be 7(0.25) = 1.75.
	 */
	@Test
	public void testGetPayment_Quarters() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(0, 7, 0, 0, 0);
		double expected = 1.75;
		Assert.assertEquals(expected, purchase.getPayment(), EPSILON);
		// NOTE: This test passed.
	}
	
	/**
	 * This test method tests the getPayment method using only dimes (3 dimes).
	 * This expects the value to be 3(0.10) = 0.30.
	 */
	@Test
	public void testGetPayment_Dimes() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(0, 0, 3, 0, 0);
		double expected = 0.30;
		Assert.assertEquals(expected, purchase.getPayment(), EPSILON);
		// NOTE: This test passed.
	}
	
	/**
	 * This test method tests the getPayment method using only nickels (9 nickels).
	 * This expects the value to be 9(0.05) = 0.45.
	 */
	@Test
	public void testGetPayment_Nickels() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(0, 0, 0, 9, 0);
		double expected = 0.45;
		Assert.assertEquals(expected, purchase.getPayment(), EPSILON);
		// NOTE: This test passed.
	}
	
	/**
	 * This test method tests the getPayment method using only pennies (29 pennies).
	 * This expects the value to be 29(0.01) = 0.29.
	 */
	@Test
	public void testGetPayment_Pennies() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(0, 0, 0, 0, 29);
		double expected = 0.29;
		Assert.assertEquals(expected, purchase.getPayment(), EPSILON);
		// NOTE: This test passed.
	}

	/**
	 * This test method tests the getPayment method using all coins (4 dollars, 14 quarters, 5 dimes, 12 nickels, 10 pennies).
	 * This expects the value to be 4 + 14(0.25) + 5(0.10) + 12(0.05) + 10(0.01) = 8.7.
	 */
	@Test
	public void testGetPayment_AllCoins() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(4, 14, 5, 12, 10);
		double expected = 8.7;
		Assert.assertEquals(expected, purchase.getPayment(), EPSILON);
		// NOTE: This test passed.
	}
	
	/**
	 * This test method tests the getPayment method after the change has been given.
	 * This expects the value to be 0 because the change has been given.
	 */
	@Test
	public void testGetPayment_AfterGiveChange() {
		YourPurchases purchase = new YourPurchases();
		purchase.recordPurchase(8.7);
		purchase.receivePayment(4, 14, 5, 12, 10);
		purchase.giveChange();
		double expected = 0;
		Assert.assertEquals(expected, purchase.getPayment(), EPSILON);
		// NOTE: This test passed.
	}
}
