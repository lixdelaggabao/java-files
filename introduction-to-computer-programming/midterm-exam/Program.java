/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: February 13, 2023
 * Modified: February 13, 2023
 * Description: Midterm Lab Exam
 */
import java.util.Scanner;

/* 
 * This class asks for Canadian money input from the user then converts it to
 * American money then outputs both Canadian and American money with two decimal positions.
 */
public class Program {

	/* Entry point for the program */
	public static void main(String[] args) {
		double canadianMoneyLa;
		double americanMoneyLa;
		Scanner scannerLa = new Scanner(System.in);
		Conversion conversionLa = new Conversion();
		
		System.out.print("Please enter Canadian money ($): ");
		canadianMoneyLa = scannerLa.nextDouble();
		scannerLa.close();
		
		conversionLa.setCanadianMoney(canadianMoneyLa);
		americanMoneyLa = conversionLa.calculateAmericanMoney();
		conversionLa.setAmericanMoney(americanMoneyLa);
		
		System.out.printf("Canadian Funds  $ %.2f %n", conversionLa.getCanadianMoney());
		System.out.printf("American Funds  $ %.2f %n", conversionLa.getAmericanMoney());
		System.out.println("Program by Lixdel Louisse L. Aggabao");
	}

}