package calculator;

public class NumberChecker implements Validator {

	@Override
	public boolean isValid(double s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String check(double num1, double num2) {
		// TODO Auto-generated method stub
		if (num1 < num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;

			System.out.println("num1: " + num1 + " " + num2);
			return num1 + " " + num2;
		} else {
			System.out.println(num1 + " " + num2);
			return num1 + " " + num2;
		}
	}

}
