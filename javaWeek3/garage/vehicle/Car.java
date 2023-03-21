package com.qa.garage.vehicle;

public class Car extends Vehicle {

	public Car(int id, int numWheels, String colour) {
		super(id, numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 10;
	}

	@Override
	public String toString() {
		return "Car [id= " + this.getId() + ", numWheels=" + this.getNumWheels() + ", colour=" + this.getColour() + "]";
	}
}
