package org.javacream.training.java.plus8.people;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonBuilder {

	// Option: leer -> Person
	// Option: key=company, value = aCompany -> Worker
	// Option: key=university, value = aUniversity -> Student

	private Map<Set<String>, PersonCreator> creatorAlgorithms;
	
	{
		 creatorAlgorithms = new HashMap<>();
		 
	}
	
	public void add(Set<String> key, PersonCreator personCreator) {
		creatorAlgorithms.put(key, personCreator);
	}
	public Person build(String lastname, String firstname, Map<String, Object> options) {

		Set<String> key = options.keySet();
		Person newPerson = creatorAlgorithms.get(key).create(lastname, firstname, options);
		return newPerson;
	}
	
	
	@FunctionalInterface
	public interface PersonCreator{
		Person create(String lastname, String firstname, Map<String, Object> options);
	}
	
}
