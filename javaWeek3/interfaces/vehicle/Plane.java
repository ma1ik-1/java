package javaWeek3.vehicle;

public class Plane extends Vehicle {

	public Plane(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public double calcBill() {
		return 23;
	}

	@Override
	public String toString() {
		return "Plane [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
	}
}