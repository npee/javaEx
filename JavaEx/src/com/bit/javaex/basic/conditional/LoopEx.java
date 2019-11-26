package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class LoopEx {

	public static void whileEx() {
		// while문 연습
		//  100 이하의 정수를 합산하여 결과를 출력
		int num = 1;	//반복 조건을 확인하기 위한 제어변수
		int total = 0;
		while (num <= 100) {
			total += num;
			num++;
		}
		
		System.out.println("TOTAL : " + total);
	}
	public static void whileEx2() {
		// 연습문제 : 키보드로부터 숫자 입력
		// 해당 숫자에 해당하는 구구단을 출력
		Scanner s = new Scanner(System.in);
		System.out.print("출력할 구구단 : ");
		int dan = s.nextInt();
		int i = 1;
		
		while (i < 10) {
			System.out.println(dan + " * " + i + " = " + dan * i++);			
		}
		s.close();
	}
	public static void forEx() {
		Scanner s = new Scanner(System.in);
		System.out.print("출력할 구구단 : ");
		int dan = s.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		s.close();
	}
	
//	public static void forExtra() {
//		int j = 1;
//		for (int i = 1; i < 10; i++) {
//			System.out.print(i + " * " + j + " = " + i * j + "\t");
//			for (j = 1; j < 10; j++) {
//				System.out.println("\n");				
//			}
//		}
//	}
	
	public static void continueEx() {
		// continue -> 반복문에서 남아있는 코드를 더이상 실행하지 않고
		//  다음 루프를 진행
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void breakEx() {
		// break -> 반복문을 종료하고
		//  반복문 다음 문장으로 이동
		// loop의 범위를 지정하기 어려운 경우 while+break 쓰는게 좋다
		int i = 1;
		while (true) {
			if (i % 6 == 0 && i % 14 == 0) {
				break;
			}
			i++;
		}
		System.out.println("6과 14의 공배수 : " + i);
			
	}
	
	public static void dowhileEx() {
		// do ~ while 은
		//  코드가 최소 1번 실행 되어야 하는 경우.
		//  반복조건의 판별은 나중에
		Scanner s = new Scanner(System.in);
		int sum;
		int result = 0;
		
		do {
			System.out.print("0이면 더하기 종료 > ");
			sum = s.nextInt();
			result += sum;
		} while (sum != 0);
		System.out.println(result);
		s.close();
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//whileEx();
		//whileEx2();
		//forEx();
		//forExtra();
		//continueEx();
		//breakEx();
		dowhileEx();
	}

}
