package stringManipulation;

public class StringManip {

	static String sun, rain;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sun = "today it was sunny";
		rain = "yesterday it was raining ";

		System.out.println(rain.toUpperCase() + ", " + sun.toUpperCase());

		String subsun = sun.substring(0, 12);
		String subrain = rain.substring(16, 24);
		System.out.println(subsun + subrain);
	}

}
