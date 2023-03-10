package javaExcersise;

import java.util.Scanner;

public class BlackJack {

	static int n1, n2;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer that's greater than zero: ");
		n1 = input.nextInt();

		System.out.println("Enter another integer that's greater than zero: ");
		n2 = input.nextInt();

		black_Jack();
	}

	public static void black_Jack() {

		if (n1 > n2) {
			System.out.println();
			if (n1 <= 21) {
				System.out.println(n1);
			} else {
				System.out.println(0);
			}
		} else if (n1 > 21 && n2 > 21) {
			System.out.println(0);
		} else if (n1 < n2) {
			if (n2 <= 21) {
				System.out.println(n2);
			} else {
				System.out.println(n1);
			}
		}

	}
}
