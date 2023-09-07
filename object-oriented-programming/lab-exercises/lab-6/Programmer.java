/*
 * File name: Programmer.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 6
 * Date: July 26, 2023
 * Due Date: July 29, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents a Programmer with first name, last name, social security number, 
 * and contract year.
 */

/**
 * This class represents a Programmer with first name, last name, social security number, 
 * and contract year.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Invoice
 * @see HourlyProgrammer
 * @see SalariedProgrammer
 * @see CommissionProgrammer
 * @see BasePlusCommissionProgrammer
 * @see Payme
 * @see PaymeInterfaceTest
 * @since 11
 */
public abstract class Programmer implements Payme {
	/**
	 * The first name of the Programmer.
	 */
	private String firstName;
	
	/**
	 * The last name of the Programmer.
	 */
	private String lastName;
	
	/**
	 * The social security number of the Programmer.
	 */
	private String socialSecurityNumber;
	
	/**
	 * The contract year of the Programmer.
	 */
	private int year;
	
	/**
	 * This constructor initializes the Programmer with the specified first name, last name, social security number, 
	 * and contract year.
	 * @param first the first name of the Programmer.
	 * @param last the last name of the Programmer.
	 * @param ssn the social security number of the Programmer.
	 * @param year the contract year of the Programmer.
	 */
	public Programmer(String first, String last, String ssn, int year) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		
		// validate year
		if (year >= 0 && year <= 23) {
			year += 2000;
		} else if (year > 23 && year < 100) {
			year += 1900;
		} else if (year < 1900 || year > 2023) {
			throw new IllegalArgumentException("Year must be >= 1900 and <= 2023");
		}
		
		this.year = year;
	}
	
	/**
	 * Returns the first name of the Programmer.
	 * @return the first name of the Programmer.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the Programmer.
	 * @param firstName the first name to set for the Programmer.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name of the Programmer.
	 * @return the last name of the Programmer.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the Programmer.
	 * @param lastName the last name to set for the Programmer.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the social security number of the Programmer.
	 * @return the social security number of the Programmer.
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * Sets the social security number of the Programmer.
	 * @param socialSecurityNumber the social security number to set for the Programmer.
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	/**
	 * Returns the contract year of the Programmer.
	 * @return the contract year of the Programmer.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the contract year of the Programmer.
	 * @param year the contract year to set for the Programmer.
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Returns the String representation of the Programmer object.
	 * @return the String representation of the Programmer object.
	 */
	@Override
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: %d", "Programmer", 
				getFirstName(), getLastName(), "social security number", 
				getSocialSecurityNumber(), "contract year", year);
	} 
	
	/**
	 * Returns the payment amount for the Programmer.
	 * @return the payment amount for the Programmer.
	 */
	@Override
	public abstract double getPaymentAmount();
} 


