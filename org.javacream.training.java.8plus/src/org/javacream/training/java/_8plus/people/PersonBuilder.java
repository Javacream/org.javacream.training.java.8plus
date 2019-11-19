package org.javacream.training.java._8plus.people;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class PersonBuilder {

	private Map<Set<String>, Function<Map<String, Object>, Person>> builders = new HashMap<>();
	
	public void addBuilder(Set<String> attributes, Function<Map<String, Object>, Person> builder) {
		builders.put(attributes, builder);
	}
	
	public Person create(Map<String, Object> options) {
		var builder = builders.get(options.keySet());
		if (builder !=  null) {
			return builder.apply(options);
		}
		else {
			return null;
		}
	}
}
