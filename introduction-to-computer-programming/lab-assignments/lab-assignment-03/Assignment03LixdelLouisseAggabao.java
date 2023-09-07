/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: April 14, 2023
 * Modified: April 10, 2023
 * Description: Lab Assignment 03
 */

/*
 * This class rolls a 10-sided dice 1000 times and records the number of occurrences of each result.
 */
public class Assignment03LixdelLouisseAggabao {

	/*
	 * Entry point for the program.
	 * The main method uses a combination of arrays, loops, and Math.random() to simulate rolling a dice.
	 */
	public static void main(String[] args) {
		int roll = 0;
		int[] diceRolls = new int[10];
		int totalRolls = 0;

		// sample the rolls
		for(int count = 0; count < 1000; count++) {
			roll = (int)(Math.random() * 10) + 1;
			diceRolls[roll - 1] = diceRolls[roll - 1] + 1;
		}
		// run a report
		for(int index = 0; index < diceRolls.length; index++) {
			System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
			totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Lixdel Louisse Aggabao");
	}


}
