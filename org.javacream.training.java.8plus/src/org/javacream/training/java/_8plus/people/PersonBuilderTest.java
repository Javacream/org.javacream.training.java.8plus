package org.javacream.training.java._8plus.people;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class PersonBuilderTest {

	@Test
	public void testPersonBuilder() {
		var personBuilder = new PersonBuilder();
		Map<String, Object> optionsForPerson = new HashMap<>();
		optionsForPerson.put("lastname", "Sawitzki");
		optionsForPerson.put("firstname", "Rainer");
		Assert.assertNull(personBuilder.create(optionsForPerson));
		var personSet = Set.of("lastname", "firstname");
		personBuilder.addBuilder(personSet,
				(opt) -> new Person((String) opt.get("lastname"), (String) opt.get("firstname")));
		Assert.assertNotNull(personBuilder.create(optionsForPerson));
		Map<String, Object> optionsForStudent = new HashMap<>();
		optionsForStudent.putAll(optionsForPerson);
		optionsForStudent.put("university", new University("LMU", new Address("München", "Marienplatz")));
		Assert.assertNull(personBuilder.create(optionsForStudent));

		personBuilder.addBuilder(Set.of("lastname", "firstname", "university"), (opt) -> {
			Student s = new Student((String) opt.get("lastname"), (String) opt.get("firstname"));
			s.setUniversity((University) opt.get("university"));
			return s;
		});
		Assert.assertNotNull(personBuilder.create(optionsForStudent));

		var message = "Created inside PersonBuilderTest";
		Set<String> freelancerSet = Set.of("lastname", "firstname", "customer");
		personBuilder.addBuilder(freelancerSet, (opt) -> {
			System.out.println(message);
			Freelancer f = new Freelancer((String) opt.get("lastname"), (String) opt.get("firstname"));
			f.setCustomer((String) opt.get("customer"));
			return f;
		});
		Map<String, Object> optionsForFreelancer = new HashMap<>();
		optionsForFreelancer.put("lastname", "Meier");
		optionsForFreelancer.put("firstname", "Hans");
		optionsForFreelancer.put("customer", "integrata");
		Assert.assertNotNull(personBuilder.create(optionsForFreelancer));
		
		Optional<Person> p = personBuilder.create(optionsForFreelancer);
		System.out.println(p.toString());
	}
}
