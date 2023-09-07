/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: April 4, 2023
 * Modified: March 24, 2023
 * Description: Lab Assignment 02
 */

/*
 * This class uses LumberChecker and DimensionalLumber classes to validate whether or not
 * the dimensions of a lumber are within tolerance standards.
 */
public class Assignment02 {

	/*
	 * Entry point for the program.
	 * The main method uses a loop and an instance of User class to ask the user for inputs for the thickness, width, and length of a lumber.
	 * Then, it uses instances of LumberChecker and DimensionalLumber classes to output a message indicating
	 * whether or not the dimensions are within tolerance standards. It may also output an error message about the
	 * dimensions or invalid input from the user.
	 */
	public static void main(String[] args) {
		LumberChecker lumberChecker = new LumberChecker();
		User user = new User();
		double thicknessLa;
		double widthLa;
		double lengthLa;
		String inputLa;
		
		// Loop that only ends if the user inputs no when asked to continue the program
		do {
			System.out.println("Enter dimensions for lumber");
			System.out.printf("Expected values for dimensions are %.2f for thickness, %.2f for width, %.2f for length %n", DimensionalLumber.EXPECTED_THICKNESS, DimensionalLumber.EXPECTED_WIDTH, DimensionalLumber.EXPECTED_LENGTH);
			thicknessLa = user.inputDouble("Enter measured thickness (inches): ");
			widthLa = user.inputDouble("Enter measured width (inches): ");
			lengthLa = user.inputDouble("Enter measured length (inches): ");
			
			DimensionalLumber dimensionalLumberLa = new DimensionalLumber(thicknessLa, widthLa, lengthLa);
			System.out.println(dimensionalLumberLa.toString());
			System.out.println(lumberChecker.validate(dimensionalLumberLa));
			
			System.out.println("Program by Lixdel Louisse L. Aggabao");
			
			// Loop that only ends if the user inputs a valid response (yes or no)
			do {
				inputLa = user.inputString("Continue Program? (yes / no) ");
				
				if(!inputLa.equalsIgnoreCase("yes") && !inputLa.equalsIgnoreCase("no")) {
					System.out.println("Invalid input.");
				}
			} while(!inputLa.equalsIgnoreCase("yes") && !inputLa.equalsIgnoreCase("no"));
		} while(inputLa.equalsIgnoreCase("yes"));
		
		System.out.println("Program will now shut down.");
	}
}