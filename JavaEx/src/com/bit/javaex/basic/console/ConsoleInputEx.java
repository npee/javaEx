package com.bit.javaex.basic.console;
import java.util.Scanner;

public class ConsoleInputEx {

	public static void main(String[] args) {
		// Console Input : Scanner
		//  표준 입력(System.in)으로부터 입력받을
		//  스캐너 생성
		Scanner scanner = new Scanner(System.in);
		// new 라는 키워드를 이용하여 메모리에 올리는 작업
		
		// 스캐너로부터 이름을 입력받아
		// Hello, 이름
		System.out.print("이름 입력 : ");
		String name = scanner.next();
		System.out.println("Hello, " + name);
		
		//스캐너로부터 정수 입력받음, 출력
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		System.out.println(num);
		
		// 시스템 자원 돌려주기
		scanner.close();
	}

}
