package javaWeek3;

import java.util.Random;

public class Simulator {

	private Random rand = new Random();

	public boolean Move(Values v) {
		int randNum = this.rand.nextInt(5);
		Values value;

		if (randNum == 0) {
			value = Values.ROCK;
		} else if (randNum == 1) {
			value = Values.PAPER;
		} else if (randNum == 2) {
			value = Values.SCISSORS;
		} else if (randNum == 3) {
			value = Values.LIZARD;
		} else {
			value = Values.SPOCK;
		}

		System.out.println("You called: " + v + " And the result was: " + value);
		return v == value;

	}

}
