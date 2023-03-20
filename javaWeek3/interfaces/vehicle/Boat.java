package javaWeek3.vehicle;

public class Boat extends Vehicle {

	public Boat(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public double calcBill() {
		return 15;
	}

	@Override
	public String toString() {
		return "Boat [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
	}
}
