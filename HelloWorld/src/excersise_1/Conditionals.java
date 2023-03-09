package excersise_1;

import java.util.Scanner;

public class Conditionals {

	static int n1, n2;
	static boolean bool;
	static int result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		n1 = input.nextInt();
		System.out.println("Enter another integer: ");
		n2 = input.nextInt();
		System.out.println("Enter either true or false: ");
		bool = input.nextBoolean();

		getConditionals(n1, n2, bool);
	}

	public static void getConditionals(int n1, int n2, boolean bool) {

		if (bool == true) {
//			result = n1 + n2;
//			System.out.println("You entered " + bool + ", so your result is: " + result);

			if (n1 % 2 == 0 || n2 % 2 == 0) {
				result = 0;
				System.out.println("You entered " + bool + ", so your result is: " + result);
			} else {
				result = n1 + n2;
				System.out.println("You entered " + bool + ", so your result is: " + result);
			}
		} else {
			result = n1 * n2;
			System.out.println("You entered " + bool + ", so your result is: " + result);
		}

	}
}
