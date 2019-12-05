package org.javacream.training.java.plus8.people;

import java.util.Map;

import org.javacream.training.java.plus8.people.PersonBuilder.PersonCreator;

public class PersonCreateFunctions {
	public static Worker worker(String lastname, String firstname, Map<String, Object> options) {
		Company company = (Company) options.get("company");
		Worker worker = new Worker(lastname, firstname, company);
		return worker;
	}

	public static Student student(String lastname, String firstname, Map<String, Object> options) {
		University university = (University) options.get("university");
		return new Student(lastname, firstname, university);
	}

	public static Freelancer freelancer(String lastname, String firstname, Map<String, Object> options) {
		Freelancer freelancer = new Freelancer(lastname, firstname);
		freelancer.setSalary((double) options.get("salary"));
		return freelancer;

	}

	public static Person person(String lastname, String firstname, Map<String, Object> options) {
		return new Person(lastname, firstname);
	}

}
