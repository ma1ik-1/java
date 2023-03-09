package demo;

public class Ref {
	private String s;
	private String s2;

	public void getData(String s, String s2) {
		this.s = s;
		this.s2 = s2;
	}

	public void showData() {
		System.out.println("S = " + s);
		System.out.println("S2 = " + s2);
	}

}
