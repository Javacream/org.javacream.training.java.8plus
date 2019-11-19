package org.javacream.training.java._8plus.demo.functional;

import java.util.function.Consumer;

import org.junit.Test;

public class FunctionalDemo {

	@Test
	public void testFunctional() {
//		Consumer<String> c = s -> System.out.println(s);
//		Consumer<Object> c2 = System.out::println;
//		Supplier<Long> longSupplier = System::currentTimeMillis;
//		demo(c);
//		demo(System.out::println);
//		
		Demo demo1 = new Demo("From 1: ");
		Demo demo2 = new Demo("From 2: ");
		Consumer<String> c = s -> demo1.anything(s);
		demo(c);
		demo(demo1::anything);
		demo(demo2::anything);
	
	}

	private void demo(Consumer<String> stringConsumer) {
		stringConsumer.accept("Hello World!");
	}

	class Demo{
		private String demoM;

		public Demo(String demoM) {
			super();
			this.demoM = demoM;
		}
	
		public void anything(String s) {
			System.out.println(this.demoM + " " + s);
		}
	}
	
	
}
