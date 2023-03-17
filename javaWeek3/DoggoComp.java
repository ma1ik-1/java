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
	}

	public static void spokenEnglish(int n) {
		for (int i = 0; i <= 100; i++) {
//			System.out.println(i);
			if (i != n) {
				// skip
				System.out.println(i);
			}
		}
	}

}
