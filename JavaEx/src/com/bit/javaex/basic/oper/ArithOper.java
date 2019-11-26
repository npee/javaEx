package com.bit.javaex.basic.oper;

public class ArithOper {

	public static void main(String[] args) {
		// 산술연산자
		int a = 7;
		int b = 3;
		
		// 부호 연산자 : +, - (일항 연산자)
		System.out.println(-a);	//부호 반전
		System.out.println(-1 * a);
		
		// 사칙 연산 : +, -, *, /, %
		// 나눗셈 주의
		System.out.println(a / b);
		System.out.println((float)a / b);
		System.out.println(a % b);
		
		// 증감 연산자 : ++, --
		// 연산 순서에 유의, a++와 ++a는 다르다는 점 확인
		System.out.println("a : " + a);
		System.out.println("++a : " + ++a);
		System.out.println("a : " + a);
		
		System.out.println("b : " + b);
		System.out.println("b++ : " + b++);
		System.out.println("b : " + b);
		
		// 증감 연사나가 다른 연산자에 포함되어 있을 경우
		// 가독성이 매우 떨어지므로 가급적 도입적으로 사용하자.
		
		// 나눗셈 보충
		// 정수를 0으로 나눠봅시다
		// System.out.println(4 / 0);// Exception Error
		// 실수를 0으로 나눠봅시다
		System.out.println(4.0 / 0); // Infinity
		
		// 경우에 따라서는 피연산자 값이 Infinity인지 체크 해야할 경우가 있음
		System.out.println(Double.isInfinite(4.0 / 0));
		System.out.println(Double.isNaN(4.0 / 0)); // Infinity는 수치 값이다.
				
		
	}

}
