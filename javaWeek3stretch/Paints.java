package javaWeek3stretch;

public class Paints {
	private String name;
	private int litres;
	private double price, coverage;

	public Paints(String name, int litres, double price, double coverage) {
		super();
		this.name = name;
		this.litres = litres;
		this.price = price;
		this.coverage = coverage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCoverage() {
		return coverage;
	}

	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}

	public int getLitres() {
		return litres;
	}

	public void setLitres(int litres) {
		this.litres = litres;
	}

}
