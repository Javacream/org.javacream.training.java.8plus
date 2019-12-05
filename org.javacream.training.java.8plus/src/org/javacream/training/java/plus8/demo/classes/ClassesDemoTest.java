package org.javacream.training.java.plus8.demo.classes;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.javacream.training.java.plus8.demo.classes.PublicTopLevel.InnerClass;
import org.javacream.training.java.plus8.demo.classes.PublicTopLevel.StaticInnerClass;
import org.junit.Test;

public class ClassesDemoTest {

	
	@Test public void testClasses() {
		PublicTopLevel publicTopLevel = new PublicTopLevel();
		AnotherTopLevel anotherTopLevelClass = new AnotherTopLevel();
		InnerClass innerClass = publicTopLevel.new InnerClass();
		StaticInnerClass staticInnerClass = new StaticInnerClass();
		
		Consumer<String> consumer = (s) -> System.out.println(s);
		consumer.accept("Hugo");

		Supplier<String> supplier = () -> "Hugo";
		supplier.get(); //-> Hugo
		
		Function<String, Integer> function = (s) -> s.length();
		function.apply("Hugo");//-> 4
		
		Predicate<String> predicate = (s) -> s.length() == 4;
		predicate.test("hugo"); //-> true
		//name: Referenz auf eine String-Objekt , "..." String-Literal
		var name = "Hugo";
		callWithString(name);
		//...
		var number = 9;
		//f: Referenz auf ein Funktionsobjekt, () -> {}: Funktions-Literal
		Function<String, Integer> f = (s) -> s.length();
		callWithFunction(f);
		
	}

	private void callWithString(String s) {
		System.out.println(s.charAt(0));
	}
	private void callWithFunction(Function<String, Integer> f) {
		f.apply("Hugo");
	}
}
