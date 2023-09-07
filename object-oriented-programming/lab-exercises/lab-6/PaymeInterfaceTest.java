/*
 * File name: PaymeInterfaceTest.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 6
 * Date: July 26, 2023
 * Due Date: July 29, 2023
 * Professor: Daniel Cormier
 * Purpose: This is a driver class to test the Payme interface that is implemented by Invoice and Programmer, together with its subclasses.
 */

/**
 * This is a driver class to test the Payme interface that is implemented by Invoice and Programmer, together with its subclasses.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Invoice
 * @see Programmer
 * @see HourlyProgrammer
 * @see SalariedProgrammer
 * @see CommissionProgrammer
 * @see BasePlusCommissionProgrammer
 * @see Payme
 * @since 11
 */
public class PaymeInterfaceTest  {
	/**
	 * This is the entry point for the program. It creates an array of Payme, populates it with objects
	 * that implement Payme interface, and then prints all objects, together with the payment amount.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		// Create an array of Payme then populate with objects implementing Payme interface.
		Payme[] paymeObjects = new Payme[6];
		paymeObjects[0] = new Invoice("22776", "brakes", 3, 300);
		paymeObjects[1] = new Invoice("33442", "gear", 5, 90.99);
		paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 24, 320);
		paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 1985, 18.95, 40);
		paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 82, 16500, 0.44);
		paymeObjects[5] = new BasePlusCommissionProgrammer("Esther", "Patel", "102-34-5888", 20, 1200, 0.04, 720);
		
		System.out.println("Payment for Invoices and Programmers are processed polymorphically:\n");
		
		// Output each Payme object and its appropriate payment amount.
		for (Payme currentPayme : paymeObjects) {
		    System.out.printf("%s \n", currentPayme.toString()); 
		       
		    if (currentPayme instanceof BasePlusCommissionProgrammer) {
		       BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;
		       double oldBaseSalary = programmer.getBaseSalary();
		       programmer.setBaseSalary(1.10 * oldBaseSalary);
		       
		       System.out.printf("new base salary with 10%% increase is: $%,.2f\n", programmer.getBaseSalary());
		    }
		    
		    System.out.printf("payment due: $%,.2f\n\n", currentPayme.getPaymentAmount());
		}
	}
}


