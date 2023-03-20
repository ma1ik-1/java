package javaWeek3.vehicle;

public class Car extends Vehicle {

	public Car(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public double calcBill() {
		return 10;
	}

	@Override
	public String toString() {
		return "Car [numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
	}
}