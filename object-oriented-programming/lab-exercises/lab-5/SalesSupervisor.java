/*
 * File name: SalesSupervisor.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 5
 * Date: July 12, 2023
 * Due Date: July 15, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents a Sales Supervisor with a location, inheriting from SalesAgent.
 */

package w23lab5;

/**
 * This class represents a Sales Supervisor with a location, inheriting from SalesAgent.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see SalesAgent
 * @see SalesChief
 * @see SalesPerson
 * @see SalesAgentTest
 * @see SalesAgentTest2
 * @see SalesPersonTest
 * @since 11
 */
public class SalesSupervisor extends SalesAgent {
	/**
	 * The location of the Sales Supervisor.
	 */
	private String location;
	
	/**
	 * The default constructor initializes the Sales Supervisor with default values.
	 */
	public SalesSupervisor() {
		this("", 0, "");
	}
	
	/**
	 * This constructor initializes the Sales Supervisor with the specified name, age, and location.
	 * @param name the name of the Sales Supervisor.
	 * @param age the age of the Sales Supervisor.
	 * @param location the location of the Sales Supervisor.
	 */
	public SalesSupervisor(String name, int age, String location) {
		super(name, age);
		this.location = location;
	}
	
	/**
	 * Returns the location of the Sales Supervisor.
	 * @return the location of the Sales Supervisor.
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location of the Sales Supervisor.
	 * @param location the location to set for the Sales Supervisor.
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Returns the String representation of the object.
	 * @return a String representation of the object.
	 */
	@Override
	public String toString() {
		return "Sales Supervisor [super=" + super.toString() + ",location=" + location + "]";
	}
}
