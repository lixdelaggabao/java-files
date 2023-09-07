/*
 * File name: MyHealthDataTest2.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 1
 * Date: June 14, 2023
 * Due Date: June 19, 2023
 * Professor: Daniel Cormier
 * Purpose: This is a test class used to test methods of the Patient class.
 */

package w23assignment1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This is a test class used to test methods of the Patient class.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Patient
 * @see MyHealthDataTest
 * @since 11
 */
public class MyHealthDataTest2 {

	/**
	 * This test case tests the getBMI() method of Patient class.
	 * Assumptions: This assumes that the arguments of the Patient constructor are using the correct units of measurement.
	 * This also expects the BMI value to be equal to 29.85.
	 */
	@Test
	public void testGetBMI() {
		/*
		 * Declaration of variables.
		 */
		Patient patient = new Patient("Lixdel", "Aggabao", "Male", 1995, 11, 14, 66.1, 185.5);
		double expectedBMI = 29.85;
		double actualBMI = patient.getBMI();
		
		/*
		 * Compare the expected and actual BMI values.
		 */
		assertEquals("Test case 1 has failed.", expectedBMI, actualBMI, 0.1);
		System.out.println("Test case 1 has passed successfully.");
	}
	
	/**
	 * This test case tests the getCalculatedBMI() method of Patient class, which has a miscalculation.
	 * Assumptions: This assumes that the arguments of the Patient constructor are using the correct units of measurement.
	 * This also expects the BMI value to be equal to 29.85.
	 */
	@Test
	public void testGetMiscalculatedBMI() {
		/*
		 * Declaration of variables.
		 */
		Patient patient = new Patient("Lex", "Lim", "Female", 1995, 11, 14, 66.1, 185.5);
		double expectedBMI = 29.85;
		double actualBMI = patient.getMiscalculatedBMI();
		
		/*
		 * Compare the expected and actual BMI values.
		 */
		assertEquals("Test case 2 has failed.", expectedBMI, actualBMI, 0.1);
		System.out.println("Test case 2 has passed successfully.");
	}

}
