package org.javcream.training.java8plus.demo.classes;

import org.junit.Test;

public class ClassesTest {
@Test public void scratch() {
	Simple s1 = new TopLevel();
	Simple s2 = new NonPublicTopLevel();
	Simple s3 = new TopLevel.StaticInnerClassLevel();
	TopLevel tl = new TopLevel();
	Simple s4 = tl.new InnerClassLevel();
}
}
