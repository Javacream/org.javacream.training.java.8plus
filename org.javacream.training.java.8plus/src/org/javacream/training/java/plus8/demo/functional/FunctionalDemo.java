package org.javacream.training.java.plus8.demo.functional;

public class FunctionalDemo {

	public static void main(String[] args) {
		var helper = new Helper();
		var result = helper.doSomething("World");
		result.accept();
		result.accept();
		var result2 = helper.doSomething("Moon");
		result2.accept();
		result.accept();
		
	}

	static class Helper {
		private int counter = 0;
		VoidFunction doSomething(String param) {
			counter++;
			// Referenz message, Gültigkeit: Closure Variable
			String message = "Hello" + counter;

			VoidFunction consumer = () -> System.out.println("in doSomething, message=" + message + ", param=" + param);
			return consumer;
		}
	}

	static interface VoidFunction {
		void accept();
	}
}
