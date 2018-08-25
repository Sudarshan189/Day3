package com.sudarshan.day3;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {

		ArrayList<Dog> array = new ArrayList<Dog>(); 

		array.add(new Dog("S", 5));
		array.add(new Dog("S", 5));
		array.add(new Dog("S", 5));
		array.add(new Dog("S", 5));
		array.add(new Dog("S", 5));

		for (Dog d : array) {
			System.out.println(d.Name);
		}
	}
}

class Dog {
	public String Name;
	public int age;

	public Dog(String Name, int age) {
		this.Name = Name;
		this.age = age;
	}
}