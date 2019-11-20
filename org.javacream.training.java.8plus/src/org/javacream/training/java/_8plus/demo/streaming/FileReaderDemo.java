package org.javacream.training.java._8plus.demo.streaming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import org.junit.Test;

public class FileReaderDemo {

	//@Test  
	public void testReadFile() throws IOException {
		final String fileName = "c:/_training/data.txt"; //Bitte Datei an dieser Stelle ablegen...
		Stream<String> stream = Files.lines(Path.of(fileName));
		
	}
}
