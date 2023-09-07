/*
 * File name: CatHandler.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 3
 * Date: August 1, 2023
 * Due Date: August 6, 2023
 * Professor: Daniel Cormier
 * Purpose: This class demonstrates catching subclass exceptions in the superclass exception. It shows
 * that ExceptionAlpha can handle both ExceptionBeta and ExceptionGammer.
 */

package assignment3;

/**
 * This class demonstrates catching subclass exceptions in the superclass exception. It shows
 * that ExceptionAlpha can handle both ExceptionBeta and ExceptionGammer.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see DogHandler
 * @see FishHandler
 * @see OrderHandler
 * @since 11
 */
public class CatHandler {
	/**
	 * This is the entry point for the program. It throws an ExceptionBeta and ExceptionGammer exception
	 * then catches them with ExceptionAlpha.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		/*
		 * Throw an ExceptionBeta exception and catch with ExceptionAlpha.
		 */
		try {
			throw new ExceptionBeta("Exception Beta");
		} catch (ExceptionAlpha exception) {
			System.err.println("Caught ExceptionAlpha: " + exception.getMessage());
			exception.printStackTrace();
		}
		
		/*
		 * Throw an ExceptionGammer exception and catch with ExceptionAlpha.
		 */
		try {
			throw new ExceptionGammer("Exception Gammer");
		} catch (ExceptionAlpha exception) {
			System.err.println("Caught ExceptionAlpha: " + exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	/**
	 * This is a custom exception class representing ExceptionAlpha and extends from Exception.
	 */
	public static class ExceptionAlpha extends Exception {
		/**
		 * Constructs ExceptionAlpha with the specified error message.
		 * @param message the error message for ExceptionAlpha.
		 */
		public ExceptionAlpha(String message) {
			super(message);
		}
	}
	
	/**
	 * This is a custom exception class representing ExceptionBeta and extends from ExceptionAlpha.
	 */
	public static class ExceptionBeta extends ExceptionAlpha {
		/**
		 * Constructs ExceptionBeta with the specified error message.
		 * @param message the error message for ExceptionBeta.
		 */
		public ExceptionBeta(String message) {
			super(message);
		}
	}
	
	/**
	 * This is a custom exception class representing ExceptionGammer and extends from ExceptionBeta.
	 */
	public static class ExceptionGammer extends ExceptionBeta {
		/**
		 * Constructs ExceptionGammer with the specified error message.
		 * @param message the error message for ExceptionGammer.
		 */
		public ExceptionGammer(String message) {
			super(message);
		}
	}
}
