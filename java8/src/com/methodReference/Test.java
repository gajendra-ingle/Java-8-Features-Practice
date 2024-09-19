package com.methodReference;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {

		List<String> students = Arrays.asList("Gajendra", "Aadi", "Rahul", "Pankaj", "Tejas", "Sohil");

		students.forEach(Test::print);
	}
}
