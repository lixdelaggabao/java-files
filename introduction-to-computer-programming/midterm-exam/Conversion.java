/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: February 13, 2023
 * Modified: February 13, 2023
 * Description: Midterm Lab Exam
 */
/*
 * This class models a Conversion, with attributes of canadianMoneyLa and americanMoneyLa.
 */
public class Conversion {
	private double canadianMoneyLa; // dollars ($)
	private double americanMoneyLa; // dollars ($)
	
	/* Accessor for canadianMoneyLa */
	public double getCanadianMoney() {
		return canadianMoneyLa;
	}
	
	/* Mutator for canadianMoneyLa */
	public void setCanadianMoney(double canadianMoneyLa) {
		this.canadianMoneyLa = canadianMoneyLa;
		return;
	}
	
	/* Accessor for americanMoneyLa */
	public double getAmericanMoney() {
		return americanMoneyLa;
	}
	
	/* Mutator for americanMoneyLa */
	public void setAmericanMoney(double americanMoneyLa) {
		this.americanMoneyLa = americanMoneyLa;
		return;
	}
	
	/*
	 * This method returns a double to represent the American money ($) converted from the Canadian money ($).
	 */
	public double calculateAmericanMoney() {
		return canadianMoneyLa * 0.75;
	}
}
