/*
 * File name: WorldClock.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 2
 * Date: July 3, 2023
 * Due Date: July 9, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents a world clock used to indicate the current time of a time zone.
 */

package w23assignment2;

/**
 * This class represents a world clock used to indicate the current time of a time zone.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Clock
 * @see AlarmClock
 * @see ClockDemo
 * @see ClocksDemo
 * @see WorldClockDemo
 * @since 11
 */
public class WorldClock extends Clock {
	/**
	 * The difference in hours between a certain time zone and UTC.
	 */
	private int offset;
	
	/**
	 * The default constructor initializes the world clock with an offset of 0.
	 */
	public WorldClock() {
		this(0);
	}
	
	/**
	 * This constructor initializes the world clock with the specified offset.
	 * @param offset the offset to set for the world clock.
	 */
	public WorldClock(int offset) {
		this.offset = offset;
	}
	
	/**
	 * Returns the offset of the world clock.
	 * @return the offset of the world clock.
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets the offset of the world clock.
	 * @param offset the offset to set for the world clock.
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Returns a String representation of the current time at the time zone with the specified offset.
	 * @return a String representing the current time at the time zone with the specified offset.
	 */
	@Override
	public String getTime() {
		/*
		 * Calculate the hour with offset and not exceed the 24-hour format.
		 */
		int newHours = (Integer.parseInt(super.getHours()) + offset) % 24;
		
		/*
		 * Adjust the hour if it becomes negative.
		 */
		if (newHours < 0) {
			newHours += 24;
		}
		
		return String.format("%02d:%s", newHours, super.getMinutes());
	}
}
