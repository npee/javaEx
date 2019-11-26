package com.bit.javaex.basic.oper;

public class ConditionalOperEx {

	public static void main(String[] args) {
		// 3항 연산자
		// 조건식 ? 참 : 거짓
		
		int a = 10;
		String result = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println(a + "는 " + result + "입니다.");
		
		// score 가 있는데
		// 80점 이상이면 good
		// 80점 미만 50점 이상이면 pass
		// 50점 미만이면 fail
		
		int score = 35;
		String message;
		message = score >= 80 ? "Good" : score >= 50 ? "Pass" : "Fail";
		System.out.println(message);
		
		
	}

}
