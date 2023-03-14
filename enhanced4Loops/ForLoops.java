package enhanced4Loops;

import java.util.ArrayList;

public class ForLoops {

	static ArrayList<String> array = new ArrayList<>();
	static ArrayList<Integer> intArray = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		addToArray();
//		printArray(array);

		addToIntArray();
		printIntArray(intArray);
		// check(15);

		check2(intArray);
	}

	public static void addToArray() {
		array.add("One");
		array.add("Two");
		array.add("Three");
		array.add("Four");
		array.add("Five");

	}

	public static void printArray(ArrayList<String> stringArray) {
		for (String str : stringArray) {
			System.out.println(str);
		}
	}

	public static void addToIntArray() {
		for (int i = 0; i <= 20; i++) {
			intArray.add(i);
		}

	}

	public static void printIntArray(ArrayList<Integer> integerArray) {
		for (int i : integerArray) {
			System.out.println(i);
		}
	}

	public static boolean check(int input) {

		if (input % 2 == 0) {
			System.out.println("Even");
			return true;
		} else {
			System.out.println("False");
			return false;
		}
	}

	public static void check2(ArrayList<Integer> integerArray) {

		int output = 0;

		for (int i : integerArray) {
			// System.out.println(i);
			if (i % 2 == 0) {
				System.out.println(i);
				output = i * i * i;
				System.out.println("Even so: " + output);
			} else {
				System.out.println(i);
				output = i * i;
				System.out.println("Odd so: " + output);
			}
		}

	}

}
