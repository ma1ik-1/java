package com.qa.garage.vehicle;

public class Plane extends Vehicle {

	public Plane(int id, int numWheels, String colour) {
		super(id, numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 23;
	}

	@Override
	public String toString() {
		return "Plane [id= " + this.getId() + ", numWheels=" + this.getNumWheels() + ", colour=" + this.getColour()
				+ "]";
	}
}
