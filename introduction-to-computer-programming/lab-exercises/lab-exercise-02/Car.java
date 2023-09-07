/*
 * Student Name: Lixdel Louisse L. Aggabao
 * Lab Professor: Mel Sanschagrin
 * Due Date: February 3, 2023
 * Modified: February 2, 2023
 * Description: Lab Exercise 02 Task 5
 */
public class Car {
	private String vehicleIdentificationNumberLa;
	private double mileageLa;
	private String vehicleYearLa;
	private double invoicePriceLa;
	
	public Car() {
		this("", 0, "", 0);
	}
	
	public Car(String vehicleIdentificationNumberLa, double mileageLa, String vehicleYearLa, double invoicePriceLa) {
		this.vehicleIdentificationNumberLa = vehicleIdentificationNumberLa;
		this.mileageLa = mileageLa;
		this.vehicleYearLa = vehicleYearLa;
		this.invoicePriceLa = invoicePriceLa;
	}
	
	public String getVehicleIdentificationNumber() {
		return vehicleIdentificationNumberLa;
	}
	
	public void setVehicleIdentificationNumber(String vehicleIdentificationNumberLa) {
		this.vehicleIdentificationNumberLa = vehicleIdentificationNumberLa;
		return;
	}
	
	public double getMileage() {
		return mileageLa;
	}
	
	public void setMileage(double mileageLa) {
		this.mileageLa = mileageLa;
		return;
	}
	
	public String getVehicleYear() {
		return vehicleYearLa;
	}
	
	public void setVehicleYear(String vehicleYearLa) {
		this.vehicleYearLa = vehicleYearLa;
		return;
	}
	
	public double getInvoicePrice() {
		return invoicePriceLa;
	}
	
	public void setInvoicePrice(double invoicePriceLa) {
		this.invoicePriceLa = invoicePriceLa;
		return;
	}
	
	public String toString() {
		return String.format("%s, %.1f (km), %s, $%.2f %n", this.vehicleIdentificationNumberLa, this.mileageLa, this.vehicleYearLa, this.invoicePriceLa);
	}
}
