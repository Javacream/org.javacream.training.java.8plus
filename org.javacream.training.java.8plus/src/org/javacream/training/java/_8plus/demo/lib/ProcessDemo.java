package org.javacream.training.java._8plus.demo.lib;

import java.util.concurrent.CompletableFuture;

public class ProcessDemo {
	public static void main(String[] args) throws Exception {
		Process process = new ProcessBuilder("calc.exe").start();
		System.out.println(process);
		final CompletableFuture<Process> future = process.onExit();
		System.out.println("waiting...");
		Process p = future.get();
		System.out.println(p);
		System.out.println("Finished");
	}

}
