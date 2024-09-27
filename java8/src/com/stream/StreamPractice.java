package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {

		// 1 - Find the sum of all element in a list using stream.
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum : " + sum);

		// 2 - Given a list of integer, Write a program to find the maximum element
		// using stream.
		int max = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max : " + max);

		// 3 - Given a list of string, Write a program to count the number of string
		// that start with a specific character using stream
		List<String> fruitList = Arrays.asList("Apple", "banana", "coconut");
		long count = fruitList.stream().filter(fruit -> fruit.startsWith("A")).count();
		System.out.println("Count : " + count);

		// 4 - Convert a list of Strings to uppercase using streams.
		fruitList.stream().map(String::toUpperCase).forEach(System.out::println);

		// 5 - Given a List of integers, write a program to filter out the even numbers.
		// count the number of elements in a list that satisfy a specific condition
		// using stream.
		long evenCount = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println("Even count : " + evenCount);

		// 6 - Write a program to find the average of a list of floating point numbers
		// using streams.
		List<Double> floatList = Arrays.asList(1.1, 1.2, 2.1, 2.4, 5.5, 7.7, 9.5, 9.1);
		double avg = floatList.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		System.out.println("Double list Avg : " + avg);

		// 7 - Given a list of strings, write a program to concatenate all the strings
		// using streams.
		String concat = fruitList.stream().collect(Collectors.joining(","));
		System.out.println("Concat string : " + concat);

		// 8 - Write a program to remove duplicate elements from a list using streams.
		List<Integer> myList = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 7, 8, 9, 9, 9, 10);
		myList.stream().distinct().forEach(System.out::println);

		// 9 - Given a List of objects, Write a program to sort the objects based on a
		// specific attribute using stream.
		List<Person> personList = Arrays.asList(new Person("Gajendra", 22), new Person("Tejas", 23),
				new Person("Nayan", 45), new Person("Sohil", 34), new Person("Suhas", 24), new Person("Pratik", 26),
				new Person("Shivam", 28));

		List<Person> sortedByAge = personList.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
				.collect(Collectors.toList());

		// Print sorted list
		sortedByAge.forEach(System.out::println);

		// 10 - Write a program to check if all elements in a list satisfy a given
		// condition using streams.
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
		boolean isEven = numbers.stream().allMatch(element -> element % 2 == 0);
		System.out.println("All element is evene : " + isEven);

	}
}
