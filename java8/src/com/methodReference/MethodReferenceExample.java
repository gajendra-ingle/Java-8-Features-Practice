
package com.methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

	public void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		MethodReferenceExample obj = new MethodReferenceExample();

		List<String> list = Arrays.asList("Gajendra", "Aadi", "Rahul", "Pankaj");

		list.forEach(obj::print);

	}

}
