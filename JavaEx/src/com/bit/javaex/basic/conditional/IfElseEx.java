package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
//		키보드로부터 숫자를 입력받아
//		숫자가 0보다 크면 “양수”
//		영보다 작으면 “음수”
//		0일때는 “0입니다.”을 출력하세요
//				
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = s.nextInt();
		
		if (num == 0) {
			System.out.println("0입니다.");
		} else {
			if (num < 0) {
				System.out.println("음수");
			} else {
				System.out.println("양수");
			}
		}
		
		s.close();
	}

}
