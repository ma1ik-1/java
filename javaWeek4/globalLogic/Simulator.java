package globalLogic;

import java.util.Random;

public class Simulator {

	private Random rand = new Random();

	public boolean Move(Values v) {
		Values cpuChoice = Values.values()[this.rand.nextInt(Values.values().length)];

		if (v == cpuChoice) {
			return false;
		} else if (v == Values.ROCK) {
			return (cpuChoice == Values.SCISSORS || cpuChoice == Values.LIZARD);
		} else if (v == Values.PAPER) {
			return (cpuChoice == Values.ROCK || cpuChoice == Values.SPOCK);
		} else if (v == Values.SCISSORS) {
			return (cpuChoice == Values.PAPER || cpuChoice == Values.LIZARD);
		} else if (v == Values.LIZARD) {
			return (cpuChoice == Values.PAPER || cpuChoice == Values.SPOCK);
		} else {
			return (cpuChoice == Values.ROCK || cpuChoice == Values.SCISSORS);
		}

	}

}