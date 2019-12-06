package org.javacream.training.java.plus8.demo.streaming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.javacream.training.java.plus8.people.Person;
import org.junit.Test;

public class StreamingDemo {

	@Test 
	public void testListSimple() {
		List<String> names = List.of("Emil", "Fridolin", "Antonius", "Xaver", "Franz", "Frieda");
		List<Integer> result = names.stream().filter(s -> s.startsWith("F")).map(s -> s.length()).collect(Collectors.toList());
		System.out.println(result);
	}

	
	@Test 
	public void testList() {
		List<String> names = List.of("Emil", "Fridolin", "Antonius", "Xaver", "Franz", "Frieda");
		Stream<String> stream = names.stream();
		doStream(stream);
	}
	@Test public void testFile() throws IOException {
		Stream<String> stream = Files.lines(Paths.get("names.txt"));
		doStream(stream);
	}
	
	
	public void doStream(Stream<String> stream) {
		//Stream<String> filtered = stream.filter((name) -> name.startsWith("X"));
		Stream<String> filtered = stream.filter(Person::checkNameBeginsWith);
		Stream<Integer> mapped = filtered.map((name) -> name.length());
		List<Integer> result = mapped.collect(Collectors.toList());
		System.out.println(result);
	}
}
