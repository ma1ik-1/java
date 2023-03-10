package javaExcersise;

import java.util.Scanner;

public class UniqueSum {

	static int n1, n2, n3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		n1 = input.nextInt();
		System.out.println("Enter another integer: ");
		n2 = input.nextInt();
		System.out.println("Enter another integer: ");
		n3 = input.nextInt();

		unique();

	}

	private static void unique() {
		int sum = 0;

//		if (n1 != n2 && n2 != n3 && n1 != n3) {
//			sum = n1 + n2 + n3;
//			System.out.println("Sum = " + sum);
//		} else if (n1 != n2 && n1 != n3) {
//			sum = sum + n1;
//		}
//		else {
//			sum = 0;
//			System.out.println("Sum = " + sum);
//		}

//		if (n1 != n2 && n1 != n3) {
//			sum = sum + n1;
//			if (n2 != n1 && n2 != n3) {
//				sum = sum + n2;
//				if (n3 != n1 && n3 != n2) {
//					sum = sum + n3;
//				}
//			}
//		}

		if (n1 != n2 && n1 != n3) {
			sum = sum + n1;
		}
		if (n2 != n1 && n2 != n3) {
			sum = sum + n2;
		}
		if (n3 != n1 && n3 != n2) {
			sum = sum + n3;
		}

		System.out.println("Sum = " + sum);

	}

}
