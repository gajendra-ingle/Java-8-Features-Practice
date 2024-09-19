package com.functionalInterface;

@FunctionalInterface
public interface Example {

	abstract void greet(String name);

	static void msg() {
		System.out.println("Thank You :)");
	}
}
