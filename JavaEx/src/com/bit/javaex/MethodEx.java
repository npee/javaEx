package com.bit.javaex;

public class MethodEx {
	public static double getSum(double a, double b) {
		// a, b는 고정인자
		// double 을 반환
		return a + b;
	}
	
	public static double getSumVar(double ... values) {
		// ...표기는 가변인자를 의미하고
		// values 는 배열로 전달된다ㅣ
		double total = 0;
		for (double num: values) {
			total += num;
		}
		
		return total;
	}
	
	public static void printTotal(String message, double ... values) {
		// 반환할 값이 없어도 선언부에는 리턴 타입이 있어야 한다. (void)
		// 고정 인자와 가변 인자를 같이 쓸 경우 순서에 유의해야 한다.
		// 먼저 고정인자가 나와야 함
		
		System.out.println(message + " " + getSumVar(values));
		// return 타입이 void 이기 때문에 return 문은 없어도 된다.
	}
	
	public static void main(String[] args) {
		System.out.println("3.3 + 2.1 = " + getSum(3.3, 2.1));
		System.out.println(getSumVar(43,44,11,2,4,44,55,1));
		printTotal("결과는", 3, 2.2, 5, 1, 0, -12.1);
	}

}
