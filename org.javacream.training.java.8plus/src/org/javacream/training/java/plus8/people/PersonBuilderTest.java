package org.javacream.training.java.plus8.people;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.javacream.training.java.plus8.people.PersonBuilder.PersonCreator;
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
		personBuilder.add(personSet, new SimplePersonCreator());

		personBuilder.add(workerSet, new PersonCreator() {
			@Override
			public Person create(String lastname, String firstname, Map<String, Object> options) {
				Company company = (Company) options.get("company");
				Worker worker = new Worker(lastname, firstname, company);
				return worker;
			}
		});

		personBuilder.add(studentSet, (lastname, firstname, options) -> {
			University university = (University) options.get("university");
			return new Student(lastname, firstname, university);
		});
		personBuilder.add(freelancerSet, (lastname, firstname, options) -> {
			Freelancer freelancer = new Freelancer(lastname, firstname);
			freelancer.setSalary((double) options.get("salary"));
			return freelancer;
			
		});

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

	private static class SimplePersonCreator implements PersonCreator {

		@Override
		public Person create(String lastname, String firstname, Map<String, Object> options) {
			return new Person(lastname, firstname);
		}

	}

}
