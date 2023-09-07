/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: February 10, 2023
 * Modified: February 7, 2023
 * Description: Lab Assignment 01 Task 4
 */
import java.util.Scanner;

/*This class asks for user inputs for height and radius of a cone then outputs its volume*/
public class Program {

	/*Entry point for the program*/
	public static void main(String[] args) {
		double heightLa;
		double radiusLa;
		double volumeLa;
		Scanner scannerLa = new Scanner(System.in);
		
		System.out.print("Enter height: ");
		heightLa = scannerLa.nextDouble();
		
		System.out.print("Enter radius: ");
		radiusLa = scannerLa.nextDouble();
		
		scannerLa.close();
		
		Cone coneLa = new Cone(heightLa, radiusLa);
		volumeLa = coneLa.calculateVolume();
		System.out.printf("Volume is: %.2f %n", volumeLa);
		
		System.out.println("Program by Lixdel Louisse L. Aggabao");
	}

}
