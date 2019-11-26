package com.bit.javaex.basic.var;

public class ConstantEx {
	// 상수 static final
	// final은 한번 할당되면 재할당 불가하다
	static final double PI = 3.14159265;
	// 상수의 이름은 모두 대문자
	// 단어의 구분은 _로
	static final int SPEED_LIMIT = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		// 1. 가독성 높일 수 있고
		// 2. 동일 값을 일괄 관리할 수 있다
		// 3. 값을 보호할 수 있다
		
		System.out.println("현재 제한 속도는 " + SPEED_LIMIT + "km/h입니다");
		// SPEED_LIMIT = 120;
		// final은  변경할 수 없다
		
		System.out.println(SPEED_LIMIT + "km/h 이하로 주행해 주십시오.");
		
		// java는 상수를 많이 활용합니다.
		System.out.println(Math.PI); // 내장 Math 객체의 상수
	}

}
