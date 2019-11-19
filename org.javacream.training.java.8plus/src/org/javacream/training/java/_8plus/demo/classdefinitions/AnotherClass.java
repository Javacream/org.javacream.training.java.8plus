package org.javacream.training.java._8plus.demo.classdefinitions;

import org.javacream.training.java._8plus.demo.classdefinitions.SimpleClass.SimpleInnerClassImplementationOne;
import org.javacream.training.java._8plus.demo.classdefinitions.SimpleClass.SimpleStaticInnerClassImplementationOne;

public class AnotherClass {

	@SuppressWarnings("unused")
	public void doSomething() {
		SimpleClass simpleClass = new SimpleClass();
		SimpleInnerClassImplementationOne one = simpleClass.new SimpleInnerClassImplementationOne();
		SimpleStaticInnerClassImplementationOne instance = new SimpleStaticInnerClassImplementationOne();
	}
}
