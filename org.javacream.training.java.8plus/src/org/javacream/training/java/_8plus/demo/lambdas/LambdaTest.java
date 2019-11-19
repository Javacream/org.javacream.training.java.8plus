package org.javacream.training.java._8plus.demo.lambdas;

import java.util.function.Supplier;

public class LambdaTest {
	
	public static void main(String[] args) {
		new LambdaTest();
	}
	
	{
		Supplier<String> result = doSomething("Hugo");
		Supplier<String> result2 = doSomething("Emil");
		System.out.println(result.get());
		System.out.println(result2.get());
		System.out.println(result.get());
	}
	
	public Supplier<String> doSomething(String param) {
		//message ist eine method scoped Variable
		//Closure-Effekt
		var message = "Hello";
		Supplier<String> stringSupplier = () -> {
			return "entering doSomething, message=" + message + ", param=" + param;
		};
		return stringSupplier;
	}

}
