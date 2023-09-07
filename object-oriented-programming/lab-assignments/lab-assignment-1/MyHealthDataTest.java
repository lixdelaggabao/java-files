/*
 * File name: MyHealthDataTest.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 1
 * Date: June 7, 2023
 * Due Date: June 19, 2023
 * Professor: Daniel Cormier
 * Purpose: This is the driver class for this program. This runs the application with a method main to input information about the patient.
 */

package w23assignment1;

import java.util.Scanner;

/**
 * This is the driver class for this program. This runs the application with a method main to input information about the patient.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Patient
 * @see MyHealthDataTest2
 * @since 11
 */
public class MyHealthDataTest {

	/**
	 * This is the entry point for the program. It asks for input for patient data, instantiates a patient, and displays the health data.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		/*
		 * Declaration of variables.
		 */
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		int birthMonth;
		int birthDay;
		double height;
		double weight;
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * Prompt for input of the patient's data.
		 */
		System.out.print("Enter patient's first name: ");
		firstName = scanner.nextLine();
		
		System.out.print("Enter patient's last name: ");
		lastName = scanner.nextLine();
		
		System.out.print("Enter patient's gender: ");
		gender = scanner.nextLine();
		
		System.out.print("Enter patient's birth year: ");
		birthYear = scanner.nextInt();
		
		System.out.print("Enter patient's birth month: ");
		birthMonth = scanner.nextInt();
		
		System.out.print("Enter patient's birth day: ");
		birthDay = scanner.nextInt();
		
		System.out.print("Enter patient's height (inches): ");
		height = scanner.nextDouble();
		
		System.out.print("Enter patient's weight (pounds): ");
		weight = scanner.nextDouble();
		
		System.out.println();
		scanner.close();
		
		/*
		 * Instantiate a patient using the data entered then display health data.
		 */
		Patient patient = new Patient(firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight);
		patient.displayMyHealthData();
	}

}
