package javaWeek4;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeTranslator {

	private final Map<String, String> morse_map;

	public MorseCodeTranslator() {
		this.morse_map = new HashMap<>();

		this.morse_map.put(".-", "a");
		this.morse_map.put("-...", "b");
		this.morse_map.put("-.-.", "c");
		this.morse_map.put("-..", "d");
		this.morse_map.put(".", "e");
		this.morse_map.put("..-.", "f");
		this.morse_map.put("--.", "g");
		this.morse_map.put("....", "h");
		this.morse_map.put("..", "i");
		this.morse_map.put(".---", "j");
		this.morse_map.put("-.-", "k");
		this.morse_map.put(".-..", "l");
		this.morse_map.put("--", "m");
		this.morse_map.put("-.", "n");
		this.morse_map.put("---", "o");
		this.morse_map.put(".--.", "p");
		this.morse_map.put("--.-", "q");
		this.morse_map.put(".-.", "r");
		this.morse_map.put("...", "s");
		this.morse_map.put("-", "t");
		this.morse_map.put("..-", "u");
		this.morse_map.put("...-", "v");
		this.morse_map.put(".--", "w");
		this.morse_map.put("-..-", "x");
		this.morse_map.put("-.--", "y");
		this.morse_map.put("--..", "z");
		this.morse_map.put("/", " ");
	}

	public String translate(String input) {
		// TODO Auto-generated method stub
		// return Arrays.stream(input.split(" ")).map(n ->
		// this.morse_map.get(n)).collect(Collectors.joining(""));

		String output = "";

		String[] inputArray = input.split(" ");
		for (String word : inputArray) {
			if (morse_map.containsKey(word)) {
				System.out.print(morse_map.get(word));
			} else {
				System.out.println(word + " cant be found");
			}
		}

		return output;
	}

}
