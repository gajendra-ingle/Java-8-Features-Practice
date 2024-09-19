package com.functionalInterface;

public class ExampleImpl implements Example {

	@Override
	public void greet(String name) {
		System.out.println("Welcome " + name );
	}

}
