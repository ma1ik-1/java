package javaWeek3.vehicle;

import javaWeek3.Billable;

public abstract class Vehicle implements Billable {

	private int numWheels;

	private String colour;

	private final int id;

	private static int count = 0;

	public Vehicle(int numWheels, String colour) {
		super();
		this.id = count;
		this.numWheels = numWheels;
		this.colour = colour;
		count++;
	}

	@Override
	public double calcBill() {
		return 0.0;
	}

	public int getId() {
		return this.id;
	}

	public int getNumWheels() {
		return this.numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [numWheels=" + this.numWheels + ", colour=" + this.colour + "]";
	}

}