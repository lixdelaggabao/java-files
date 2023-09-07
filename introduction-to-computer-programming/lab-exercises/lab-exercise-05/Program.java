/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: April 9, 2023
 * Modified: April 7, 2023
 * Description: Lab Exercise 05
 */

/*
 * This class uses the User class to allow the user to select menu
 * options to be used on the DiceChecker class to help visualize the
 * fairness of a dice based on data obtained using a golf-ball test.
 */
public class Program {

	/*
	 * Entry point for the program.
	 * The main method uses a loop to ask the user for inputs based on the provided
	 * menu options and uses a switch statement and a DiceChecker object to handle the
	 * user's selected option. The menu options allow the user to enter dice roll values,
	 * display a report of the number of occurrences of each face value, reset the data,
	 * and quit the program.
	 */
		public static void main(String[] args) {
			final char ENTER_VALUES = 'E';
			final char DISPLAY_REPORT = 'D';
			final char RESET_VALUES = 'R';
			final char QUIT_PROGRAM = 'Q';
			char option = 'Q';
			DiceChecker diceChecker = new DiceChecker(); 
			
			do {
				System.out.println("   (E)nter Dice Roll Values");
				System.out.println("   (D)isplay Report");
				System.out.println("   (R)eset Dice Roll Data");
				System.out.println("   (Q)uit Program");
				System.out.println();
				option = Character.toUpperCase(User.inputCharacter("Select option: "));
				
				switch(option) {
					case ENTER_VALUES:
						diceChecker.enterData();
						break;
					case DISPLAY_REPORT:
						diceChecker.printReport();
						break;
					case RESET_VALUES:
						diceChecker.resetData();
						break;
					case QUIT_PROGRAM:
						break;
					default:
						System.out.println("Invalid menu option");
				}
				
			} while(option != 'Q');
	
			System.out.println("Program by Lixdel Louisse L. Aggabao");
			System.out.println("Thank you for using my Dice Checker software");
	}

}
