/*
 * File name: FishHandler.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 3
 * Date: August 1, 2023
 * Due Date: August 6, 2023
 * Professor: Daniel Cormier
 * Purpose: This class demonstrates rethrowing of an exception.
 */

package assignment3;

/**
 * This class demonstrates rethrowing of an exception.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see CatHandler
 * @see DogHandler
 * @see OrderHandler
 * @since 11
 */
public class FishHandler {
	/**
	 * This is the entry point for the program. It calls easterStarting method which
	 * calls easterEnding method then catches the Exception thrown by them.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		try {
			easterStarting();
		} catch (Exception exception) {
			System.err.println("Caught exception: " + exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	/**
	 * This method throws an Exception.
	 * @throws Exception Always throws an Exception.
	 */
	public static void easterEnding() throws Exception {
		throw new Exception("easterEnding Exception");
	}
	
	/**
	 * This method calls easterEnding method, catches the Exception, then rethrows it.
	 * @throws Exception The exception caught from easterEnding method.
	 */
	public static void easterStarting() throws Exception {
		try {
			easterEnding();
		} catch (Exception exception) {
			throw exception;
		}
	}
}
