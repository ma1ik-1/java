package calculator;

import java.util.Scanner;

public class UserInput {

	private Scanner scan = new Scanner(System.in);

	public double getDouble(double num1, double num2) {
		num1 = this.scan.nextDouble();
		num2 = this.scan.nextDouble();

		return num1 + num2;
	}

}
