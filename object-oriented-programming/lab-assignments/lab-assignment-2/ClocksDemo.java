/*
 * File name: ClocksDemo.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 2
 * Date: July 3, 2023
 * Due Date: July 9, 2023
 * Professor: Daniel Cormier
 * Purpose: This class tests the Clock, WorldClock, and AlarmClock classes.
 */

package w23assignment2;

/**
 * Tests the Clock, WorldClock, and AlarmClock classes.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Clock
 * @see AlarmClock
 * @see WorldClock
 * @see ClockDemo
 * @see WorldClockDemo
 * @since 11
 */
public class ClocksDemo {
	/**
	 * This is the entry point for the program. It creates instances of Clock, WorldClock, and AlarmClock
	 * classes then displays the time for each of the classes.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		/*
		 * Create instances of Clock, WorldClock, and AlarmClock classes then store in an array.
		 */
		Clock clock = new Clock();
		WorldClock worldClock = new WorldClock(4);
		AlarmClock alarmClock = new AlarmClock(17, 28);
		Clock[] clocks = {clock, worldClock, alarmClock};

		/*
		 * Display the time for each class.
		 */
		for (Clock c : clocks) {
			System.out.printf("%s Time: %s %n", c.getClass().getSimpleName(), c.getTime());
		}
	}

}
