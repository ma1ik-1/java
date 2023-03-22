package globalLogic;

public class Owner {

	private static String name;
	private static int id, age;

	public Owner(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Owner.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Owner.age = age;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Owner.id = id;
	}

	public static void main(String[] args) {
		OwnerDAO dao = new OwnerDAO("jdbc:mysql://localhost:3306/?user=root", "root", "pass");

		dao.read();

		// dao.create(4, "Fiona", 41);

		dao.update(4, "Fiona", 42);
		dao.read();

		dao.deleteByName("Donkey");
		dao.read();
	}
}
