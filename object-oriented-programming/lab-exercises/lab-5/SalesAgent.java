/*
 * File name: SalesAgent.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 5
 * Date: July 12, 2023
 * Due Date: July 15, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents a Sales Agent with a name and age.
 */

package w23lab5;

/**
 * This class represents a Sales Agent with a name and age.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see SalesSupervisor
 * @see SalesChief
 * @see SalesPerson
 * @see SalesAgentTest
 * @see SalesAgentTest2
 * @see SalesPersonTest
 * @since 11
 */
public class SalesAgent {
	/**
	 * The name of the Sales Agent
	 */
	private String name;
	
	/**
	 * The age of the Sales Agent
	 */
	private int age;
	
	/**
	 * The default constructor initializes the Sales Agent with default values.
	 */
	public SalesAgent() {
		this("", 0);
	}
	   
	/**
	 * This constructor initializes the Sales Agent with the specified name and age.
	 * @param name the name of the Sales Agent.
	 * @param age the age of the Sales Agent.
	 */
	public SalesAgent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Returns the name of the Sales Agent.
	 * @return the name of the Sales Agent.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the Sales Agent.
	 * @param name the name to set for the Sales Agent.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the age of the Sales Agent.
	 * @return the age of the Sales Agent.
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Sets the age of the Sales Agent.
	 * @param age the age to set for the Sales Agent.
	 */
	public void setAge(int age) {
		this.age = age;
	}
		
	/**
	 * Returns the String representation of the object.
	 * @return a String representation of the object.
	 */
	@Override
	public String toString() {
		return "Sales Agent [name=" + name + ",age=" + age + "]";
	}
}