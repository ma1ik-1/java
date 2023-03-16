package javaWeek3stretch;

import java.util.Scanner;

public class PaintWizard {

	private static double numOfCans;

	private static Paints[] Products = { new Paints("CheapoMax", 21, 19.99, 10),
			new Paints("TheOneWithTheDog", 40, 34.38, 12), new Paints("AverageJoes", 16, 17.99, 11),
			new Paints("DuluxourousPaints", 10, 25, 22) };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the width of your room: ");
		double width = input.nextDouble();
		System.out.println("Enter the height of your room: ");
		double height = input.nextDouble();
		System.out.println("Enter the length of your room: ");
		double length = input.nextDouble();

		double area = (width + length) * height * 2;

		for (Paints paint : Products) {
			// rounds cans up
			numOfCans = Math.ceil(area / paint.getCoverage());
			double doubleCans = area / paint.getCoverage();
			// System.out.println(doubleCans);
			double price = numOfCans * paint.getPrice();
			System.out.println(paint.getName() + " uses: " + numOfCans + " number of cans, and costs: " + price);

			// waste
			double totalLitres = numOfCans * paint.getLitres();
			System.out.println("Total litres of cans: " + totalLitres);

			double leftoverOfCan = doubleCans / numOfCans;
			System.out.println("Remainder of can: " + leftoverOfCan);

			double paintUsed = leftoverOfCan * totalLitres;
			double leftoverPaint = totalLitres - paintUsed;
			System.out.println("Paint used: " + paintUsed);
			System.out.println("Leftover Paint: " + String.format("%.2f", leftoverPaint));

		}

	}

}
