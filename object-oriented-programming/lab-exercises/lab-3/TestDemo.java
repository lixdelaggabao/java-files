package lab3package;
/*
 * File name: TestDemo.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 3
 * Date: June 6, 2023
 * Due Date: June 11, 2023
 * Professor: Daniel Cormier
 * Purpose: This class is the driver class for this program. This runs the application with a method main to instantiate EventSchedule objects.
 */

/*
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main to instantiate EventSchedule objects.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see EventSchedule
 * @since 11
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		System.out.println("Just creating 4 EventSchedules");
		System.out.println();
		
		/*
		 * Create EventSchedule1 and output report
		 */
		System.out.println("EventSchedule1");
		System.out.println(new EventSchedule().createReport());
		
		/*
		 * Create EventSchedule2 and output report
		 */
		System.out.println("EventSchedule2");
		System.out.println(new EventSchedule(2024).createReport());
		
		/*
		 * Create EventSchedule3 and output report
		 */
		System.out.println("EventSchedule3");
		System.out.println(new EventSchedule(2024, 12).createReport());
		
		/*
		 * Create EventSchedule4 and output report
		 */
		System.out.println("EventSchedule4");
		System.out.println(new EventSchedule(2024, 12, 15).createReport());
	}

}
