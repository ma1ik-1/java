package globalLogic;

public class Pet {

	private static String name;
	private String colour;
	private String breed;
	private int age;

	public Pet(String name, int age, String colour, String breed) {
		super();
		this.name = name;
		this.age = age;
		this.colour = colour;
		this.breed = breed;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		PetDAO dao = new PetDAO("jdbc:mysql://localhost:3306/?user=root", "root", "pass");

		dao.create("Puss in Boots", 1, "Ginger", "British Shorthair");

		dao.read();

		// dao.update("Puss in Boots", 1, "Red", "British Shorthair");
		dao.deleteByName("Puss in Boots");
		dao.read();

		// test
		// System.out.println("E" + getName());
	}
}
