package generics;

import java.util.ArrayList;
import java.util.List;

public class VehicleContainer<T extends Vehicle> {
	private List<T> vehicles;

	public VehicleContainer() {
		this.vehicles = new ArrayList<T>();
	}

	public List<T> getVehicles() {
		return vehicles;
	}

	public void addVehicle(T vehicle) {
		this.vehicles.add(vehicle);
	}

	public void removeVehicles(T vehicle) {
		this.vehicles.remove(vehicle);
	}

	public int getNumVehicles() {
//		System.out.println(this.vehicles.size());
		return this.vehicles.size();
	}

	public T getVehicle(int i) {
		return this.vehicles.get(i);
	}

	public boolean containsVehcile(T vehicle) {
		return this.vehicles.contains(vehicle);
	}

}
