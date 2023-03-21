package com.qa.garage.vehicle;

public class Bike extends Vehicle {

	public Bike(int id, int numWheels, String colour) {
		super(id, numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 31;
	}

	@Override
	public String toString() {
		return "Bike [id= " + this.getId() + ", numWheels=" + this.getNumWheels() + ", colour=" + this.getColour()
				+ "]";
	}

}