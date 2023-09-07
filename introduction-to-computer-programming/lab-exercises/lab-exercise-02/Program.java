/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: February 3, 2023
 * Modified: February 2, 2023
 * Description: Lab Exercise 02 Task 5
 */
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String vehicleIdentificationNumberLa;
		double mileageLa;
		String vehicleYearLa;
		double invoicePriceLa;
		Car carLa = new Car();
		String reportLa;
		Scanner scannerLa = new Scanner(System.in);
		
		System.out.print("Please enter vehicle identification number: ");
		vehicleIdentificationNumberLa = scannerLa.nextLine();
		carLa.setVehicleIdentificationNumber(vehicleIdentificationNumberLa);
		
		System.out.print("Please enter mileage (km): ");
		mileageLa = scannerLa.nextDouble();
		scannerLa.nextLine();
		carLa.setMileage(mileageLa);	
		
		System.out.print("Please enter vehicle year: ");
		vehicleYearLa = scannerLa.nextLine();
		carLa.setVehicleYear(vehicleYearLa);
		
		System.out.print("Please enter invoice price: ");
		invoicePriceLa = scannerLa.nextDouble();
		scannerLa.nextLine();
		carLa.setInvoicePrice(invoicePriceLa);
		
		scannerLa.close();
		
		reportLa = carLa.toString();
		System.out.println(reportLa);	
		System.out.println("Program by Lixdel Louisse L. Aggabao");
	}

}
