package com.tryWithResources;

import java.io.FileOutputStream;

public class TryWithResourcesExample {
	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("example.txt")) {

			String text = "Hello World. This is my java program";

			byte arr[] = text.getBytes();
			fos.write(arr);

		} catch (Exception e) {

			System.out.println(e);
		}

		System.out.println("Resource are closed and message has been written into the example.txt");
	}
}
