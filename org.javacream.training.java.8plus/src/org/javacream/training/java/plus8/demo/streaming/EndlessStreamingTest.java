package org.javacream.training.java.plus8.demo.streaming;

import java.io.IOException;
import java.util.stream.Stream;

import org.junit.Test;

public class EndlessStreamingTest {
	@Test
	public void testEndless() throws IOException {
		Stream.generate(Math::random).map(d -> d * 10).map(Math::round).forEach(System.out::println);
//		var result = Stream.generate(Math::random).limit(10).collect(Collectors.toList());
//		System.out.println(result);
	}

}
