package org.javcream.training.java8plus.people;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class PersonCreator {

	public PersonCreator() {
		builders = new HashMap<Set<String>, PersonCreator.PersonBuilder>();
		Set<String> personKeySet = new HashSet<>();
		builders.put(personKeySet, (lastname, firstname, address, options) -> 
			new Person(lastname, firstname, address));
	}

	private Map<Set<String>, PersonBuilder> builders;
	private Map<Set<String>, BiFunction<Person, Map<String, Object>, Person>> buildersAlternative;
	private Map<Set<String>, Function<Map<String, Object>, Person>> buildersAlternative2;
	
	public Person create(String lastname, String firstname, Address address, Map<String, Object> options) {
		Set<String> key = options.keySet();
		PersonBuilder builder = builders.get(key);
		if (builder == null) {
			throw new IllegalArgumentException("unable to create person with options " + options);
		}else {
			return builder.build(lastname, firstname, address, options);
		}
	}

	public void addBuilder(Set<String> key, PersonBuilder builder) {
		builders.put(key, builder);
	}
	@FunctionalInterface
	public interface PersonBuilder {
		Person build(String lastname, String firstname, Address address, Map<String, Object> options);
	}
}
