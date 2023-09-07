/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: February 17, 2023
 * Modified: February 14, 2023
 * Description: Lab Exercise 03 Task 1
 */
/* This class uses the wrapper classes of primitive data types to output their SIZE, BYTES, MIN_VALUE, and MAX_VALUE. */
public class PrimitiveDataTypesInformation {

	/* Entry point for the program */
	public static void main(String[] args) {
		System.out.println("Java Primitive Data Types Information:");
		System.out.printf("char, SIZE: %d, BYTES: %d, MIN_VALUE: %d, MAX_VALUE: %d %n", Character.SIZE, Character.BYTES, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		System.out.printf("double, SIZE: %d, BYTES: %d, MIN_VALUE: %e, MAX_VALUE: %e %n", Double.SIZE, Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
		System.out.printf("byte, SIZE: %d, BYTES: %d, MIN_VALUE: %d, MAX_VALUE: %d %n", Byte.SIZE, Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("short, SIZE: %d, BYTES: %d, MIN_VALUE: %d, MAX_VALUE: %d %n", Short.SIZE, Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("int, SIZE: %d, BYTES: %d, MIN_VALUE: %d, MAX_VALUE: %d %n", Integer.SIZE, Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("long, SIZE: %d, BYTES: %d, MIN_VALUE: %d, MAX_VALUE: %d %n", Long.SIZE, Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.printf("float, SIZE: %d, BYTES: %d, MIN_VALUE: %e, MAX_VALUE: %e %n", Float.SIZE, Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.println("Program by Lixdel Louisse L. Aggabao");
	}

}
