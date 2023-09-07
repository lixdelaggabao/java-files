/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: April 9, 2023
 * Modified: April 7, 2023
 * Description: Lab Exercise 05
 */

/*
 * This class models a DiceChecker with dice size and the number of occurrences
 * of each face number. This also contains its constructors and worker methods.
 */
public class DiceChecker {
	private final int DICE_SIZE; // Initialization deferred to constructor
	private int[] values = null;
	
	/*
	 * No-argument constructor, sets the size of the dice to 8-sides
	 * as a default value.
	 */
	public DiceChecker() {
		this(8); // default to 8 sided dice
	}
	
	/*
	 * Overloaded constructor accepts the dice face count to make
	 * the program more flexible for dice with different number of sides.
	 * e.g. 4-sided, 6-sided and so on. If the dice size is less than 4
	 * then it will be set to 4 by default.
	 */
	public DiceChecker(int faceCount) {
		if(faceCount < 4) {
			faceCount = 4;
		}
		// (non-static constant can have initialization
		// deferred to a constructor).
		DICE_SIZE = faceCount;
		values = new int[DICE_SIZE];
	}
	
	/*
	 * This method prompts the user to enter integer values between 1, i.e. min,
	 * to the max value which is based on the DICE_SIZE constant value. After each 
	 * value the user is asked if they would like to enter more values (y/n).
	 * Each value is used as an index, offset by -1, in the array and for
	 * each entry the count stored in the associated element is increased by 1.
	 */
	public void enterData() {
		int input = 0;
		int min = 1;
		int max = DICE_SIZE;
		String continueDataEntry = null;
		do {
			input = User.inputInteger("Enter dice value: ", min, max);
			// numbers will be from 1 to DICE_SIZE, so offset by -1 as index
			// and add 1 to the value in the indexed element.
			// i.e. face value 1 is stored at index 0 and so on.
			values[input - 1]++;
			continueDataEntry = User.inputString("Enter another? (y/n): ");
		}while(continueDataEntry.equalsIgnoreCase("y") );
	}
	
	/*
	 * This method iterates over the values array and prints the number of occurrences
	 * of each face number by using "+" for each occurrence.
	 */
	public void printReport() {
		for(int faceNumberLa = 0; faceNumberLa < values.length; faceNumberLa++) {
			System.out.printf("%3d ", (faceNumberLa + 1));
			
			for(int countLa = 1; countLa <= values[faceNumberLa]; countLa++) {
				System.out.print("+");
			}
			
			System.out.println();
		}
	}
	
	/*
	 * This method iterates over the values array and
	 * places zero into each element.
	 */
	public void resetData() {
		for(int index = 0; index < values.length; index++) {
			values[index] = 0; // zero out each element
		}
	}
}
