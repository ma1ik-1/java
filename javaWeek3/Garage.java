package javaWeek3;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles;

	public Garage() {
		vehicles = new ArrayList<Vehicle>();
	}

	public void addVehicles(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

}
