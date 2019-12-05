package org.javacream.training.java.plus8.demo.functional;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

public class CollectionsDemo {

	@SuppressWarnings("unused")
	@Test public void testCollections() {
		var names = List.of("Emil", "Hugo", "Fridolin", "Hans");
		var namesSet = Set.of("Emil", "Hugo", "Fridolin", "Hans");
		
//		for (int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}
//
//		for (String name: namesSet) {
//			System.out.println(name);
//		}
		//Consumer<String> outputAlgorithm = (name) -> System.out.println(name);
		var e = new Egal();
		
		Consumer<String> c = e::doThat;
		Supplier<String> s = e::doThis;
		Function<String, Integer> f = e::transform;
		
		namesSet.forEach(System.out::println);
		
	}
	
	public class Egal{
		public String doThis() {
			return "OK";
		}
		
		public void doThat(String param) {
			//..
		}
		
		public Integer transform(String s) {
			return 4;
		}
	}
}
