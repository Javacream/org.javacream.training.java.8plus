package org.javcream.training.java8plus.demo.collections;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class CollectionsDemo {
	private List<String> names;
	
	@Before public void init() {
		names = new ArrayList<>();
		names.add("Hugo");
		names.add("Emil");
		names.add("Fritz");
		names.add("Eduard");

	}
	//@Test
	public void testList() {

		Stream<String> namesStream = names.stream();
		Stream<String> filteredStream = namesStream.filter(name -> name.startsWith("E"));
		Stream<Integer> mappedStream = filteredStream.map(name -> name.length());
		// mappedStream.forEach(name -> System.out.println(name));
		List<Integer> resultList = mappedStream.collect(Collectors.toList());
		System.out.println(resultList);
	}

	//@Test
	public void testListCompact() {

		System.out.println(names.stream().filter(name -> name.startsWith("E")).map(name -> name.length())
				.collect(Collectors.toList()));

	}
	
	//@Test 
	public void testCollection() {
		System.out.println(handleStream(names.stream()));
	}
	//@Test 
	public void testFile() throws Exception{
		System.out.println(handleStream(Files.lines(Paths.get("names.txt"))));
	}

	private List<String> handleStream(Stream<String> data) {
		return data.filter(name -> name.startsWith("E")).filter(name -> name.length() > 4)
		.collect(Collectors.toList());
	}
	
}
