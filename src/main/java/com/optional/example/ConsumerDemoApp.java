package com.optional.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemoApp implements Consumer<Integer> {

	public static void main(String[] args) {

		//tradional way
		ConsumerDemoApp app = new ConsumerDemoApp();
		app.accept(10);

		// using lambda expression
		Consumer<Integer> cons = (t) -> {
			System.out.println("print :: " + t);
		};

		cons.accept(100);

		List<Integer> nums = Arrays.asList(1,2,3,4,5);

		nums.stream().forEach(t -> System.out.println(t));

	}

	@Override
	public void accept(Integer integer) {

		System.out.println("printing :: "+integer);
	}
}
