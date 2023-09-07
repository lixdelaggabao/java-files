import java.util.Scanner;

/*
 * File name: Driver.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 1
 * Date: May 17, 2023
 * Due Date: May 20, 2023
 * Professor: Daniel Cormier
 * Purpose: This class is used to input the first name, last name, and student number of the student.
 */

/**
 * This class represents a Driver to input the first name, last name, and student number of the student.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Username
 * @since 11
 */
public class Driver {

	/**
	 * This main method is the entry point for the program.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		/*
		 * Declaration of variables.
		 */
		Scanner scanner = new Scanner(System.in);
		String firstName;
		String lastName;
		String studentNumber;
		Username username = new Username();
		
		/*
		 * User inputs for first name, last name, and student number.
		 */
		System.out.print("Enter first name: ");
		firstName = scanner.nextLine();
		System.out.print("Enter last name: ");
		lastName = scanner.nextLine();
		System.out.print("Enter student number: ");
		studentNumber = scanner.nextLine();
		scanner.close();
		
		/*
		 * Sets the first name, last name, and student number to the instance of Username.
		 */
		username.setFirstName(firstName);
		username.setLastName(lastName);
		username.setStudentNumber(studentNumber);
		
		/*
		 * Output the information entered.
		 */
		System.out.println();
		System.out.println("Information entered:");
		System.out.println("First name: " + username.getFirstName());
		System.out.println("Last name: " + username.getLastName());
		System.out.println("ID: " + username.getStudentNumber());
		
		/*
		 * Output the pig latinized version of the inputted information.
		 */
		System.out.println();
		System.out.println("Pig Latinized:");
		System.out.println("First name: " + username.pigLatinize(username.getFirstName()));
		System.out.println("Last name: " + username.pigLatinize(username.getLastName()));
		System.out.println("ID: " + username.pigLatinize(username.getStudentNumber()));
	}

}
