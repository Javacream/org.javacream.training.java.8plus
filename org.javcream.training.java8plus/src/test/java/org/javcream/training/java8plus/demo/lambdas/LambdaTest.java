package org.javcream.training.java8plus.demo.lambdas;

import org.junit.Test;

public class LambdaTest {
	interface Simple {
		void demo();
	}

	interface WithParams {
		void demo(String s, double d);
	}

	interface WithParamsAndReturn {
		int demo(String s);
	}

	interface WithReturn {
		int demo();
	}

	@Test
	public void simpleLambda() {
		Simple s = () -> {
		};
	}

	@Test
	public void withParamsLambda() {
		WithParams l = (String s, double d) -> {
			System.out.println(s);
		};
	}

	@Test
	public void withReturnLambda() {
		WithReturn l = () -> {
			return 42;
		};
	}

	@Test
	public void withParamsShortLambda() {
		WithParams l = (s, d) -> {
			System.out.println(d);
		};
	}

	@Test
	public void withParamsShort2Lambda() {
		WithParamsAndReturn l = s -> s.length();
	}
}
