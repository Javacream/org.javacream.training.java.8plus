package org.javacream.training.java._8plus.demo.classdefinitions;

import java.util.ArrayList;
import java.util.List;

public class SimpleClass {
	private boolean privateState;

	@SuppressWarnings("unused")
	public void doSomethingWithClassDefinitions() {
		List<String> privateStateInMethod = new ArrayList<String>();
		SimpleTopLevelImplementationOne simpleTopLevelImplementationOne = new SimpleTopLevelImplementationOne();
		SimpleTopLevelImplementationTwo simpleTopLevelImplementationTwo = new SimpleTopLevelImplementationTwo();
		SimpleInFileClassImplementationOne simpleInFileClassImplementationOne = new SimpleInFileClassImplementationOne();
		SimpleInnerClassImplementationOne simpleInnerClassImplementationOne = new SimpleInnerClassImplementationOne();

		class SimpleMethodImplementationOne implements OneMethodInterface {
			@Override
			public void method() {
				var demo = privateStateInMethod;
				demo.add("Hugo");
			}

		}
		class SimpleMethodImplementationTwo implements TwoMethodsInterface {
			@Override
			public void method1() {
			}

			@Override
			public void method2() {
			}
		}

		SimpleMethodImplementationOne simpleMethodImplementationOne = new SimpleMethodImplementationOne();
		SimpleMethodImplementationTwo simpleMethodImplementationTwo = new SimpleMethodImplementationTwo();

		OneMethodInterface oneMethodInterface = new OneMethodInterface() {
			@Override
			public void method() {
				var demo = privateStateInMethod;
				demo.add("Hugo");
			}

		};

		TwoMethodsInterface twoMethodInterface = new TwoMethodsInterface() {
			@Override
			public void method1() {
			}

			@Override
			public void method2() {
			}
		};

		OneMethodInterface algorithm = () -> {
			var demo = privateStateInMethod;
			demo.add("Hugo");
		};

//		TwoMethodsInterface twoAlgorithm = () -> {
//			var demo = privateStateInMethod;
//			demo.add("Hugo");
	};

	public class SimpleInnerClassImplementationOne implements OneMethodInterface {

		@Override
		public void method() {
			@SuppressWarnings("unused")
			var accessIsPosible = SimpleClass.this.privateState;
		}

	}

	public class SimpleInnerClassImplementationTwo implements TwoMethodsInterface {

		@Override
		public void method1() {
			// TODO Auto-generated method stub

		}

		@Override
		public void method2() {
			// TODO Auto-generated method stub

		}

	}

	public static class SimpleStaticInnerClassImplementationOne implements OneMethodInterface {

		@Override
		public void method() {
		}

	}

	public static class SimpleStaticInnerClassImplementationTwo implements TwoMethodsInterface {

		@Override
		public void method1() {
			// TODO Auto-generated method stub

		}

		@Override
		public void method2() {
			// TODO Auto-generated method stub

		}

	}

}

class SimpleInFileClassImplementationOne implements OneMethodInterface {

	@Override
	public void method() {
		// TODO Auto-generated method stub

	}

}

class SimpleInFileImplementationTwo implements TwoMethodsInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

}
