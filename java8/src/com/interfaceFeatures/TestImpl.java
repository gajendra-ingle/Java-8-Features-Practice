package com.interfaceFeatures;

public class TestImpl implements Test {

	@Override
	public void greeting(String name) {
		System.out.println("Hello " + name);
	}

}
