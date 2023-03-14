package stringManipulation;

import java.util.Scanner;

public class Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner input = new Scanner(System.in);
		// System.out.println("Enter a string: ");
		String in = "My name is jordan";

		// wordCount(in);
//		wordPrint(in);
//		reverseWordPrint(in);
		find("My name is jordan", "jord");
	}

	public static void wordCount(String input) {

		int w = 1;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				w++;
			}
		}

		System.out.println("Word Count: " + w);
	}

	public static void wordPrint(String input) {

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == ' ') {
				System.out.println();
			} else {
				System.out.print(c);
			}
		}
		System.out.println();
		System.out.println("//////");
	}

	public static void reverseWordPrint(String input) {

		for (int i = input.length() - 1; i >= 0; i--) {
			char c = input.charAt(i);
			if (c == ' ') {
				System.out.println();
			} else {
				System.out.print(c);
			}
		}
		System.out.println();
		System.out.println("//////");

	}

	public static boolean find(String input, String find) {

		Scanner newInput = new Scanner(System.in);
		System.out.println("Enter another string: ");

//		if (input.contains(s)) {
//			System.out.println("True");
//			return true;
//		} else {
//			System.out.println("False");
//			return false;
//		}

//		for (int i = 0; i < input.length(); i++) {
//			for (int j = 0; j < find.length(); j++) {
//				char c = input.charAt(i);
//				char d = find.charAt(j);
//				if (c == d) {
//					System.out.println(d);
//					System.out.println("True");
//					return true;
//				} else {
//					System.out.print(c);
//				}
//			}
//		}
//		return false;

		return false;
	}

}
