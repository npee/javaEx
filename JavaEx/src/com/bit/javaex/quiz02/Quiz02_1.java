package com.bit.javaex.quiz02;

public class Quiz02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 6;
		char c = 'A';
		
		System.out.println(a % 2 == 0);
		System.out.println(b % 3 == 0);
		boolean r1 = (a % 2 == 0) && (b % 3 == 0); 
		System.out.println(r1);
		char r2 = (char)((int)c + 4);
		System.out.println(r2);
	}

}
