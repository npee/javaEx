package com.bit.javaex.oop.staticmember;

//	Static의 활용
public class Calculator {
	//	static 상수와 static 메서드는 인스턴스화 하지 않아도
	//		접근 가능하기 때문에 기능과 상수의 묶음으로 활용할 수 있다.
	public static final double PI = 3.14159;
	public static double getSum(double ...arg) {
		double total = 0;
		
		for (double num: arg)  {
			total += num;
		}
		
		return total;
	}
}
