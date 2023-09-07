/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: February 17, 2023
 * Modified: February 14, 2023
 * Description: Lab Exercise 03 Task 2
 */
/* This class tests the class HardBread constructors and worker methods. */
public class TestHardBread {

	/*Entry point for the program*/
	public static void main(String[] args) {
		HardBread hardBread1La = new HardBread();
		HardBread hardBread2La = new HardBread(6.4, 18.7, 4.7, true);
		String reportLa;
		double totalSurfaceAreaLa;
		
		totalSurfaceAreaLa = hardBread1La.calculateTotalSurfaceArea();
		reportLa = hardBread1La.toString();
		System.out.println("hardBread 1:");
		System.out.printf("TotalSurfaceArea: %.4f %n", totalSurfaceAreaLa);
		System.out.println(reportLa);
		
		totalSurfaceAreaLa = hardBread2La.calculateTotalSurfaceArea();
		reportLa = hardBread2La.toString();
		System.out.println("hardBread 2:");
		System.out.printf("TotalSurfaceArea: %.3f %n", totalSurfaceAreaLa);
		System.out.println(reportLa);
		
		System.out.println("Program by Lixdel Louisse L. Aggabao");
	}

}
