package javaWeek3;

public class Car extends Vehicle {

	private int numOfDoors;

	public Car(String make, String model, String colour, int year, int numDoors) {
		super(make, model, colour, year);
		this.numOfDoors = numDoors;
		// TODO Auto-generated constructor stub
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

}
