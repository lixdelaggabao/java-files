/*
 * File name: HourlyProgrammer.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 6
 * Date: July 26, 2023
 * Due Date: July 29, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents an Hourly Programmer with wage per hour and number of hours worked for the week and
 * inherits from Programmer.
 */

/**
 * This class represents an Hourly Programmer with wage per hour and number of hours worked for the week and inherits
 * from Programmer.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Invoice
 * @see Programmer
 * @see SalariedProgrammer
 * @see CommissionProgrammer
 * @see BasePlusCommissionProgrammer
 * @see Payme
 * @see PaymeInterfaceTest
 * @since 11
 */
public class HourlyProgrammer extends Programmer {
	/**
	 * The wage per hour of the Hourly Programmer.
	 */
	private double wage;
	
	/**
	 * The number of hours worked for the week by the Hourly Programmer.
	 */
	private double hours;
	
	/**
	 * This constructor initializes the Hourly Programmer with the specified first name, 
	 * last name, social security number, contract year, wage per hour, and number of hours.
	 * @param firstName the first name of the Hourly Programmer.
	 * @param lastName the last name of the Hourly Programmer.
	 * @param socialSecurityNumber the social security number of the Hourly Programmer.
	 * @param year the contract year of the Hourly Programmer.
	 * @param wage the wage per hour of the Hourly Programmer.
	 * @param hours the number of hours worked for the week by the Hourly Programmer.
	 */
	public HourlyProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int year, double wage, double hours)
	{
		super(firstName, lastName, socialSecurityNumber, year);
		
		if (wage < 0.0) { // validate wage
		  throw new IllegalArgumentException(
		     "Hourly wage must be >= 0.0");
		}
	
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}
	
		this.wage = wage;
		this.hours = hours;
	} 
	
	/**
	 * Sets the wage per hour of the Hourly Programmer.
	 * @param wage the wage per hour to set for the Hourly Programmer.
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}
	
		this.wage = wage;
	} 
	
	/**
	 * Returns the wage per hour of the Hourly Programmer.
	 * @return the wage per hour of the Hourly Programmer.
	 */
	public double getWage() {
		return wage;
	} 
	
	/**
	 * Sets the hours worked for the week by the Hourly Programmer.
	 * @param hours the hours worked for the week to set for the Hourly Programmer.
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}
	
		this.hours = hours;
	} 
	
	/**
	 * Returns the hours worked for the week by the Hourly Programmer.
	 * @return the hours worked for the week by the Hourly Programmer.
	 */
	public double getHours() {
		return hours;
	} 
	
	/**
	 * Returns the payment amount for the Hourly Programmer.
	 * @return the payment amount for the Hourly Programmer.
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		if (getHours() <= 40) { // no overtime                           
			return getWage() * getHours();   
		} else { //with overtime
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}
	
	/**
	 * Returns the String representation of the Hourly Programmer object.
	 * @return the String representation of the Hourly Programmer object.
	 */
	@Override                                                             
	public String toString() {
		return String.format("%s %s\n%s: $%,.2f; %s: %,.2f", 
				"hourly", super.toString(), "hourly wage", 
				getWage(), "hours worked", getHours());
	}        
}

