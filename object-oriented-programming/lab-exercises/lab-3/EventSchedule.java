package lab3package;

import java.time.LocalDate;
/*
 * File name: EventSchedule.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 3
 * Date: June 6, 2023
 * Due Date: June 11, 2023
 * Professor: Daniel Cormier
 * Purpose: This class is used to represent an event schedule which contains the date of the event.
 */

/*
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Lixdel Louisse L. Aggabao. 
 */

/**
 * This class is named EventSchedule Class. It shows constructor chaining using keyword "this".
 * In this code, the simpler constructors all call the more complex one, thereby
 * chaining the calls 'UPWARDS' (from the default constructor to the one 
 * with the most arguments. Ensure that you implement it in this order). 
 
 * EventSchedule() calls EventSchedule(int, int, int), program flow returns to
 * EventSchedule() and exits the constructor.
 * 
 * EventSchedule(int) calls EventSchedule(int, int, int), program flow returns
 * to EventSchedule(int) and exits the constructor.
 * 
 * EventSchedule(int, int) calls EventSchedule(int, int, int), program flow
 * returns to EventSchedule(int, int) and exits the constructor.
 * 
 * EventSchedule(int, int, int) just assigns the values.
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in them,
 *       for demonstration purposes only. DO NOT PUT input / output
 *       into constructors in real production code!!!
 * 
 * This class represents an event schedule which contains the date of the event.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see TestDemo
 * @since 11
 */
public class EventSchedule {

	/**
	 * year component of the date of EventSchedule.
	 */
	private int year;
	
	/**
	 * month component of the date of EventSchedule.
	 */
	private int month;
	
	/**
	 * day component of the date of EventSchedule.
	 */
	private int day;
	
	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	public EventSchedule() {
		this(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
		System.out.println("EventSchedule() was called");
	}
	
	/**
	 * This constructor sets the year as passed, month to current month,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 */
	public EventSchedule(int year) {
		this(year, LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
		System.out.println("EventSchedule(int) was called");
	}
	
	/**
	 * This constructor sets the year as passed, month as passed,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 * @param month The month of this EventSchedule.
	 */
	public EventSchedule(int year, int month) {
		this(year, month, LocalDate.now().getDayOfMonth());
		System.out.println("EventSchedule(int, int) was called");
	}	

	/**
	 * This constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year The year of this EventSchedule.
	 * @param month The month of this EventSchedule.
	 * @param day The day of this EventSchedule.
	 */
	public EventSchedule(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println("EventSchedule(int, int, int) was called");
	}
	
	/**
	 * Returns the year for this EventSchedule.
	 * @return the year for this EventSchedule.
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Sets the year for this EventSchedule.
	 * @param year This is the year to set for this EventSchedule.
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Returns the month for this EventSchedule.
	 * @return the month for this EventSchedule.
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * Sets the month for this EventSchedule.
	 * @param month This is the month to set for this EventSchedule.
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	
	/**
	 * Returns the day for this EventSchedule.
	 * @return the day for this EventSchedule.
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * Sets the day for this EventSchedule.
	 * @param day This is the day to set for this EventSchedule.
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	/**
	 * Generates a report containing the information about this EventSchedule.
	 * @return A String representation of this EventSchedule, each field is separated 
	 * by a comma in the order of year, month, day.
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",year,month,day);
	}
}
