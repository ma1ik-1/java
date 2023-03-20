package javaWeek3.vehicle;

public class Bike extends Vehicle {

	public Bike(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public double calcBill() {
		return 31;
	}

	@Override
	public String toString() {
		return "Bike [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
	}

}