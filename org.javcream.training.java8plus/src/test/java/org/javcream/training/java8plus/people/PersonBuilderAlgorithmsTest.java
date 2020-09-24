package org.javcream.training.java8plus.people;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class PersonBuilderAlgorithmsTest {
	private final Address a = new Address("city", "street");
	@Test public void testPersonCreateAlgorithmCreatesAPerson() {
		Person p = PersonBuilderAlgorithms.createPerson("lastname", "firstname", a, new HashMap<>());
		assertEquals("lastname", p.getLastname());
	}
	@Test public void testPersonCreateAlgorithmCreatesAStudent() {
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put("university", "U");
		Student s = PersonBuilderAlgorithms.createStudent("lastname", "firstname", a, options);
		assertEquals("lastname", s.getLastname());
	}

	@Test(expected = Exception.class) public void testPersonCreateAlgorithmCreatesAPersonFailsIfOptionaAreWrong() {
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put("university", "U");
		Person p = PersonBuilderAlgorithms.createPerson("lastname", "firstname", a, options);
		assertEquals("lastname", p.getLastname());
	}

	@Test(expected = Exception.class) public void testPersonCreateAlgorithmCreatesAStudentFailsIfOptionaAreWrong() {
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put("___", "U");
		Student s = PersonBuilderAlgorithms.createStudent("lastname", "firstname", a, options);
		assertEquals("lastname", s.getLastname());
	}

}
