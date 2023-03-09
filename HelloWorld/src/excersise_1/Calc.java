package excersise_1;

import java.util.Scanner;

public class Calc {

	static int n1;
	static int n2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		n1 = input.nextInt();

		System.out.println("Enter a second integer: ");
		n2 = input.nextInt();

		Addition(n1, n2);
		Multiplication(n1, n2);
		Subtraction(n1, n2);
		Division(n1, n2);
	}

	public static int Addition(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("The addition of the two numbers are :" + result);
		return result;
	}

	public static void Multiplication(int n1, int n2) {
		int result = n1 * n2;
		System.out.println("The multiplication of the two numbers are :" + result);
	}

	public static void Subtraction(int n1, int n2) {
		int result = n1 - n2;
		System.out.println("The subtraction of the two numbers are :" + result);
	}

	public static void Division(double n1, double n2) {
		double result = n1 / n2;
		System.out.println("The division of the two numbers are :" + result);
	}
}
