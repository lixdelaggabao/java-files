/*
 * File name: DogHandler.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Assignment: 3
 * Date: August 1, 2023
 * Due Date: August 6, 2023
 * Professor: Daniel Cormier
 * Purpose: This class demonstrates catching different types of subclasses using the superclass
 * Exception.
 */

package assignment3;

import java.io.IOException;

/**
 * This class demonstrates catching different types of subclasses using the superclass
 * Exception.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see CatHandler
 * @see FishHandler
 * @see OrderHandler
 * @since 11
 */
public class DogHandler {
	/**
	 * This is the entry point for the program. It throws an ExceptionDog, ExceptionPuppy,
	 * NullPointerException, and IOException exception then catches them with Exception.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		handleExceptionDog();
		handleExceptionPuppy();
		handleNullPointerException();
		handleIOException();
	}
	
	/**
	 * This is a custom exception class representing ExceptionDog and extends from Exception.
	 */
	public static class ExceptionDog extends Exception {
		/**
		 * Constructs ExceptionDog with the specified error message.
		 * @param message the error message for ExceptionDog.
		 */
		public ExceptionDog(String message) {
			super(message);
		}
	}
	
	/**
	 * This is a custom exception class representing ExceptionPuppy and extends from ExceptionDog.
	 */
	public static class ExceptionPuppy extends ExceptionDog {
		/**
		 * Constructs ExceptionPuppy with the specified error message.
		 * @param message the error message for ExceptionPuppy.
		 */
		public ExceptionPuppy(String message) {
			super(message);
		}
	}
	
	/**
	 * This method throws an ExceptionDog exception and catches it with Exception.
	 */
	public static void handleExceptionDog() {
		try {
			throw new ExceptionDog("Exception Dog");
		} catch (Exception exception) {
			System.err.println("Caught exception: " + exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	/**
	 * This method throws an ExceptionPuppy exception and catches it with Exception.
	 */
	public static void handleExceptionPuppy() {
		try {
			throw new ExceptionPuppy("Exception Puppy");
		} catch (Exception exception) {
			System.err.println("Caught exception: " + exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	/**
	 * This method throws a NullPointerException exception and catches it with Exception.
	 */
	public static void handleNullPointerException() {
		try {
			throw new NullPointerException("Null Pointer Exception");
		} catch (Exception exception) {
			System.err.println("Caught exception: " + exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	/**
	 * This method throws an IOException exception and catches it with Exception.
	 */
	public static void handleIOException() {
		try {
			throw new IOException("IO Exception");
		} catch (Exception exception) {
			System.err.println("Caught exception: " + exception.getMessage());
			exception.printStackTrace();
		}
	}
}
