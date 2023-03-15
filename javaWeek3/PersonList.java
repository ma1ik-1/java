package javaWeek3;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	private List<Person> persons;

	public PersonList() {
		persons = new ArrayList<>();
	}

	public void addToPersons(Person person) {
		persons.add(person);
	}

	public String findPerson(String name) {

		for (Person person : persons) {
			if (person.getName().equals(name)) {
				// person.setName("Jill");
				return person.getInfo();
			}
		}

		return null;

	}

	@Override
	public String toString() {
		for (Person person : persons) {
			return person.getInfo() + "\n" + findPerson("Jane");
		}
		return null;
	}

	public static void main(String[] args) {
		PersonList personList = new PersonList();

		personList.addToPersons(new Person("John", "Software Engineer", 25));
		personList.addToPersons(new Person("Jane", "Software Engineer", 24));
		personList.addToPersons(new Person("Jack", "Software Engineer", 27));

		System.out.println(personList.toString());

		String found = personList.findPerson("Jack");
		System.out.println("Found: " + found);

	}
}
