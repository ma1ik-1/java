package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Calc addition = (num1, num2) -> num1 + num2;
		Calc subtraction = (num1, num2) -> num1 - num2;
		Calc division = (num1, num2) -> num1 / num2;
		Calc multiplication = (num1, num2) -> num1 * num2;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		double num1 = s.nextDouble();

		System.out.println("Enter another integer: ");
		double num2 = s.nextDouble();

//		UserInput ui = new UserInput();
//		double num1 = ui.getDouble(num1);

//		double num1 = 12;
//		double num2 = 3;

		NumberChecker nc = new NumberChecker();
		nc.check(num1, num2);

		System.out.println(num1 + " + " + num2 + " = " + addition.calc(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + subtraction.calc(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + multiplication.calc(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + division.calc(num1, num2));

	}
}
