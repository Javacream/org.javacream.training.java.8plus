package org.javcream.training.java8plus.demo.classes;

@FunctionalInterface
public interface Simple {

	void doSomething();
	default String doSomething2() {
		return "Hugo";
	}
}
