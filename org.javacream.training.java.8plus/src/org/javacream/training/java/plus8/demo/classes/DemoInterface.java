package org.javacream.training.java.plus8.demo.classes;

@FunctionalInterface
public interface DemoInterface {

	public int doDemo(String param);
	//public void doDemo2();
	
	default int answer() {
		return 42;
	}
}
