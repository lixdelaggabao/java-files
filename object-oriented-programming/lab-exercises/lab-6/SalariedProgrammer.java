/*
 * File name: SalariedProgrammer.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 6
 * Date: July 26, 2023
 * Due Date: July 29, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents a Salaried Programmer with a weekly salary and inherits from Programmer.
 */

/**
 * This class represents a Salaried Programmer with a weekly salary and inherits from Programmer.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Invoice
 * @see Programmer
 * @see HourlyProgrammer
 * @see CommissionProgrammer
 * @see BasePlusCommissionProgrammer
 * @see Payme
 * @see PaymeInterfaceTest
 * @since 11
 */
public class SalariedProgrammer extends Programmer {
	/**
	 * The weekly salary of the Salaried Programmer.
	 */
	private double weeklySalary;

	/**
	 * This constructor initializes the Salaried Programmer with the specified first name, last name,
	 * social security number, contract year, and weekly salary.
	 * @param firstName the first name of the Salaried Programmer.
	 * @param lastName the last name of the Salaried Programmer.
	 * @param socialSecurityNumber the social security number of the Salaried Programmer.
	 * @param year the contract year of the Salaried Programmer.
	 * @param weeklySalary the weekly salary of the Salaried Programmer.
	 */
	public SalariedProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int year, double weeklySalary)
	{
		super(firstName, lastName, socialSecurityNumber, year); 
	
		if (weeklySalary < 0.0) { // validate weekly salary
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}
	
		this.weeklySalary = weeklySalary;
	} 
	
	/**
	 * Sets the weekly salary of the Salaried Programmer.
	 * @param weeklySalary the weekly salary to set for the Salaried Programmer.
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) { // validate weekly salary
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}
	
		this.weeklySalary = weeklySalary;
	} 
	
	/**
	 * Returns the weekly salary of the Salaried Programmer.
	 * @return the weekly salary of the Salaried Programmer.
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} 
	
	/**
	 * Returns the payment amount for the Salaried Programmer.
	 * @return the payment amount for the Salaried Programmer.
	 */
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
	}         
	
	/**
	 * Returns the String representation of the Salaried Programmer object.
	 * @return the String representation of the Salaried Programmer object.
	 */
	@Override        
	public String toString() {
		return String.format("%s %s\n%s: $%,.2f", 
				"salaried", super.toString(), 
				"weekly salary", getWeeklySalary());
	}
}

