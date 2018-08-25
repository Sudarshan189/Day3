package com.sudarshan.day3;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int k = 0;
			int i = 2/k;
			System.out.println(i);
		} catch(Exception e) {
			System.err.println(e);
		} finally {
			System.out.println("Bye");
		}

	}
}
