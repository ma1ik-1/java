package com.qa.garage;

import java.util.Scanner;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.VehicleNotFoundException;

public class Runner {

	public static void main(String[] args) {
		Garage g = new Garage();

		g.addVehicle(new Car(1, 4, "Black"));
		g.addVehicle(new Boat(2, 0, "Blue"));
		g.addVehicle(new Bike(3, 2, "Red"));
		g.addVehicle(new Car(4, 3, "red"));

		System.out.println(g.toString());
		System.out.println();

//		g.removeByType("car");
//		g.remove(Car.class);
//		System.out.println(g);

		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the vehicle id: ");
//		int input = scanner.nextInt();

		while (true) {
//			System.out.println("Enter the vehicle id: ");
//			int input = scanner.nextInt();
			int input = 0;
			boolean validInput = false;

			while (!validInput) {
				System.out.println("Enter the vehicle id: ");

				if (scanner.hasNextInt()) {
					input = scanner.nextInt();
					validInput = true;
				} else {
					System.out.println("Enter an integer.");
					scanner.nextLine();
				}
			}

			try {
				g.findVehicleByID(input);
			} catch (VehicleNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Vehicle not found");
				break;
			}
		}

		scanner.close();
	}

}
