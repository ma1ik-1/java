package excersise_1;

import java.util.Scanner;

public class Results {
	static int physics, chemistry, biology, total;
	static double percentage;
	static int max = 150;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

//		System.out.println("Enter your physics result: ");
//		physics = input.nextInt();
//
//		if (physics > 150) {
//			System.out.println("Enter a valid result.");
//		}

		do {
			System.out.println("Enter your physics result: ");
			physics = input.nextInt();

			if (physics > max) {
				System.out.println("Result over 150");
			}
		} while (physics > max);

		do {
			System.out.println("Enter your chemistry result: ");
			chemistry = input.nextInt();

			if (chemistry > max) {
				System.out.println("Result over 150");
			}
		} while (chemistry > max);

		do {
			System.out.println("Enter your biology result: ");
			biology = input.nextInt();

			if (biology > max) {
				System.out.println("Result over 150");
			}
		} while (biology > max);

		setPhysics(physics);
		setChemistry(chemistry);
		setBiology(biology);

		displayResults();
		displayPercentage();
	}

	public static int getPhysics() {
		return physics;
	}

	public static void setPhysics(int physics) {
		Results.physics = physics;
	}

	public static int getChemistry() {
		return chemistry;
	}

	public static void setChemistry(int chemistry) {
		Results.chemistry = chemistry;
	}

	public static int getBiology() {
		return biology;
	}

	public static void setBiology(int biology) {
		Results.biology = biology;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Results.total = total;
	}

	public static double getPercentage() {
		return percentage;
	}

	public static void setPercentage(double percentage) {
		Results.percentage = percentage;
	}

	public static void displayResults() {
		int p = getPhysics();
		int c = getChemistry();
		int b = getBiology();

		System.out.println("Your physics result is: " + p);
		System.out.println("Your chemistry result is: " + c);
		System.out.println("Your biology result is: " + b);

		total = p + b + c;

		System.out.println("Your total result is: " + total);
	}

	public static void displayPercentage() {
		percentage = (total * 100) / 450;
		System.out.println("and that as a percentage is: " + percentage);
	}

}
