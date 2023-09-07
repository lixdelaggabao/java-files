/*
 * File name: Invoice.java
 * Author: Lixdel Louisse L. Aggabao, 041081985
 * Course: CST8284 - OOP
 * Lab: 6
 * Date: July 26, 2023
 * Due Date: July 29, 2023
 * Professor: Daniel Cormier
 * Purpose: This class represents an Invoice for a part with part number, part description, quantity, and price per item.
 */

/**
 * This class represents an Invoice for a part with part number, part description, quantity, and price per item.
 * @author Lixdel Louisse L. Aggabao
 * @version 1.0
 * @see Programmer
 * @see HourlyProgrammer
 * @see SalariedProgrammer
 * @see CommissionProgrammer
 * @see BasePlusCommissionProgrammer
 * @see Payme
 * @see PaymeInterfaceTest
 * @since 11
 */
public class Invoice implements Payme {
	/**
	 * The part number associated with the Invoice.
	 */
	private String partNumber;
	
	/**
	 * The description of the part associated with the Invoice.
	 */
	private String partDescription;
	
	/**
	 * The quantity of the part associated with the Invoice.
	 */
	private int quantity;
	
	/**
	 * The price per item of the part associated with the Invoice.
	 */
	private double pricePerItem;
	
	/**
	 * This constructor initializes the Invoice with the specified part number, part description, quantity, and price per item.
	 * @param part the part number associated with the Invoice.
	 * @param description the description of the part associated with the Invoice.
	 * @param count the quantity of the part associated with the Invoice.
	 * @param price the price per item of the part associated with the Invoice.
	 */
	public Invoice(String part, String description, int count, double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count); // validate and store quantity
		setPricePerItem(price); // validate and store price per item
	}
	
	/**
	 * Sets the part number associated with the Invoice.
	 * @param part the part number to set for the Invoice.
	 */
	public void setPartNumber(String part) {
		partNumber = part; 
	}
	
	/**
	 * Returns the part number associated with the Invoice.
	 * @return the part number associated with the Invoice.
	 */
	public String getPartNumber() {
		return partNumber;
	}
	
	/**
	 * Sets the description of the part associated with the Invoice.
	 * @param description the description to set for the part associated with the Invoice.
	 */
	public void setPartDescription(String description) {
		partDescription = description; 
	}
	
	/**
	 * Returns the description of the part associated with the Invoice.
	 * @return the description of the part associated with the Invoice.
	 */
	public String getPartDescription() {
		return partDescription;
	}
	
	/**
	 * Sets the quantity of the part associated with the Invoice.
	 * @param count the quantity to set for the part associated with the Invoice.
	 */
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}
	
	/**
	 * Returns the quantity of the part associated with the Invoice.
	 * @return the quantity of the part associated with the Invoice.
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * Sets the price per item of the part associated with the Invoice.
	 * @param price the price per item to set for the part associated with the Invoice.
	 */
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}
	
	/**
	 * Returns the price per item of the part associated with the Invoice.
	 * @return the price per item of the part associated with the Invoice.
	 */
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	/**
	 * Returns the String representation of the Invoice object.
	 * @return the String representation of the Invoice object.
	 */
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(), 
				"quantity", getQuantity(), "price per item", getPricePerItem());
	} 
	
	/**
	 * Returns the payment amount for the Invoice.
	 * @return the payment amount for the Invoice.
	 */
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}


