/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: March 24, 2023
 * Modified: March 21, 2023
 * Description: Lab Exercise 04 Task 2
 */

import java.util.Scanner;

/*
 * This class uses Customer class to output the price of the ticket.
 */
public class TicketAdmission {

	/*
	 * Entry point for the program.
	 * The main method asks for user input for the age of the customer and uses an instance of class Customer
	 * to output the price of the ticket.
	 */
	public static void main(String[] args) {
		int ageLa;
		double priceLa;
		Customer customerLa = new Customer();
		Scanner scannerLa = new Scanner(System.in);
		
		System.out.print("Enter age: ");
		ageLa = scannerLa.nextInt();
		customerLa.setAge(ageLa);
		
		priceLa = customerLa.calculateTicketPrice();
		
		/*
		 * If the price is less than 0, it means that the inputted age is invalid.
		 * Otherwise, the age is valid.
		 */
		if (priceLa < 0) {
			System.out.println("Invalid Age Entered");
		}
		else {
			System.out.printf("Price is: $%.2f %n", priceLa);	
		}
		
		System.out.println("Program by Lixdel Louisse L. Aggabao");
	}

}
