package org.javcream.training.java8plus.demo.classes;

public class TopLevel implements Simple {

	private String attr;
	private static String static_attr;
	@Override
	public void doSomething() {
		int variable = 42;//vor Java 8 hätte variable als final deklariert müssen
		class MethodLevel implements Simple{
			@Override
			public void doSomething() {
				System.out.println(variable);
			}
		}
		Simple s5 = new MethodLevel();
		Simple s6 = new Simple() {
			@Override
			public void doSomething() {
				System.out.println(variable);
			}
			
		};
		//Lambda-Ausdruck
		//Voraussetzung: "functional interface" mit einer Methode
		Simple s7 = () -> {
			System.out.println(variable);
		};

		

	}
	public class InnerClassLevel implements Simple {
		@Override
		public void doSomething() {
			System.out.println(TopLevel.this.attr);
		}
	}
	static class StaticInnerClassLevel implements Simple {
		@Override
		public void doSomething() {
			System.out.println(TopLevel.static_attr);
		}
	}
}

class NonPublicTopLevel implements Simple {

	@Override
	public void doSomething() {

	}

}
