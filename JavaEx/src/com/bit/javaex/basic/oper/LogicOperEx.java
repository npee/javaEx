package com.bit.javaex.basic.oper;

public class LogicOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 관계연산, 비교연산
		// 관계연산 : ==, !=, >, >=, <, <=
		int a = 7, b = 3;
		System.out.println(a == b);
		System.out.println(a > b ? a - b : b - a);
		System.out.println(a != b);
		
		// 논리연산 : AND(&&), OR(||), NOT(!)
		boolean b1 = a > b; //true
		boolean b2 = a < b; //false
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(b1 && !b2);
	}

}
