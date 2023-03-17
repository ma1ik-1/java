package javaWeek3;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer you want the factorial of: ");
		int input = scanner.nextInt();
		int fact = fact(input);
		System.out.println("Factorial of " + input + " is: " + fact);

		System.out.println("Enter an integer you want the factorial of: ");
		int input2 = scanner.nextInt();
		int rFact = reverseFactint(input2);
		System.out.println("The reverse factorial is: " + rFact);
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	public static int reverseFactint(int n) {
		int i = 1;
		while (n % i == 0) {
			n /= i;
			i++;
		}
		if (n == 1) {
			return i - 1;
		} else {
			System.out.println(n + " is not a factorial");
			return -1;
		}
	}
}
