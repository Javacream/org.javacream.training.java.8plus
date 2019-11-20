package org.javacream.training.java._8plus.people;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PeopleManager {

	private PersonBuilder personBuilder;
	private List<Person> people;
	
	{
		people = new ArrayList<>();
		personBuilder = new PersonBuilder();
		Map<String, Object> optionsForPerson = new HashMap<>();
		optionsForPerson.put("lastname", "Sawitzki");
		optionsForPerson.put("firstname", "Rainer");
		var personSet = Set.of("lastname", "firstname");
		personBuilder.addBuilder(personSet,
				(opt) -> new Person((String) opt.get("lastname"), (String) opt.get("firstname")));

		Map<String, Object> optionsForStudent = new HashMap<>();
		optionsForStudent.putAll(optionsForPerson);
		optionsForStudent.put("university", new University("LMU", new Address("München", "Marienplatz")));
		personBuilder.addBuilder(Set.of("lastname", "firstname", "university"), (opt) -> {
			Student s = new Student((String) opt.get("lastname"), (String) opt.get("firstname"));
			s.setUniversity((University) opt.get("university"));
			return s;
		});
		Set<String> freelancerSet = Set.of("lastname", "firstname", "customer");
		personBuilder.addBuilder(freelancerSet, (opt) -> {
			Freelancer f = new Freelancer((String) opt.get("lastname"), (String) opt.get("firstname"));
			f.setCustomer((String) opt.get("customer"));
			return f;
		});
		Map<String, Object> optionsForFreelancer = new HashMap<>();
		optionsForFreelancer.put("lastname", "Meier");
		optionsForFreelancer.put("firstname", "Hans");
		optionsForFreelancer.put("customer", "integrata");
		
		
	}
	
	public Person createPerson(Map<String, Object> options) {
		Person p =personBuilder.create(options);
		people.add(p);
		return p;
	}
	
	public List<Person> findByLastname(String lastname){
		return people.stream().filter(person -> person.getLastname().startsWith(lastname)).collect(Collectors.toList());
	}

	public List<Person> findByFirstname(String firstname){
		return people.stream().filter(person -> person.getFirstname().startsWith(firstname)).collect(Collectors.toList());
	}

}
