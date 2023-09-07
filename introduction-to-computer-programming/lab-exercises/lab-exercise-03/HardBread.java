/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: February 17, 2023
 * Modified: February 14, 2023
 * Description: Lab Exercise 03 Task 2
 */
/* This class contains the constants, variables, constructors, and methods for HardBread. */
public class HardBread {
	public static final double MAX_HEIGHTLA = 5.5;
	public static final double MAX_LENGTHLA = 21.5;
	public static final double MAX_WIDTHLA = 5.3;
	private double heightLa;
	private double lengthLa;
	private double widthLa;
	private boolean isOliveBreadLa;
	
	/* No-argument constructor assigns values from the constants into the matching fields and sets isOliveBreadLa to true. */
	public HardBread() {
		this(MAX_HEIGHTLA, MAX_LENGTHLA, MAX_WIDTHLA, true);
	}
	
	/* Constructor with arguments and assigns each argument to their matching fields. */
	public HardBread(double heightLa, double lengthLa, double widthLa, boolean isOliveBreadLa) {
		this.heightLa = heightLa;
		this.lengthLa = lengthLa;
		this.widthLa = widthLa;
		this.isOliveBreadLa = isOliveBreadLa;
	}
	
	/* Accessor for heightLa */
	public double getHeight() {
		return heightLa;
	}
	
	/* Mutator for heightLa */
	public void setHeight(double heightLa) {
		this.heightLa = heightLa;
	}
	
	/* Accessor for lengthLa */
	public double getLength() {
		return lengthLa;
	}
	
	/* Mutator for lengthLa */
	public void setLength(double lengthLa) {
		this.lengthLa = lengthLa;
	}
	
	/* Accessor for widthLa */
	public double getWidth() {
		return widthLa;
	}
	
	/* Mutator for widthLa */
	public void setWidth(double widthLa) {
		this.widthLa = widthLa;
	}
	
	/* Accessor for isOliveBreadLa */
	public boolean isOliveBread() {
		return isOliveBreadLa;
	}
	
	/* Mutator for isOliveBreadLa */
	public void setOliveBread(boolean isOliveBreadLa) {
		this.isOliveBreadLa = isOliveBreadLa;
	}

	/* 
	 * This method returns the total surface area of a rectangular cube [1] with length, width, and height. 
	 * Formula is taken from a website.
	 * Reference:
	 * [1] Rectangular Prism. byjus.com. https://byjus.com/maths/rectangular-prism/ (accessed Feb. 17, 2023).
	 */
	public double calculateTotalSurfaceArea() {
		return 2 * ((lengthLa * heightLa) + (widthLa * heightLa) + (lengthLa * widthLa));
	}
	
	/* This method returns a string with height, length, and width formatted to 2 decimal places. */
	public String toString() {
		return String.format("Height %.2f, Length %.2f , Width %.2f", heightLa, lengthLa, widthLa);
	}
}
