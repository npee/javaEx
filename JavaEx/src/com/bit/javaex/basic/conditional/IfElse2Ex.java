package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class IfElse2Ex {

	public static void main(String[] args) {
//		과목번호를 입력받아 강의실 번호를 출력하는
//		프로그램을 작성하세요
//		과목 code값이
//		1이면 “R101호 입니다.”
//		2이면 “R202호 입니다.”
//		3이면 “R303호 입니다.”
//		4이면 “R404호 입니다.”
//		나머지는 “상담원에게 문의하세요”
//		를 출력하세요
		
		Scanner s = new Scanner(System.in);		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바  2.C  3.C++  4.파이썬)");
		System.out.print("과목번호: ");

		int lectureNum = s.nextInt();
		String message;
		if (lectureNum == 1) 
			//System.out.println("R101호 입니다.");
			message = "R101";
		else if (lectureNum == 2)
			//System.out.println("R102호 입니다.");
			message = "R102";
		else if (lectureNum == 3)
			//System.out.println("R103호 입니다.");
			message = "R103";
		else if (lectureNum == 4)
			//System.out.println("R104호 입니다.");
			message = "R104";
		else
			message = "상담원에게 문의하세요.";
			
		if (lectureNum >= 1 && lectureNum <= 4)
			System.out.println(message + "호 입니다.");
		else
			System.out.println(message);
		
		s.close();

	}

}
