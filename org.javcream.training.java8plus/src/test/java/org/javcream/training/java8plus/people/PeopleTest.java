package org.javcream.training.java8plus.people;
import org.junit.Test;

public class PeopleTest {

	@Test public void people(){
		Person p = new Person("Sawitzki", "Rainer", new Address("M�nchen", "Marienplatz"));
		System.out.println(p.getNormalizedAddress());
	}
}
