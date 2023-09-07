/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: April 3, 2023
 * Modified: April 3, 2023
 * Description: Final Lab Exam
 */

/*
 * This class uses the Temperatures class to generate reports about the temperatures.
 */
public class Program {

	/*
	 * Entry point for the program.
	 * The main method uses an instance of the Temperatures class. Then, it uses
	 * the inputTemperatureValues method to ask the user for inputs for the temperature
	 * value of each day. Then, it outputs both the daily and average temperature report about
	 * the inputted temperature values.
	 */
	public static void main(String[] args) {
		Temperatures temperaturesLa = new Temperatures();
		temperaturesLa.inputTemperatureValues();
		
		System.out.println(temperaturesLa.generateReports()[0]); // Daily temperature report
		System.out.println(temperaturesLa.generateReports()[1]); // Average temperature report
		System.out.println("Program by Lixdel Louisse L. Aggabao (Student Number: 041081985)");
	}

}
