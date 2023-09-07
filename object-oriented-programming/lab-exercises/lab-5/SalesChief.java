/*
 * File name: SalesChief.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 5
 * Date: July 12, 2023
 * Due Date: July 15, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents a Sales Chief with a department, inheriting from SalesSupervisor.
 */

package w23lab5;

/**
 * This class represents a Sales Chief with a department, inheriting from SalesSupervisor.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see SalesAgent
 * @see SalesSupervisor
 * @see SalesPerson
 * @see SalesAgentTest
 * @see SalesAgentTest2
 * @see SalesPersonTest
 * @since 11
 */
public class SalesChief extends SalesSupervisor {
	/**
	 * The department of the Sales Chief.
	 */
	private String department;
	
	/**
	 * The default constructor initializes the Sales Chief with default values.
	 */
	public SalesChief() {
		this("", 0, "", "");
	}
	
	/**
	 * This constructor initializes the Sales Chief with the specified name, age, location, and department.
	 * @param name the name of the Sales Chief.
	 * @param age the age of the Sales Chief.
	 * @param location the location of the Sales Chief.
	 * @param department the department of the Sales Chief.
	 */
	public SalesChief(String name, int age, String location, String department) {
		super(name, age, location);
		this.department = department;
	}
	
	/**
	 * Returns the department of the Sales Chief.
	 * @return the department of the Sales Chief.
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department of the Sales Chief.
	 * @param department the department to set for the Sales Chief.
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Returns the String representation of the object.
	 * @return a String representation of the object.
	 */
	@Override
	public String toString() {
		return "Sales Chief [super=" + super.toString() + ",department=" + department + "]";
	}
}
