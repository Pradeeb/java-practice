package com.java.learn.java8.funcationinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LearnConsumer {
// Takes input and performs an operation (no return value)
	public static void main(String[] args) {
		Consumer<String> c = name -> {
			System.out.println("Hello " + name);
		};

		c.accept("Pradeeb");

		Consumer<Integer> co = x -> System.out.println(x * 2);

		co.accept(5); // 10

		// 🔥 Real Use (VERY IMPORTANT – Streams)
		List<String> list = Arrays.asList("A", "B", "C");
		list.forEach(name -> System.out.println(name));

	}

}
