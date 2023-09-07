/*
 * File name: Payme.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 6
 * Date: July 26, 2023
 * Due Date: July 29, 2023
 * Professor: Daniel Cormier
 * Purpose: The Payme interface represents an entity that can be paid.
 */

/**
 * The Payme interface represents an entity that can be paid.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Invoice
 * @see Programmer
 * @see HourlyProgrammer
 * @see SalariedProgrammer
 * @see CommissionProgrammer
 * @see BasePlusCommissionProgrammer
 * @see PaymeInterfaceTest
 * @since 11
 */
public interface Payme {
	/**
	 * Returns the payment amount.
	 * @return the payment amount.
	 */
	double getPaymentAmount();
}
