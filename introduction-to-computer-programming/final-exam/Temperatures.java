/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: April 3, 2023
 * Modified: April 3, 2023
 * Description: Final Lab Exam
 */
import java.util.Scanner;

/*
 * This class models Temperatures with number of days and the value for each day.
 * This also contains its constructors, temperature values accessor and mutator, and
 * worker methods.
 */
public class Temperatures {
	private final int NUMBER_OF_DAYSLA = 7;
	private double[] temperatureValuesLa;
	
	/*
	 * Constructor with no parameter, sets all temperature values to 0 by default.
	 */
	public Temperatures() {
		temperatureValuesLa = new double[NUMBER_OF_DAYSLA];
	}
	
	/*
	 * Constructor with parameter, sets temperature values as specified.
	 */
	public Temperatures(double[] temperatureValuesLa) {
		this.temperatureValuesLa = temperatureValuesLa;
	}
	
	/*
	 * Accessor for temperature values
	 */
	public double[] getTemperatureValues() {
		return temperatureValuesLa;
	}
	
	/*
	 * Mutator for temperature values
	 */
	public void setTemperatureValues(double[] temperatureValuesLa) {
		this.temperatureValuesLa = temperatureValuesLa;
	}
	
	/*
	 * This method uses a loop to ask the user for an input for the
	 * temperature value for each day.
	 */
	public void inputTemperatureValues() {
		Scanner scannerLa = new Scanner(System.in);
		
		for (int indexLa = 0; indexLa < temperatureValuesLa.length; indexLa++) {
			System.out.printf("Enter temperature value for day %d: ", indexLa + 1);
			temperatureValuesLa[indexLa] = scannerLa.nextDouble();
		}
	}
	
	/*
	 * This method uses a loop to get the sum of all temperature values then
	 * uses it to calculate and return the average temperature.
	 */
	public double calculateAverageTemperature() {
		double sumLa = 0;
		
		for (int indexLa = 0; indexLa < temperatureValuesLa.length; indexLa++) {
			sumLa += temperatureValuesLa[indexLa];
		}
		
		return sumLa / temperatureValuesLa.length;
	}
	
	/*
	 * This method returns an array of Strings about the daily temperature report
	 * and average temperature. Additionally, it uses the calculateAverageTemperature
	 * method to create the average temperature report. The first element of the
	 * returned array contains the daily temperature report, and the second element
	 * of the returned array contains the average temperature report.
	 */
	public String[] generateReports() {
		final int REPORT_SIZELA = 2;
		String[] reportsLa = new String[REPORT_SIZELA];
		
		reportsLa[0] = "DAILY TEMP ";
		
		for (int indexLa = 0; indexLa < temperatureValuesLa.length; indexLa++) {
			reportsLa[0] += temperatureValuesLa[indexLa];
			
			if (indexLa < temperatureValuesLa.length - 1) {
				reportsLa[0] += ",";
			}
		}
		
		reportsLa[1] = String.format("AVERAGE %.2f", calculateAverageTemperature());
		
		return reportsLa;
	}
}
