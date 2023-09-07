/*
 * File name: OrderHandler.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 3
 * Date: August 1, 2023
 * Due Date: August 6, 2023
 * Professor: Daniel Cormier
 * Purpose: This class demonstrates that the more specific exception (IOException) is caught
 * first before the more general exception (Exception) because the more general
 * exception will catch all exceptions under it and the more specific exception will never be
 * caught if it is placed after the catch block of the more general exception.
 */

package assignment3;

import java.io.IOException;

/**
 * This class demonstrates that the more specific exception (IOException) is caught
 * first before the more general exception (Exception) because the more general
 * exception will catch all exceptions under it and the more specific exception will never be
 * caught if it is placed after the catch block of the more general exception.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see CatHandler
 * @see DogHandler
 * @see FishHandler
 * @since 11
 */
public class OrderHandler {
	/**
	 * This is the entry point for the program. It instantiates an Exception and IOException,
	 * throws them, then provides a catch for the subclass (IOException) first before the
	 * superclass (Exception).
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		/*
		 * Instantiates an Exception, throws it, then catches it with IOException first before
		 * Exception.
		 */
		try {
			Exception exception = new Exception("Exception");
			throw exception;
		} catch (IOException ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
			ex.printStackTrace();
		} catch (Exception ex) {
			System.err.println("Caught Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		/*
		 * Instantiates an IOException, throws it, then catches it with IOException first
		 * before Exception.
		 */
		try {
			IOException ioException = new IOException("IO Exception");
			throw ioException;
		} catch (IOException ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
			ex.printStackTrace();
		} catch (Exception ex) {
			System.err.println("Caught Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
