/*
 * File name: YourPurchasesTest.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 4
 * Date: June 20, 2023
 * Due Date: June 24, 2023
 * Professor: Daniel Cormier
 * Purpose: This is a test class used to test the getPurchase method of the YourPurchases class.
 */

package s23lab4;

import org.junit.Test;
import org.junit.Assert;

/**
 * This is a test class used to test the getPurchase method of the YourPurchases class.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see YourPurchasesTest2
 * @see YourPurchases_GetPaymentTest
 * @see YourPurchases_ChangeCoins303Test
 * @since 11
 */
public class YourPurchasesTest {
	/**
	 * Tolerance for comparison between the expected and actual values.
	 */
   private static final double EPSILON = 1E-12;
   
   /**
    * This test method tests the getPurchase method with only one purchase (3.75).
    * This expects the value to be 3.75.
    */
   @Test
   public void testGetPurchase_OnePurchase()
   {
      YourPurchases register = new YourPurchases();
      register.recordPurchase(3.75);
      double expected = 3.75;
      Assert.assertEquals(expected, register.getPurchase(), EPSILON);
      // NOTE: This test passed.
    }

   /**
    * This test method tests the getPurchase method with more than one purchase (0.75, 1.50).
    * This expects the value to be 0.75 + 1.50 = 2.25.
    */
   @Test
   public void testGetPurchase_MoreThanOnePurchase()
   {
      YourPurchases register = new YourPurchases();
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      double expected = 2.25;
      Assert.assertEquals(expected, register.getPurchase(), EPSILON);
      // NOTE: This test passed.
    }
}

