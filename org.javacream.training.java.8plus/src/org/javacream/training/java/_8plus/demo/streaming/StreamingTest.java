package org.javacream.training.java._8plus.demo.streaming;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class StreamingTest {

	@Test public void testList() throws IOException {
		List<String> names = List.of("Hugo", "Emil", "Fritz");
		classicForLoop(names);
		forEachForLoop(names);
		modern(names);
	}
	@Test public void testData() throws IOException {
		List<String> names = List.of("Hugo", "Emil", "Fritz", "Eduard", "Egon");
		@SuppressWarnings("unused")
		List<Integer> result = names.stream().filter(element -> element.startsWith("E")).map(element -> element.length()).collect(Collectors.toList());
	}

	private void modern(Collection<String> names) {
		System.out.println("MODERN");
//		names.forEach(System.out::println);
//		names.forEach(element -> System.out.println(element));
		Stream<String> namesStream = names.stream();
		namesStream.forEach(System.out::println);
		names.stream().forEach(System.out::println);
	}

	private void forEachForLoop(Collection<String> names) {
		System.out.println("FOR EACH LOOP");
		//Lies als: "for each name in names"
		for (String name : names) {
			System.out.println(name);
		}
	}

	@Test public void testSet() {
		Set<String> names = Set.of("Hugo", "Emil", "Fritz");
		//classicForLoop(names);
		forEachForLoop(names);
	}

	private void classicForLoop(List<String> list) {
		System.out.println("CLASSICAL");
		int listSize = list.size();
		for (int i = 0; i < listSize; i++) {
			System.out.println(list.get(i));
		}
	}
}
