package javaWeek3;

import java.util.ArrayList;
import java.util.List;

import javaWeek3.vehicle.Bike;
import javaWeek3.vehicle.Boat;
import javaWeek3.vehicle.Car;
import javaWeek3.vehicle.Vehicle;

public class Runner {

	public static void main(String[] args) {
		List<Billable> billables = new ArrayList<>();

		Employee employee1 = new Employee("John", 24, "Software Eng");
		Employee employee2 = new Employee("Jack", 26, "Software Eng");

		Garage g = new Garage();

		g.addVehicle(new Car(4, "Black"));
		g.addVehicle(new Boat(0, "Blue"));
		g.addVehicle(new Bike(2, "Red"));
		g.addVehicle(new Car(3, "red"));

		billables.add(employee1);
		billables.add(employee2);
		billables.add(new Car(4, "Black"));
		billables.add(new Boat(0, "Blue"));
		billables.add(new Bike(2, "Red"));
		billables.add(new Car(3, "red"));

		double totalBill = 0.0;
		for (Billable billable : billables) {
			double bill = billable.calcBill();
			totalBill += bill;

			if (billable instanceof Vehicle) {
				Vehicle v = (Vehicle) billable;
				System.out.println("Vehicle " + v.getId() + " bill: " + bill);
			} else if (billable instanceof Employee) {
				Employee e = (Employee) billable;
				System.out.println("Employee: " + e.getName() + " bill: " + bill);
			}
		}

		System.out.println("Total bill: " + totalBill);
		System.out.println(g);

//		g.removeByType("car");
		g.remove(Car.class);
		System.out.println(g);
	}

}