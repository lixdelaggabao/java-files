/*
 * File name: Clock.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 2
 * Date: July 3, 2023
 * Due Date: July 9, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents a clock used to indicate the current local time.
 */

package w23assignment2;

import java.time.LocalTime;

/**
 * This class represents a clock used to indicate the current local time.
 * This assumes that the location is timezone 0 (UTC).
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see AlarmClock
 * @see WorldClock
 * @see ClockDemo
 * @see ClocksDemo
 * @see WorldClockDemo
 * @since 11
 */
public class Clock
{
	/**
	 * Returns a String representation of the hours of the current local time.
	 * @return a String representing the hours of the current local time.
	 */
	public String getHours() {
		return LocalTime.now().toString().substring(0, 2);
	}
	
	/**
	 * Returns a String representation of the minutes of the current local time.
	 * @return a String representing the minutes of the current local time.
	 */
	public String getMinutes() {
		return LocalTime.now().toString().substring(3, 5);
	}
	
	/**
	 * Returns a String representation of the current local time.
	 * @return a String representing the current local time.
	 */
	public String getTime() {
		return getHours() + ":" + getMinutes();
	}
}
