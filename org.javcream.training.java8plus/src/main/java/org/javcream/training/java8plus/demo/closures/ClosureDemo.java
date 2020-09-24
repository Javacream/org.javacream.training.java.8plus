package org.javcream.training.java8plus.demo.closures;

import java.util.ArrayList;
import java.util.List;

public class ClosureDemo {
	public Demo doSomething(String param) {
		// "i ist eine lokale Variable", nur sichtbar innerhalb der Methode doSomething
		int i = 42;

		// "message ist eine closure Variable", sichtbar solange irgendein Lambda
		// referenzierbar ist
		String message = "Hello";
		List<String> list = new ArrayList<>();
		list.add("Egal");
		Demo d = () -> {
			System.out.println(message + " " + param + " " + list);
			list.add("TEST");
//			list = new ArrayList<>(); "effective final" compier error
//			message = "H";
		};
		return d;
	}

	public static void main(String[] args) {
		ClosureDemo closureDemo = new ClosureDemo();
		Demo demo = closureDemo.doSomething("World");
		demo.execute();
		Demo demo2 = closureDemo.doSomething("Moon");
		demo2.execute();
		demo.execute();
		demo.execute();
		demo2.execute();

	}

	public interface Demo {
		void execute();
	}
}
