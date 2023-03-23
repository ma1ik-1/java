package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
//		List<String> names = new ArrayList<>();
//		names.add("Michael");
//		names.add("Dean");
//		names.add("James");
//		names.add("Chris");

//		names.stream().forEach(i -> System.out.println(i));
		// names.stream().filter(name -> !name.equals("James")).forEach(name ->
		// System.out.println("Hello " + name));

		List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12);

		int product = numbers.stream().reduce((a, b) -> a * b).get();
		System.out.println(product);

		int max = numbers.stream().reduce(Math::max).get();
		System.out.println(max);

		int min = numbers.stream().reduce(Math::min).get();
		System.out.println(min);

		System.out.println("------");

		List<Integer> even = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		even.stream().forEach(i -> System.out.print(i + " "));

		System.out.println();

		List<Integer> odd = numbers.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
		odd.stream().forEach(i -> System.out.print(i + " "));

		System.out.println();

		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

		OptionalInt minOfSquares = numbers.stream().mapToInt(number -> number * number)
				.filter(number -> number % 2 != 0).reduce(Math::min);
		;
		System.out.println(minOfSquares);
	}
}
