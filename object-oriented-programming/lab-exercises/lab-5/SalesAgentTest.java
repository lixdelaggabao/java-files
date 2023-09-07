/*
 * File name: SalesAgentTest.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 5
 * Date: July 12, 2023
 * Due Date: July 15, 2023
 * Professor: Daniel Cormier
 * Purpose: This program is the first test for the SalesAgent class including the subclasses.
 */

package w23lab5;

/**
 * This program is the first test for the SalesAgent class including the subclasses.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see SalesAgent
 * @see SalesSupervisor
 * @see SalesChief
 * @see SalesPerson
 * @see SalesAgentTest2
 * @see SalesPersonTest
 * @since 11
 */
public class SalesAgentTest {
	/**
	 * This is the entry point for the program. It creates instances of SalesAgent, SalesSupervisor, 
	 * and SalesChief classes then prints all created objects.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		/*
		 * Create instances of SalesAgent, SalesSupervisor, and SalesChief.
		 */
		SalesAgent salesAgent1 = new SalesAgent("Peter", 56);
		SalesAgent salesAgent2 = new SalesAgent("John", 48);
		SalesSupervisor salesSupervisor = new SalesSupervisor("Ifeoma", 53, "Toronto");
		SalesChief salesChief = new SalesChief("Lixdel Louisse L. Aggabao", 27, "Philippines", "Academics");
		   
		/*
		 * Print all objects.
		 */
		System.out.println(salesAgent1);
	    System.out.println(salesAgent2);
	    System.out.println(salesSupervisor);
	    System.out.println(salesChief);
	}
}  