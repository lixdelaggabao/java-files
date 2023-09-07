/*
 * File name: WorldClockDemo.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 2
 * Date: July 3, 2023
 * Due Date: July 9, 2023
 * Professor: Daniel Cormier
 * Purpose: This class tests the Clock and WorldClock classes.
 */

package w23assignment2;

/**
 * Tests the Clock and WorldClock classes.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Clock
 * @see AlarmClock
 * @see WorldClock
 * @see ClockDemo
 * @see ClocksDemo
 * @since 11
 */
public class WorldClockDemo
{
	/**
	 * This is the entry point for the program. It creates an instance of the WorldClock class then displays
	 * the current time at the time zone with the specified offset.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("Testing WorldClock class");
		int offset = 3;
		System.out.println("Offset: " + offset);
		
		/*
		 * Create an instance of WorldClock with offset.
		 */
		WorldClock wclock = new WorldClock(offset);
		
		/*
		 * Display hours, minutes, and current time at the time zone.
		 */
		System.out.println("Hours: " + wclock.getHours());
		System.out.println("Minutes: " + wclock.getMinutes());
		System.out.println("Time: " + wclock.getTime());
	}
}
