/*
 * File name: CommissionProgrammer.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 6
 * Date: July 26, 2023
 * Due Date: July 29, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents a Commission Programmer with gross weekly sales and commission percentage and 
 * inherits from Programmer.
 */

/**
 * This class represents a Commission Programmer with gross weekly sales and commission percentage and inherits
 * from Programmer.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Invoice
 * @see Programmer
 * @see HourlyProgrammer
 * @see SalariedProgrammer
 * @see BasePlusCommissionProgrammer
 * @see Payme
 * @see PaymeInterfaceTest
 * @since 11
 */
public class CommissionProgrammer extends Programmer {
	/**
	 * The gross weekly sales of the Commission Programmer.
	 */
	private double grossSales;
	
	/**
	 * The commission percentage of the Commission Programmer.
	 */
	private double commissionRate;
	
	/**
	 * This constructor initializes the Commission Programmer with the specified first name,
	 * last name, social security number, contract year, gross weekly sales, and 
	 * commission percentage.
	 * @param firstName the first name of the Commission Programmer.
	 * @param lastName the last name of the Commission Programmer.
	 * @param socialSecurityNumber the social security number of the Commission Programmer.
	 * @param year the contract year of the Commission Programmer.
	 * @param grossSales the gross weekly sales of the Commission Programmer.
	 * @param commissionRate the commission percentage of the Commission Programmer.
	 */
	public CommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int year, double grossSales, 
			double commissionRate)
	{
		super(firstName, lastName, socialSecurityNumber, year);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate commission rate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
	
		if (grossSales < 0.0) { // validate gross sales
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 
	
	/**
	 * Sets the gross weekly sales of the Commission Programmer.
	 * @param grossSales the gross weekly sales to set for the Commission Programmer.
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate gross sales
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		this.grossSales = grossSales;
	} 
	
	/**
	 * Returns the gross weekly sales of the Commission Programmer.
	 * @return the gross weekly sales of the Commission Programmer.
	 */
	public double getGrossSales() {
		return grossSales;
	} 
	
	/**
	 * Sets the commission percentage of the Commission Programmer.
	 * @param commissionRate the commission percentage to set for the Commission Programmer.
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate commission rate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
		
		this.commissionRate = commissionRate;
	} 
	
	/**
	 * Returns the commission percentage of the Commission Programmer.
	 * @return the commission percentage of the Commission Programmer.
	 */
	public double getCommissionRate() {
		return commissionRate;
	} 
	
	/**
	 * Returns the payment amount for the Commission Programmer.
	 * @return the payment amount for the Commission Programmer.
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}                       
	
	/**
	 * Returns the String representation of the Commission Programmer object.
	 * @return the String representation of the Commission Programmer object.
	 */
	@Override
	public String toString() {
		return String.format("%s %s\n%s: $%,.2f; %s: %,.2f", 
				"commission", super.toString(), "gross sales", 
				getGrossSales(), "commission rate", getCommissionRate());
	}  
}

