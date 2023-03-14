package arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	static ArrayList<String> array = new ArrayList<>();

	public static void main(String[] args) {
		array.add("Malik");
		array.add("Hello");
		array.add("Ye");

		for (String name : array) {
			System.out.println(name);
		}

		System.out.println(array.get(0));

		array.set(2, "Yeah");

		for (String name : array) {
			System.out.println(name);
		}

		array.remove(2);
		array.add("What");

		Collections.sort(array);

		for (String name : array) {
			System.out.println(name);
		}
		System.out.println("//");
		Collections.reverse(array);
		for (String name : array) {
			System.out.println(name);
		}
		System.out.println("//");
		Collections.swap(array, 0, 1);
		for (String name : array) {
			System.out.println(name);
		}

		System.out.println("//");
		array.clear();
		for (String name : array) {
			System.out.println(name);
		}
		System.out.println("E");
	}

}
