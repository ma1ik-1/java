package generics;

public class Van extends Vehicle {

	private boolean isCarryingLoad;

	public Van(String make, String model, String colour, int year, boolean load) {
		super(make, model, colour, year);
		this.isCarryingLoad = load;
		// TODO Auto-generated constructor stub
	}

	public boolean isCarryingLoad() {
		return isCarryingLoad;
	}

	public void setCarryingLoad(boolean isCarryingLoad) {
		this.isCarryingLoad = isCarryingLoad;
	}

}