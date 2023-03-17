package javaWeek3;

import java.util.Scanner;

public class Goldilocks {

	private static int[][] necessities = new int[30][2];
	private static int weight;
	private static int maxTemp;

	public static void setNecessities() {
		// [row] [column]
		necessities[0][0] = 297;
		necessities[1][0] = 66;
		necessities[2][0] = 257;
		necessities[3][0] = 276;
		necessities[4][0] = 280;
		necessities[5][0] = 163;
		necessities[6][0] = 193;
		necessities[7][0] = 153;
		necessities[8][0] = 107;
		necessities[9][0] = 137;
		necessities[10][0] = 40;

		necessities[0][1] = 90;
		necessities[1][1] = 110;
		necessities[2][1] = 113;
		necessities[3][1] = 191;
		necessities[4][1] = 129;
		necessities[5][1] = 163;
		necessities[6][1] = 193;
		necessities[7][1] = 153;
		necessities[8][1] = 107;
		necessities[9][1] = 137;
		necessities[10][1] = 40;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your weight: ");
		weight = scanner.nextInt();

		System.out.println("Enter your max porridge temperature: ");
		maxTemp = scanner.nextInt();

		setNecessities();

		// System.out.println(necessities[0][0] + " " + necessities[0][1]);
		compare(weight, maxTemp);
	}

	public static void compare(int w, int t) {
		// for (int i = 0; i < necessities.length(); i++)
//		for (int i = 0; i <= 10; i++) {
//			for (int j = 0; j < necessities[i].length; j++) {
//				// weight is first column and temp is second
////				if (w < i && t > j) {
////					System.out.println(necessities[i][j] + " have the right needs");
////				}
//				System.out.println(w + " " + necessities[i][j] + "");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < necessities.length; i++) {
			if (necessities[i][0] > w && necessities[0][i] < t) {
				System.out.println("The numbers: " + w + " and" + t + " found at row: " + i);
			}
		}
	}

}
