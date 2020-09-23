package org.javcream.training.java8plus.demo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class CollectionsDemo {

	@Test
	public void testList() {
		ArrayList<String> names = new ArrayList();
		names.add("Hugo");
		names.add("Emil");
		names.add("Fritz");
		names.add("Eduard");

		Stream<String> namesStream = names.stream();
		Stream<String> filteredStream = namesStream.filter(name -> name.startsWith("E"));
		Stream<Integer> mappedStream = filteredStream.map(name -> name.length());
		// mappedStream.forEach(name -> System.out.println(name));
		List<Integer> resultList = mappedStream.collect(Collectors.toList());
		System.out.println(resultList);
	}

	@Test
	public void testListCompact() {

		ArrayList<String> names = new ArrayList<>();
		names.add("Hugo");
		names.add("Emil");
		names.add("Fritz");
		names.add("Eduard");
		System.out.println(names.stream().filter(name -> name.startsWith("E")).map(name -> name.length())
				.collect(Collectors.toList()));

	}

}
