/*
 * File name: ClockDemo.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 2
 * Date: July 3, 2023
 * Due Date: July 9, 2023
 * Professor: Daniel Cormier
 * Purpose: This class tests the Clock class.
 */

package w23assignment2;

/**
 * Tests the Clock class.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Clock
 * @see AlarmClock
 * @see WorldClock
 * @see ClocksDemo
 * @see WorldClockDemo
 * @since 11
 */
public class ClockDemo
{
	/**
	 * This is the entry point for the program. It creates an instance of the Clock class then displays the current time.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args)
	{
		System.out.println("Testing Clock class");
		
		/*
		 * Create an instance of Clock class.
		 */
		Clock clock = new Clock();
		
		/*
		 * Display hours, minutes, and current time.
		 */
		System.out.println("Hours: " + clock.getHours());
		System.out.println("Minutes: " + clock.getMinutes());
		System.out.println("Time: " + clock.getTime());
	}
}
