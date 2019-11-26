package com.bit.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// 콘솔 출력
		// System.out.print		: 출력 후 개행없음
		// System.out.println	: 출력 후 개행
		// System.out.printf	: 형식 지정 문자열 출력
		
		System.out.print("Hello ");
		System.out.println("Java");
		
		// 이스케이프 묹
		// \n (개행), \t (탭), \" (쌍따옴표), \\ (백슬래시)
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		String message = "Hello \"Java\"";
		System.out.println(message);
		
		String dir = "D:\\javastudy";
		System.out.println(dir);
	}

}
