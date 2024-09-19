package com.interfaceFeatures;

public interface Test {

	abstract void greeting(String name);

	default void defalutMethod() {
		System.out.println("Default method in interfae");
	}

	static void staticMethod() {
		System.out.println("Static method in interface");
	}

	private void privateMethod() {
		System.out.println("Private method ");
	}

}
