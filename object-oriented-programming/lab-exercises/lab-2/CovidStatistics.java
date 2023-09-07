/*
 * File name: CovidStatistics.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 2
 * Date: May 23, 2023
 * Due Date: June 3, 2023
 * Professor: Daniel Cormier
 * Purpose: This class is used to output Covid statistics for 7 Canadian provinces over the periods of February to September 2020.
 */

/**
* This class is used to output Covid statistics for 7 Canadian provinces over the periods of February to September 2020.
* @author Lixdel Louisse L. Aggabao
* @version 1.0
* @since 11
*/
public class CovidStatistics
{
	
	/**
	 * This main method is the entry point for the program to output the Covid statistics.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args)
	 {
	   final int ROWS = 7;
	   final int COLUMNS = 8;
	
	   int[][] patients = 
	      { 
	         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
	         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
	         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
	         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
	         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
	         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
	         {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 } 
	      };
	
	   String[] provinces = 
	      { 
	         "Ontario", 
	         "Quebec", 
	         "Nova Scotia",
	         "New Brunswick", 
	         "Manitoba", 
	         "British Columbia",
		     "Prince Edward Island"         
	      };
	   
	   String[] months = 
		  { 
		     "Feb", 
		     "March", 
		     "April",
		     "May", 
		     "June", 
		     "July",
			 "Aug",
			 "Sept"
		  };
	   
	   System.out.println("              Month      Feb     March   April   May     June    July    Aug     Sept    Least");
	   System.out.println();
	   
	   /*
	    * Outputs the number of patients for each month per province. This also outputs the months with the least patients.
	    */
	   for (int provincesIndex = 0; provincesIndex < ROWS; provincesIndex++) {
		   int leastNumber = patients[provincesIndex][0];
		   int leastIndex = 0;
		   
		   System.out.printf("%21s", provinces[provincesIndex]);
		   
		   for (int patientsIndex = 0; patientsIndex < COLUMNS; patientsIndex++) {
			   System.out.printf("%8d", patients[provincesIndex][patientsIndex]);
			   
			   if (patients[provincesIndex][patientsIndex] < leastNumber) {
				   leastNumber = patients[provincesIndex][patientsIndex];
				   leastIndex = patientsIndex;
			   }
		   }
		  
		   System.out.printf("%9s", months[leastIndex]);
		   System.out.println();
	   }
	   
	   System.out.println();
	   System.out.print("    Recovered Patients");
	   
	   /*
	    * Calculates and outputs the number of recovered patients per month.
	    */
	   for (int columnIndex = 0; columnIndex < COLUMNS; columnIndex++) {
		   int sum = 0;
		   
		   for (int rowIndex = 0; rowIndex < ROWS; rowIndex++) {
			   sum += patients[rowIndex][columnIndex];
		   }
		   
		   System.out.printf("%8d", sum);
	   }
	   
	   System.out.println();
	   System.out.println();
	   System.out.println();
	   System.out.println("                Vaccinate and maintain good health practices!" );
	}
}




   
   
   
   
   





