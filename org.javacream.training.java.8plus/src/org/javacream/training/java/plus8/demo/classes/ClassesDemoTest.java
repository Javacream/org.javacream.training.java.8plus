package org.javacream.training.java.plus8.demo.classes;

import org.javacream.training.java.plus8.demo.classes.PublicTopLevel.InnerClass;
import org.javacream.training.java.plus8.demo.classes.PublicTopLevel.StaticInnerClass;
import org.junit.Test;

public class ClassesDemoTest {

	
	@Test public void testClasses() {
		PublicTopLevel publicTopLevel = new PublicTopLevel();
		AnotherTopLevel anotherTopLevelClass = new AnotherTopLevel();
		InnerClass innerClass = publicTopLevel.new InnerClass();
		StaticInnerClass staticInnerClass = new StaticInnerClass();
	}
}
