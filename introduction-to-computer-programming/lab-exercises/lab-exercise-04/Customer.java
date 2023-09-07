/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: March 24, 2023
 * Modified: March 21, 2023
 * Description: Lab Exercise 04 Task 2
 */

/*
 * This class represents a Customer with age. This also contains its constructors, age accessor, age mutator, and a worker method
 * that calculates the ticket price based on the age of the customer.
 */
public class Customer {
	private int age;
	
	/*
	 * Constructor with no parameter used for initializing objects and sets the age to 0.
	 */
	public Customer() {
		this(0);
	}
	
	/*
	 * Constructor with parameters and sets the value of the age parameter to the instance variable age.
	 */
	public Customer(int age) {
		this.age = age;
	}

	/*
	 * Accessor for age
	 */
	public int getAge() {
		return age;
	}

	/*
	 * Mutator for age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * This method calculates the ticket price based on the age.
	 * A return value of -1.0 indicates that the age is invalid.
	 */
	public double calculateTicketPrice() {
		double price = -1.0; // set to -1 in case the age is invalid.
		
		if (age >= 0 && age < 3) {
			price = 0;
		}
		else if (age >= 3 && age <= 13) {
			price = 7.99;
		}
		else if (age >= 14 && age < 65) {
			price = 10.99;
		}
		else if (age >= 65 && age < 110) {
			price = 8.50;
		}
		
		return price; 
	}
	
}
