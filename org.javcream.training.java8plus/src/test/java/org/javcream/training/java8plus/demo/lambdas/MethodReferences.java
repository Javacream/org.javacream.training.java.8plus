package org.javcream.training.java8plus.demo.lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class MethodReferences {
	private ArrayList<String> names;

	@Before public void init() {
		names = new ArrayList<>();
		names.add("Hugo");
		names.add("Emil");
		names.add("Fritz");
		names.add("Eduard");

	}
	@Test
	public void testListForEach() {

		Stream<String> namesStream = names.stream();
		Stream<String> filteredStream = namesStream.filter(name -> name.startsWith("E"));
		Consumer<String> c = System.out::println;
		Hugo h = System.out::println;
		filteredStream.forEach(System.out::println);
		Egon instance = new Egon();
		c = instance::e;
		c = Egon::f;
	}
	
	public interface Hugo{
		void fritz(String s);
	}
	
	static class Egon{
		static void f (String s) {
			
		}
		private String name;
		public void e(String s) {
			System.out.println("Egon: " + name + ", " + s) ;
		}
	}


}
