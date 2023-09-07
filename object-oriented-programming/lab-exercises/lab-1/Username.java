/*
 * File name: Username.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 1
 * Date: May 17, 2023
 * Due Date: May 20, 2023
 * Professor: Daniel Cormier
 * Purpose: This class is used to represent a Username which contains the name and student number of the student.
 */

/**
 * This class represents a Username which contains the name and student number of the student.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Driver
 * @since 11
 */
public class Username {
	private String firstName; // first name of the student
	private String lastName; // last name of the student
	private String studentNumber; // student number of the student
	
	/**
	 * Username no-argument constructor initializes each instance variable with empty
	 * strings.
	 */
	public Username() {
		this("", "", "");
	}
	
	/**
	 * Username constructor with given first name, last name, and student number.
	 * @param firstName the first name of the student.
	 * @param lastName the last name of the student.
	 * @param studentNumber the student number of the student.
	 */
	public Username(String firstName, String lastName, String studentNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
	}
	
	/**
	 * Gets the first name of the student.
	 * @return a String specifying the first name of the student.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name of the student.
	 * @param firstName the first name of the student.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the last name of the student.
	 * @return a String specifying the last name of the student.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name of the student.
	 * @param lastName the last name of the student.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the student number of the student.
	 * @return a String specifying the student number of the student.
	 */
	public String getStudentNumber() {
		return studentNumber;
	}
	
	/**
	 * Sets the student number of the student.
	 * @param studentNumber the student number of the student.
	 */
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	/**
	 * Converts the String or word into pig latin.
	 * @param word the String or word to be pig latinized.
	 * @return the pig latinized version of the String or word.
	 */
	public String pigLatinize(String word) {
		String pigLatinizedWord = "";
		
		for(int index = 1; index < word.length(); index++) {
			pigLatinizedWord += word.charAt(index);
		}
		
		pigLatinizedWord += word.charAt(0) + "ay";
		return pigLatinizedWord;
	}
}
