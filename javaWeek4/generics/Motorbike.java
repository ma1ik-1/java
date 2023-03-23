package generics;

public class Motorbike extends Vehicle {

	private boolean canWheelie;

	public Motorbike(String make, String model, String colour, int year, boolean canWheelie) {
		super(make, model, colour, year);
		this.canWheelie = canWheelie;
		// TODO Auto-generated constructor stub
	}

	public boolean isCanWheelie() {
		return canWheelie;
	}

	public void setCanWheelie(boolean canWheelie) {
		this.canWheelie = canWheelie;
	}

}