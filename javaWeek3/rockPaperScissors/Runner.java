package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Values userMove = usersMove();
		Values move = Move();

		WLD result = winner(userMove, move);

		System.out.println("Your move: " + userMove);
		System.out.println("My move: " + move);
		System.out.println(result);
	}

	private static WLD winner(Values userMove, Values move) {
		// TODO Auto-generated method stub
		if (userMove == move) {
			return WLD.DRAW;
		} else if (userMove == Values.ROCK && move == Values.SCISSORS || userMove == Values.PAPER && move == Values.ROCK
				|| userMove == Values.SCISSORS && move == Values.PAPER
				|| userMove == Values.ROCK && move == Values.LIZARD || userMove == Values.LIZARD && move == Values.SPOCK
				|| userMove == Values.SPOCK && move == Values.SCISSORS
				|| userMove == Values.SCISSORS && move == Values.LIZARD
				|| userMove == Values.LIZARD && move == Values.PAPER || userMove == Values.PAPER && move == Values.SPOCK
				|| userMove == Values.SPOCK && move == Values.ROCK) {
			return WLD.WIN;
		} else {
			return WLD.LOSE;
		}
	}

	private static Values usersMove() {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a move: ");
//		String input = scanner.nextLine().toUpperCase();

		Values value = null;
		boolean valid = false;

		while (!valid) {
			System.out.println("Enter a move: ");
			String input = scanner.nextLine().toUpperCase();

//			value = Values.valueOf(input);
//			valid = true;

			try {
				value = Values.valueOf(input);
				valid = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid input");
			}
		}
		return value;

	}

	private static Values Move() {
		Random r = new Random();
		Values[] move = { Values.ROCK, Values.PAPER, Values.SCISSORS };
		return move[r.nextInt(move.length)];
	}

}
