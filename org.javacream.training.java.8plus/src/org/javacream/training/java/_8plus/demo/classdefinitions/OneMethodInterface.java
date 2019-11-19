package org.javacream.training.java._8plus.demo.classdefinitions;

@FunctionalInterface
public interface OneMethodInterface {

	public void method();
	
	public default String asManyAsNeeded() {
		return "OK";
	}
}
