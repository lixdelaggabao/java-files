/*
 * File name: YourPurchases_ChangeCoins303Test.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 4
 * Date: June 21, 2023
 * Due Date: June 24, 2023
 * Professor: Daniel Cormier
 * Purpose: This is a test class used to test the changeCoins303 method of the YourPurchases class.
 */

package s23lab4;

import org.junit.Test;
import org.junit.Assert;

/**
 * This is a test class used to test the changeCoins303 method of the YourPurchases class.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see YourPurchasesTest
 * @see YourPurchasesTest2
 * @see YourPurchases_GetPaymentTest
 * @since 11
 */
public class YourPurchases_ChangeCoins303Test {
	/**
	 * This test method tests the changeCoins303 method using all coins (20 dollars, 1 quarter, 2 dimes, 3 nickels, 4 pennies).
	 * Since there is no purchase, the expected number of change coins should be 20 + 1 + 2 + 3 + 4 = 30.
	 */
	@Test
	public void testChangeCoins303_AllCoins() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(20, 1, 2, 3, 4);
		int expected = 30;
		Assert.assertEquals(expected, purchase.changeCoins303());
		// NOTE: This test passed.
	}
	
	/**
	 * This test method tests the changeCoins303 method using only dollars (10 dollars, 0 quarters, 0 dimes, 0 nickels, 0 pennies).
	 * Since there is no purchase, the expected number of change coins should be 10 + 0 + 0 + 0 + 0 = 10.
	 */
	@Test
	public void testChangeCoins303_Dollars() {	
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(10, 0, 0, 0, 0);
		int expected = 10;
		Assert.assertEquals(expected, purchase.changeCoins303());
		// NOTE: This test passed.
	}

	/**
	 * This test method tests the changeCoins303 method using only quarters (0 dollars, 5 quarters, 0 dimes, 0 nickels, 0 pennies).
	 * Since there is no purchase, the expected number of change coins should be 0 + 5 + 0 + 0 + 0 = 5.
	 */
	@Test
	public void testChangeCoins303_Quarters() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(0, 5, 0, 0, 0);
		int expected = 5;
		Assert.assertEquals(expected, purchase.changeCoins303());
		// NOTE: This test passed.
	}
	
	/**
	 * This test method tests the changeCoins303 method using only dimes (0 dollars, 0 quarters, 10 dimes, 0 nickels, 0 pennies).
	 * Since there is no purchase, the expected number of change coins should be 0 + 0 + 10 + 0 + 0 = 10.
	 */
	@Test
	public void testChangeCoins303_Dimes() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(0, 0, 10, 0, 0);
		int expected = 10;
		Assert.assertEquals(expected, purchase.changeCoins303());
		// NOTE: This test failed so there is something wrong with how the number of dimes was used in the method.
	}
	
	/**
	 * This test method tests the changeCoins303 method using only nickels (0 dollars, 0 quarters, 0 dimes, 4 nickels, 0 pennies).
	 * Since there is no purchase, the expected number of change coins should be 0 + 0 + 0 + 4 + 0 = 4.
	 */
	@Test
	public void testChangeCoins303_Nickels() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(0, 0, 0, 4, 0);
		int expected = 4;
		Assert.assertEquals(expected, purchase.changeCoins303());
		// NOTE: This test failed so there is something wrong with how the number of nickels was used in the method.
	}
	
	/**
	 * This test method tests the changeCoins303 method using only pennies (0 dollars, 0 quarters, 0 dimes, 0 nickels, 28 pennies).
	 * Since there is no purchase, the expected number of change coins should be 0 + 0 + 0 + 0 + 28 = 28.
	 */
	@Test
	public void testChangeCoins303_Pennies() {
		YourPurchases purchase = new YourPurchases();
		purchase.receivePayment(0, 0, 0, 0, 28);
		int expected = 28;
		Assert.assertEquals(expected, purchase.changeCoins303());
		// NOTE: This test passed.
	}
}
