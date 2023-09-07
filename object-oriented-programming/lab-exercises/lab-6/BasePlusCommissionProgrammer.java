/*
 * File name: BasePlusCommissionProgrammer.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 6
 * Date: July 26, 2023
 * Due Date: July 29, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents a Base Plus Commission Programmer with base salary and 
 * inherits from CommissionProgrammer.
 */

/**
 * This class represents a Base Plus Commission Programmer with base salary and inherits
 * from CommissionProgrammer.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Invoice
 * @see Programmer
 * @see HourlyProgrammer
 * @see SalariedProgrammer
 * @see CommissionProgrammer
 * @see Payme
 * @see PaymeInterfaceTest
 * @since 11
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer {
	/**
	 * The base salary per week of the Base Plus Commission Programmer.
	 */
	private double baseSalary;
	
	/**
	 * This constructor initializes the Base Plus Commission Programmer with the specified
	 * first name, last name, social security number, contract year, gross weekly sales, 
	 * commission percentage, and base salary per week.
	 * @param firstName the first name of the Base Plus Commission Programmer.
	 * @param lastName the last name of the Base Plus Commission Programmer.
	 * @param socialSecurityNumber the social security number of the Base Plus Commission Programmer.
	 * @param year the contract year of the Base Plus Commission Programmer.
	 * @param grossSales the gross weekly sales of the Base Plus Commission Programmer.
	 * @param commissionRate the commission percentage of the Base Plus Commission Programmer.
	 * @param baseSalary the base salary per week of the Base Plus Commission Programmer.
	 */
	public BasePlusCommissionProgrammer (String firstName, String lastName, 
			String socialSecurityNumber, int year, double grossSales, double commissionRate, 
			double baseSalary)
	{
		super(firstName, lastName, socialSecurityNumber, year,
				grossSales, commissionRate);
	
		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
	
		this.baseSalary = baseSalary;  
	}
	
	/**
	 * Sets the base salary per week of the Base Plus Commission Programmer.
	 * @param baseSalary the base salary per week to set for the Base Plus Commission Programmer.
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
	
		this.baseSalary = baseSalary;
	} 
	
	/**
	 * Returns the base salary per week of the Base Plus Commission Programmer.
	 * @return the base salary per week of the Base Plus Commission Programmer.
	 */
	public double getBaseSalary() {
		return baseSalary;
	}
	
	/**
	 * Returns the payment amount for the Base Plus Commission Programmer.
	 * @return the payment amount for the Base Plus Commission Programmer.
	 */
	@Override                                                            
	public double getPaymentAmount() {                                             
		return getBaseSalary() + super.getPaymentAmount();                        
	}
	
	/**
	 * Returns the String representation of the Base Plus Commission Programmer object.
	 * @return the String representation of the Base Plus Commission Programmer object.
	 */
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", 
				"base-plus", super.toString(), 
				"base salary", getBaseSalary());
	}
}



