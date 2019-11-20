package org.javacream.training.java._8plus.demo.lib;

import org.junit.Test;

public class StackwalkerTest {

	@Test public void testStackWalker() {
		StackWalker stackWalker = StackWalker.getInstance();
		stackWalker.forEach((stack) -> System.out.println(stack.getMethodName()));
	}
}
