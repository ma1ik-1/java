package javaWeek3;

import java.util.List;

public class Vehicle {

	private String make, model, colour;
	private int year;

	public Vehicle(String make, String model, String colour, int year) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		Garage garage = new Garage();

		Car car1 = new Car("Honda", "Civic", "White", 2005, 4);
		garage.addVehicles(car1);

		Car car2 = new Car("Toyota", "Yaris", "Black", 2007, 4);
		garage.addVehicles(car2);

		Motorbike mb1 = new Motorbike("Ducatti", "Panigale", "Red", 2020, true);
		garage.addVehicles(mb1);

		Van van1 = new Van("Mercedes", "Sprinter", "Grey", 2022, true);
		garage.addVehicles(van1);

		List<Vehicle> vehicles = garage.getVehicles();
		for (Vehicle v : vehicles) {
			System.out.println(v.getMake() + " " + v.getModel() + " " + v.getColour() + " " + v.getColour());

			if (v instanceof Car) {
				Car car = (Car) v;
				System.out.println("No. of doors: " + car.getNumOfDoors());
			} else if (v instanceof Motorbike) {
				Motorbike mb = (Motorbike) v;
				System.out.println("Can it wheelie: " + mb.isCanWheelie());
			} else if (v instanceof Van) {
				Van van = (Van) v;
				System.out.println("Is it carrying a load: " + van.isCarryingLoad());
			}
		}
	}

}
