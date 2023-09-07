/*
 * File name: SalesPersonTest.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 5
 * Date: July 12, 2023
 * Due Date: July 15, 2023
 * Professor: Daniel Cormier
 * Purpose: This is a driver class to test the Sales Person class.
 */

package w23lab5;

/**
 * This is a driver class to test the Sales Person class.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see SalesAgent
 * @see SalesSupervisor
 * @see SalesChief
 * @see SalesPerson
 * @see SalesAgentTest
 * @see SalesAgentTest2
 * @since 11
 */
public class SalesPersonTest {
	/**
	 * This is the entry point for the program. It creates instances of SalesPerson and
	 * then prints all created objects.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		/*
		 * Create instances of SalesPerson.
		 */
		SalesPerson salesPerson1 = new SalesPerson("Peter", 56);
		SalesPerson salesPerson2 = new SalesPerson("John", 48);
		SalesPerson salesPerson3 = new SalesPerson("Ifeoma", 53, "Toronto");
		SalesPerson salesPerson4 = new SalesPerson("Lixdel Louisse L. Aggabao", 27, "Philippines", "Academics");
		
		/*
		 * Print all objects.
		 */
		System.out.println(salesPerson1);
		System.out.println(salesPerson2);
		System.out.println(salesPerson3);
		System.out.println(salesPerson4);
	}
}
