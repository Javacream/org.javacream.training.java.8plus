package org.javcream.training.java8plus.people;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class PersonCreatorTest {

	private PersonCreator personCreator;
	private final Address anywhere = new Address("Any", "Where");
	@Before
	public void init() {
		personCreator = new PersonCreator();
	}

	@Test
	public void creatorCreatesAPerson() {
		personCreator.create("lastname", "firstname", anywhere, new HashMap<>());
	}
	@Test(expected = IllegalArgumentException.class)
	public void creatorCannotCreateAStudent() {
		HashMap<String, Object> options = new HashMap<>();
		options.put("university", "LMU");
		personCreator.create("lastname", "firstname", anywhere, options);
	}
	@Test
	public void afterAddingStudentBuilderAStudentIsCreated() {
		Set<String> studentOptions = new HashSet<>();
		studentOptions.add("university");
		personCreator.addBuilder(studentOptions, (lastname, firstname, address, options) -> 
			new Student(lastname, firstname, address, options.get("university").toString()));
		HashMap<String, Object> options = new HashMap<>();
		options.put("university", "LMU");
		personCreator.create("lastname", "firstname", anywhere, options);
	}
	@Test
	public void afterAddingStudentBuilderAStudentIsCreatedWithMethodReference() {
		Set<String> studentOptions = new HashSet<>();
		studentOptions.add("university");
		personCreator.addBuilder(studentOptions, PersonBuilderAlgorithms::createStudent);
		HashMap<String, Object> options = new HashMap<>();
		options.put("university", "LMU");
		personCreator.create("lastname", "firstname", anywhere, options);
	}
}
