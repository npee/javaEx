package com.bit.javaex.oop.staticmember;

public class CalculatorApp {

	public static void main(String[] args) {
		//	static 멤버의 활용
		//	static 멤버는 new 없이도 접근 가능
		//	특정 클래스에 상수, static 메서드를 직접 이용할 수 있다.
		//Calculator cal = new Calculator();
		double area = 10 * 10 * Calculator.PI;
		double total = Calculator.getSum(1,2,3,4,5,6,7);
		

	}

}
