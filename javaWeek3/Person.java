package javaWeek3;

public class Person {
	private String name, jobTitle;
	private int age;

	public Person(String name, String jobTitle, int age) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
	}

	public String getInfo() {
		return "Name: " + name + " Age: " + age + " Job Title: " + jobTitle;
	}

	public String getName() {
		return name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 1 && age <= 100) {
			this.age = age;
		}

	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Person person1 = new Person("John", "Software Engineer", 25);
		Person person2 = new Person("Jane", "DevOps", 24);

		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
	}

}
