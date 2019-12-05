package org.javacream.training.java.plus8.people;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonBuilderTest {

	private PersonBuilder personBuilder;

	@Before
	public void init() {
		personBuilder = new PersonBuilder();
		Set<String> personSet = Set.of();
		Set<String> workerSet = Set.of("company");
		Set<String> studentSet = Set.of("university");
		Set<String> freelancerSet = Set.of("salary");
		personBuilder.add(personSet, PersonCreateFunctions::person);
		personBuilder.add(workerSet, PersonCreateFunctions::worker);
		personBuilder.add(studentSet, PersonCreateFunctions::student);
		personBuilder.add(freelancerSet, PersonCreateFunctions::freelancer);
	}

	@Test
	public void testPersonBuilder() {
		Person p = personBuilder.build("Sawitzki", "Rainer", new HashMap<String, Object>());
		Assert.assertTrue(p instanceof Person);

		Map<String, Object> workerMap = Map.of("company", new Company("Integrata"));
		Person worker = personBuilder.build("Schufter", "Hans", workerMap);
		Assert.assertTrue(worker.getClass().equals(Worker.class));

	
		Map<String, Object> freelancerMap = Map.of("salary", 9.99);
		Person freelancer = personBuilder.build("Eg", "Al", freelancerMap);
		Assert.assertTrue(freelancer.getClass().equals(Freelancer.class));

	}
}
