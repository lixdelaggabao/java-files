/*
 * File name: SalesPerson.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 5
 * Date: July 12, 2023
 * Due Date: July 15, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents a Sales Person with a name, age, location, and department.
 */

package w23lab5;

/**
 * This class represents a Sales Person with a name, age, location, and department.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see SalesAgent
 * @see SalesSupervisor
 * @see SalesChief
 * @see SalesAgentTest
 * @see SalesAgentTest2
 * @see SalesPersonTest
 * @since 11
 */
public class SalesPerson {
	/**
	 * The name of the Sales Person.
	 */
	private String name;
	
	/**
	 * The age of the Sales Person.
	 */
	private int age;
	
	/**
	 * The location of the Sales Person.
	 */
	private String location;
	
	/**
	 * The department of the Sales Person.
	 */
	private String department;

	/**
	 * The default constructor initializes the Sales Person with default values.
	 */
	public SalesPerson() {
		this("", 0, "", "");
	}
	
	/**
	 * This constructor initializes the Sales Person with the specified name and age.
	 * @param name the name of the Sales Person.
	 * @param age the age of the Sales Person.
	 */
	public SalesPerson(String name, int age) {
		this(name, age, "", "");
	}
	
	/**
	 * This constructor initializes the Sales Person with the specified name, age, and location.
	 * @param name the name of the Sales Person.
	 * @param age the age of the Sales Person.
	 * @param location the location of the Sales Person.
	 */
	public SalesPerson(String name, int age, String location) {
		this(name, age, location, "");
	}
	
	/**
	 * This constructor initializes the Sales Person with the specified name, age, location, and department.
	 * @param name the name of the Sales Person.
	 * @param age the age of the Sales Person.
	 * @param location the location of the Sales Person.
	 * @param department the department of the Sales Person.
	 */
	public SalesPerson(String name, int age, String location, String department) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.department = department;
	}

	/**
	 * Returns the name of the Sales Person.
	 * @return the name of the Sales Person.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the Sales Person.
	 * @param name the name to set for the Sales Person.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the age of the Sales Person.
	 * @return the age of the Sales Person.
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age of the Sales Person.
	 * @param age the age to set for the Sales Person.
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Returns the location of the Sales Person.
	 * @return the location of the Sales Person.
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location of the Sales Person.
	 * @param location the location to set for the Sales Person.
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Returns the department of the Sales Person.
	 * @return the department of the Sales Person.
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department of the Sales Person.
	 * @param department the department to set for the Sales Person.
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
		String output = "Sales Agent [name=" + name + ",age=" + age + "]";
		
		if(!location.isEmpty()) {
			output = "Sales Supervisor [super=" + output + ",location=" + location + "]";
		}
		if(!department.isEmpty()) {
			output = "Sales Chief [super=" + output + ",department=" + department + "]";
		} 
		
		return output;
	}
}
