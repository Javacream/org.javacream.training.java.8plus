package org.javcream.training.java8plus.people;

import java.util.Map;

public class PersonBuilderAlgorithms {
	public static Person createPerson(String lastname, String firstname, Address address, Map<String, Object> options) {
		if (options.size() != 0) throw new IllegalArgumentException("wrong options");
		return new Person(lastname, firstname, address);
	}
	public static Student createStudent(String lastname, String firstname, Address address, Map<String, Object> options) {
		return new Student(lastname, firstname, address, options.get("university").toString());
	}

}
