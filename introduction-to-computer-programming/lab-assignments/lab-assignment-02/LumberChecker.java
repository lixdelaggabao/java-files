/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: April 4, 2023
 * Modified: March 24, 2023
 * Modified By: Lixdel Louisse L. Aggabao
 * Description: Lab Assignment 02
 */

/*
 * This class represents a checker for the dimensions of a lumber. This also contains a method that validates the dimensions
 * of a lumber.
 */
public class LumberChecker {
	public static final double EPSILONLA = 0.03125; // Tolerance (unit of measurement is inches)
	
	/*
	 * This method validates the dimensions of a lumber using the expected value and epsilon.
	 * Then, a message is returned about whether or not the dimensions are within
	 * tolerance standards. Additionally, an error message is returned if any dimension is negative.
	 */
	public String validate(DimensionalLumber lumber) {
		boolean isThicknessValidLa = Math.abs(lumber.getThickness() - DimensionalLumber.EXPECTED_THICKNESS) <= EPSILONLA;
		boolean isWidthValidLa = Math.abs(lumber.getWidth() - DimensionalLumber.EXPECTED_WIDTH) <= EPSILONLA;
		boolean isLengthValidLa = Math.abs(lumber.getLength() - DimensionalLumber.EXPECTED_LENGTH) <= EPSILONLA;
		
		// Check for negative values
		if(lumber.getThickness() < 0 || lumber.getWidth() < 0 || lumber.getLength() < 0) {
			return "Negative dimension entered, lumber cannot be verified.";
		}
		// If all dimensions are within the tolerance standards
		else if(isThicknessValidLa && isWidthValidLa && isLengthValidLa) {
			return String.format("Lumber dimensions meet tolerance standards of %.5f inches", EPSILONLA);
		}
		// If all dimensions are not within the tolerance standards
		else if (!isThicknessValidLa && !isWidthValidLa && !isLengthValidLa) {
			return "All lumber dimensions are not within tolerance.";
		}
		// If some of the dimensions are not within the tolerance standards
		else {
			String messageLa = "Lumber dimensions are not within tolerance. ";
						
			if(!isThicknessValidLa) {
				messageLa += String.format("Thickness exceeds tolerance of %.5f inches. ", EPSILONLA);
			}
			
			if(!isWidthValidLa) {
				messageLa += String.format("Width exceeds tolerance of %.5f inches. ", EPSILONLA);
			}
						
			if(!isLengthValidLa) {
				messageLa += String.format("Length exceeds tolerance of %.5f inches.", EPSILONLA);
			}
						
			return messageLa;
		}
	}
}
