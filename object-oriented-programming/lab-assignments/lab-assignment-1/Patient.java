/*
 * File name: Patient.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 1
 * Date: June 7, 2023
 * Due Date: June 19, 2023
 * Professor: Daniel Cormier
 * Purpose: This class contains important health information about a patient.
 */

package w23assignment1;

import java.time.LocalDate;
import java.time.Period;

/**
 * This class contains important health information about a patient.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see MyHealthDataTest
 * @see MyHealthDataTest2
 * @since 11
 */
public class Patient {
	
	/**
	 * First name of the patient.
	 */
	private String firstName;
	
	/**
	 * Last name of the patient.
	 */
	private String lastName;
	
	/**
	 * Gender of the patient.
	 */
	private String gender;
	
	/**
	 * Birth year of the patient.
	 */
	private int birthYear;
	
	/**
	 * Birth month of the patient.
	 */
	private int birthMonth;
	
	/**
	 * Birth day of the patient.
	 */
	private int birthDay;
	
	/**
	 * Height (inches) of the patient.
	 */
	private double height;
	
	/**
	 * Weight (pounds) of the patient.
	 */
	private double weight;
	
	/**
	 * The default constructor initializes each instance variable with default values.
	 */
	public Patient() {
		this("", "", "", 0, 0, 0, 0.0, 0.0);
	}
	
	/**
	 * This constructor sets all patient data as passed.
	 * @param firstName the first name of the patient.
	 * @param lastName the last name of the patient.
	 * @param gender the gender of the patient.
	 * @param birthYear the birth year of the patient.
	 * @param birthMonth the birth month of the patient.
	 * @param birthDay the birth day of the patient.
	 * @param height the height (inches) of the patient.
	 * @param weight the weight (pounds) of the patient.
	 */
	public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.height = height;
		this.weight = weight;
	}
	
	/**
	 * Returns the first name of this patient.
	 * @return the first name of this patient.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of this patient.
	 * @param firstName the first name to set for this patient.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name of this patient.
	 * @return the last name of this patient.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of this patient.
	 * @param lastName the last name to set for this patient.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the gender of this patient.
	 * @return the gender of this patient.
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender of this patient.
	 * @param gender the gender to set for this patient.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns the birth year of this patient.
	 * @return the birth year of this patient.
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * Sets the birth year of this patient.
	 * @param birthYear the birth year to set for this patient.
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * Returns the birth month of this patient.
	 * @return the birth month of this patient.
	 */
	public int getBirthMonth() {
		return birthMonth;
	}

	/**
	 * Sets the birth month of this patient.
	 * @param birthMonth the birth month to set for this patient.
	 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	/**
	 * Returns the birth day of this patient.
	 * @return the birth day of this patient.
	 */
	public int getBirthDay() {
		return birthDay;
	}

	/**
	 * Sets the birth day of this patient.
	 * @param birthDay the birth day to set for this patient.
	 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * Returns the height in inches of this patient.
	 * @return the height in inches of this patient.
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the height in inches of this patient.
	 * @param height the height in inches to set for this patient.
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Returns the weight in pounds of this patient.
	 * @return the weight in pounds of this patient.
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight in pounds of this patient.
	 * @param weight the weight in pounds to set for this patient.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * Calculates and returns the Body Mass Index (BMI) of this patient.
	 * @return the Body Mass Index (BMI) of this patient.
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	}
	
	/**
	 * Calculates and returns a miscalculated Body Mass Index (BMI) of this patient.
	 * @return a miscalculated Body Mass Index (BMI) of this patient.
	 */
	public double getMiscalculatedBMI() {
		return (getWeight() * 100) / (getHeight() * getHeight());
	}
	
	
	/**
	 * Calculates and returns the age in years of this patient.
	 * @return the age in years of this patient.
	 */
	public int getAge() {
		LocalDate dateOfBirth = LocalDate.of(birthYear, birthMonth, birthDay);
		Period period = Period.between(dateOfBirth, LocalDate.now());
		
		return period.getYears();
	}
	
	/**
	 * Calculates and returns the maximum heart rate of this patient.
	 * @return the maximum heart rate of this patient.
	 */
	public double getMaximumHeartRate() {
		return (220 - getAge());
	}

	/**
	 * Calculates and returns the minimum target heart rate of this patient.
	 * @return the minimum target heart rate of this patient.
	 */
	public double getMinimumTargetHeartRate() {
		return (0.5 * getMaximumHeartRate());
	}
	
	/**
	 * Calculates and returns the maximum target heart rate of this patient.
	 * @return the maximum target heart rate of this patient.
	 */
	public double getMaximumTargetHeartRate() {
		return (0.85 * getMaximumHeartRate());
	}

	/**
	 * Displays all the patient's health data.
	 */
	public void displayMyHealthData() 
	{
		/*
		 * Display patient health data
		 */
		System.out.println("Patient Health Data:");
		System.out.printf("First name: %s %n", firstName);
		System.out.printf("Last name: %s %n", lastName);
		System.out.printf("Gender: %s %n", gender);
		System.out.printf("Birthdate: %d/%d/%d %n", birthMonth, birthDay, birthYear);
		System.out.printf("Height: %.2f in %n", height);
		System.out.printf("Weight: %.2f lb %n", weight);
		System.out.printf("Age: %d year(s) old %n", getAge());
		System.out.printf("BMI: %.2f %n", getBMI());
		System.out.printf("Maximum Heart Rate: %.0f %n", getMaximumHeartRate());
		System.out.printf("Target Heart Rate Range: %.0f - %.0f %n", getMinimumTargetHeartRate(), getMaximumTargetHeartRate());
		
		/*
		 * Display BMI Values
		 */
		System.out.println();
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");   
	}

}



