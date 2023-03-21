package com.qa.garage.vehicle;

public class Boat extends Vehicle {

	public Boat(int id, int numWheels, String colour) {
		super(id, numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 15;
	}

	@Override
	public String toString() {
		return "Boat [id= " + this.getId() + ", numWheels=" + this.getNumWheels() + ", colour=" + this.getColour()
				+ "]";
	}
}
