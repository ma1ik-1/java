package javaWeek3;

import java.util.Scanner;

public class DoggoComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ranking of your dog: ");
		int input = scanner.nextInt();

		spokenEnglish(input);
		// result(input);
	}

	public static void spokenEnglish(int n) {
		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
			if (i != n) {
				// skip
				// System.out.println(i);
				result(i);
			}
		}
	}

	public static void result(int n) {
		int lastDigit = n % 10;

		if (lastDigit == 1) {
			if (n == 11) {
				System.out.println(n + "th");
			} else {
				System.out.println(n + "st");
			}
		} else if (lastDigit == 2) {
			if (n == 12) {
				System.out.println(n + "th");
			} else {
				System.out.println(n + "nd");
			}
		} else if (lastDigit == 3) {
			if (n == 13) {
				System.out.println(n + "th");
			} else {
				System.out.println(n + "rd");
			}
		} else {
			System.out.println(n + "th");
		}
	}

}
