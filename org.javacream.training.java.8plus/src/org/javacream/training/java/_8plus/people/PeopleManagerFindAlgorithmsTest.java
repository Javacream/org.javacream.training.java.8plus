package org.javacream.training.java._8plus.people;

import org.junit.Assert;
import org.junit.Test;

public class PeopleManagerFindAlgorithmsTest {
	private final String VALID_LASTNAME = "VALID_LASTNAME";
	private final String VALID_FIRSTNAME = "VALID_FIRSTNAME";
	private final String INVALID_LASTNAME = "INVALID_LASTNAME_OK";
	private final String INVALID_FIRSTNAME = "NVALID_FIRSTNAME_OK";
	
	
	@Test public void testMatchValidLastname() {
		Person p = new Person(VALID_LASTNAME, VALID_FIRSTNAME);
		Assert.assertTrue(PeopleManagerRefactored.FinderAlgorithms.matchesLastname(p, VALID_LASTNAME));
	}
	@Test public void testMatchValidFirstname() {
		Person p = new Person(VALID_LASTNAME, VALID_FIRSTNAME);
		Assert.assertTrue(PeopleManagerRefactored.FinderAlgorithms.matchesFirstname(p, VALID_FIRSTNAME));
	}
	@Test public void testMatchInvalidLastname() {
		Person p = new Person(VALID_LASTNAME, VALID_FIRSTNAME);
		Assert.assertFalse(PeopleManagerRefactored.FinderAlgorithms.matchesLastname(p, INVALID_LASTNAME));
	}
	@Test public void testMatchInvalidFirstname() {
		Person p = new Person(VALID_LASTNAME, VALID_FIRSTNAME);
		Assert.assertFalse(PeopleManagerRefactored.FinderAlgorithms.matchesFirstname(p, INVALID_FIRSTNAME));
	}

}
