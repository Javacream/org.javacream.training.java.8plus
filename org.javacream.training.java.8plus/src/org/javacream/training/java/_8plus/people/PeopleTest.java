package org.javacream.training.java._8plus.people;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

	@Test
	public void testPeople() {
		Person p1 = new Person("Sawitzki", "Rainer", new Address("München", "Marienplatz"));
		Assert.assertEquals("MÜNCHEN", p1.getNormalizedAddress().getCity());
		Assert.assertEquals("MARIENPLATZ", p1.getNormalizedAddress().getStreet());
	}
}
