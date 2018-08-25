package com.sudarshan.day3;

public class Sample2 extends Emp{
	public static void main(String[] args) {
		Sample2 sam = new Sample2();
		System.out.println(sam.showAge());
		System.out.println(sam.showAge1());
	}
}



class Emp extends Emp1 {
	private int age;
	public int showAge() {
		return age;
	}
}


class Emp1 {
	private int age1 = 5;
	public int showAge1() {
		return age1;
	}
}
