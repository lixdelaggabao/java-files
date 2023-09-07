/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: February 10, 2023
 * Modified: February 7, 2023
 * Description: Lab Assignment 01 Task 4
 */
/*This class contains the variables, constructors, and methods for Cone*/
public class Cone {
	private double heightLa;
	private double radiusLa;
	
	/*Constructor with no parameters used for initializing objects using default values*/
	public Cone() {
		this(0, 0);
	}
	
	/*Constructor with height and radius parameters used for initializing objects with specific values*/
	public Cone(double heightLa, double radiusLa) {
		this.heightLa = heightLa;
		this.radiusLa = radiusLa;
	}
	
	/*This method is used to access the height of the cone*/
	public double getHeight() {
		return heightLa;
	}
	
	/*This method is used to modify the height of the cone*/
	public void setHeight(double heightLa) {
		this.heightLa = heightLa;
		return;
	}
	
	/*This method is used to access the radius of the cone*/
	public double getRadius() {
		return radiusLa;
	}
	
	/*This method is used to modify the radius of the cone*/
	public void setRadius(double radiusLa) {
		this.radiusLa = radiusLa;
		return;
	}
	
	/*
	 * Calculates the volume of the cone [1] using the radius and height inputs from the user.
	 * Formula used is taken from a website.
	 * Reference:
	 * [1] Cone - Definition, Formula, Properties, Examples. byjus.com. https://byjus.com/maths/cone/ (accessed Feb. 6, 2023).
	 */
	public double calculateVolume() {
		return (1.0/3.0) * Math.PI * Math.pow(radiusLa, 2) * heightLa;
	}
}
