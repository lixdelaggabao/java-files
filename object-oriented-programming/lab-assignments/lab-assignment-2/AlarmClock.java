/*
 * File name: AlarmClock.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 2
 * Date: July 3, 2023
 * Due Date: July 9, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents an alarm clock used to set an alarm at a particular time.
 */

package w23assignment2;

import java.time.LocalTime;

/**
 * This class represents an alarm clock used to set an alarm at a particular time.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Clock
 * @see WorldClock
 * @see ClockDemo
 * @see ClocksDemo
 * @see WorldClockDemo
 * @since 11
 */
public class AlarmClock extends Clock {
	/**
	 * The set hours for the alarm.
	 */
	private int hours;
	
	/**
	 * The set minutes for the alarm.
	 */
	private int minutes;
	
	/**
	 * The default constructor initializes the hours and minutes to -1 (no alarm set).
	 */
	public AlarmClock() {
		this(-1, -1);
	}
	
	/**
	 * This constructor initializes the alarm using the specified hours and minutes.
	 * @param hours the hours to set for the alarm.
	 * @param minutes the minutes to set for the alarm.
	 */
	public AlarmClock(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	/**
	 * Sets the hours of the alarm.
	 * @param hours the hours to set for the alarm.
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * Sets the minutes of the alarm.
	 * @param minutes the minutes to set for the alarm.
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	/**
	 * Sets the alarm using the specified hours and minutes.
	 * @param hours the hours to set for the alarm.
	 * @param minutes the minutes to set for the alarm.
	 */
	public void setAlarm(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	/**
	 * Returns a String representation of the current time and an indication if the alarm time has been reached.
	 * @return a String representing the current time and an indication if the alarm time has been reached.
	 */
	@Override
	public String getTime() {
		/*
		 * Check if alarm has been set.
		 */
		if(hours > -1 && minutes > -1) {
			LocalTime alarmTime = LocalTime.of(hours, minutes);
			LocalTime currentTime = LocalTime.of(Integer.parseInt(super.getHours()), Integer.parseInt(super.getMinutes()));
			
			/*
			 * Check if the alarm time has been reached.
			 */
			if (currentTime.compareTo(alarmTime) >= 0) {
				/*
				 * Clear the alarm.
				 */
				hours = -1;
				minutes = -1;
				
				return super.getTime() + " Alarm";
			}
		}
		
		return super.getTime();
	}
}
