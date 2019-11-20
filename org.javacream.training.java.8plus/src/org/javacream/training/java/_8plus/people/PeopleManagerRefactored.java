package org.javacream.training.java._8plus.people;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleManagerRefactored {

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
		Optional<Person> createdPerson = personBuilder.create(options);
		createdPerson.ifPresent(p -> people.add(p));
		return createdPerson.orElseThrow(() -> new IllegalArgumentException("wrong optioons: " + options));
	}
	
	public List<Person> findByLastname(String lastname){
		return FinderAlgorithms.collectSorted(people.stream().filter(person -> FinderAlgorithms.matchesLastname(person, lastname)));
	}

	public List<Person> findByFirstname(String firstname){
		return FinderAlgorithms.collectSorted(people.stream().filter(person -> FinderAlgorithms.matchesFirstname(person, firstname)));
	}

	
	public static class FinderAlgorithms{
		public static boolean matchesFirstname(Person person, String firstname) {
			return person.getFirstname().startsWith(firstname);
		}
		public static boolean matchesLastname(Person person, String lastname) {
			return person.getLastname().startsWith(lastname);
		}
		public static int comparePeopleByLastname(Person person1, Person person2) {
			return person1.getLastname().compareTo(person2.getLastname());
		}
		
		public static List<Person> collectSorted(Stream<Person> stream){
			return stream.sorted(FinderAlgorithms::comparePeopleByLastname).collect(Collectors.toList());
		}
	}
}
