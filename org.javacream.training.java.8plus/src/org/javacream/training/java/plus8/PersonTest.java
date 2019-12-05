package org.javacream.training.java.plus8;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		Person person = new Person("Sawitzki", "Rainer");
		person.setAddress(new Address("München", "Marienplatz"));
		Assert.assertEquals("city=München, street=Marienplatz", person.getShortAddress());
		Address address = person.getNormalizedAddress();
		Assert.assertEquals("MÜNCHEN", address.getCity());
		Assert.assertEquals("marienplatz", address.getStreet());
	}
	@Test
	public void testUniversity() {
		University university = new University("LMU");
		university.setAddress(new Address("München", "Marienplatz"));
		Assert.assertEquals("city=München, street=Marienplatz", university.getShortAddress());
		Address address = university.getNormalizedAddress();
		Assert.assertEquals("MÜNCHEN", address.getCity());
		Assert.assertEquals("alexanderplatz", address.getStreet());
		Assert.assertEquals("München", university.getCity());
		Assert.assertEquals("Alexanderplatz", university.getStreet());
	}
}
