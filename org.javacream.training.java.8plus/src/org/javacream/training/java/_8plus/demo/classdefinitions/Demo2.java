package org.javacream.training.java._8plus.demo.classdefinitions;

import java.util.function.Function;

public class Demo2 {

	@SuppressWarnings("unused")
	public void doSomething() {
		OneMethodInterface algo = () -> {System.out.println("Hello World");};
		OneMethodInterface2 algo2 = () -> {System.out.println("Hello World");};
		StringToIntTransformer algo3 = (String input) -> {return input.length();};
		Function<String, Integer> algo4 = (input) -> {int i = 42; return input.length();};
	}
}
