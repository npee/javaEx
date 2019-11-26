package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// 
		//switchEx1();
		//switchEx2();
		switchEx3();
	}
	public static void switchEx1() {
		//일반적인 switch문
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바  2.C  3.C++  4.파이썬)");
		System.out.print("과목번호: ");
		Scanner s = new Scanner(System.in);
		int lectureNum = s.nextInt();
		switch (lectureNum) {
		case 1:
			System.out.println("R101호 입니다.");
			break;
		case 2:
			System.out.println("R102호 입니다.");
			break;
		case 3:
			System.out.println("R103호 입니다.");
			break;
		case 4:
			System.out.println("R104호 입니다.");
			break;
		default :
			System.out.println("상담원에게 문의하세요.");
			//break;
		}
		
		s.close();
	}
	public static void switchEx2() {

		// C언어의 switch는 수치형 판별만 가능하지만
		// Java는 char, String도 가능하다

		// Grade A -> Exellent
		// Grade B -> Good
		// Grade C -> So so
		// Grade D -> Pass
		// Grade F -> Fail
		// 나머지 -> What?
		char grade = 'A';
		System.out.println("등급 : " + grade);

		switch (grade) {
		case 'A':
			System.out.println("Exellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("So so");
			break;
		case 'D':
			System.out.println("Pass");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("What?");
		}
	}
	public static void switchEx3() {
		// 여러 개의 값을 한꺼번에 묶어서 case로 처리하고자 할 경우
		// 요일에 따라 다른 행동을 해 봅시다
		String dow = "WED";
		// SUN >> 휴식
		// MON, TUE, WED, THU >> 열공
		// FRI >> 불금
		// SAT >> 방전
		// TODO String으로 넘기는것은 권장하지 않음
		// 특정 카테고리에 포함되는 값들은 상수나 ENUM으로
		// 치환해서 사용하면 좋다.
		switch (dow) {
		case "SUN":
			System.out.println("휴식");
			break;
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			System.out.println("열공");
			break;
		case "FRI":
			System.out.println("불금");
		case "SAT":
			System.out.println("방전");
		default:
			break;
		}
	}
}
