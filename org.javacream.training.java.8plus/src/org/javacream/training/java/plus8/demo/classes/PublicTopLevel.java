package org.javacream.training.java.plus8.demo.classes;

import java.util.ArrayList;

public class PublicTopLevel {

	private String topLevelAttribute;
	private static String staticTopLevelAttribute;
	
	
	@SuppressWarnings("unused")
	public void doSomething() {
		//Vor Java 8: final
		String methodVariable = "method";
		ArrayList<String> names = new ArrayList<String>();
		class MethodClass{
			public void inMethod() {
				System.out.println(methodVariable);
				System.out.println(names);
				names.add("Hugo");
				//names = new ArrayList<String>();
			}
		}
		MethodClass methodClass = new MethodClass();
		MethodClass methodClass2 = new MethodClass() {
			public void inMethod() {
				
			}
		};
		methodClass2.inMethod();
		
		DemoInterface demoInterface = new DemoInterface() {
			@Override
			public int doDemo(String s) {
				return s.length();
			}
		};
		

		DemoInterface demoInterface2 = (s) ->s.length();
		
		demoInterface2.doDemo("Hugo");//4
		
	}
	public class InnerClass{
		public void doSomething() {
			System.out.println(topLevelAttribute);
		}
		
	}
	public static class StaticInnerClass{
		public void doSomething() {
			System.out.println(staticTopLevelAttribute);
		}
		
	}

	
}


class AnotherTopLevel{
	
}

